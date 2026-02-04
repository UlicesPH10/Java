public class insertarNumero {
    public static void main(String[] args) {
        int[] nums = {15, 17, 19, 23, 25, 27, 0};
        int aux = 0;
        int posInsert = 0;
        int num = 20;
        for (int i = 0; i < nums.length; i++) {
            if (num <= nums[i]) {
                System.out.println("fsd");
                aux = nums[i];
                nums[i] = num ;
                posInsert = i;
                break;
            }
        }

        for (int i = posInsert+1; i < nums.length ; i++) {
            int piv = nums[i];
            nums[i] = aux;
            aux = piv;
            
        }
        for (int n : nums){
            System.out.println("n = " + n);
        }

    }
}
