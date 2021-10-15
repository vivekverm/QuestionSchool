public class Person
{

}
 class Teacher extends Person
{
    public void Salary()
    {
        System.out.println("The amount the teacher earns");
    }
    public void Subject()
    {
        System.out.println("Subject:-");
        System.out.println("  1:Computer Science");
        System.out.println("  2:Chemistry");
        System.out.println("  3:English");
        System.out.println("  4:Other");
    }
}
class Student extends Person
{

}
class CollegeStudent extends Student
{
    public void Year()
    {
        System.out.println("Current level of college");
    }
    public void MajorSubject()
    {
        System.out.println("Department:-");
        System.out.println("  1:Electrical Engineer");
        System.out.println("  2:Communication");
        System.out.println("  3:Undeclared");
    }
}
class Test
{
    public static void main(String[] args) {
        Teacher obj=new Teacher();
        obj.Salary();
        obj.Subject();
        System.out.println();
        CollegeStudent obj1=new CollegeStudent();
        obj1.Year();
        obj1.MajorSubject();
    }
}

