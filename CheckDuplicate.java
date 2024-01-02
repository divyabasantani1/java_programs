package Test;

public class CheckDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] Arr= {1,2,3,4,5,3,4};
		for(int i=0;i<Arr.length;i++)
		{
			for(int j=i+1;j<Arr.length;j++) {
				if((Arr[i]==Arr[j]) )
			
				System.out.println("Duplicate Elements are =" +Arr[j]);
			}
				
				
		}

	}

}
