package edu.kh.array.ex;

import java.util.Arrays;

public class ArrayExample2 {

	
	//얕은 복사(shallow: 얕은)
	// - > 주소를 복사하여 서로 다른 두 변수가 (같은 주소)
	//하나의 배열(또는 객체)을 참조하는 상태를 만드는 복사 방법
	
	public void ShallowCopy() {
		
		
		//얕은 복사(deep)
//		->같은 자료형의 새로운 배열을 만들어서
//		기존 배열의 데이터를 모두 복사하는 방법
		int arr[] = {1,2,3,4,5};
		
		//얕은 복사 진행
		int[] copyArr = arr;//주소만 복사
		
		
		
		System.out.println("주소확인");
		System.out.println("arr"+ arr);
		System.out.println("copyArr" + copyArr);
		
		
		copyArr[2] =999;
		
		//배열 값 변경 확인
		System.out.println("변경 전");
		System.out.println("arr " + Arrays.toString(arr));
		System.out.println("copyArr " + Arrays.toString(copyArr));
		
	}
	
	public void deepCopy() {
		int arr[] = {1,2,3,4,5};
		int[]	copyArr1 = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			copyArr1[i] = arr[i];
		}
	
		//2.system.arraycopy(원본배열,원본 복사 시작 인덱스
		//		복사배열,복사배열의 삽입 시작 인덱스 복사 길이)
		
		int[] copyArr2 = new int[arr.length];
		System.arraycopy(arr, 0, copyArr2, 0, arr.length);
		
		//3. Arrays.copyOf(원본 배열, 복사할 길이);

		int[] copyArr3 = Arrays.copyOf(arr,arr.length);
		
		//값 변경 후 확인
		copyArr1[4] = 0;
		copyArr2[4] = 999;
		copyArr3[4] = 5000;
		
		
		System.out.println("arr :" + Arrays.toString(arr));
		System.out.println("copyArr1 :" + Arrays.toString(copyArr1));
		System.out.println("copyArr2 :" + Arrays.toString(copyArr2));
		System.out.println("copyArr3 :" + Arrays.toString(copyArr3));
	}

	
	public void creatLottoNumber(){
		//로또 번호 생성기
		//[6,12,16,20,21,41]
		
		//1.1~45사이 중복되지 않는 난수  6개 생성 => math.randaom()
		//2.생성된 난수가 오름차순으로 정렬 => Arrays.sort()
		
		//1) 정수 6개를 저장할 배열 선언 및 할당
		int[] lotto = new int[6];
		
		//2)생성된 배열을 처음부터 끝까지 순차 접근하는 for문 작성
		for(int i =0; i< lotto.length; i++) {
			
			//3) 1~45 사이의 난수생성
			int random = (int)(Math.random() * 45 + 1);
			//0.0 <- = < 1.0
			//0.0 < = x * 45 < 45.0
					//1.0 <= 45+ 1 < 46
					//1 <= (int)(X * 45+1) < 46
			
			//4) 생성된 난수를 순서대로 배열 요소에 대입
			lotto[i] = random;
			
			//5)중복 검사를 위한 for문 작성
			for(int x = 0; x<1; x++) {
				
				//6) 현재 생성된 난수와 같은 수가
				//앞쪽 요소에 있는지 검사
				if(lotto[i] == lotto[x]) {
					
					i--;
					//i가 1씩 증가할때마다 난수가 하나 생성
					//--> 중복 값이 있으므로 난수를 새로 하나 더 생성해야함
					//--->i는 기본적으로 0~5까ㅏ지 6회 반복되지만
					//i값을 인위적으로 1 감소 시켜서 7회로 반복되는 오염을 만듬
					break;
					//앞족에서 중복 데이터 발견하면
					//남은 값을 비교할 필요 없음
					// --> 효율 향상을 위해서 검사하는 for문을 종료
					
				}
			}
		
		
		
		}//for문 끝

		
		//7) 오름차순 정렬
		// ---> 선택,삽입,버블,퀵 등등
		//Arrays.sort(배열명) : 배열 내 값들이 오름차순을 정렬됨
		//시간복잡도
		
		Arrays.sort(lotto);
		
		//결과출력
		System.out.println(Arrays.toString(lotto));
	}


}
		

		