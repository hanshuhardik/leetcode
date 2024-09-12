import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> cand=new ArrayList<>();
        for(int val:candidates){
            cand.add(val);
        }
        List<Integer> res=new ArrayList<>();
       for(int i=0;i<candidates.length;i++){
           int sum=candidates[i];
           res.add(candidates[i]);
           if(sum==target){
               result.add(new ArrayList<>(res));
               res.clear();
               continue;
           }

           for(int j=i+1;j<candidates.length;j++){
                sum+=candidates[j];
                res.add(candidates[j]);
                if(sum==target){
                    result.add(new ArrayList<>(res));
                    break;
                }
                if(sum>target)break;
                int f=target%sum;
                if(cand.contains(f)){
                    int t=0;
                    while(t<target/sum){
                        res.add(f);
                        t++;
                    }
                    result.add(new ArrayList<>(res));
                    System.out.println(result);

                }
           }
           System.out.println(result);
           res.clear();
       }
return result;
    }
    public static void main(String args[]){
       int[] candidates = {2,3,5};int target = 7;
       System.out.println(combinationSum(candidates,target));
    }
}
