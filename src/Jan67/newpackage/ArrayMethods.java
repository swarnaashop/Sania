
package Jan67.newpackage;

public class ArrayMethods {

    public int[] numbers(int n) {
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }
    public int[] evenNumbers(int n) {
        int count = 0;
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0) count++;
        }
      int[] arr = new int[count];
        int index = 0;
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0) {
                arr[index] = i;
                index++;
            }
        }

       return arr;
    }
}

