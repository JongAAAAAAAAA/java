package java_github;

import java.util.Scanner;

public class BAEKJOON_5086 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if(A==0 && B==0)
				break;
			
			if(B%A==0) {
				System.out.println("factor");
			}
			else if(A%B==0) {
				System.out.println("multiple");
			}
			else {
				System.out.println("neither");
			}
		}
	}
}


