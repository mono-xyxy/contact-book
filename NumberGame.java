import java.util.Scanner;

public class NumberGame {
  public static void main (String[] args){
    int number = (int)Math.random();
    Scanner sc = new Scanner(System.in);

    for(int i=0;i<3;i++){
 int input = sc.nextInt();
    if(input>number){
      System.out.println("Guess lower");
    }else if (input<number){
      System.out.println("Guess higher");
    }else if ( input==number){
      System.out.println("Correct guess");
    }
  
    
    }
   
      System.out.println("Number is :" +number);
  }
}
