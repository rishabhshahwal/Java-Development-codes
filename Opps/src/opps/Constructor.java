package opps;

public class Constructor {
    String name ;  //default value = null
    int duration;

    /*
    Course()
    {
      System.out.println("opps.Constructor called...")
    }
     */
    Constructor(String name ,int duration)
    {
        System.out.println(name);
        this.name = name;;  //instance = local
        this.duration = duration;
        //System.out.println("Para constructor called...");
    }

      public static void main(String[] args){
         // System.out.println("before object create");
          Constructor c= new Constructor("Java",4);
       /* c.name="java full stack";
        System.out.println("after object create");*/

          Constructor c2= new Constructor("Devops",5);
          //c2.name="Devops";
          //c.learn(c2);

          //para
          Constructor c3=new Constructor("DSA",3);

          System.out.println(c.name);
          System.out.println(c.duration);
          System.out.println(c2.name);
          System.out.println(c2.duration);
          System.out.println(c3.name);
          System.out.println(c3.duration);

      }

    void learn(Constructor c)
    {
        System.out.println("we are learning "+c.name);
    }
}
