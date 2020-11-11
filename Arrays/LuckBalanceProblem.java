import java.util.*;
public class LuckBalanceProblem {

    // Complete the luckBalance function below.
    //TODO: Get description of luck balance problem
    static int luckBalance(int k, int[][] contests) {
        int luckBalance =0;

        Arrays.sort(contests, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return -1 * Integer.compare(a[0], b[0]);
            }
        });

        for(int i =0; i < contests.length; i++){
            int luck = contests[i][0];
            int importantance = contests[i][1];

            if(importantance ==1 && k >0){
                k--;
                luckBalance +=luck;
            }else if(importantance ==1 && k ==0) {
                luckBalance -= luck;
            }
            if(importantance ==0){
                luckBalance += luck;
            }
        }
        return luckBalance;
    }
    //Write some tests here 
    public static void main (String args[])
    {

    }
}