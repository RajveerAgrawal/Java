// class Student 
// {
//     int id;
//     String name;
//     float stipend;

//     Student(){}

//     Student(int id, String name){
//         this.id = id;
//         this.name = name;
//     }

//     Student(int id, String name, float stipend){
//         this.id = id;
//         this.name = name;
//         this.stipend = stipend;
//     }

//     void displayDetails(){
//         System.out.println(this.id + " | " + this.name + " | " + this.stipend);
//     }
// }

// class Main{
//     public static void main(String[] args)
//     {
//         Student st1 = new Student();
//         Student st2 = new Student(45, "Aashish");
//         Student st3 = new Student(234, "Cody", 10000);

//         st1.displayDetails();
//         st2.displayDetails();
//         st3.displayDetails();
//     }
// }

// class Parent
// {
//     public void sayHello()
//     {
//         System.out.println("Hello from parent");
//     }
// }

// class Child extends Parent{
//     @Override
//     public void sayHello(){
//         System.out.println("Hello from child");
//     }
// }


// class Main{
//     public static void main(String[] args)
//     {
//         Parent p = new Child();
//         p.sayHello();
//     }
// }

// class Superclass
// {
//     int number = 56;
// }

// class Subclass extends Superclass{
//     int number = 96;
//     void printNumber()
//     {
//         System.out.println(super.number);
//     }
// }
// class Main{
//     public static void main(String args[])
//     {
//         Subclass sub = new Subclass();
//         sub.printNumber();
//     }
// }

class Parent{
    protected void protect()
    {
        System.out.println("I am inside protected method");
    }
}

class child extends Parent{
    private void privateMethod()
    {
        System.out.println("I am inside private method");
    }
}

class Main {
    public static void main(String[] args) {
        child kid = new child();
        kid.protect();
        System.out.println("Hello world!");

    }
}