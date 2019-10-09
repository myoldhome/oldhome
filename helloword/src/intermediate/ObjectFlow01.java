package intermediate;

import basis.Hero;

import java.io.*;
/**
 * @Date: 2019/9/30
 * @Author: oldhome
 * todo
*/
public class ObjectFlow01 {
    public static void main(String[] args) {
        Hero[] hs = new Hero[10];
        for (int i = 0; i < hs.length; i++) {
            hs[i] = new Hero("hero:" + i);
        }
        File f = new File("d:\\hai.txt");
        try{
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            oos.writeObject(hs);
            Hero[] hs2 = (Hero[]) ois.readObject();
            for (Hero h : hs2){
                System.out.println(h.name);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
