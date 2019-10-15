import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Magazine magazine = new Magazine();

        Ingredient cheese = new Ingredient("Ser");
        Ingredient ham = new Ingredient("Szynka");
        Ingredient sauce = new Ingredient("Sos");
        Ingredient pineapple = new Ingredient("Ananas");


        magazine.add(new Pizza(30, "Margherita", new ArrayList<Ingredient>(Arrays.asList(cheese, sauce))), 10);
        magazine.add(new Pizza(30, "Hawajska", new ArrayList<>(Arrays.asList(cheese, sauce, ham, pineapple))), 10);
        magazine.add(new Pizza(30, "Vesuvio", new ArrayList<>(Arrays.asList(cheese, sauce, ham))), 10);




        while(true) {

            System.out.println("Witamy w prototypie Pizzomatu.");
            System.out.println("Oto obecne zasoby:");
            magazine.read();
            System.out.println("Aby zakupić pizzę wpisz jej nazwę. Aby dowiedzieć się więcej o pizzy wpisz jej nazwę wraz z znakiem zapytania.");

            Scanner scan = new Scanner(System.in);
            String name = scan.next();
            try {
                if (name.endsWith("?")) {

                    magazine.find(name.substring(0, name.length() - 1)).getDetails();
                } else {
                    Ware bought = magazine.find(name);
                    magazine.buy(bought);
                }
            }catch (Exception e){
                    System.err.println(e.getMessage());
                }

        }


    }
}