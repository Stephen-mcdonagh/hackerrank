import java.util.*;
public class MaximumNumberOfToysProblem {

    //Given a list of prices and an amount to spend, what is the maximum number of toys Mark can buy?
    // For example, if  and Mark has  to spend, he can buy items  for , or  for  units of currency.
    // He would choose the first group of  items.
    static int maximumToys(int [] toyPrices, int amountAbleToSpend){
        int maxAmountOfToys = 0;
        //First task is to sort the toyPrices in ascendingOrder
        Arrays.sort(toyPrices);
        //Then continue to take off money
        for(int i=0; i < toyPrices.length; i++){
            amountAbleToSpend -= toyPrices[i];
            if(amountAbleToSpend >0){
                maxAmountOfToys++;
            }
            if(amountAbleToSpend <=0){
                break;
            }
        }
        return maxAmountOfToys;
    }
	//Write some tests here 
	public static void main (String args[])
	{

	}
}