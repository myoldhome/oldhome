package intermediate;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {
        ArrayList heros = new ArrayList();
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero" + i));

        }
        Hero specialHero = new Hero("special hero");
        heros.add(specialHero);
        System.out.println(heros);
        System.out.println("获取数组大小" + heros.size());

    }
}
