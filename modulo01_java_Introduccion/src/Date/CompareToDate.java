package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CompareToDate {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Ingrese una fecha con foramto 'yyyy-MM-dd");
        try {

            Date fecha = format.parse(in.next());
            System.out.println("fecha = " + fecha);
            System.out.println("format.format(fecha) = " + format.format(fecha));

            Date fecha2 = new Date();
            System.out.println("fecha2 = " + fecha2);

            if (fecha.after(fecha2)) System.out.println("fecha del usario es después que fecha actual");
            else if(fecha.before(fecha2)) System.out.println("Fecha es anterior que fecha actual");
            else if (fecha.equals(fecha2)) System.out.println("Fecha1 es igual a fecha actual");

            //comparcion con
            if(fecha.compareTo(fecha2) > 0) System.out.println("fecha del usario es después que fecha actual");
            else if(fecha.compareTo(fecha2) < 0) System.out.println("Fecha es anterior que fecha actual");
            else if(fecha.compareTo(fecha2) == 0) System.out.println("Fecha1 es igual a fecha actual");


        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
