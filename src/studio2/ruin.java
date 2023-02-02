package studio2;

import java.util.Scanner;

public class ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int startAmount = in.nextInt();
		System.out.println(startAmount);
		int money = startAmount;
		int winLimit = in.nextInt();
		System.out.println(winLimit);
		int countVariable = 0;
		double winChance = in.nextDouble();
		System.out.println(winChance);

		while (money > 0 && money <= winLimit) {
			countVariable++;
			double actualChance;
			actualChance = Math.random();
			if (actualChance < winChance) {
				money--;
			} else {
				money++;

			}

		} 
		if (money >= winLimit) {
			System.out.println(countVariable + " win");
		} 
		else {
			System.out.println(countVariable + " lose");
		}
	}
}
