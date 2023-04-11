import java.util.*;
class logical_AND{
    public static void main(String[] args){

    
     int a=10, b=20,c=20, sum=0;
     if((a<b) && (b==c)){
        sum=a+b+c;
        System.out.println(+sum);
     }
     else{
        System.out.println("Number doesn't match conditions.");
     };
    }
}