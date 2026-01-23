package ValorReferencia;

public class PasarPorReferencia {
    public static void main(String[] args) {
        //Una variable primitiva siempres se pasa por valor
        int[] edades = {10, 11, 12};
        System.out.println(" Iniciamos el método main con  i" );
        for(int n : edades ){
            System.out.println("n = " + n);
        }
        System.out.println("Antes de llamar el método test");
        test(edades);
        System.out.println("Despúes de llamar el método test");
        for(int n : edades ){
            System.out.println("n = " + n);
        }
        System.out.println(" Finaliza el método main con los datos del arreglo modificados! ");
    }

    public static void test(int[] edadArr){
        System.out.println("Iniciamos el método test");
        for (int i = 0; i < edadArr.length; i++) {
            edadArr[i] += 20;
        }
        for(int n : edadArr ){
            System.out.println("n = " + n);
        }
        System.out.println("Finaliza el método test ");
    }
}
