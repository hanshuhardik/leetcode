import java.util.Arrays;

public class insertIntervals {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        int [][] itl=new int[intervals.length+1][2];
        int i=0;
        for(int[]val:intervals){

            itl[i++]=val;
        }
        itl[i]=newInterval;
        Arrays.sort(itl, (a, b) -> Integer.compare(a[0],b[0]));
        System.out.println(Arrays.deepToString(itl));
        int [][] res=new int[intervals.length+1][2];
        int k=0;
        int a=0,b=0;
        for(int j=0;j<itl.length;j++){
            System.out.println(j);
            if(a==0) {
                a=itl[j][0];
            b=itl[j][1];
            System.out.println(a+" "+b);
            }else{
                System.out.println(a+" "+b);
                if(b<itl[j][0]){
                    res[k++]=new int[]{a,b};
                    a=itl[j][0];
                    b=itl[j][1];
                }else{
                    b=itl[j][1];
                }
                System.out.println(a+" "+b);
            }
        }
        res[k]=new int[]{a,b};
        res=Arrays.copyOf(res,k+1);
        return res;


    }
    public static void main(String args[]){
        int [][]intervals = {{1,3},{6,9}};int [] newInterval = {2,5};
        System.out.println(Arrays.deepToString(insert(intervals, newInterval)));
    }
}
