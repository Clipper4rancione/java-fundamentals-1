package org.lessons.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TrainTicket {
    public static void main(String[] args) {

        // DATA
        int userKilometers;
        int userAge;

        double priceForKm = 0.21;

        // INPUT
        // con lo scanner vado ad interagire con l'utente permettendogli di inserire i propri dati
        Scanner scan = new Scanner(System.in);
        System.out.println("Quanti Km vorresti percorrere?: ");
        userKilometers = Integer.parseInt(scan.nextLine());
        System.out.println("Inserisci la tua età: ");
        userAge = Integer.parseInt(scan.nextLine());
        // OUTPUT
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        // definisco prima il prezzo totale del biglietto (moltiplicando il prezzo per km con i km inseriti dall'utente)
        double totalTripPrice = priceForKm * userKilometers;
        System.out.println("Prezzo totale Biglietto: €" + decimalFormat.format(totalTripPrice));

        // creo una condizione che definisce i due sconti in base all'età
        if (userAge < 18 ){

            //calcolo lo a quanto ammonta lo sconto
            double discount = (totalTripPrice * 20) / 100;
            // sottraggo lo sconto al prezzo totale e così ottengo il prezzo scontato
            double discountedPrice = totalTripPrice - discount;
            System.out.println("prezzo scontato under 18: " + decimalFormat.format(discountedPrice));

        } else if (userAge >= 65 ) {
            // // //
            double discount = (totalTripPrice * 40) / 100;
            double discountedPrice = totalTripPrice - discount;
            System.out.println("prezzo scontato over 65: " + decimalFormat.format(discountedPrice));

        }
    }
}
