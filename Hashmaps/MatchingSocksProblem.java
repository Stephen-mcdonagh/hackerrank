import java.util.*;
public class MatchingSocksProblem {

    //Given an array of coloured socks which are represented by number (1=white,2=black etc)
    //count how many pairs of socks there are
    // example :7  [1,2,3,2,1,2,1] -> 2 pairs

    static int countNumberOfMatchingSocks(int numOfSocks, int[] allSocks){
        int pairs =0;
        //Hashmap will contain socks and count of those socks
        Map<Integer, Integer> socks = new HashMap<>();
        for(int i =0; i < allSocks.length;i++){
            if(socks.containsKey(allSocks[i])){
                socks.remove(allSocks[i]);
                pairs++;
            }
            else{
                socks.put(allSocks[i],1);
            }
        }
        return pairs;
    }

	//Write some tests here 
	public static void main (String args[])
	{

	}
}