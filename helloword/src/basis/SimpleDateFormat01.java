package basis;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimpleDateFormat01 {
    public static void main(String[] args) {
        //日期对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss SSSS");
        Date date = new Date();
        String str = sdf.format(date);
        System.out.println("时间对象" + date);
        System.out.println("格式化输出" + str);
        //日历对象
        
        Calendar cld = Calendar.getInstance();
        System.out.println("日历对象" + cld);
        cld.add(Calendar.MONDAY, 2);
        cld.set(Calendar.DATE, 1);
        cld.add(Calendar.DATE, -3);
        System.out.println("当前时间" + cld.getTime());
        System.out.println("下个月的倒数第三天" + sdf.format(cld.getTime()));
    }
}
