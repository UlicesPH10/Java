package Wrappers;

public class AutoboxingInteger {
    public static void main(String[] args) {
        Integer[] enteros = {1, 2,3 ,4 ,5 ,6 ,7 ,8 ,9, 10};

        int suma = 0;

        for (Integer n : enteros){
            if(n.intValue() % 2 == 0) suma += n;
        }

        System.out.println("suma = " + suma);
    }
}
