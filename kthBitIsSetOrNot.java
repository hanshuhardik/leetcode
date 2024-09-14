import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.toBinaryString;

public  class kthBitIsSetOrNot {
    static boolean checkKthBit(int n, int k) {
        // Your code here
        if(((n>>k)&1)==1)return true;
        else return false;
    }
    static String oddEven(int n) {
        if((n&1)==1)return "odd";
        else return "even";
        // code here
    }
    public static int __builtin_popcount(int i){
        int cnt=0;
        while(i!=0){
            i=(i&(i-1));
            cnt++;
        }
        return cnt;
    }
    static int setBit(int n) {
        // code here
        return (n|(n+1));
   }
    public static int countSetBits(int n){
        int cnt=0;
        for(int k=1;k<=n;k++){
            cnt+= __builtin_popcount(k);


        }
        return cnt;
    }
    static List<Integer> get(int a,int b)
    {
        List<Integer> lt=new ArrayList<>();
        a=a^b;
        b=a^b;
        a=a^b;
        lt.add(a);
        lt.add(b);

        return lt;
    }
    public static int divide(int dividend, int divisor) {
        if(divisor==dividend)return 1;
        boolean sign=true;
        if(divisor<0 && dividend>0)sign=false;
        if(divisor>0 && dividend<0)sign=false;
        long n=Math.abs((long)dividend);
        long d=Math.abs((long)divisor);
        System.out.println(n+" " +d);
        if(d==1){
            if(n>=Integer.MAX_VALUE){
                if(sign)return Integer.MAX_VALUE;
                else return Integer.MIN_VALUE;
            }
        }

        long ans=0;
        while(n>=d){
            int cnt=0;
            while(n>=d*(2L <<(cnt+1))){
                cnt++;
            }
            ans+=(1L <<cnt);
            n=n-(d<<cnt);
        }
        if(ans>=Integer.MAX_VALUE && sign==true)return Integer.MAX_VALUE;
        if(ans>=Integer.MAX_VALUE && sign==false)return Integer.MIN_VALUE;
        return sign?(int)ans:(-1)*(int)ans;
    }
    public static void main(String args[]){
//        System.out.println(checkKthBit(500,3));
//        System.out.println(oddEven(503));
        System.out.println(divide(-2147483648,2));


    }
}
