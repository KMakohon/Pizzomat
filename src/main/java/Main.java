import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //Drinks
        Drink sok = new Drink("Sok pomarańczowy", 300, 5);
        Drink woda = new Drink("Woda", 500, 3);
        Drink cola = new Drink("Cola", 300, 7);

        //Sweets
        Sweet ciastko = new Sweet("Ciasto", 12);
        Sweet lody = new Sweet("lody", 10);

        //ingredience
        Ingredients sos = new Ingredients("sos", 1, 3);
        Ingredients ciasto = new Ingredients("ciasto", 1, 7);
        Ingredients ser = new Ingredients("ser", 1, 5);
        Ingredients szynka = new Ingredients("szynka", 1, 3);
        Ingredients pieczarki = new Ingredients("pieczarki", 1, 3);
        Ingredients bazylia = new Ingredients("bazylia", 1, 1);


        System.out.print("Witamy w pizzomacie \n");
        Buy buy = new Buy();
        buy.setList(new ArrayList<Product>());

        Boolean bool = true;
        while(bool){

        System.out.print("Co chcesz zamówić? \n");
        System.out.print("1. Pizza \n");
        System.out.print("2. Napój \n");
        System.out.print("3. Przekąska \n");
        System.out.print("4. Zapłać \n");


        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        switch(a) {
            case "1":
                System.out.println("Wybierz jaką pizzę chcesz");
                System.out.println("1. Margharitta (sos pomidorowy, ser, bazylia)");
                System.out.println("2. Napolitana (sos pomidorowy, ser, szynka, bazylia)");
                System.out.println("3. Vesuvio (sos pomidorowy, ser, szynka, pieczarki,  bazylia)");
                String p = scanner.nextLine();
                switch (p){
                    case"1":
                        Pizza p1 = new Pizza();
                        p1.addIngredience(sos);
                        p1.addIngredience(ciasto);
                        p1.addIngredience(ser);
                        p1.addIngredience(bazylia);
                        buy.addProduct(p1);
                        break;
                    case"2":
                        Pizza p2 = new Pizza();
                        p2.addIngredience(sos);
                        p2.addIngredience(ciasto);
                        p2.addIngredience(ser);
                        p2.addIngredience(szynka);
                        p2.addIngredience(bazylia);
                        buy.addProduct(p2);

                        break;
                    case"3":
                        Pizza p3 = new Pizza();
                        p3.addIngredience(sos);
                        p3.addIngredience(ciasto);
                        p3.addIngredience(ser);
                        p3.addIngredience(szynka);
                        p3.addIngredience(bazylia);
                        p3.addIngredience(pieczarki);
                        buy.addProduct(p3);
                        break;
                }

                break;
            case "2":
                System.out.println("Wybierz napój:");
                System.out.println("1. Woda");
                System.out.println("2. Cola");
                System.out.println("3. Sok pomarańczowy");
                String b = scanner.nextLine();
                switch(b){
                    case"1":
                        buy.addProduct(woda);
                        break;
                    case"2":
                        buy.addProduct(cola);
                        break;
                    case"3":
                        buy.addProduct(sok);
                        break;
            }
            break;
            case "3":
                System.out.println("Wybierz przekąskę:");
                System.out.println("1. ciastko");
                System.out.println("2. lody");
                String c = scanner.nextLine();
                switch(c) {
                    case "1":
                        buy.addProduct(ciastko);
                        break;
                    case"2":
                        buy.addProduct(lody);
                        break;
                }
                break;
            case "4":
                System.out.println("Masz do zapłaty: "+ buy.getTotalCost().toString() );
                bool = false;
                break;
        }
        }


    }
}