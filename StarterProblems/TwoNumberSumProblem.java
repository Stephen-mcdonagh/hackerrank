<<<<<<< HEAD
// Two number sum problem
// Given an array of numbers, return indices of two numbers which sum to give the target number
import java.util.Arrays;

class TwoNumberSumProblem {

	//n*log(n)
	private static int[] TwoSumSorted(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
            if(nums[left] + nums[right] == target) {
            	System.out.println("indices are " + left + " and " + right);
                return new int[] {left, right};
            } 
            else if (nums[left] + nums[right] < target) {
                left++;
            } 
            else {
                right--;
            }
        }
        System.out.println("Does not exist");
        return new int[] {};
    }


    public static void main(String[] args) {
    	//Test Two sum problem 
    	int [] numbers = new int [] {1,2,3,4};
    	int target = 3;
    	TwoSumSorted(numbers,target);
    }
=======
// Two number sum problem
// Given an array of numbers, return indices of two numbers which sum to give the target number
import java.util.Arrays;

class TwoNumberSumProblem {

	//n*log(n)
	private static int[] TwoSumSorted(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
            if(nums[left] + nums[right] == target) {
            	System.out.println("indices are " + left + " and " + right);
                return new int[] {left, right};
            } 
            else if (nums[left] + nums[right] < target) {
                left++;
            } 
            else {
                right--;
            }
        }
        System.out.println("Does not exist");
        return new int[] {};
    }


    public static void main(String[] args) {
    	//Test Two sum problem 
    	int [] numbers = new int [] {1,2,3,4};
    	int target = 3;
    	TwoSumSorted(numbers,target);
    }
>>>>>>> d2301bc12cddf067a134523ba715bd412355135b
}