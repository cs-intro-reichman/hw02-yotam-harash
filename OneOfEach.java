
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		
		boolean girl= false;
        boolean boy= false;
        int sum=0;
		while ((!boy)||(!girl)) {
			double n= (Math.random());
            sum++;
			if (n<=0.5) {
				boy=true;
				System.out.print("b ");
			}else{
				girl=true;
				System.out.print("g ");
			}

		}
        System.out.println();
		System.out.println("You made it... and you now have " + sum + " children.");
		
	}
}
