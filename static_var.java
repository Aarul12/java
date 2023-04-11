import java.util.*;
class static_var{
    public static String student = "Aarul Juneja";
    public static void main(String[] args){
        System.out.println("The Student Name is: " +static_var.student);

        // static c=0;
        // if above line is uncommented,
        // it will throw an error
        // because static variable cannot be 
        // declared locally
    };
    
}