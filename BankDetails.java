package com.BankApp;
import java.util.*;

public class BankDetails {

	public static void main(String[] args) {
		
		Accounts Acc=new Accounts("Venu", "my101");
		Acc.Show();

	}

}
class Accounts
{
	static Scanner sc=new Scanner(System.in);
	int TotalAmount=0;
	 int amount;
	 int PreviousAmount;
	 String UserName;
	 String UserID;
	Accounts(String UserName, String UserID){
		this.UserName=UserName;
		this.UserID= UserID;
		
	}

void Deposit(int Amount)
{
	if(Amount!=0)
	{
		TotalAmount+=Amount;
		System.out.println("Amount Deposited : "+TotalAmount);
		PreviousAmount = Amount;
		System.out.println(PreviousAmount=Amount);
	}
}

 void withdrawl(int Amount)
 {
	if(Amount!=0)
	{
		TotalAmount-=Amount;
		System.out.println("Amount withdrawl from Accoutn : ");
		PreviousAmount=-Amount;
		System.out.println(PreviousAmount);
	}
 }
 void getPreviousTransaction()
 {
	 if(PreviousAmount>0)
	 {
		 System.out.println("Amount Deposited : "+ PreviousAmount);
	 }
	 else if(PreviousAmount<0)
	 {
		 System.out.println("Amount withdrawl : "+PreviousAmount);
	 }
	 else
	 {
		 System.out.println("No Previous transaction Happened");
	 }
 }
   void Show()
   {
	   System.out.println("WelCome to The My BankWorld "+UserName);
	   System.out.println("Choose below options to perform actions : ");
	   char options;
	   System.out.println();
	   System.out.println("A. CheckBalance");
	   System.out.println("B. Deposit");
	   System.out.println("C. Withdrawl");
	   System.out.println("D. getPreviousAmount");
	   System.out.println("E. Exit");
	   
	   //Character.toUpperCase(options);
	   
	   do
	   {
		   System.out.println("Choose options : ");
		   options= sc.next().charAt(0);
		   Character.toUpperCase(options);
		   switch(options)
		   {
		   case 'A' : 
			   System.out.println("Amount Available : "+TotalAmount);
			   System.out.println();
			   break;
			   
		   case 'B' :
			   System.out.println("Choose Amount to Deposit :");
			   int Damount = sc.nextInt();
			   Deposit(Damount);
			   System.out.println();
			   break;
			   
		   case 'C' :
			   System.out.println("Choose Amount to withdrawl : ");
			   int Wamount = sc.nextInt();
			   withdrawl(Wamount);
			   System.out.println();
			   break;
		   case 'D' :
			   System.out.println("Know the Previus Details : ");
			   getPreviousTransaction();
			   System.out.println();
			   break;
		   case 'E' :
			   System.out.println("This is Exit Option");
			   System.out.println();
			   break;
			   
		   default :
			   System.out.println("Invalid Option Choosed : ");
			   System.out.println();
			  
			   
		   }
	   }while(options!='E');
	   
   }
}
