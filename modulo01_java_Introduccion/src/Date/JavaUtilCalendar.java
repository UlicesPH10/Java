package Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavaUtilCalendar {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
       // calendario.set(2100, Calendar.DECEMBER, 22, 1, 6);
        calendario.set(Calendar.YEAR, 2020);
        calendario.set(Calendar.MONTH, Calendar.JULY);
        calendario.set(Calendar.DAY_OF_MONTH, 20);
       // calendario.set(Calendar.HOUR_OF_DAY, 21);
        calendario.set(Calendar.HOUR, 7);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        calendario.set(Calendar.MINUTE, 20);
        calendario.set(Calendar.SECOND, 10);
        calendario.set(Calendar.MILLISECOND, 125);
        //System.out.println("calendario = " + calendario);

        Date fecha = calendario.getTime();
        System.out.println(fecha);

        SimpleDateFormat formato =new  SimpleDateFormat("yyyy-MM-dd hh::mm:ss:SSS a");
        String strFecha = formato.format(fecha);
        System.out.println("strFecha = " + strFecha);

    }
}
