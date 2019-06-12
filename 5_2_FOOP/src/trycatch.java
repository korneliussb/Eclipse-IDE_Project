import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

//Kornelius S B

public class trycatch {

	public static void main(String[] args) {
        // TODO code application logic here
        InputStream in = null;
        try{
            System.out.println("Sebentar lagi akan membuka file myFile.txt");
            in = new FileInputStream ("D:\\KOM\\Semester 6\\FOOP\\Tugas\\myFile.txt");
            System.out.println("File terbuka");
            int data = in.read();
        }
        catch (IOException myException){
            System.out.println(myException.getMessage());
        }
    }
}
