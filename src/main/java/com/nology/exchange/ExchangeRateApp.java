package com.nology.exchange;

import com.nology.exchange.calculators.*;

import java.util.ArrayList;
import java.util.Scanner;

public class ExchangeRateApp {

    public void run() {

        GbpToUsdCalculator gbpToUsdCalculator = new GbpToUsdCalculator();

        //list all exchange calculators
        ArrayList<ExchangeRateCalculator> calculators = new ArrayList<>();
        calculators.add(gbpToUsdCalculator);
        calculators.add(new EurToGBPCalculator()); // you can also create a new object here, it will save it as an interface of the list anyway.
        calculators.add(new GbpToUsdCalculator());
        calculators.add(new GbpToEurCalculator());

        System.out.println(calculators.size());
        System.out.println(calculators);

        for (int i = 0; i < calculators.size(); i++) {
            System.out.println( (i+1) + ") from: " + calculators.get(i).fromCurrency() + "--to: " + calculators.get(i).toCurrency() + ", rate: " + calculators.get(i).getExchangeRate());
        }
        //prompt user for a exchange calculator
        System.out.println("Enter a rate: ");

        //get their response
        Scanner scanner = new Scanner(System.in); //scanner needs a source. In this case, we are specifying it to be System.in
        int choice = 0;

        do {
            //read the response
            choice = scanner.nextInt();
            System.out.println("choice = " + choice);

            //a check within the function to catch invalid inputs
            if(choice < 1 || choice > calculators.size()) {
                System.out.println("Please enter a number between 1 and " + calculators.size());
            }
        } while(choice < 1 || choice > calculators.size()); //if true then do the loop again.
        //do-while will always run atleast once, as it runs first and then checks condition
        //But, while-do only works of the condition is true.


        //use their response to select an exchange rate calculator
        ExchangeRateCalculator selected = calculators.get(choice - 1);

        System.out.println(selected.fromCurrency() + " " + selected.toCurrency());
        //prompt user for an amount
        System.out.println("Enter an amount to convert: ");
        double amount = scanner.nextDouble();
        //calculate new amount using calculator
        double result = selected.calculate(amount);
        System.out.println("The new amount is: " + result);
    }
}
