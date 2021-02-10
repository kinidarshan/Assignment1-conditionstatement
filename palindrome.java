import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {

       System.out.println("Enter a number");
		Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int temp = num;
        int rev = 0,rem;
        
        while(temp !=0)
        {
        	rem = temp%10;
        	rev = rev*10+rem;
        	temp = temp/10;
        }
        if(num==rev)
        {
        	System.out.println("It is a palindrome number");
        }
        else
        {
        	System.out.println("It is not a palindrome number");
        }
	}

}
