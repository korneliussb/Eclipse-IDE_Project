import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDemoCheck {
	public static void main(String[]args) {
		Path p = Paths.get("D:/KOM/Semester 6/FOOP/Tugas");
		Path p2 = Paths.get("Nganu.txt");
		Path p3 = p.resolve(p2);
		
		//used to test the value of p3
		System.out.println("The content of p3 : "+p3.toString());
		try {
			if (Files.notExists(p))
				Files.createDirectories(p);
			//endif
		}//end try
		catch (IOException x) {
			System.err.println(x);
		}//end catch
	}//end of main
} // end of class fileDemoCheck
