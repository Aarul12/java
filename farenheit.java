import java.util.*;
public class farenheit{
    public static void main(String[] args){
        double f, c;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number: ");
        f= scan.nextDouble(); 
        c=(5.0/9.0)*(f-32);
        System.out.println("Temperature in Celcius: " +c);
    }
};