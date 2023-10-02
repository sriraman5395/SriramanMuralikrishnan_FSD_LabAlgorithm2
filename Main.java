package com.lab.gl;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		System.out.print("Enter the size of currency denominations");
		int size = sc.nextInt();
		int[] denominations = new int[size];


		System.out.println("enter the currency denominations value");
		for (int i = 0; i < size; i++) {

			denominations[i] = sc.nextInt();

		}


		System.out.print("Enter the amount you want to pay: ");
		int amount = sc.nextInt();

		sc.close();

		MergeSort mergeSort = new MergeSort();
		mergeSort.mergeSort(denominations, 0, denominations.length - 1);

		Currency.calculateMinCoins(denominations, amount);
	}

}
