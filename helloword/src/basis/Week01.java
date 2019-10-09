package basis;

import java.util.Scanner;

public class Week01 {
    public static void main(String[]args){
        System.out.println("输入1-7");
        Scanner s = new Scanner(System.in);
        int day =s.nextInt();
        String b = day<=5?"工作日":"周末";
        System.out.println(b);

    }
}
