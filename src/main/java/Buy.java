import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Buy {
    List<Product> list;


    public Integer getTotalCost(){
        int cost = 0;
        for(Product pro: list){
            cost+=pro.getCost();
        }
        return cost;
    }

    public void addProduct(Product product){
        list.add(product);
    }
}
