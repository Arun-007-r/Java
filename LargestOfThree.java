import java.util.Scanner;
public class LargestOfThree{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=input.nextInt();
        System.out.println("Enter sceond number:");
        int b=input.nextInt();
        System.out.println("Enter third number:");
        int c=input.nextInt();
        int largest;
        if(a>b && a>c)
            largest=a;
        else if(b>c)
             largest=b;
        else 
             largest=c;
        System.out.println("The Largest of Three number is:"+largest);
    }
}