import java.util.*;
public class Gross_Salary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the test cases");//Enter the test cases
		int t=sc.nextInt();
		System.out.println("enter the salaray");
		for(int a=0;a<t;a++)
		{
			int d=sc.nextInt();// Enter the salaray
			if(d<1500)
			
				System.out.println(d+(0.1*d)+(0.9*d));// if salary is less than 1500
				else
					System.out.println(d+500+(0.98*d));// if salary is greather than 1500
			
		}

	}

}

/*
 Pseudo code
 1.enter the test cases
 2.enter the salary
 3.if salary< 1500 then (d+(0.1*d)+(0.9*d))
 4.else (d+500+(0.98*d))
 
 logic
 if salary >1500 (d+(0.1*d)+(0.9*d))
 else
 (d+500+(0.98*d))
 
 
 



*/