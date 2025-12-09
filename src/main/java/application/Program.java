package application;

import services.PrintService;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PrintService<Integer> printService = new PrintService<>();
        System.out.print("How many values? ");
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            printService.addValue(scanner.nextInt());
        }

        printService.print();
        System.out.print("First: " + printService.first());

        scanner.close();
    }
}
