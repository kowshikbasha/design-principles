package epam.task3;
import java.util.*;
public class Calu {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the operation");
		String s1=sc.next();
		System.out.println("Enter the two numbers");
		int n=sc.nextInt();
		int n1=sc.nextInt();
		if(s1.equals("addition"))
		{
			add a=new add();
			a.addition(n,n1);
		}
		else if(s1.equals("subtract"))
		{
			sub s=new sub();
			s.subtract(n,n1);
		}
		else if(s1.equals("multiplication"))
		{
			mul m=new mul();
			m.multi(n,n1);
		}
		else if(s1.equals("division"))
		{
			div d=new div();
			d.division(n,n1);
		}
		
	}

}
