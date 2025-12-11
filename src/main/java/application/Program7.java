package application;


import entities.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Program7 {

    public static void main(String[] args) {

        String path = "c:\\temp\\in.txt";

        Set<User> usersList = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while(line != null) {
                String[] fields = line.split(" ");
                usersList.add(new User(fields[0]));
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Total users: " + usersList.toArray().length);
    }
}
