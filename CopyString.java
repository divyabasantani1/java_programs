package Test;
import java.util.Scanner;


public class CopyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String strOriginal,strCopy;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the original String");
    strOriginal=s.nextLine();
    
    strCopy=strOriginal;
    System.out.println("StrOriginal= " +strOriginal);
    
    System.out.println("StrCopy= " +strCopy);
    
	}

}
