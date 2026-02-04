import java.util.Scanner;

public class ejersicio_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] nums = new int[10];

        System.out.println("Ingrese 10 numeros: ");
        for (int i = 0; i <10 ; i++) {
            nums[i] = in.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.printf("%d %d ", nums[i], nums[9-i]);
        }

    }
}
