// Simple isPrime Problem
class isPalindrome {

	public static boolean checkIsPalindrome(String word){
        int i = 0;
        int j = word.length() - 1; 
        while (i < j){ 
			if (word.charAt(i) != word.charAt(j)){
				return false; 
			}
            i++; 
            j--; 
        } 

		return true; 
    } 

	public static void main(String [] args){
		System.out.println(checkIsPalindrome("haah"));
		System.out.println(checkIsPalindrome("stephen"));
		System.out.println(checkIsPalindrome("ABBA"));
  }
}
