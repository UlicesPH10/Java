package Arreglos;

public class moverIndices {
    public static void main(String[] args) {
        int[] nums = {1, 2 ,3, 4, 5, 6, 7, 8, 9, 10};
        int piv = nums[0];
        for (int i = 1; i < nums.length; i++) {
             int aux = nums[i];
             nums[i] = piv;
             piv = aux;
        }

        nums[0] = piv;

        for(int n : nums){
            System.out.println("n = " + n);
        }
    }
}
