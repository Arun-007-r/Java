import java.util.Scanner;
public class CountDigit{
     public static void main(String[] args){
         Scanner input=new Scanner(System.in);
         System.out.println("Enter a number:");
         int number=input.nextInt();
         int count=0;
         int temp=number;
         while(temp>0){
            temp/=10;
            count++;
         }
         System.out.println("Count Digits of a number is:"+count);
     }

}