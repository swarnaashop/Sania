
package Jan6work;

public class TryCatch {
     public static void main(String[] args) {
       try {
            int a = 10 / 0;  
            String s = null;
            System.out.println(s.length());
            int age = 15;
            if(age < 18) {
             throw new AgeException("-18");
            }
          }
       catch(ArithmeticException e) {
           System.out.println("Arithmetic Exception: " + e.getMessage());

        } catch(NullPointerException e) {
          System.out.println("Null Pointer Exception:" + e.getMessage());

        } catch(AgeException e) {
            System.out.println("Custom Exception:" + e.getMessage());
        }
        System.out.println("Program finis");
    }
}
    

