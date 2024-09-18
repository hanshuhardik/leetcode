import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class d3Contest1 {
    // static
    public static int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer> s=new HashSet<>();
        int k=0;
        int[] arr=new int[2];
        for(int i=0;i<nums.length;i++){
            if(s.contains(nums[i])){
                arr[k++]=nums[i];
            }else s.add(nums[i]);
        }
        return arr;
    }

    public static void main(String args[]){
int [] n={0,1,1,0};
        System.out.print(Arrays.toString(getSneakyNumbers(n)) );
    }
}
