package basis;

public class Array01 {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = (int) (Math.random() * 100);
        a[1] = (int) (Math.random() * 100);
        a[2] = (int) (Math.random() * 100);
        a[3] = (int) (Math.random() * 100);
        a[4] = (int) (Math.random() * 100);
        /**
        System.out.println("数组长度为"+a.length);
        int min1 = a[0];
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            if (min1 > a[i]) {
                min1 = a[i];
            }
        }
        System.out.println("最小值"+min1);

        int min = a[0];
        for (int i : a) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println("最小值=" + min);

        int[] num ={1200,334,543,2,2324,324,21,1};
        int max= num[0];
        for(int j : num){
            if (j>max){
                max=j;
            }
        }
        System.out.println("最大值="+max);

        long [] max1= {3242,234251153,2334,23,567,99,33};
        long max2=max1[0];
        for (long i :max1){
            if (i>max2){
                max2=i;
            }
        }
        System.out.println("最大值"+max2);**/

        int [] min3={21,2,2,54,6546,999,66666};
        int min4=min3[0];
        for (int i: min3){
            if (i<min4){
                min4=i;
            }
        }
        System.out.println("最小值啊"+min4);

        int[] max003={002,5465,2112,65465,35465,515};
        int max004=max003[0];
        for (int i : max003){
            if (i>max004){
                max004=i;
            }
        }
        System.out.println("最大值"+max004);

        int big[]={1,2,34,22};
        int b =big[0];
        for (int eache:big){
            if (eache>b){
                b=eache;
            }
        }
        System.out.println("最大值"+b);



        int min[]= {1,1,2,334,45,5};
        int b1 =big[0];
        for (int eache: min){
            if(eache<b1){
                b1=eache;
            }
        }
        System.out.println("再来一次最小值"+b1);
    }
}
