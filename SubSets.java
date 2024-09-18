import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubSets {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            List<Integer> ls=new ArrayList<>();
            ls.add(nums[i]);
            res.add(new ArrayList<>(ls));
            int t=i+1;
            while(t<nums.length){
                ls.clear();
                ls.add(nums[i]);
            for(int j=t;j<nums.length;j++){
                ls.add(nums[j]);
                res.add(new ArrayList<>(ls));
            }
            t++;
            }
        }
        res.add(new ArrayList<>());


        return res;
    }
    public static void main(String args[]){
        int[] nums={1,2,3};
        System.out.println(subsets(nums));
    }
}
