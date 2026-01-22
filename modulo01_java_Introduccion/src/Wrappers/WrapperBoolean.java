package Wrappers;

public class WrapperBoolean {
    public static void main(String[] args) {
        Integer num1, num2;
        num1 = 1;
        num2 = 2;

        boolean primBool = num1 > num2; //false
        Boolean objBool = Boolean.valueOf(primBool ); //true
        Boolean objBool2 = Boolean.valueOf("false");
        Boolean objBool3 = false;

        System.out.println("primBool = " + primBool);
        System.out.println("objBool = " + objBool);
        System.out.println("objBool2 = " + objBool2);

        System.out.println("Comparando dos ojbetos boolean " + (objBool == objBool2));
        System.out.println("Comparando dos ojbetos boolean " + (objBool2.booleanValue() == objBool3));
        System.out.println("Comparando dos ojbetos boolean " + (objBool == objBool3));

        boolean primBool2 = objBool;
    }
}
