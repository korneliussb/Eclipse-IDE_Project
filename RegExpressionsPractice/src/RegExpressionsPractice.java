import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegExpressionsPractice {
	public static void main(String[]args) {
		Pattern dateP;
		dateP = Pattern.compile("([0-9]{2})/([0-9]{2})/([0-9]{4})");
		Scanner in = new Scanner(System.in);
		System.out.print("Masukan tanggal lahirmu (dd/mm/yyyy): ");
		String date = in.nextLine();
		while (!date.equals("")) {
			Matcher dateM = dateP.matcher(date);
			if (dateM.matches()) {
				String day = dateM.group(1);
				String month = dateM.group(2);
				String year = dateM.group(3);
				System.out.println("Indonesian Style Date - "+day+ "/" +month+ "/" +year);
				System.out.println();
			}
			//endif
			System.out.print("Masukkan tanggal lahirmu (dd/mm/yyyy): ");
			date=in.nextLine();
		}//endwhile
		in.close();
	}//end method main
	
	public class Date{
		public String month;
		public String day;
		public String year;
		public Date (String m, String d, String y){
			month=m;
			day=d;
			year=y;
		}
	}

}//end class
