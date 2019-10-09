package basis;

import java.math.BigDecimal;

public class Break01 {
    public static void main(String[] args) {
        int year = 0;
        double income = 0;
        while (income<1000000){
            income =(12000+income)*(1+0.2);
            year++;
        }
        System.out.println("持续投资"+year);
    }
}
