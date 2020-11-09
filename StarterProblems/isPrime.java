// Simple isPrime Problem
class isPrime {

	public static boolean isPrimeSlow(int n ){
		for(int i = 2; i < n; i++) {
        	if(n % i == 0){
            	return false;
        	}
    }
    return true;
	}

	//stops if anything divides by two
	public static boolean checkIsPrime(int n) {
		if(n % 2 == 0){
			return false;
		}

	    //if not, then just check the odds
	    for(int i = 3; i * i <= n; i += 2) {
	        if(n % i == 0)
	            return false;
	    }
	    return true;
 	}

 	

	public static void main(String [] args){
		System.out.println(isPrimeSlow(3));
		System.out.println(isPrimeSlow(5));
		System.out.println(isPrimeSlow(8));

		System.out.println(checkIsPrime(3));
		System.out.println(checkIsPrime(5));
		System.out.println(checkIsPrime(8));

  }
}
