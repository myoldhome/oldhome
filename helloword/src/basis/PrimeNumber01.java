package basis;

public class PrimeNumber01 {
    public static void main(String[] args) {
        for (int i = 2; i < 200; i++) {
            boolean num = true;
            for (int j = 2; j < i - 1; j++) {
                if (i % j == 0) {
                    num = false;
                    break;
                }
            }
            if (num){
                System.out.println(i);
            }

        }


    }

}
