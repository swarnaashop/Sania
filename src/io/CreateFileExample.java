
package io;
import java.io.File;
import java.io.IOException;
public class CreateFileExample {
    public static void main(String[]args) {
        try{
            File file = new File("D:\\database\\Swarna.txt");
            if(file.createNewFile()) {
                System.out.println("File is Created ");
               
            } else {
                System.out.println("File already exit");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
