package com.service;

import java.util.Scanner;

import com.data.CalculateArea;

public class Service {

	public void performOperation() {
		CalculateArea c = new CalculateArea();
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		do {
			System.out.println("1.Area of Circle \n 2. Area of Square \n 3. Area of triangle ");
			System.out.println("Enter you choice");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("enter radius of circle");

				int radius = sc.nextInt();
				double area = c.areaCircle(radius);
				System.out.println("area:" + area);
				break;

			case 2:
				System.out.println("enter side of Square");

				int side = sc.nextInt();
				area = c.areaSquare(side);
				System.out.println("area:" + area);
				break;
			case 3:
				System.out.println("enter height of triangle");
				int height = sc.nextInt();

				System.out.println("enter base of triangle");
				int base = sc.nextInt();

				area = c.areaTriangle(height, base);
				System.out.println("area:" + area);
				break;
			default:
				System.out.println("sorry no option");
				break;
			}
			System.out.println("Type '1' to quit");
			ans = sc.nextInt();
		} while (ans != 1);
	}

}
