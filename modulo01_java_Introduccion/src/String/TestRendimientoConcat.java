package String;

public class TestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            c = c.concat(a).concat(b).concat("\n"); //1000 => 3 milisegundos, 100,000 => 1613 milisegundos
            // c += b + "\n"; //1000 => 9 milisegundos, 100,000 => 540 milisegundos
            // sb.append(a).append(b).append("\n"); // 1000 => 0 milisegundo, 100,000 => 8 milisegundos
        }
        long fin = System.currentTimeMillis();

        System.out.println(fin - inicio);
    //    System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
    }
}
