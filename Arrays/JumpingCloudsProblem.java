import java.util.*;
public class jumpingCloudsProblem {

    // Cloud game -> given an array of 0's & 1s (0 = safe, 1 not safe)
    // can jump max 2 at a time
    // minimum number of jumps require
    static int jumpingInTheClouda(int [] cloudNumbers){
        int count = 0;
        int i = 0;
        while(i < cloudNumbers.length-1){
            if(i+2 < cloudNumbers.length && cloudNumbers[i + 2] == 0){
                i = i + 2;
                count++;
            }
            else{
                i++;
                count++;
            }
        }
        return count;

    }

	//Write some tests here 
	public static void main (String args[])
	{

	}
}