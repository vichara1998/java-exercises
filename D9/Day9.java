
public class Day9 {

    String name;
    int age;
    static double hight;
    boolean isSmoke;
    String colour;

    public Day9() {
        System.out.println("Hello");
    }
// this     ====   current Object

    public Day9(String name, int age, String colour) {
        this.name = name;
        this.age = age;
        this.colour = colour;

    }

    public static void main(String[] args) {
        Day9 constructor1 = new Day9();
        System.out.println("Your age is : " + constructor1);
        Day9 constructor2 = new Day9("Amal", 22, "red");
        System.out.println(constructor2.name);
        System.out.println("Your age is : " + constructor2.age);
        System.out.println(Day9.hight);

    }

    public static void sing() {
        learn();    // we only can call static methods  ,we cant call nonstattic methds

    }

    public static void learn() {
        //    get();   we cant call get an error
    }

    public void get() {

    }
}

//instance variable     have default value
//Static variable     have default value

//local variables    no  default value
/*
int a;
System.out.println(a);         error
 */




//instance block ---- > initialize default values for instance variables ---- > not execute

/*
{
}

*/