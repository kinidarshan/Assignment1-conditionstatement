import java.util.Scanner;
public class sumofdigits {

	public static void main(String[] args) {
		int sum=0,count=0;
		System.out.println("Enter a number : ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		while(num != 0)
		{
			count = num % 10;
			num = num/10;
			sum = sum + count;
		}
		System.out.println("The sum of digits id "+sum);
		s.close();
	}

}
