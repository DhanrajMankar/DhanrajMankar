package Dhanarjanudip01;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

 class FileReaderExample {

    public static void main(String[] args) {
        Reader reader = null;
        try {
            reader = new FileReader("D:\\mahi\\mahi.txt");
            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (reader != null)
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }
 }