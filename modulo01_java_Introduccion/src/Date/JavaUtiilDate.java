package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaUtiilDate {
    public static void main(String[] args) {
        Date fecha = new Date();
        System.out.println("fecha = " + fecha);

        SimpleDateFormat df = new SimpleDateFormat("EEEE dd 'de' MMMM 'del año' yyyy" );
        String fechaStr = df.format(fecha);
        System.out.println("fechaStr = " + fechaStr);

        long j = 0;
        for (int i = 0; i < 1000000000; i++){
            j += i;
        }

        Date fecha2 = new Date();
        long tiempoFinal = fecha2.getTime() - fecha.getTime();

        System.out.println("j = " + j);
        System.out.println("Teimpo transcurriido en el for " + tiempoFinal);
    }
}
