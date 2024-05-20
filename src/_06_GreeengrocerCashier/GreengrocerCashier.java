package _06_GreeengrocerCashier;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class GreengrocerCashier {
    public static void main(String[] args) {

        float totalAmount = 0f, kilogram = 0f;

        Scanner input = new Scanner(System.in);

        Map<String, Float> fruits = new LinkedHashMap<>(); // add fruits and theirs price to the Hashap.
        fruits.put("Pears", 2.14f);
        fruits.put("Apples", 3.67f);
        fruits.put("Tomatoes", 1.11f);
        fruits.put("Bananas", 0.95f);
        fruits.put("Eggplanties", 5.00f);

        for (Map.Entry<String, Float> fruit : fruits.entrySet()) {
            System.out.print("How many kilos of " + fruit.getKey() + "? : "); // user input fruits' kilogram
            kilogram = input.nextFloat();
            totalAmount += kilogram * fruit.getValue();
            System.out.printf("Subtotal = %.2f TL%n", totalAmount); // The part after the comma should not exceed two digits
        }
        System.out.printf("%nTotal Amount = %.2f TL%n", totalAmount);
    }
}