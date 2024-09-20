import java.util.Arrays;

public class changeArray {
    public static int[] plusOne(int[] digits) {
        digits[digits.length - 1] = digits[digits.length - 1] + 1;
        if(digits[digits.length-1]==10)
        {
            int[] arr = new int[digits.length];
            int r = 0;

            for (int i = digits.length - 1; i >= 0; i--) {
                arr[i] = (r + digits[i]) % 10;
                r = (r + digits[i]) / 10;
            }
            if (r == 1) {
                int[] newarr = new int[digits.length + 1];
                newarr[0] = r;
                System.arraycopy(arr, 0, newarr, 1, arr.length);

                return newarr;

            }
            return arr;
        }
return digits;
    }
    public static void main(String args[]){
        System.out.print(Arrays.toString(plusOne(new int[]{9,9,9})));
    }
}
