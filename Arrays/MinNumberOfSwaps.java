import java.util.*;
public class MinNumberOfSwaps {

	//Given an array of unordered Number -> find the minimum number of swaps required to make it ordered
	// [4,3,2,1] -> [1,2,3,4] -> 2 swaps
	static int minimumSwaps(int [] arrayOfUnorderedNumbers){
    	int minIndex = 0;
    	int min = arrayOfUnorderedNumbers[0];
    	int swaps = 0;
    	for(int i =0; i < arrayOfUnorderedNumbers.length; i++){
    		if(arrayOfUnorderedNumbers[i] < min){
    			min = arrayOfUnorderedNumbers[i];
    			minIndex= i;
			}
		}
    	if(minIndex != 0){
    		int temp = arrayOfUnorderedNumbers[0];
    		arrayOfUnorderedNumbers[0] = arrayOfUnorderedNumbers[minIndex];
    		arrayOfUnorderedNumbers[minIndex]= temp;
    		swaps++;
		}
    	for(int current = 1; current < arrayOfUnorderedNumbers.length-1; current++ ){
    		int pos = arrayOfUnorderedNumbers[current]-arrayOfUnorderedNumbers[0];
    		while(arrayOfUnorderedNumbers[pos] != arrayOfUnorderedNumbers[current]){
    				int temp = arrayOfUnorderedNumbers[current];
    				arrayOfUnorderedNumbers[pos] = arrayOfUnorderedNumbers[current];
    				arrayOfUnorderedNumbers[current] = temp;
    				swaps++;
    				pos = arrayOfUnorderedNumbers[current] - arrayOfUnorderedNumbers[0];
			}
			current = pos;
		}
    	return swaps;
	}

	//Write some tests here 
	public static void main (String args[])
	{

	}
}