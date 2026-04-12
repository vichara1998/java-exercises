class New_Day9 {

    public static void main (String[] args){

        Student std = new Student();
        std.name = "amal";
        std.age=12;
        std.isSmoke =true;
        System.out.println(std.age);
        std.Student();
    }
}
    class Student {
        String name;
        static int age;
        Boolean isSmoke;
    
        public void Student(){
            System.err.println("Hello");
        }
    }
    
