//Get the nth fibonacci 
class Fibonacci {


	public static int getNthFib(int n) {
		if(n == 1){
			return 0;
		}
		if(n ==2){
			return 1;
		}
		else{
			return getNthFib(n-1) + getNthFib(n-2);
		}
  }

	public static void main(String [] args){
		System.out.println(getNthFib(3));
		System.out.println(getNthFib(6));
		System.out.println(getNthFib(8));
  }
}
