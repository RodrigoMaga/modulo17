package application;

import entities.Student;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Program8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<Student> studentList = new HashSet<>();

        System.out.print("How many students for course A? ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            studentList.add(new Student(scanner.nextInt()));
        }

        System.out.print("How many students for course B? ");
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            studentList.add(new Student(scanner.nextInt()));
        }

        System.out.print("How many students for course C? ");
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            studentList.add(new Student(scanner.nextInt()));
        }

        System.out.print("Total students: " + studentList.size());


        scanner.close();
    }
}
