package Matrices;

public class ejersisio1 {
    public static void main(String[] args) {
        int n = 9;
        if (n == 0){
            System.out.println("ERROR");
            System.exit(0);
        }
        String[][] matriz = new String[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == j || n-1-i == j) matriz[i][j] = "X";
                else matriz[i][j] = "_";
            }
        }

        for (String[] fila : matriz){
            for (String s : fila){
                System.out.print(s);
            }
            System.out.println();
        }
    }
}
