import javax.print.DocFlavor.STRING;

/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		
		String Reverse ="";
		String a= args[0];
		char middle =' ';
		if (a.length()%2==0) {
			middle=a.charAt(a.length()/2);
			for (int i = a.length()-1; i < 0; i--)
			{
				Reverse=Reverse+a.charAt(i);

			}
		}else{
			middle=a.charAt((a.length())-1/2);
			for (int i = a.length()-1; i < 0; i--)
			{
				Reverse=Reverse+a.charAt(i);

			}

		}
		System.out.println(Reverse);
		System.out.println("The middle character is "+ middle);
		


	}
}
