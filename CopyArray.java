package Test;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a1[]= new int[] {1,2,3,4,5};
		
		int a2[]=new int[a1.length];
		for(int i=0;i<a1.length;i++)
		{
			a2[i]=a1[i];
		}
		System.out.println("Elements of Array 1");
		for(int i=0;i<a1.length;i++)
		{
			System.out.println(a1[i]+"");
		}
		System.out.println("Elements of Array 2");
		
		for(int i=0;i<a2.length;i++)
		{
			System.out.println(a2[i]+"");
		}
			

	}

}
