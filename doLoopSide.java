import java.util.Scanner;
 
public class doLoopSide {
  public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  System.out.print("Please enter your side length: ");
 
  int sideLength = in.nextInt();
  int heightTop = sideLength;
  int heightBottom = sideLength-1;
 
  //Top Half of Diamond
  for (int j=1;j<=heightTop+1;j++){//changed to heightTop+1
    for (int k= (heightTop-j);k>=0 ;k--){
      System.out.print(" ");
    }
    for (int n=1;n<(2*j-2);n++){//changed to 2*j-2
      System.out.print("*");
    }
    System.out.println();
  }
 
  /*Reverse this loop*/
  for (int j=heightTop;j>1;j--){
    for (int k= (heightTop-j);k>=0 ;k--){
      System.out.print(" ");
    }
    for (int n=1;n<(2*j-2);n++){
      System.out.print("*");
    }
    System.out.println();
  }
 
  //Bottom Half of Diamond
  /*for (int h = heightBottom; h > 1; h--){
    for (int p = heightTop-h; p >= 0; p--){
      System.out.print(" ");
    }
    for (int f=heightBottom;f<=h*2-1; f++){
      System.out.print("*");
    }
    System.out.println();
    }*/
  }
}