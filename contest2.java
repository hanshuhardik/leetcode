import java.util.ArrayList;
import java.util.List;

public class contest2 {

    public static long findMaximumScore(List<Integer> nums) {
        long res=0;
        int i=0;

        while(i+1<nums.size()){
            int j=i+1;
            System.out.println(i+" "+j);
            if(nums.get(i)>=nums.get(j)){
                while(nums.get(i)>=nums.get(j)){

                    if(j>=nums.size()-1)break;
                    j++;
                    System.out.println(j);
                }

            }
            if(j==nums.size()-1 ||nums.get(i)<nums.get(j)){

                res=res+(long)(j-i)*nums.get(i);
                i=j;
                System.out.println(res);

            }

        }
        return res;
    }




    public static void main(String args[]){


        int []num={1,1,4};
        List<Integer> nums=new ArrayList<>();
       for(int val:num){
           nums.add(val);
       }
        System.out.println(findMaximumScore(nums));
    }
}
