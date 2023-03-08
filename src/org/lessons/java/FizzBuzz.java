package org.lessons.java;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
    // INPUT
        // chiedo all'utente di inserire il numero
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci un numero compreso tra 0 e 999");
        int numberLimit = Integer.parseInt(scan.nextLine());
    // OUTPUT
        //creo un ciclo che stampa tutti i numeri
        for (int i = 0; i <= numberLimit; i++){
            String message = Integer.toString(i);

            if (i % 3 == 0){
                message = "Fizz";
            }
            if(i % 5 == 0){
                message = "Buzz";
            }
            if (i % 15 == 0){
                message = "FizzBuzz";
            }
            System.out.println(message);

        }
    }
}
