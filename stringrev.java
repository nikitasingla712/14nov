import java.util.Scanner;
public class stringrev
{
	boolean isAlphabetic(char x)
	{
		return((x>='A' && x<='Z') ||( x>='a' && x<='z'));
	}
	public static void reverse(char s[])
	{
		int right=s.length-1;
		int left=0;
		while(left<right)
		{
			if(!Character.isAlphabetic(s[left]))
				left++;
			else if(!Character.isAlphabetic(s[right]))
				right--;
			else
			{
				char temp=s[left];
				s[left]=s[right];
				s[right]=temp;
				left++;
				right--;
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char c[]=str.toCharArray();
		System.out.println("Input String: "+str);
		reverse(c);
		String rev=new String(c);
		System.out.println("Output String: "+rev);
	}

}
