package basis;

public class Continue01 {
    public static void main(String[] args) {

        for (int j=0;j<20;j++){
            if (0==j%2){
                continue;
            }
            System.out.println(j);
        }
    }
//    public static void main(String[] args) {
//
//        //打印单数
//        for (int j = 0; j < 10; j++) {
//            if(0==j%2)
//                continue; //如果是双数，后面的代码不执行，直接进行下一次循环
//
//            System.out.println(j);
//        }
//    }
}
