/*
 PayMoney. processes thousands of transactions daily amounting to crores of Rupees. They
also have a daily target that they must achieve. Given a list of transactions done by
PayMoney and a daily target, your task is to determine at which transaction PayMoney
achieves the same. If the target is not achievable, then display the target is not achieved.
 TestCase 1
Enter the size of transaction array
3
Enter the values of array
20 12 31
Enter the total no of targets that needs to be achieved
2
Enter the value of target
21
Target achieved after 2 transactions
Enter the value of target
19
Target achieved after 1 transactions
Explanation
Target 1 i.e 21 is achieved after 2 transactions, (20 + 12)
Target 2 i.e 19 is achieved in the 1st transaction itself.
 */
package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.services.TransactionService;

public class Driver {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int transtionSize = 0;
		int noOfTarget;
		int targetVal;
		TransactionService tc = new TransactionService();
		System.out.println("Enter the size of transaction array\r\n");
		transtionSize = sc.nextInt();
		
		int transactionArr[] = new int[transtionSize];
		System.out.println("Enter the values of array\r\n");
		
		for(int i=0; i<transtionSize; i++){  
		//reading array elements from the user   
			transactionArr[i]=sc.nextInt();  
		}   

		System.out.println("Enter the total no of targets that needs to be achieved\r\n");
		noOfTarget = sc.nextInt();
		for(int i=0; i< noOfTarget;i++) {
			System.out.println("Enter the value of target\r\n");
			targetVal = sc.nextInt();
			int noOfDays = tc.checkTargets(targetVal, transactionArr);
			if(noOfDays == -1) {
				System.out.println("Given target is not achieved !!");
			}
			else {
				System.out.println("Target achieved after "+ noOfDays + " transactions");
			}
		}
		
	}
}
