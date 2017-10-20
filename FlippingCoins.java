import java.util.Scanner;

public class FlippingCoins {
public static void main (String[] args){
	  Scanner in=new Scanner(System.in);
	  System.out.print ("How many times do you want to flip the coin? ");
	  int flips=in.nextInt();
	  int headCount=0;
	  int tailCount=0;
	  for(int i=1; i<=flips; i++)
	{double x=Math.random();
	String coin="H";
	if (x>.5) {
		coin="H";
		headCount++;
	}
	if (x<=.5){
		coin="T";
		tailCount++;
	}
	System.out.print(coin);}
	  System.out.println();
	  System.out.println("The number of heads: "+headCount);
	  System.out.print("The number of tails: "+tailCount);

	
}
}
