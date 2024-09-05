import java.util.ArrayList;
import java.util.Scanner;

public class SetsandUnion {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar=new ArrayList<>();
        ArrayList<Integer> ar1=new ArrayList<>();
int max=0;
        int t=sc.nextInt();  //test case
            for(int i=0;i<t;i++){
                int n=sc.nextInt();  //number of set
                int [][] s=new int[n][50];
                int[] l=new int[n];
                for(int j=0;j<n;j++){
                    int n1=sc.nextInt(); //number of element
                    l[j]=n1;
//                    s=new int[n][n1];
                    for(int k=0;k<n1;k++){
                        int e=sc.nextInt();
                        s[j][k]=e;
                        if(!ar.contains(e)){
                            ar.add(e);
                        }
                    }
                }
                int g=0;
                for(int z=0;z<ar.size();z++){
                for(int j=0;j<n;j++){
                    for(int k=0;k<l[j];k++){
                        if(ar.get(z)==s[j][k]){
                            g++;
                            break;
                        }
                    }
                    if(g==0){
                        for(int k=0;k<l[j];k++){
                            if(!ar1.contains(s[j][k])){
                                ar1.add(s[j][k]);
                            }
                        }
                    }g=0;

                }
                if(max<ar1.size()){
                    max=ar1.size();
                }
//                System.out.println(ar1);
                ar1.clear();

                }
                System.out.println(max);
                ar.clear();max=0;

            }



        }

    }

