package bit;

import java.util.Scanner;

public class chapter1 {  
	
	public static void main(String[] args) {
		// ����ڿ��� �̸��� �Է�
		Scanner scan =  new Scanner(System.in);
		String s = scan.nextLine();
		
		//0
		// �̸� ���
		System.out.println(s);
		
		//1
		// �̸��� ���� ���
		System.out.println(s.length());
		
		//2
		// s�� ������ true ���
		System.out.println(s.endsWith("s")); 
		
		//3
		// ù��° ���ڸ�  *�� ǥ�� 1
		System.out.println(s.replace( s.charAt(0), '*'));
		
		//4
		// j�� �����ϸ�  false ���
		System.out.println(s.startsWith("j"));
		
		//5
		// �̸� �߿�  E or A�� ������ *���
		if(s.contains("E"))
            System.out.println("*");
		if(s.contains("A"))
            System.out.println("*");
 
		//6
		// �̸� �߿� on�� ������  **�� ǥ��
		System.out.println(s.replaceFirst("on", "**"));
		
		//7
		// ��� �빮�ڷ� ���
		System.out.println(s.toUpperCase());
		
		//8
		// �����̽�(����)�� �Է� ������ ����
		System.out.println(s.trim());
		
		//9
		// on �� �� ��° �ڸ��� �ִ°�?? 
        System.out.println(s.indexOf("on"));
 
        //10
		// ù ��° n�� �� ��° �ε����� �ִ°�
        System.out.println(s.indexOf("n"));
        
	}
}
