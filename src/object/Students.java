package object;

public class Students {
 // instance variable/global variable/object variable
    String name;
    String location;
    int age;
    char gender;
    boolean isStudent;
    String schoolName;


    public void watchingReels() {
        System.out.println("love watching reels instead of study");
    }




    public static void main(String[] args) {
        Students obj = new Students(); // created an object of the class
        obj.name = "Rony";
        obj.location = "Tx";
        obj.age = 25;
        obj.gender = 'M';
        obj.isStudent = true;
        obj.schoolName = "UTS";
        obj.watchingReels();


        Students obj1 = new Students(); // created an object of the class
        obj1.name = "Jobayda";
        obj1.location = "Tx";
        obj1.age = 24;
        obj1.gender = 'F';
        obj1.isStudent = true;
        obj1.schoolName = "UTS";
        obj1.watchingReels();

        Students obj2 = new Students(); // created an object of the class
        obj2.name = "Varsha";
        obj2.location = "NC";
        obj2.age = 25;
        obj2.gender = 'F';
        obj2.isStudent = true;
        obj2.schoolName = "UTS";



    }









}
