import java.util.Scanner;
public class Alpspl {
	private static Scanner sc;
	public static void main(String[] args) {
		String aldisp_str;
		int i, alph, spl;
		alph = spl = 0;
		char ch;
		
		sc= new Scanner(System.in);
		System.out.print("\nPlease Enter Alpha Special String =  ");
		aldisp_str = sc.nextLine();
		
		for(i = 0; i < aldisp_str.length(); i++)
		{
			ch = aldisp_str.charAt(i);
			if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ) {
				alph++;
			}
			else {
				spl++;
			}
		}		
		System.out.println("\nNumber of Alphabet Characters  =  " + alph);
		System.out.println("Number of Special Characters   =  " + spl);
	}
}  