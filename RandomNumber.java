package com.acadgild.session.three;

import java.util.Scanner;

public class RandomNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int MinNo = 0;
		int MaxNo;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter Max No:");
		MaxNo = input.nextInt();
		System.out.println("Random no between 0 and " + MaxNo + " is : " + getRandomInteger(MaxNo, MinNo));

	}

	public static int getRandomInteger(int maximum, int minimum) {
		return ((int) (Math.random() * (maximum - minimum))) + minimum;
	}

}
