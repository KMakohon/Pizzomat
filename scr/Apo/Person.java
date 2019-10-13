package Apo;

class Person {
    private double money;
    private double card;

    Person(double money, double card) {
        this.money = money;
        this.card = card;
    }

    Person() {
    }

    double getMoney() {
        return money;
    }

    private void setMoney(double money) {
        this.money = money;
    }

    double getCard() {
        return card;
    }

    private void setCard(double card) {
        this.card = card;
    }

    int paidWithMoney(double money, double price) {
        if (money - price > 0) {
            setMoney(money - price);
            System.out.println("Zamówienie przyjęte");
            return 0;
        }
        else{
            System.out.println("Nie masz wystarczających środków");
            return 1;
        }
    }

    int paidWithCard(double money, double price) {
        if (money - price > 0) {
            setCard(money - price);
            System.out.println("Zamówienie przyjęte");
            return 0;
        }
        else{
            System.out.println("Nie masz wystarczających środków");
            return 1;
        }
    }
}


