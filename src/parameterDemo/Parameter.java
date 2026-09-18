package parameterDemo;

public class Parameter {

    public void add(int a, int b){ // parameters // custom method

        System.out.println(a+b);

    }


    public void substraction(int a, int b){
        add(10,10);
        //System.out.println(a-b);
        int c = a-b;
        int d = c;
        System.out.println(d);
    }

    public void printName(String name){
        substraction(21,9);
        System.out.println(name);
    }

    public static void main(String[] args) {
       Parameter obj = new Parameter();
//        obj.add(21, 9);
//        obj.add(30,40 );
       // obj.substraction(21, 9 );
        obj.printName("Bashir");
    }


}
