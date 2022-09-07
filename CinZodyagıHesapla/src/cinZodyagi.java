import java.util.Scanner;

public class cinZodyagi {

	public static void main(String[] args) {
		
		int year;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Doðum Yýlýnýzý Giriniz:");
		year = input.nextInt();
		
		int cinZodyagi = year % 12;
		
		switch (cinZodyagi) {
			case 0:
				System.out.println("Çin Zodyaðý burcunuz: Maymun");
				break;
			case 1:
				System.out.println("Çin Zodyaðý burcunuz: Horoz");
				break;
			case 2:
				System.out.println("Çin Zodyaðý burcunuz: Köpek");
				break;
			case 3:
				System.out.println("Çin Zodyaðý Burcunuz: Domuz");
				break;
			case 4:
				System.out.println("Çin Zodyaðý Burcunuz: Fare");
				break;
			case 5:
				System.out.println("Çin Zodyaðý Burcunuz: Öküz");
				break;
			case 6:
				System.out.println("Kadir'in Çin Zodyaðý Burcu: Kaplan");
				break;
			case 7:
				System.out.println("Çin Zodyaðý Burcunuz: Tavþan");
				break;
			case 8:
				System.out.println("Çin Zodyaðý Burcunuz: Ejderha");
				break;
			case 9:
				System.out.println("Çin Zodyaðý Burcunuz: Yýlan");
				break;
			case 10:
				System.out.println("Çin Zodyaðý Burcunuz: At");
				break;
			case 11:
				System.out.println("Çin Zodyaðý Burcunuz: Koyun");
				break;
			
			
		}
		

	}

}
