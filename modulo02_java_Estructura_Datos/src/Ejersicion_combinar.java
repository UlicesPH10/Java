public class Ejersicion_combinar {
    public static void main(String[] args) {
        int[] a, b, c;
        a = new int[10];
        b = new int[10];
        c = new int[a.length + b.length];
        for (int i = 0; i < a.length ; i++) {
            a[i] = i + 1;
            b[i] = (i + 1) * 5;
        }
        int j = 0;
        for (int i = 0; i < b.length; i++) {
            c[j++] = a[i];
            c[j++] = b[i];
        }

        for (int n : c){
            System.out.println("n = " + n);
        }
    }
}
