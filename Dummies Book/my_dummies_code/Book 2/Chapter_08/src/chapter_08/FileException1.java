package chapter_08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileException1 {

    public static void main(String[] args) {
        openFile("D:\\test.txt");
    }

    public static void openFile(String file) {
        // 1st Way to handle Exceptions:

        try {
            FileInputStream f = new FileInputStream(file);
        } catch (FileNotFoundException error) {
            System.out.println("File not found.");
        }
    }
}
