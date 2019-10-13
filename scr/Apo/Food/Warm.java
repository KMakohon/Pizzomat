package Apo.Food;


public class Warm {
    private String name;
    private int amount;
    private double price;

    public Warm(String name, int amount, double price) {
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    Warm(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    void refill(){
        setAmount(3);
    }
}
