package intermediate;

import java.util.ArrayList;

public class TestCollecation01 {
    public static void main(String[] args) {
        ArrayList heros = new ArrayList();
        for (int i=0;i<5;i++){
            heros.add(new Hero("hero"+i));
        }
        System.out.println(heros);

        Hero speciakHero = new Hero("special hero");
        heros.add(3,speciakHero);
        System.out.println(heros.toString());
    }
}
