/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T=Integer.parseInt(args[0]);
		int c2=0;
		int c3=0;
		int c4=0;
		double count=0;
		int sum=0;
		for (int i = 0; i < T; i++) {
			boolean girl= false;
            boolean boy= false;
            sum=0;
		    while ((!boy)||(!girl)) {
			   double n= (Math.random());
               sum++;
			   if (n<=0.5) {
				boy=true;
				
			    }else{
				girl=true;
				
			    }
			}
			if (sum==2) {
				c2++;
			}
			if (sum==3) {
				c3++;
			}
			if (sum>=4) {
				c4++;
			}	
			count+=sum;
		}
		double avg = count/T;
		System.out.println("Average: " + avg+ "children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + c2);
		System.out.println("Number of families with 3 children: " + c3);
		System.out.println("Number of families with or more children: " + c4);
		int max= Math.max(Math.max(c4, c3), c2);
		if (max==c2||max==0){

			System.out.println("The most common number of children is 2.");
		}else if (max==c3) {
			System.out.println("The most common number of children is 3.");
		}else {
			System.out.println("The most common number of children is 4 or more.");
		}

		
		
		

			
		
		
		
		

	 
			
		

		
		

		
	
	}
		

		
		

	
	}

