package com.peachcake.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

public class CompletableFutureMallDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(12).setName("li4").setMajor("english");


    }
}
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
class Student{
    Integer id;
    String name;
    String major;
}
