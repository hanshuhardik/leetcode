import java.util.HashSet;

public class validSudoku {
    public static boolean isValidSudoku(char[][] board) {
        HashSet<Character> set1=new HashSet<>();
        HashSet<Character> set2=new HashSet<>();

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                    if(board[i][j]>=48 && board[i][j]<=57){
                        if(set1.contains(board[i][j]))return false;
                        else set1.add((board[i][j]));
                    }
                if(board[j][i]>=48 && board[j][i]<=57){
                    if(set2.contains(board[j][i]))return false;
                    else set2.add((board[j][i]));
                }


            }
            set1.clear();
            set2.clear();
        }
        HashSet<Character> set3=new HashSet<>();
        int t=0;
        for(int i=0;i<board.length;i++){
            t++;
            for(int j=0;j<board.length;j++){
                if(board[i][j]>=48 && board[i][j]<=57){
                    if(j<3){
                        if(set1.contains(board[i][j]))return false;
                        else set1.add(board[i][j]);
                    } else if (j<6) {
                        if(set2.contains(board[i][j]))return false;
                        else set2.add(board[i][j]);
                    }else{
                        if(set3.contains(board[i][j]))return false;
                        else set3.add(board[i][j]);
                    }
                }
            }
            if(t==3){
                set1.clear();
                set2.clear();
                set3.clear();
                t=0;
            }
        }

        return true;
    }
    
    public static void main(String args[]){
        char[][] board={
                {'8','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}};
        System.out.println(isValidSudoku(board));
    }
}
