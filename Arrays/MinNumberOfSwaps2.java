import java.util.*;
public class MinNumberOfSwaps2 {

    //ARRAY QUESTION 3 MINIMUM SWAPS
    //Given an unordered array -> find minimum swaps for ascending order
    static int minimumNumberOfSwaps(int [] unorderedArray){
        int numSwaps = 0;
        int size = unorderedArray.length -1;
        for(int i =0; i < size; i++){
            if(i < unorderedArray[i] -1){
                swap(unorderedArray,i, Math.min(size,unorderedArray[i]-1));
                numSwaps++;
                i--;
            }
        }


        return numSwaps;
    }
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

	//Write some tests here 
	public static void main (String args[])
	{

	}
}