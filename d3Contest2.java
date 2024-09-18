public class d3Contest2 {
    public static boolean contain(String[] words,String s){

        for(int i=0;i<words.length;i++){
            if(words[i].contains(s) && words[i].startsWith(s))return true;
        }
        return false;
    }

    public static int minValidStrings(String[] words, String target) {
        String s="";
        int i=0;
        int cnt=0;
        String sc="";
        boolean ctn=false;
        while(i<target.length()){
            s+=target.charAt(i);
            if(sc.equals(s)){
                return -1;
            }
            if(contain(words,s)){
                i++;
                continue;
            }else{
                cnt++;
                sc=s;
                s="";
            }
            if(i==0){
                return -1;
            }


        }
        if(s!=null){
            if(contain(words,s))cnt++;
        }

return cnt==0?-1:cnt;
    }

    public static void main(String args[]){
       String[] words = {"aaaaabbaccbcbaaaacb"};String target = "b";

        System.out.print(minValidStrings(words,target));
    }
}
