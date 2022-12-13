package edu.kh.array.exedu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {
	Scanner sc = new Scanner(System.in);
	
	
	public void practice1(){
		int sum = 0;
		int arr[] = new int[9];
		for(int i =0; i<arr.length; i++) {
		arr[i] = i +1;
		System.out.print(arr[i]+ " ");
		if(i%2==0) {
			
			sum += arr[i];
			
		}
		

		}
		System.out.println();
		System.out.println("짝수 번째 인덱스 합 : " + sum);
		
	}
	
	
	public void practice2(){
		int sum = 0;
		int arr[] = new int[9];
		for(int i =0; i<arr.length; i++) {
			arr[i] = arr.length - i;
		System.out.print(arr[i]+ " ");
		if(i%2!=0) {
			
			sum += arr[i];
			
		}
		

		}
		System.out.println();
		System.out.println("짝수 번째 인덱스 합 : " + sum);
		
	}
	
	public void practice3(){
		
		System.out.print("양의 정수 :");
		
		int input = sc.nextInt();
		int arr[] = new int[input];
		
		for(int i =0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+ " ");
		}
		
	}
	
	public void practice4(){
		int input0 = sc.nextInt();
		System.out.println("입력 0 :");
		int input1 = sc.nextInt();
		System.out.println("입력 1 :");
		int input2 = sc.nextInt();
		System.out.println("입력 2 :");
		int input3 = sc.nextInt();
		System.out.println("입력 3 :");
		int input4 = sc.nextInt();
		System.out.println("입력 4 :");
		
		int[] arr ;
		for(int i =0; i<)
	}

	
	public void practice5(){
	
		
		
		System.out.print("문자열 : ");
		String input = sc.next();
		String str = "";
//		1. 문자열을 입력 받아 한글자씩 잘라내어 char배열에 순서대로 저장
		char[] arr = new char[input.length()];

		int count = 0;
		
		
//	2. 문자 하나를 입력 받아 일치하는 문자가 char 배열에 몇개 존재하는 지 확인		
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);

		
		for(int i =0; i<arr.length; i++) {
			arr[i]  = (input.charAt(i));
	
			if(ch == arr[i]) {
				str += i + "";
				count++;
				
			}
		
		}
		
		System.out.println(input + "에 " + ch + "가 존재하는 위치(인덱스) : " + str);
		System.out.println(ch + " 개수 : " + count);
		
		
		
		
		
		
	}


	
	
	public void practice6(){
		
		System.out.print("정수 : ");
		int input = sc.nextInt();

		int arr[] = new int[input];
		int i =0;
		for(; i<arr.length; i++) {
			
			System.out.printf("배열 %d번째 인덱스에 넣을 값 :" ,i);
			int input2 = sc.nextInt();
			
		
			arr[i] += input2;
			
			
			
	
		}
		System.out.print(arr[i] + " ");
	
	}

	
	public void practice7(){
		
		String age =sc.next();
		System.out.print("주민등록번호(-포함) : ");
	
		
		
	}
	
	


}
