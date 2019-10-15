import javafx.application.Preloader;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Magazine {

    private Map<Ware, Integer> magazine;

    public Magazine(){
        magazine = new HashMap<>();
    }


    public void add(Ware ware, int count){
        if (magazine.containsKey(ware)){
            magazine.put(ware, magazine.get(ware) + count);
        }
        else{
            magazine.put(ware, count);
        }
    }

    public void read(){
        magazine.forEach((k, v) -> {
            k.read(v);
        });
    }


    public Ware find(String name) throws Exception {
        Optional<Ware> ware = magazine.keySet().stream().filter(f -> f.getName().equals(name)).findAny();
        if (ware.isPresent()){
            return ware.get();
        }
        else{
            throw new Exception("Brak towaru");
        }
    }

    public void buy(Ware ware){
        magazine.put(ware, magazine.get(ware)-1);
        System.out.println("Kupiłeś: " + ware.getName() + ". Smacznego i zapraszamy ponownie! :)");
        if(magazine.get(ware) == 0){
            magazine.remove(ware, 0);
        }
    }

}
