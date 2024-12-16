// class Employee
// {
//     int empno;
//     String name;
//     float sal;

//     Employee()
//     {
//         System.out.println("*****");
//         empno = 101;
//         name = "Aashish";
//         sal = 5000f;
//     }

//     void displayDetails()
//     { 
//         System.out.println(empno + " - " + name + " - " + sal);
//     }
// }

// class main
// {
//     public static void main(String[] args) 
//     {
//         Employee emp1 = new Employee();
//         Employee emp2 = new Employee();
//         emp1.displayDetails();
//         emp2.displayDetails();
//     }
// }

// class Counter 
// {
//     // int number=10;
//     static int number=10;
//     void increment()
//     {
//         number=number+1;
//     }
//     public static void main(String[] args) {
//         Counter obj1 = new Counter();
//         Counter obj2 = new Counter();
//         Counter obj3 = new Counter();

//         // guess the answer

//         obj1.increment();
//         System.out.println(obj1.number);
//         obj2.increment();
//         System.out.println(obj2.number);
//         obj3.increment();
//         System.out.println(obj3.number);
//     }
// }

class main {
    public static void main(String[] args) {
        String first="Cod";
        String second="ingal";
        System.out.println(first+second);

        String word="Hello";
        System.out.println(word.toUpperCase());

        System.out.println(word.toLowerCase());

        System.out.println(word.length());
    }
}