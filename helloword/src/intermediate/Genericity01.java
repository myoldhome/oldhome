package intermediate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Genericity01 {
    public static void main(String[] args) {
        List<Hero> heros = new ArrayList<>();
        for (int i = 0 ;i<5;i++){
            heros.add(new Hero("hero"+i));
        }
        Iterator<Hero> it = heros.iterator();
        while (it.hasNext()){
            Hero h =it.next();
            System.out.println(h);
        }
    }
}
