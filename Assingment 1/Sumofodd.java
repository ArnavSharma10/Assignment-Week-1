package javatest;
import java.util.Scanner;

public class Sumofodd {

	
		 static Scanner SC = new Scanner(System.in);
			public static void main(String[] args) {
				System.out.print("Enter 3 digit Number: ");
				System.out.println("Sum of Odd Digits in the given number: "+ sumOfOdddigits(SC.next()));

			}
			
			public static int sumOfOdddigits(String s) {
				int sum = 0, n = s.length();
				for(int i = 0; i < n; i++) {
					int c = s.charAt(i) - '0';
					sum+=c%2!=0?c:0;
				}
				return sum;
		}
			
			


	}