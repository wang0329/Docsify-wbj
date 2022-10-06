package 代码随想录.回溯;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: wbj
 * @date: 2022/10/05/21:44
 * @since: 1.8
 */
public class Leetcode_51 {
    List<List<String>> res = new LinkedList<>();

    public List<List<String>> solveNQueens(int n) {
        char[][] c = new char[n][n];
        for(char[] i : c){
            Arrays.fill(i,'.');
        }
        dfs(n,0,c);
        return res;
    }

    private void dfs(int n, int row, char[][] c) {
        if(row == n){
            res.add(Array2List(c));
            return;
        }
        for (int col = 0; col < n; col++) {
            if(isValid(row,col,n,c)){
                c[row][col] = 'Q';
                dfs(n,row+1,c);
                c[row][col] = '.';
            }
        }
    }

    private boolean isValid(int row, int col, int n, char[][] c) {
        // 检查列
        for (int i=0; i<row; ++i) { // 相当于剪枝
            if (c[i][col] == 'Q') {
                return false;
            }
        }

        // 检查45度对角线
        for (int i=row-1, j=col-1; i>=0 && j>=0; i--, j--) {
            if (c[i][j] == 'Q') {
                return false;
            }
        }

        // 检查135度对角线
        for (int i=row-1, j=col+1; i>=0 && j<=n-1; i--, j++) {
            if (c[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    private List<String> Array2List(char[][] c) {
        List<String> list = new ArrayList<>();

        for (char[] ci : c) {
            list.add(String.copyValueOf(ci));
        }
        return list;
    }
}
