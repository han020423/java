package finalTest;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class TryCatch {								//파일 관리						
	public static void main(String[] args) /*throws FileNotFoundException */ {
		int[] array = new int[10];
		for (int i = 0; i < 10; i++)
		array[i] = 0;
		try {
			int result = array[13];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스가 잘못되었습니다.");
		}
		System.out.println("과연 이 문장이 실행될까요?");
		
		
		/*
		ArrayList<String> list = new ArrayList<String>();
		list.add("item1"); 
		list.add("item2"); 
		list.add("item3"); 
		try (PrintWriter output = new PrintWriter("myoutput.txt")) { // myoutput.txt 파일 생성, 파일 자동 닫기
			for (String s : list) {
				output.println(s.toLowerCase());
			}
		}
		 */
	}
}

//Exception  >  NumberException  >   TooSmallException  =  TooBigException