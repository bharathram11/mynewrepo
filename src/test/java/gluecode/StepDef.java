package gluecode;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef
{
	int value;
	String text;
	
	@When("I have a value like {int}")   // here we can use {int} or {}
	public void method1(int y)
	{
		value=y;
	}
	
	@Then("the number should be either even or odd")
	public void method2()
	{
		if(value%2==0)
		{
			System.out.println(value+" is Even");
		}
		else
		{
			System.out.println(value+" is Odd");
		}
	}
	
	@Then("the number should be prime or not")
	public void method3()
	{
		int flag=0;
		for(int i=2;i<value;i++) //divide value by 2 to (value-1)
		{
			if(value%i==0)
			{
				flag=1;
				break; //break the loop
			}
		}
		if(flag==0)
		{
			System.out.println(value+" is Prime");
		}
		else
		{
			System.out.println(value+" is Not Prime");
		}		
	}
	
	@Then("the number should be palindrome or not")
	public void method4()
	{
		int temp=value;
		int rev=0;
		while(temp!=0)
		{
			int rem=temp%10; //take last digit
			rev=rev*10+rem; //add last digit to reversed number
			temp=temp/10; //remove last digit
		}
		if(value==rev)
		{
			System.out.println(value+" is Palindrome");
		}
		else
		{
			System.out.println(value+" is Not Palindrome");
		}
	}
	
	@Then("the number should be armstrong or not")
	public void method5()
	{
		//153=1*1*1+5*5*5+3*3*3
		//1634=1*1*1*1+6*6*6*6+3*3*3*3+4*4*4*4
		int temp1=value;
		int temp2=value;
		//get count of digits in value
		int count=0;
		while(temp1!=0)
		{
			temp1=temp1/10;
			count++;
		}
		//check for Armstrong number
		int sum=0;
		while(temp2!=0)
		{
			int rem=temp2%10;
			sum=(int) (sum+Math.pow(rem, count));
			temp2=temp2/10;
		}
		if(sum==value)
		{
			System.out.println(value+" is Armstrong");
		}
		else
		{
			System.out.println(value+" is Not Armstrong");
		}	
	}
	
	@Given("a value like")
	public void method6(String docString) 
	{
	    text=docString;
	}
	
	@Given("a value like {string}")
	public void method7(String y) 
	{
	    text=y;
	}

	@Then("the chars count should be {int}")
	public void method8(Integer y) 
	{
		String[] lines=text.split("\n");
		int count=0;
		for(String line:lines)
		{
			count=count+line.trim().length();
		}
		System.out.println(count);
		if(count==y)
		{
			System.out.println("Chars length is Correct");
		}
		else
		{
			System.out.println("Chars length is Incorrect");
		}
	}
	
	@Then("the words count should be {int}")
	public void method9(Integer y) 
	{
		String[] lines=text.split("\n");
		int count=0;
		for(String line:lines)
		{
			count=count+line.trim().split(" ").length;
		}
		System.out.println(count);
		if(count==y)
		{
			System.out.println("Words length is Correct");
		}
		else
		{
			System.out.println("Words length is Incorrect");
		}
	}
	
	@Then("the lines count should be {int}")
	public void method10(Integer y) 
	{
		int count=0;
		count=text.split("\n").length;
		System.out.println(count);
		if(count==y)
		{
			System.out.println("Lines length is Correct");
		}
		else
		{
			System.out.println("Lines length is Incorrect");
		}
	}

	@Then("the string should be reversed and display")
	public void method11() 
	{
		String rev="";
		for(int i=text.length()-1;i>=0;i--)//loop from last char to first
		{
			rev=rev+text.charAt(i);
		}
		System.out.println(rev);  
	}

	@Then("the string should be palindrome or not")
	public void method12() 
	{
		String rev="";
		for(int i=text.length()-1;i>=0;i--)//loop from last char to first
		{
			rev=rev+text.charAt(i);
		}
		if(text.equals(rev))
		{
			System.out.println(text+" is Palindrome");
		}
		else
		{
			System.out.println(text+" is Not Palindrome");
		}
	}
}
