package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.services.CurrencyService;
import com.greatlearning.services.Sorting;

public class Driver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		CurrencyService cs = new CurrencyService();
		Sorting s = new Sorting();
		int size;
		int amount;
		System.out.println("Enter the size of currency denominations:");
		size = sc.nextInt();
		
		int currencyArr[] = new int[size];
		
		System.out.println("Enter the currency denominations value:");
		for(int i=0; i<size; i++){  
			int value = sc.nextInt();
		//reading array elements from the user 
			if(value > 0) {
				currencyArr[i]= value;	
			}else {
				System.out.println("Not possible!!");
				return;
			}
			
		}
		
		s.sort(currencyArr, 0, currencyArr.length -1);
		
		System.out.println("Enter the amount you want to pay");
		amount = sc.nextInt();
		
		System.out.println("Your payment approach in order to give min no of notes will be:");
		cs.calculateNotes(currencyArr, amount);
	}


}
