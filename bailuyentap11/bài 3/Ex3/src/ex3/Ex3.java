/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3;

/**
 *
 * @author ADMIN
 */
import java.util.*;
import java.util.stream.Collectors;

public class Ex3 {
    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
            new Employee(1, "An", 800),
            new Employee(2, "Binh", 1500),
            new Employee(3, "Cuong", 2000),
            new Employee(4, "Dung", 900)
        );

        List<String> result = list.stream()
                .filter(e -> e.getSalary() > 1000)   // lọc lương > 1000
                .map(Employee::getName)              // lấy tên
                .sorted()                            // sắp xếp A-Z
                .collect(Collectors.toList());       // gom vào List

        System.out.println(result);
    }
}