import java.util.*;
// import java.Math;


public class area_triangle{
    public static void main(String[] args){
        int a,b,c;
        float s, area;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the sides of triangle: ");
        a=scan.nextInt();
        // char=scan.next().charAt(index:0);    
        b=scan.nextInt();
        c=scan.nextInt();
        s=(a+b+c)/2;
        area=(int)Math.sqrt((s*(s-a)*(s-b)*(s-c)));
        System.out.println("Area of Traingle is " +area);
    }
}
