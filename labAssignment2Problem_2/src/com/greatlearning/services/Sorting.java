package com.greatlearning.services;

public class Sorting {

	public void sort(int[] currencyArr, int left, int right) {
		// TODO Auto-generated method stub
		if(left < right) {
			int mid = left + right / 2;
			sort(currencyArr, left, mid);
			sort(currencyArr, mid+1, right);
			merge(currencyArr, left, mid, right);
		}
	}

	public void merge(int currencyArr[], int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;
		int LeftArray[] = new int[n1];
		int RightArray[] = new int[n2];
		
		for (int i = 0;i < n1; i++)
			LeftArray[i] = currencyArr[left + i];
		for (int j = 0;j < n2; j++)
			RightArray[j] = currencyArr[mid + 1 + j];
		
		int i = 0, j = 0;
		int k = left;
		
		while (i < n1 && j < n2) {
		if (LeftArray[i] >= RightArray[j]) {
			currencyArr[k] = LeftArray[i];
			i++;
		}
		else {
			currencyArr[k] = RightArray[j];
			j++;
		}
			k++;
		}
		while (i < n1) {
			currencyArr[k] = LeftArray[i];
			i++;
			k++;
		}
		while (j < n2) {
			currencyArr[k] = RightArray[j];
			j++;
			k++;
		}
	}
}
