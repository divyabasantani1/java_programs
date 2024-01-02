package Test;

public class CheckLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] Arr= {98,1,2,3,4,5,6,34,9,0};
		
		int LargNum= Arr[0];
		for(int i=1;i < Arr.length;i++)
		{
				if(Arr[i] > LargNum)
						{
						
					LargNum=Arr[i];
						
			}
		}
			
				System.out.println("Largest no is =" +LargNum);
			}
				
				
		}

	

	


