package Apo;
import Apo.Food.Drinks;
import Apo.Food.Sweets;
import Apo.Food.Warm;

import java.util.Scanner;

public class Automat {
    public static void main(String[] args) {

        double orderPrice;
        Person Client = new Person(20,25);

        Drinks Cola = new Drinks("Cola",3,3.00);
        Drinks Water = new Drinks("Water",3,2.00);

        Sweets Cookies = new Sweets("Cookies", 3, 4.99);
        Sweets Chocolate = new Sweets("Chocolate", 3, 1.50);

        Warm Soup = new Warm("Soup",4,10.60);
        Warm Meatballs = new Warm("Meatballs",4,25.60);

        System.out.println("Witamy w Automacie spożywczym\n");
        System.out.println("1 - Cola  3.00\n2 - Woda  2.00\n3 - Ciastka  4.99\n4 - Czekolada  1.50\n5 - Zupa  10.60\n6 - Pulpety 25.60\n");

        System.out.println("Twoje środki to:\nGotówka: "+ Client.getMoney()+"\nKarta: "+ Client.getCard());

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj numer produktu: ");
        int order = scan.nextInt();

        System.out.println("Czym chcesz zapłacić?\n1 - Gotówką\n2 - Kartą");
        int payment = scan.nextInt();

        /////////////////////////////Cola
        if(order == 1){
            if (payment == 1)
            {
                int result = Client.paidWithMoney(Client.getMoney(), Cola.getPrice());
                if (result == 0){Cola.setAmount(Cola.getAmount()-1);}
            }
            else if(payment == 2)
            {
                int result = Client.paidWithCard(Client.getCard(), Cola.getPrice());
                if (result == 0){Cola.setAmount(Cola.getAmount()-1);}
            }
        }
        /////////////////////////// Water
        else if (order == 2){
            if (payment == 1)
            {
                int result = Client.paidWithMoney(Client.getMoney(), Water.getPrice());
                if (result == 0){Water.setAmount(Water.getAmount()-1);}
            }
            else if(payment == 2)
            {
                int result = Client.paidWithCard(Client.getCard(), Water.getPrice());
                if (result == 0){Water.setAmount(Water.getAmount()-1);}
            }
        }
        //////////////////////////// Cookies
        else if (order == 3){
            if (payment == 1)
            {
                int result = Client.paidWithMoney(Client.getMoney(), Cookies.getPrice());
                if (result == 0){Cookies.setAmount(Cookies.getAmount()-1);}
            }
            else if(payment == 2)
            {
                int result = Client.paidWithCard(Client.getCard(), Cookies.getPrice());
                if (result == 0){Cookies.setAmount(Cookies.getAmount()-1);}
            }
        }
        /////////////////////////////// Chocolate
        else if (order == 4){
            if (payment == 1)
            {
                int result = Client.paidWithMoney(Client.getMoney(), Chocolate.getPrice());
                if (result == 0){Chocolate.setAmount(Chocolate.getAmount()-1);}
            }
            else if(payment == 2)
            {
                int result = Client.paidWithCard(Client.getCard(), Chocolate.getPrice());
                if (result == 0){Chocolate.setAmount(Chocolate.getAmount()-1);}
            }
        }
        //////////////////////////// Soup
        else if (order == 5){
            if (payment == 1)
            {
                int result = Client.paidWithMoney(Client.getMoney(), Soup.getPrice());
                if (result == 0){Soup.setAmount(Soup.getAmount()-1);}
            }
            else if(payment == 2)
            {
                int result = Client.paidWithCard(Client.getCard(), Soup.getPrice());
                if (result == 0){Soup.setAmount(Soup.getAmount()-1);}
            }
        }
        ///////////////////////////////
        else if (order == 6){
            if (payment == 1)
            {
                int result = Client.paidWithMoney(Client.getMoney(), Meatballs.getPrice());
                if (result == 0){Meatballs.setAmount(Meatballs.getAmount()-1);}
            }
            else if(payment == 2)
            {
                int result = Client.paidWithCard(Client.getCard(), Meatballs.getPrice());
                if (result == 0){Meatballs.setAmount(Meatballs.getAmount()-1);}
            }
        }

        System.out.println("Dziękujemy za zakupy.");
        System.out.println("Twoje środki to:\nGotówka: "+ Client.getMoney()+"\nKarta: "+ Client.getCard());
    }
}
