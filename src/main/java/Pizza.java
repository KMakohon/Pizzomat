import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pizza extends Product {

    List<Ingredients> ingredientsList = new ArrayList<>();
    int cost = 0;

public void addIngredience(Ingredients in){
    ingredientsList.add(in);
    cost+=in.getCost();
}
}
