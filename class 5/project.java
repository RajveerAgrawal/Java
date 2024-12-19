// class Parent
// {
//     int age;
//     String name;
//     void naming(String name)
//     {
//         System.out.println("Name:" + name);
//     }
// }

// class Child extends Parent
// {
//     void ageN(int age)
//     {
//         System.out.println("Age of a student is:"+age);
//     }
// }
// class project
// {
//     public static void main(String [] args)
//     {
//         Child obj= new Child();
//         obj.naming("Rajveer");
//         obj.ageN(15);
//     }
// }

// class Animal{
//     void eat(){
//         System.out.println("eatinng... Animal class...eat method");
//     }
// }
// class Lion extends Animal{
//     void roar(){
//         System.out.println("Roar...Lion class...roar method");
//     }
// }

// class Babylion extends Lion{
//     void weep(){
//         System.out.println("weeping...Babylion class...weep mehod");
//     }
// }

// class project{
//     public static void main(String args []){
//         Babylion obj=new Babylion();
//         obj.weep();
//         obj.roar();
//         obj.eat();
//     }
// }
// class Mammals{
//     void mam(){
//         System.out.println("Inside Mammals Class");
//     }
// }
// class Lion extends Mammals{
//     void roar(){
//         System.out.println("Inside Lion class");
//     }
// }

// class Human extends Mammals{
//     void hum(){
//         System.out.println("Inside Human");
//     }
// }

// class project{
//     public static void main(String args []){
//         Lion obj=new Lion();
//         // obj.hum();
//         obj.roar();
//         obj.mam();
//     }
// }
class project{
    int age;
    project(int age){
        this.age = age;
    }
    public static void main(String[] args){
        project obj = new project(24);
        System.out.println("obj.age = " + obj.age);
    }
}