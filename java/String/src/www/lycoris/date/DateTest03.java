package www.lycoris.date;


import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest03 {
    public static void main(String[] args) {
        //北京是东9时区差8小时本来是0时0分0秒
        //这个时间就是1970-1-1 08：00：00 001
        Date Time = new Date(1);

        SimpleDateFormat timeStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String s = timeStr.format(Time);
        System.out.println(s);

        //想获取昨天的此时的时间
        Date yesterdayToDates = new Date(System.currentTimeMillis()-(1000*60*60*24));
        String time2 = timeStr.format(yesterdayToDates);
        System.out.println(time2);
    }
}
