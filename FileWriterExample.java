package Dhanarjanudip01;
public class FileWriterExample {
	public static void main(String[] args) {
        FileWriter writer = null;
        try {
            writer = new FileWriter("D:\\mahi\\mahi.txt");
            writer.write("Writing Test data");
            writer.flush();
            System.out.println("Data written to File");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException ioe) {

            }
        }
    }
}
