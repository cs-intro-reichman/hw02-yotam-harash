/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int n= (int) (Math.random() * 10);
		System.out.println(n+ " ");
		int n1= (int) (Math.random() * 10);
		int temp=n;
		boolean flag=true;
		while ((temp<=n1)&&(flag)) {
			System.out.print(n1);
			if (temp<=n1) {
				System.out.print(" ");
				temp=n1;
			}else{
				flag=false;
			}
			n1=(int) (Math.random() * 10);
			

		}
	}
}
