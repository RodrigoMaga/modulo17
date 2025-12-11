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
        int nA = scanner.nextInt();
        for (int i = 0; i < nA; i++) {
            studentList.add(new Student(scanner.nextInt()));
        }

        System.out.print("How many students for course B? ");
        int nB = scanner.nextInt();
        for (int i = 0; i < nB; i++) {
            studentList.add(new Student(scanner.nextInt()));
        }

        System.out.print("How many students for course C? ");
        int nC = scanner.nextInt();
        for (int i = 0; i < nC; i++) {
            studentList.add(new Student(scanner.nextInt()));
        }

        System.out.print("Total students: " + studentList.toArray().length);


        scanner.close();
    }
}
