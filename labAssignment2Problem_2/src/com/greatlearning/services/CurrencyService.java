package com.greatlearning.services;
import java.util.Arrays;

public class CurrencyService {

	public void calculateNotes(int[] currencyArr, int amount) {
		// TODO Auto-generated method stub
		int [] resultArr = new int[currencyArr.length];
		int i =0;
		int count;
		while (amount > 0) {
			if (amount >= currencyArr[i]) {
				count = amount / currencyArr[i];
				amount = amount % currencyArr[i];
				System.out.println(currencyArr[i] + ":"+ count);
			}
			++i;
		}
	}

}



