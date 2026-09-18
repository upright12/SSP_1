package variableTypes;

public class VariableTypesDemo {

    /*
    variable has 3 parts.
    1. declaring a variable
    2. defining a variable
    3. using a variable


    There are two types of variables
    1. Instance variable/global variable
    2. Local variable
    3. Parameter

     */
static String location = "New York"; // global variable/instance variable

    public static void method1(){ // custome method // method signature// method body
        int zipcode = 11354; // local variable
        System.out.println( "Method1");
        System.out.println(zipcode);
//location = "New Jersey";
    }



    public static void main(String[] args) {

        String name = "Bashir"; // declare and define // local
       // name = "Bashir"; // define
        System.out.println(name); // use

        System.out.println(location);
        method1(); // calling the method
    }



}
