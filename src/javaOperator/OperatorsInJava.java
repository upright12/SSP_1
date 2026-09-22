package javaOperator;

public class OperatorsInJava {

    /*
    There are few operators in Java
    1. Arithmatic operator -- +, -, *, /
    2. comparison operator
    3. logical operator
    4. Assignment operator
     */


    public void arithmaticOperator(int a, int b){
        int result = a+b;
        System.out.println(result);
        int result1 = a-b;
        System.out.println(result1);
        int result2 = a*b;
        System.out.println(result2);
        float result3 = (float) a/b; // type casting
        System.out.println(result3);
    }


    public void comparisonOperator(int a, int b, int c){
 // comparison statement always true or false. symbols ... <,>, <=,>=, ==,!=
        boolean result = a+b>c;
        System.out.println(result);

        boolean result1 = a-b+c<=10;
        System.out.println(result1);

        boolean result2 = a-b+c!=10;
        System.out.println(result2);

        boolean result3 = a+b-c==10;
        System.out.println(result3);
    }


    public boolean logicalOperator(int a, int b, int c){
        boolean result = ((a+b>c)&&(b+c<a));// true, false
        //System.out.println(result);

        boolean result1 = ((a+b>c)||(b+c<a));// true, false
//System.out.println(result1);

        return result1;
    }


    public void assignmentOperator(){
        int a = 20;
        int b = 30;

    }

    public static void main(String[] args) {
        OperatorsInJava obj = new OperatorsInJava();
        //obj.arithmaticOperator(20, 23);
       // obj.comparisonOperator(5,7,9);
        System.out.println(obj.logicalOperator(10,15, 20));
    }


}
