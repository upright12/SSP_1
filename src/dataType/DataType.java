package dataType;

public class DataType {



// to execute the command
    public static void main(String[] args) {

 // byte -- Stores whole numbers from -128 to 127



    // short -Stores whole numbers from -32,768 to 32,767




        // byte -- Stores whole numbers from -128 to 127

        byte age = 127;
      //  byte wrongData = 128; //error because exceeds limit 127

       System.out.println("He is "+ age + " years old");
        System.out.println("I am 12 Years old");


        // short -- Stores whole numbers from -32,768 to 32,767

        short rollnumber = 32767;
        // short wrongData1 = 32800; //error because exceeds limit 127

        // int -- Stores whole numbers from -2,147,483,648 to 2,147,483,647

        int regNum = 2145455656;

        int courseTaken = 2;
        int wrongData2 = 2147483647; // ask to bashir vaim(can a wrong data for int can be an integer or it should be only decimals)

        // long -- Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

        long numbers = 9223372036854775807L;
        long wrongdata3 = 922337203685477l;

        // float -- Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits

        float cgpa = 3.65f;
        float wrongdata4 = 3.5435236426437f;
       // wrongdata4 = 3.54352f;

        // double -- Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits

        double points = 3.66666666666666666666666666666666666666666666666666666666; // why no error cz I exceeded more than 16 decimal degits
        double wrongdata5 = 3.43;
        wrongdata5 = 3.656566767676767676;

        // char -- Stores a single character/letter or ASCII values

        char gender = 'F';
        //char wrongdata6 = 'AB';
       // char wrongdata7 = "A";

        boolean isStudent = true;

        String name = "Bashir"; // String is a data type + a class too






    }

}
