import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*1��
		// int���� 100���� ���Ҹ� ������ array�� �����Ǵ� �迭�� ����
		int [] array = new int[100]; 
		*/
		
		
		/*2��
		// int�� ������ �����ϰ� �ִ� �迭 array�� ���� ������ ���� �� ��� ����� �ݺ� ������ �ۼ�
		int [] array = {1,2,3,4,5}; // �ʱ�ȭ
		int [] b = new int[array.length];
		for (int i = 0; i < b.length; i++) {
			b[i] = array[i*2];
		}
		*/
		
		
		/*3��
		// ����ڿ��� �迭�� ũ�⸦ �޾Ƽ� double�� �迭�� ����
		int Size = 0;
		Scanner scan = new Scanner(System.in);
		Size = scan.nextInt();
		int ArrayInput[] = new int[Size];
		double ArrayOutput = ArrayInput[Size]; // casting 
		*/
		
		
		/*4��
		// �ϳ��� �迭�� �ٸ� �迭�� �����ϴ� �ݺ� ������ �ۼ�
		int [] a = {1,2,3,4,5}; // �ʱ�ȭ
		int [] b = new int[a.length];
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i];
		}
		System.out.println(b);
		*/
		
		
		/*5��
		// ����ڿ��� �Է� ���� ���ڸ� ������������ ����
		Scanner scan = new Scanner(System.in);
		int[] str = new int[3];
		for(int i = 0; i<3; i++)
		{
			str[i] = scan.nextInt();
		}
		int temp = 0; // ������ ���� �ӽ÷� ���� ������ ���� 
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i] > str[j]) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
			System.out.print(str[i]);
			if (i < str.length - 1) {
				System.out.print(",");
			}
		}
 		*/
		
		
		/*6��
		// 2���� �迭�� ��� ��� ���� ���հ� ����� ���ϴ� ���α׷��� �ۼ�
		int arr[][] = { 
				{1, 2, 3, 4, 5}, 
				{6, 7, 8, 9, 10}, 
				{11, 12, 13, 14, 15}, 
				{16, 17, 18, 19, 20} }; 
		int sum = 0;
		int cnt = 0;
		double avg = 0.0;
		
		for ( int i = 0 ; i <arr.length; i++){
			for (int j = 0; j < arr[i].length; j++){
				sum += arr[i][j];
				cnt++;
			}
		}
		avg = sum/cnt;
		
		System.out.println(sum);
		System.out.println(avg);
		*/ 
		
		
		/**/
		// 1���� �迭 ����
		int Size = 0;
		Scanner scan = new Scanner(System.in);
		Size = scan.nextInt();
		int Parking [] = new int[Size];
		int num = 0;
		System.out.println("-���� ����-");
		System.out.println("1: ����");
		System.out.println("2: ����");
		System.out.println("3: ������");
		System.out.println("4: ����");
		Scanner numScan = new Scanner(System.in);
		num = numScan.nextInt();
		while(true)
		{
			if(num == 1)
			{
				Scanner scan = new Scanner(System.in);
				int[] str = new int[3];
				for(int i = 0; i<3; i++)
				{
					str[i] = scan.nextInt();
				}
			}
			if(num == 2)
			{
				
			}
			if(num == 3)
			{
				
			}
			if(num == 4)
			{
				break;
			}
		}
		
		
		/*
		// 2���� �ζ�
		*/
		int [][] Lotto; 
		Lotto = new int[3][4];
		
		System.out.println( Lotto.length ); 	
		
		for(int i = 0; i<Lotto.length; i++) 
		{
			for( int j = 0; j<Lotto[i].length; j++)
				Lotto[i][j] = 0;
			
		}
		for(int i = 0; i<Lotto.length; i++)  
		{
			for( int j = 0; j<Lotto[i].length; j++)
					System.out.print(Lotto[i][j]);
			System.out.println("");
		}
		
	}

}
