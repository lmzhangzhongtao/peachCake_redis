package com.peachcake.utils;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureAPI3Demo {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> {
            return 1;
        }).thenApply(f -> {
            return f + 2;
        }).thenApply(f -> {
            return f + 3;
        }).thenAccept(System.out::println);
//                .thenAccept(r ->{
//            System.out.println(r);
//        });

    }
}
