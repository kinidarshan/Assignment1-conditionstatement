import java.util.Scanner;

public class reversenum {

	public static void main(String[] args) {
		int num=0;
		int reversenum=0;
		System.out.println("Enter a number");
		Scanner in = new Scanner(System.in);
		 num = in.nextInt();
	

	
  while(num != 0)
	{
		reversenum = reversenum*10;
		reversenum = reversenum + num%10;
		num = num/10;
	}
	
	System.out.println("Reverse number is " + reversenum);

}
}