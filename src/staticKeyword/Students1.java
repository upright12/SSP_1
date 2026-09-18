package staticKeyword;

public class Students1 {
    String name;
    String location;
    int age;
    char gender;
    boolean isStudent;
  static String schoolName = "UTS";


    public void watchingReels() {
        System.out.println("love watching reels instead of study");
    }

    public static void study(){
        System.out.println("I must study");
    }


    public static void main(String[] args) {
        Students1 obj = new Students1(); // created an object of the class
        obj.name = "Rony";
        System.out.println(obj.name );
        obj.location = "Tx";
        obj.age = 25;
        obj.gender = 'M';
        obj.isStudent = true;
        System.out.println(Students1.schoolName);
        obj.watchingReels();
        Students1.study();


        Students1 obj1 = new Students1(); // created an object of the class
        obj1.name = "Jobayda";
        System.out.println(obj1.name);
        obj1.location = "Tx";
        obj1.age = 24;
        obj1.gender = 'F';
        obj1.isStudent = true;
        schoolName = "UTS";
        System.out.println(Students1.schoolName);
        obj1.watchingReels();

        Students1 obj2 = new Students1(); // created an object of the class
        obj2.name = "Varsha";
        obj2.location = "NC";
        obj2.age = 25;
        obj2.gender = 'F';
        obj2.isStudent = true;
        schoolName = "UTS";
        System.out.println(Students1.schoolName);


        Students1 obj3 = new Students1();
        obj3.name = "Bashir";
        obj3.location = "NY";
        obj3.age = 100;
        obj3.gender = 'M';
        obj3.isStudent = false;
        schoolName = "UTS";
        System.out.println(Students1.schoolName);

    }



}
