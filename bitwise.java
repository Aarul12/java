import java.util.*;
class bitwise{
    public static void main(String[] args){
        int a=5, b=7;
        //bitwise AND
        System.out.println("a&b = "+(a&b));

        //bitwise OR
        System.out.println("a|b = " +(a|b));

        //bitwise xor
        System.out.println("a^b = " +(a^b));

        //bitwise not
        System.out.println("~a = "+(~a));

        // also combined with assignment operator
        a+=b;
        System.out.println(+a);

    }
}