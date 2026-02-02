import java.util.Scanner;

public class DetectarOrden {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        int[] a = new int[7];
        System.out.println("Ingrese 7 numeros");

        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        boolean asc = true;
        boolean des = true;
        for (int i = 0; i < a.length -1; i++) {
            if(asc) asc = a[i] < a[i+1];
            if(des) des = a[i] > a[i+1];
            if(!asc && !des) break;

        }

        if (!asc && !des) System.out.println("Esta desordnado");
        else if(asc) System.out.println("Esta ordenado ascendentemente");
        else System.out.println("Esta ordenado descendentemente");
    }
}
