package com.linecomp;

import java.util.Scanner;

public class LineCompUC4 {
		
		public static void main(String[] args) {
			System.out.println("Welcome to line comparision problem");
			lineComp();
			checkingEqualsLine(0 , 0 );
		}
			
			public static void  lineComp() {
			
			System.out.println("Enter the first  line point ");
			Scanner sc = new Scanner(System.in);
			int x0 = sc.nextInt();
			int y0 = sc.nextInt();
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			System.out.println("Enter the second line point");
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int x3 = sc.nextInt();
			int y3 = sc.nextInt();
			sc.close();
			
			int x = (x0 -x1);
			int y = (y0 - y1);
			int powerofx = (int) Math.pow(x, 2);
			int powerofy = (int) Math.pow(y, 2);
			int add = powerofx + powerofy;
			
			double length1 = (int) Math.pow(add, .05);
			
			//line 2 point
			int a = (x2 -x1);
			int b = (y2 -y1);
			int powerofa = (int) Math.pow(a, 2);
			int powerofb = (int) Math.pow(b, 2);
			int add2 = powerofa + powerofb;
			
			double length2 =(int)Math.pow(add2, 0.5);
			System.out.println("length of line 1" +length1 + "second Length : " + length2);
		
			}
			
			private static void checkingEqualsLine(double length1, double length2) {
				
				int a = (int) length1;
				int b = (int) length2;

				if (a == b) {
					System.out.println("Lines are equal");
				} else {
					System.out.println("Lines are not equal");
				}
				System.out.println(Double.compare(length1, length2));
		
	}

}
