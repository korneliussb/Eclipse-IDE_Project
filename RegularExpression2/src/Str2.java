import java.util.Scanner;
//Str 2
public class Str2 {
	public static void main (String[]args) {
		//String str;
		String str2;
		//String str3;
		//str = getStr();
		str2 = getStr2();
		//str3 = getStr3();
		//if (rhymningStr(str))
			//System.out.println("This str rhymes with mouse (berima)");
		//else 
		if (rhymningStr2(str2))
			System.out.println("This str rhymes with mouse (berima)");
		else
			System.out.println("This str doesn't rhyme! (tidak berima)");
		//endif
	}//end method main
	
	private static boolean rhymningStr2(String str2) {
		return str2.matches("[Bb]anana|banana|anana|shanana");
	}//end method rhymningStr
	
	private static String getStr2() {
		String str2;
		Scanner in = new Scanner(System.in);
		System.out.println("Bahasa inggrisnya Pisang adalah: ");
		str2 = in.next();
		in.close();
		return str2;
	}//end method getStr
	
}//end class
