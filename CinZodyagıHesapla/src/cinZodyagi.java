import java.util.Scanner;

public class cinZodyagi {

	public static void main(String[] args) {
		
		int year;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Do�um Y�l�n�z� Giriniz:");
		year = input.nextInt();
		
		int cinZodyagi = year % 12;
		
		switch (cinZodyagi) {
			case 0:
				System.out.println("�in Zodya�� burcunuz: Maymun");
				break;
			case 1:
				System.out.println("�in Zodya�� burcunuz: Horoz");
				break;
			case 2:
				System.out.println("�in Zodya�� burcunuz: K�pek");
				break;
			case 3:
				System.out.println("�in Zodya�� Burcunuz: Domuz");
				break;
			case 4:
				System.out.println("�in Zodya�� Burcunuz: Fare");
				break;
			case 5:
				System.out.println("�in Zodya�� Burcunuz: �k�z");
				break;
			case 6:
				System.out.println("Kadir'in �in Zodya�� Burcu: Kaplan");
				break;
			case 7:
				System.out.println("�in Zodya�� Burcunuz: Tav�an");
				break;
			case 8:
				System.out.println("�in Zodya�� Burcunuz: Ejderha");
				break;
			case 9:
				System.out.println("�in Zodya�� Burcunuz: Y�lan");
				break;
			case 10:
				System.out.println("�in Zodya�� Burcunuz: At");
				break;
			case 11:
				System.out.println("�in Zodya�� Burcunuz: Koyun");
				break;
			
			
		}
		

	}

}
