import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ArrayPathClass {
	public static void main(String[]args) {
		File root = new File("D:/KOM/Semester 6/FOOP/Tugas/itu");
		Path p1 = Paths.get("D:/KOM/Semester 6/FOOP/Tugas/itu/Nyoba.txt");
		Path p2 = Paths.get("D:/KOM/Semester 6/FOOP");
		Path p3 = p2.relativize(p1);
		
		System.out.print("-> Relative Path: ");
		System.out.println(p3);
		process(root);
	}
	
	private static void process(File path) {
		File[] subs = path.listFiles();
		if (subs != null) {
			for (File f:subs) {
				if (f.isDirectory()) {
					process(f);
				}
				else {
					System.out.print("-> Absolute Path: ");
					System.out.println(f.getAbsolutePath());
				}
			}
		}
	}
}
