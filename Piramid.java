import java.util.Scanner;

public class Piramid {
	public static void main(String args[])
	{
		Scanner star = new Scanner (System.in);
		System.out.println("Input Star count");
		int s = star.nextInt();
		
		for (int row=1; row<=s; row++)
		{
			for (int j=1; j<=s; j++)
			{
				System.out.print("["+j+"]");
			}
			System.out.println("Row "+row);
		}
	}
}
