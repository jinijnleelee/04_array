package edu.kh.array.exedu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {
	Scanner sc = new Scanner(System.in);
	
	
	public void practice1(){
		int sum = 0;
		//인덱스의 합을 입력할 변수 sum을 0으로 초기화
		int arr[] = new int[9];
		//길이가 9인 배열을 arr을 변수로 선언 및 할당
		for(int i =0; i<arr.length; i++) {
		//1부터 9까지 배열 인덱스에 대입하려면
		//배열은 인덱스가 0부터 시작하니까 i를 0으로 잡고 arr배열길이(9)전까지
		//순차적으로 증가시키면 결국 i는 8까지 인덱스가 생기면서 포문이 돌아
		arr[i] = i +1;
		//arr의 i번째에 i더하기1을 하면 1부터9까지  순차적으로 arr에 입력될거임
		//만약 i가 0이면 arr[0]= 1, arr[1] = 2
		System.out.print(arr[i]+ " ");
		//arr요소들을 출력해줘.그럼 순차적으로 출력될거임
		if(i%2==0) {
		//짝수번째 인덱스를 구하려면 i와 2를나누고 몫이 0인걸 찾으면 
		//	sum에 그 arr[i]의 요소를 누적해줘
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
//		int input0 = sc.nextInt();
//		System.out.println("입력 0 :");
//		int input1 = sc.nextInt();
//		System.out.println("입력 1 :");
//		int input2 = sc.nextInt();
//		System.out.println("입력 2 :");
//		int input3 = sc.nextInt();
//		System.out.println("입력 3 :");
//		int input4 = sc.nextInt();
//		System.out.println("입력 4 :");
	
		int arr[] = new int[5];
	
		for(int i =0; i<arr.length; i++) {
			System.out.printf("입력 " + i + ":");
	
			int input0 = sc.nextInt();

	
			arr[i] += input0;
			
			
		
		}
		System.out.print("검색할 값 :" );
		int input1 = sc.nextInt();
	
		
		//신호를 나타내기 위한 변수
		//flag == false : 일치하는 값이 존재하지 않음
		//flag == true : 일치하는 값이 존재힘
		
		boolean flag = false; //검사 전에는 없다고 가정
		
		
		//arr 배열 요소 순차 접근
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == input1) {
				System.out.println("인덱스 "+ i );
				
				flag = true;// 일치하는 값이 있으므로 true로 변경
			}
			
		}
		//flag 상태를 검사
		if(!flag) { 
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
	
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
		int sum = 0;
			
			for(int i =0; i<arr.length; i++) {
				System.out.printf("배열 %d번째 인덱스에 넣을 값 :" ,i);
		
				int input0 = sc.nextInt();

		
				arr[i] += input0;
				
				sum += arr[i];
			}
			
			System.out.println(Arrays.toString(arr));
			System.out.println("총합 :" + sum );
			
	}	
			

	
	

	
	public void practice7(){

		
		
		
		System.out.print("주민등록번호(-포함) : ");
		String age =sc.next();
		System.out.println(age);
	
		char[] arr = new char[age.length()];
		for(int i =0; i<arr.length; i++) {
			arr[i] =(age.charAt(i)) ;
		
			
			if(arr[6]=='-') {

				System.out.println("값" + arr[7+2]);  
					
				
		
			
	
			}
		}
		System.out.print(Arrays.toString(arr));
		}


	

}
