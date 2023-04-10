import java.util.*;
public class average{
    public static void main(S3tring[] args){
        double a,b,sum=0, avrg=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the First Number:");
        a=scan.nextDouble();
        System.out.println("Enter the second number: ");
        b=scan.nextDouble();
        sum=a+b;
        avrg=sum/2;
        System.out.println("The average is " +avrg);


    }
};