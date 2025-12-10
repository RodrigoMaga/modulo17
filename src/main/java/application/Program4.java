package application;

import entities.Client;

public class Program4 {

    public static void main(String[] args) {

        Client bob = new Client("Walter White", "heisenberg@gmail.com");
        Client bob1 = new Client("Walter White", "heisenberg@gmail.com");
        Client joe = new Client("Jesse Pinkman", "scienceboi@gmail.com");


        //expressões literais "" recebem tratamento especial
        String s1 = "Test";
        String s2 = "Test";
        String s3 = new String("Test");
        String s4 = new String("Test");


        System.out.println(bob.hashCode());
        System.out.println(joe.hashCode());
        System.out.println(bob.equals(bob1));
        System.out.println(bob == bob1);
        System.out.println(s1 == s2);
        System.out.println(s3 == s4);


    }
}
