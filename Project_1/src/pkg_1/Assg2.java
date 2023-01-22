package pkg_1;

public class Assg2 {
	public int divide(int a, int b)
	{
		int c=a/b;
		System.out.println("divide "+c);
		return c;
	}
	public int sub(int d, int e)
	{
		int f= d-e;
		System.out.println("sub "+f);
		return f;
	}
	public int sum(int g, int h)
	{
		int i= g+h;
		System.out.println("sum "+i);
		return i;
		
	}
	public void multi(int j, int k)
	{
		int l=j*k;
		System.out.println("final result "+l);
	}	
public static void main(String[] args) {
	Assg2 ref=new Assg2();
	int divideresult=ref.divide(10, 2);
	int subresult=ref.sub(divideresult, 2);
	int sumresult=ref.sum(subresult, 2);
	int subresult1=ref.sub(sumresult, 2);
	ref.multi(subresult1, 2);
	
}
}
