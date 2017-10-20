import java.util.Random;
import java.util.Scanner;
public class Histogram {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Random rand=new Random();
		System.out.print ("How many times do you want to roll the dice? ");
		int total;
		int rolls=in.nextInt();
		int two=0;
		int three=0;
		int four=0;
		int five=0;
		int six=0;
		int seven=0;
		int eight=0;
		int nine=0;
		int ten=0;
		int eleven=0;
		int twelve=0;

		for (int i=0;i<=rolls;i++){
			total=rand.nextInt(12)+2;
			System.out.print(total+" ");
			if (total==2)two++;		
			if (total==3)three++;
			if (total==4)four++;
			if (total==5)five++;
			if (total==6)six++;
			if (total==7)seven++;
			if (total==8)eight++;
			if (total==9)nine++;
			if (total==10)ten++;
			if (total==11)eleven++;
			if (total==12)twelve++;
			}
		System.out.println();
		System.out.print("2:");
		for (int j=1;j<=two;j++)System.out.print("*");
		System.out.println();
		System.out.print("3:");
		for (int j=1;j<=three;j++)System.out.print("*");
		System.out.println();
		System.out.print("4:");
		for (int j=1;j<=four;j++)System.out.print("*");	
		System.out.println();
		System.out.print("5:");
		for (int j=1;j<=five;j++)System.out.print("*");
		System.out.println();
		System.out.print("6:");
		for (int j=1;j<=six;j++)System.out.print("*");
		System.out.println();
		System.out.print("7:");
		for (int j=1;j<=seven;j++)System.out.print("*");
		System.out.println();
		System.out.print("8:");
		for (int j=1;j<=eight;j++)System.out.print("*");
		System.out.println();
		System.out.print("9:");
		for (int j=1;j<=nine;j++)System.out.print("*");
		System.out.println();
		System.out.print("10:");
		for (int j=1;j<=ten;j++)System.out.print("*");
		System.out.println();
		System.out.print("11:");
		for (int j=1;j<=eleven;j++)System.out.print("*");
		System.out.println();
		System.out.print("12:");
		for (int j=1;j<=twelve;j++)System.out.print("*");


	}

}
