package org.opentutorials.java_tutorials.io;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(i*1000);
        sc.close();
	}

}
