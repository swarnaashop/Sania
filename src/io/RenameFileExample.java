package io;

import java.io.File;

public class RenameFileExample {
    public static void main(String[] args) {

        File oldfile = new File("D:\\database\\Swarna.txt");
        File newfile = new File("D:\\database\\Afrin.txt");

        if (oldfile.renameTo(newfile)) {
            System.out.println("Rename success");
        } else {
            System.out.println("Rename failed");
        }
    }
}
