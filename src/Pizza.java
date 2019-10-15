import java.util.List;

public class Pizza implements Ware {
    private List<Ingredient> ingredients;
    private int cost;
    private String name;

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int aCost) {
        cost = aCost;
    }

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public void getDetails(){
        ingredients.forEach(i -> System.out.println(i.getName()));
    }

    public void read(int count){
        System.out.println("Pizza: " + name + ", Ilość: " + count + ", Cena: " + cost );
    }

    public Pizza(int cost, String name, List<Ingredient> ingredients) {
        this.cost = cost;
        this.name = name;
        this.ingredients = ingredients;
    }

    public Pizza(int cost, List<Ingredient> ingredients){
        this(cost, "", ingredients);
    }

    @Override
    public boolean equals(Object obj) {
        Pizza aPizza = (Pizza) obj;

        return (this.ingredients.equals(aPizza.ingredients) && this.cost == aPizza.cost && this.name.equals(aPizza.name));
    }
}
