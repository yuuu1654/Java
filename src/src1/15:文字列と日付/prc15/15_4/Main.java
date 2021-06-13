import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {
  public static void main(String[] args){

    //現在日時をDate型で取得する
    Date now = new Date();

    //取得した日時情報をCalendarにセット
    Calendar c = Calendar.getInstance();　
    c.setTime(now);

    //Calendarから日の情報を取得する
    int day = c.get(Calendar.DAY_OF_MONTH);

    //取得した値に100を足した値をCalendarの日にセットする
    day += 100;
    c.set(Calendar.DAY_OF_MONTH, day);

    //Calendarの日時情報をDate型に変換する
    Date future = c.getTime();

    //SimpleDateFormatを用いて、指定された方式でDateインスタンスの内容を表示する
    SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
    System.out.println(f.format(future));

  }
}
