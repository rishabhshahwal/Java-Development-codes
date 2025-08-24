package opps;

public class student {
    String name;
    int age ;
    String course;

    student()
    {
        this("Unknow",0);
    }

    student(String name,int age )
    {
        this.name=name;
        this.age=age;
    }

    public static void main(String[] args) {
        student s1=new student();
        student s2=new student("risi",12);
        s2.StudentDetail();
        s1.StudentDetail();
    }
       void StudentDetail()
       {
           System.out.println("name "+name + " age " +age);
           hello(this);//this will rep here as default const
       }

       void hello(student s)
       {
           System.out.println("hello "+s.name);
       }
}
