package Test;

public class Rev_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Divya";
		int length=name.length();
		String rev= " ";
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
			System.out.println(rev);
			
		}
		System.out.println(rev);
		}


}
