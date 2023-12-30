/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		
		int n = Integer.parseInt(args[0]);
		String out= n + " is a perfect number since " + n + " = 1 ";
		int sum=1;
		for (int i = 2; i < n; i++) {
			
			if (n%i==0){
				sum=sum+i;
				out=out + " + " +i;

			}
			
				
			
			
		}
		if (sum==n) {
			System.out.println(out);
		}
		else{
			System.out.println(n + " is not a perfect number");
		}

		



		
		

	
	}
}
