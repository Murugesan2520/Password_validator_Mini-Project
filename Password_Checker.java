package task.interview;

import java.util.Scanner;

public class Password_Checker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner scobj=new Scanner(System.in);
 System.out.println("Enter Your Password");
 String s=scobj.nextLine();
 int slength=s.length();
 char[] ch=s.toCharArray();
 int lowercase=0;
 int uppercase=0;
 int number=0;
 int spl_character=0;
 
 if(slength<8)
 {
	System.out.println("your password must have  atlest 8 character "); 
 }
 else if(slength>=8) {
	 for(int i=0;i<ch.length;i++)
	 {
		if(ch[i]>='a'&&ch[i]<='z')
		{	
			lowercase++;
		}
		else if(ch[i]>='A'&&ch[i]<='Z')
		{
			//System.out.print(ch[i]);
			
			uppercase++;
		}
		else if(ch[i]>='0'&&ch[i]<='9')
		{
			number++;
		}
		else {
			spl_character++;
		}
	 }
 
 if(uppercase>=1&&lowercase>=1&&number>=1&&spl_character>=1)
 {
	 System.out.println("---------------Good Password------------");
	 System.out.println("Your Password is strong");
	 System.out.println("Your Password is valid ");
 }
 else
 {
	 System.out.println("------------oops---------");
	 System.out.println();
	 System.out.println("Your Password is Not Valid");
	 System.out.println("Enter a  strong Password");
	 System.out.println("Your password must have");
	 System.out.println("Atleast one Uppercase letter a-z");
	 System.out.println("Atleast one lowercase letter A-z");
	 System.out.println("Atleast one Numeric number   0-9");
	 System.out.println("Atleast one Special Character !-?");
 }
 }
	}

}
