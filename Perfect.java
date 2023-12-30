/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		
		int x = Integer.parseInt(args[0]);
		String out= x + " is a perfect number since " + x + " = 1 + ";
		int sum=1;
		for (int i = 2; i <= x; i++) {
			
			if (x%i==0&&(i==x/2)) {
				sum=sum+i;
				out=out + i;
			}else if (x % i == 0) {
				sum=sum+i;
				out=out + i +" + "; 
			}
			
		}
		if (sum==x) {
			System.out.println(out);
		}
		else{
			System.out.println(x+ " is not a perfect number");
		}
	}
}
