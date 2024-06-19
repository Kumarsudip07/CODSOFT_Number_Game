import java.util.Random;
import java.util.Scanner;
public class Numbergame {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("You have only 3 chances to guess a number ");
        for(int i=0;i<=2;i++){
        System.out.println("Guess a Number : ");
        int num=sc.nextInt();
        Random random = new Random();
        int randomNum = random.nextInt(100) + 1;
        if(num==randomNum){
            System.out.println("Number Matched");
        }
       else{
        if (num>randomNum) {
            int diff =num-randomNum;
            System.out.println("Guess Num is bigger than Random number and difference is "+diff);
            
        }
        else{
            int numdiff = randomNum-num;
            System.out.println("Random Number is bigger than guess number and difference is "+numdiff);
        }
       }
    }
    System.out.println("Better luck next time");

    }
}