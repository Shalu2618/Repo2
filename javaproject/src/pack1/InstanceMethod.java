package pack1;

public class InstanceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InstanceMethod show=new  InstanceMethod();        
		  show.print(30,20);
		  show.print("hello");  
		
	}
	public  void print(int a,int b)
	{                                       
	int c=a+b;
	System.out.println(c);
	}
	public  void print(String a)
	{
	System.out.println(a);
	}

}
