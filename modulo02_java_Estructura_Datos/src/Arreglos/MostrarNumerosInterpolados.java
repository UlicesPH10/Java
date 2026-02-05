package Arreglos;

public class MostrarNumerosInterpolados {
    public static void main(String[] args) {
        int[] nums = new int[10];
        int[] nums2 = new int[10];
        int t = nums.length;

        for (int i = 0; i < t; i++) {
            nums[i] = i + 1;
        }

        int j = t-1;
        int k = 0;
        for (int i = 0; i < t/2  ; i++) {
            System.out.printf("%d =  (%d %d)\n",i, nums[i],nums [j-i]);
            nums2[k++] = nums[i];
            nums2[k++] = nums[j-i];
        }

        for(int n : nums2){
            System.out.println("n = " + n);
        }
    }
}
