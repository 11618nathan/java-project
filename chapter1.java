package bit;

import java.util.Scanner;

public class chapter1 {  
	
	public static void main(String[] args) {
		// 사용자에게 이름을 입력
		Scanner scan =  new Scanner(System.in);
		String s = scan.nextLine();
		
		//0
		// 이름 출력
		System.out.println(s);
		
		//1
		// 이름의 길이 출력
		System.out.println(s.length());
		
		//2
		// s로 끝나면 true 출력
		System.out.println(s.endsWith("s")); 
		
		//3
		// 첫번째 문자를  *로 표시 1
		System.out.println(s.replace( s.charAt(0), '*'));
		
		//4
		// j로 시작하면  false 출력
		System.out.println(s.startsWith("j"));
		
		//5
		// 이름 중에  E or A가 있으면 *출력
		if(s.contains("E"))
            System.out.println("*");
		if(s.contains("A"))
            System.out.println("*");
 
		//6
		// 이름 중에 on이 있으면  **로 표시
		System.out.println(s.replaceFirst("on", "**"));
		
		//7
		// 모두 대문자로 출력
		System.out.println(s.toUpperCase());
		
		//8
		// 스페이스(공백)을 입력 했으면 제거
		System.out.println(s.trim());
		
		//9
		// on 은 몇 번째 자리에 있는가?? 
        System.out.println(s.indexOf("on"));
 
        //10
		// 첫 번째 n은 몇 번째 인덱스에 있는가
        System.out.println(s.indexOf("n"));
        
	}
}
