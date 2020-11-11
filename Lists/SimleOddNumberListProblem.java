import java.util.*;
public class SimpleOddNumberListProblem {

    public static List<Integer> oddNumbers(int l, int r) {
        // Write your code here
        // GIVEN 2 & 10 print all the odd numbers between 2 & 10
        List<Integer> oddNumbersList = new ArrayList<>();
        for(int i =l; i < r; i++){
            if(i %2 !=0){

            }oddNumbersList.add(i);
        }
        return oddNumbersList;
    }
    //Write some tests here 
    public static void main (String args[])
    {

    }
}