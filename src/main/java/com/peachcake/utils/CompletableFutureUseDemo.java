package com.peachcake.utils;

import java.util.concurrent.*;

public class CompletableFutureUseDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService threadPool = Executors.newFixedThreadPool(3);

        try {
            CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> {
                System.out.println(Thread.currentThread().getName() + "------come in");
                int result = ThreadLocalRandom.current().nextInt(10);
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("------1秒钟后出结果：" + result);
                if (result >5) {
                    int i=10/0;
                }
                return result;
            },threadPool).whenComplete((v, e) -> {
                if (e == null) {
                    System.out.println("----计算完成，更新系统UpdateVa:" + v);
                }
            }).exceptionally(e -> {
                e.printStackTrace();
                System.out.println("" + e.getMessage());
                return null;
            });
            System.out.println(completableFuture.get());
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            threadPool.shutdown();
        }

    }
}
