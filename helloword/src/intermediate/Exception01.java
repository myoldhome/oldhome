package intermediate;

import java.text.ParseException;

public class Exception01 {
    public static void main(String[] args) {
        try {
            NullPointerException pit= new NullPointerException();//空指针异常
            //ParseException par = new ParseException();解析异常
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
