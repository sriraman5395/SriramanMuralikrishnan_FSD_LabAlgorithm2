package com.lab.gl;

public class Currency {

	public static void calculateMinCoins(int[] denominations, int amount) {
		System.out.println("Your payment approach in order to give min no of notes will be");

		for (int i = 0; i < denominations.length; i++) {
			int countCurr = amount / denominations[i];
			if (countCurr > 0) {
				System.out.println(denominations[i] + ":" + countCurr);
				amount = amount % denominations[i];
			}
		}
	}


}
