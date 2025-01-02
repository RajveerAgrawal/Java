public class Person {
    private String name="Kevin";
    private int age=12;

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        if (age > 0)
        {
            this.age = age;
        }
        else
        {
            System.out.println("Age must be positive");
        }
    }

    public static void main(String[] args) {
        {
            Person person = new Person();
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
            person.setName("John Doe");
            person.setAge(15);
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
        }
    }
}