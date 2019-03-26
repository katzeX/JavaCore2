public class Student {
    String name;
    int age;


    Student(String name, int age){
        this.name = name;
        this.age = age;

    }
    public void setData(String n, int a)
    {
        name = n;
        age = a;
    }

    public int getAge()
    {
        return age;
    }
}
