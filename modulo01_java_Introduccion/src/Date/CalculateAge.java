package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalculateAge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Ingrese su fecha de nacimiento en el formato 'yyyy-MM-dd'");
        String fechaStr = in.next();

        try {
            Date fecha = format.parse(fechaStr);
            String strFecha[] = format.format(fecha).split("-");
            int year = Integer.parseInt(strFecha[0]);
            int month = Integer.parseInt(strFecha[1]);
            int dia = Integer.parseInt(strFecha[2]);
            System.out.println(format.format(fecha));
            Date fechaActual = new Date();
            String strFechaActual[] = format.format(fechaActual).split("-");
            int yearAct = Integer.parseInt(strFechaActual[0]);
            int monthAct = Integer.parseInt(strFechaActual[1]);
            int diaAct = Integer.parseInt(strFechaActual[2]);

            int age = 0;
            if(monthAct <= month && diaAct < dia) age = yearAct - year - 1;
            else age = yearAct -year;

            System.out.printf("Tienes %d años de edad\n", age);

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
