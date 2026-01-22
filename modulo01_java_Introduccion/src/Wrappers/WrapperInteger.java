package Wrappers;

public class WrapperInteger {
    public static void main(String[] args) {
        int Primitivo = 32768;
        Integer integer = Integer.valueOf(Primitivo);
        Integer intObjeto2 = 32768;
        System.out.println("intObjeto2 = " + intObjeto2);

        int num = intObjeto2;
        System.out.println("num = " + num);

        String valorTvLcs = "67000";
        Integer valor = Integer.valueOf(valorTvLcs);
        System.out.println("valor = " + valor);

    }
}
