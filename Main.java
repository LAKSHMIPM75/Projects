package Assignment24;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sn=new Scanner(System.in);
	
	String s1=sn.nextLine();
	System.out.println(UserMainCode.getAlternateChars(s1));
	sn.close();
}
}
