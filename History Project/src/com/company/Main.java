package com.company;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
	    String state ="";
	    int Apop = 0;
	    int Bpop = 0;
	    int Cpop = 0;
	    int pop = 0;
	    int elecvote = 0;

        HashMap<String, Integer> map = new HashMap<>();
        map.put("California", 55);
        map.put("Texas", 38);
        map.put("Michigan", 16);
        map.put("Ohio", 18);
        map.put("Alabama", 9);
        map.put("Alaska", 3);
        map.put("Arizona", 11);
        map.put("Arkansas", 6);
        map.put("Colorado", 9);
        map.put("Connecticut", 7);
        map.put("Delaware", 3);
        map.put("Florida", 29);
        map.put("Georgia", 16);
        map.put("Hawaii", 4);
        map.put("Idaho", 4);
        map.put("Illinois", 20);
        map.put("Indiana", 11);
        map.put("Iowa", 6);
        map.put("Kansas", 6);
        map.put("Kentucky", 8);
        map.put("Louisiana", 8);
        map.put("Maine", 4);
        map.put("Minnesota", 10);
        map.put("Mississippi", 6);
        map.put("Montana", 3);
        map.put("Nebraska", 5);
        map.put("Nevada", 6);
        map.put("New Hampshire", 4);
        map.put("New Jersey", 14);
        map.put("New Mexico", 5);
        map.put("New York", 29);
        map.put("North Carolina", 15);
        map.put("South Carolina", 9);
        map.put("North Dakota", 3);
        map.put("Oklahoma", 7);
        map.put("Oregon", 7);
        map.put("Pennsylvania", 20);
        map.put("Rhode Island", 4);
        map.put("South Dakota", 3);
        map.put("Utah", 6);
        map.put("Vermont", 3);
        map.put("Virginia", 13);
        map.put("Washington", 12);
        map.put("West Virginia", 5);
        map.put("Wisconsin", 10);
        map.put("Wyoming", 3);


        Scanner kboard = new Scanner(System.in);
        while (true) {
            System.out.println("Enter A's Popular Vote: ");
            Apop = Integer.parseInt(kboard.nextLine());

            System.out.println("Enter B's Popular Vote: ");
            Bpop = Integer.parseInt(kboard.nextLine());

            System.out.println("Enter C's Popular Vote: ");
            Cpop = Integer.parseInt(kboard.nextLine());

            while (true) {
                System.out.println("Select your state: ");
                state = kboard.nextLine();
                if (map.containsKey(state)) {
                    elecvote = map.get(state);
                    break;
                } else {
                    continue;
                }
            }

            a = (Apop + Bpop + Cpop);
            a = Apop / a;
           // a = a * elecvote;// Apop) * elecvote;
            b = (Apop + Bpop + Cpop) / Bpop * elecvote;
            c = elecvote * (a + b);

            System.out.println("A's total votes: " + a);
            System.out.println("B's total votes: " + b);
            System.out.println("C's total votes: " + c);


        }

    }
}
