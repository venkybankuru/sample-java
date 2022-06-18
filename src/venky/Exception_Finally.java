package venky;

public class Exception_Finally {

	public static void main(String[] args) {
		
		int a[] = new  int[4];
		
		try
		{
			System.out.println("print the value of:"+a[6]);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			//System.out.println("print exception value:"+ e);
		}finally
		{
			 a[0]=100;
			 System.out.println("print the access value :"+ a[0]);
			 System.out.println("code flows sucessfull");
			
		}
	}
}
