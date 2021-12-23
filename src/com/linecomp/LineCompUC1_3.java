package com.linecomp;

import java.util.Scanner;

public class LineCompUC1_3 {
	
	public static void main(String[] args) {
		 System.out.println("Welcome to line comparision problem");
		 
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
		
		int length1 = (int) Math.pow(add, .05);
		
		//line 2 point
		int a = (x2 -x1);
		int b = (y2 -y1);
		int powerofa = (int) Math.pow(a, 2);
		int powerofb = (int) Math.pow(b, 2);
		int add2 = powerofa + powerofb;
		
		int length2 =(int)Math.pow(add2, 0.5);
		
		if (length1 == length2 ) {
			System.out.println("The two line are equal ");
		}else if ( length1 > length2){
			System.out.println("line one is greater than line 2");
		}else if (length1 < length2){
			System.out.println("line one is less than line 2");
		}else {
		System.out.println("The two line are not equal");
		}
	}

}


