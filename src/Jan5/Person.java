
package Jan5;
import java.util.ArrayList;
import java.util.List;
        
 public class Person {
      int id ;
     String name;
     double salary;
     
     public Person(int id, String name,double salary) {
         this.id=id;
         this.name=name;
         this.salary=salary;
     }
     void display(){
         System.out.println("ID:" + id +",Name: " 
              + name + ",Salary: " + salary);
     }
     public static void main(String[] args) {
         List<Person> persons = new ArrayList<>();
         persons.add(new Person(1, "Rahim", 25000));
         persons.add(new Person(1, "Karim", 30000));
         persons.add(new Person(1, "Labib", 40000));
         for (Person p : persons) {
             p. display();
         }
     }
     
         
                 
     }
     
 