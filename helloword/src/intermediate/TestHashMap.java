package intermediate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestHashMap {
    public static void main(String[] args) {
        ArrayList<Hero> heroes = new ArrayList<>();
        System.out.println("开始初始化");
        for (int i =0;i<300*10000;i++){
            Hero h = new Hero("hero-"+(int)(Math.random()*9000)+1000);
            heroes.add(h);
        }
        HashMap<String,ArrayList<Hero>>map=new HashMap<>();
        for (Hero h :heroes){
            ArrayList<Hero> value=map.get(h.name);
            if (value==null){
                value = new ArrayList<>();
                map.put(h.name,value);
            }
            value.add(h);
        }
        System.out.println("初始化查找");
        System.out.println("开始查找");
        //for
        forLoop(heroes);
        //map
        mapLoop(map);
    }

    private static void forLoop(ArrayList<Hero> heros) {
        long start = System.currentTimeMillis();
        ArrayList<Hero> result = new ArrayList<>();
        for (Hero h :heros){
            if (h.name.equals("hero-5555")){
                result.add(h);
            }
        }
        long end = System.currentTimeMillis();
        System.out.printf("通过for查找，"
                + "一共找到%d重复个英雄，耗时%d毫秒%n",result.size(),end-start);
    }
    private static void mapLoop(HashMap<String, ArrayList<Hero>> map) {
        long start = System.currentTimeMillis();
        ArrayList<Hero>result= map.get("hero-5555");
        long end =System.currentTimeMillis();
        System.out.printf("通过map查找，"
                + "一共找到%d重复个英雄，耗时%d 毫秒%n",result.size(),end-start);
    }
}
