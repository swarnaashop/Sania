
package Jan67.newpackage;
public class TestArrayMethods {
public static void main(String[] args) {
 ArrayMethods obj = new ArrayMethods();
        int[] nums = obj.numbers(5);
        System.out.print("Numbers: ");
        for(int n : nums) {
         System.out.print(n + " ");
        }  
        System.out.println();
        int[] evens = obj.evenNumbers(10);
        System.out.print("Even Numbers: ");
        for(int n : evens) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
