import java.util.regex.*;
import java.io.*;

public class codedAnswerKey {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		File kunci = new File("CodedAnswerKey.txt");
		kunci.createNewFile();
		FileWriter writer = new FileWriter(kunci);
		writer.write("a,A,b,B,c,C,d,D,e,E,F");
		writer.flush();
		writer.close();
		BufferedReader codedAnswers = new BufferedReader(new FileReader(kunci));
		String line = codedAnswers.readLine();
		FileReader fr = new FileReader(kunci);
		char [] a = new char [50];
		fr.read(a);

		for(char c : a){
			System.out.print(c);
			fr.close();
		}

	}

}
