package com.greatlearning.services;

import java.util.Scanner;

public class TransactionService {
	public int checkTargets(int targetVal, int[] transactionArr) {
		// TODO Auto-generated method stub			
			for(int i=0; i<transactionArr.length; i++) {
				if (transactionArr[i] >= targetVal) {
					return i+1;
				}else {
					targetVal = targetVal + transactionArr[i];
				}
			}
			return -1;
	}
}
