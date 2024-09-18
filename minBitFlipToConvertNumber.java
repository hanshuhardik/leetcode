public class minBitFlipToConvertNumber {


    public static int minBitFlips(int start, int goal) {
        int i=0;
        if(start>goal){
            while(start>Math.pow(2,i)){
                i++;
            }
        }else{
            while(goal>Math.pow(2,i)){
                i++;
            }
        }
        int k=0;
        int res=0;
        while(k<=i){
            if((start & 1)!=(goal & 1))res++;
            start=start>>1;
            goal=goal>>1;

            k++;
        }

return res;
    }
    public static  void main(String args[]){
System.out.println(minBitFlips(3,4));
    }
}
