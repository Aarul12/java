import java.util.*;
class cal{
    public static void main(String args[]){
        int a,b,sum=0, product=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the First number:");
        a=scan.nextInt();
        System.out.println("Enter the 2 no: ");
        b=scan.nextInt();
        sum=a+b;
        product=a*b;
        System.out.println("Sum = " +sum);
        System.out.println("Product= " +product);

    }
}