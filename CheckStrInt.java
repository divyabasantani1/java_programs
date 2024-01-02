package Test;

public class CheckStrInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "ghhh[][]bvv";
		String str1 = "12345[]";
		System.out.println(str +"" +str.matches(("[0-9]+"))) ;
		
		System.out.println(str1 +"" +str1.matches(("[0-9]+"))) ;
		
			
		}

	}


