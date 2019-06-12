import java.util.regex.*;
import java.io.*;

public class codedAnswerKey2 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		File kunci = new File("CodedAnswerKey.txt");
		kunci.createNewFile();
		FileWriter writer = new FileWriter(kunci);
		//writer.write("a,A,b,B,c,C,d,D,e,E,F");
		String str = "a,A,b,B,c,C,d,D,e,E,F,f";
        str = str.replace("e","b");
        str = str.replace("E","A");
        str = str.replace("f","c");
        str = str.replace("F","D");
        str = str.toLowerCase();
        writer.write(str);
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
