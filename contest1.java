public class contest1 {
    public static String bin(String s){
        int i=Integer.parseInt(s);
        StringBuilder s1=new StringBuilder();
        while(i>=2){
            int f=i%2;
            s1.append(f);
            i=i/2;
        }
        if(i>0){
            s1.append(i);
        }


        s1.reverse();
        return s1.toString();
    }
    public static String convertDateToBinary(String date) {
        int l=date.length();
        String s="";
        String res="";
        for(int i=0;i<l;i++){
            if(date.charAt(i)=='-'){
               res=res+ bin(s);
               res=res+date.charAt(i);
               s="";
            }else{
                s+=date.charAt(i);
            }


        }
        res=res+ bin(s);
        return  res;
    }


    public static void main(String args[]){
        System.out.println(convertDateToBinary("2080-02-29"));
    }
}
