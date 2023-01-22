package pkg_1;

public class Assg1 {
	public int sum(int a,int b)
	{int c=a+b;
	System.out.println("sum "+c);
	return c;
		}
	public int sub(int c,int d)
	{
		int e=c-d;
		System.out.println("sub "+e);
		return e;
	}
	public int multi(int f,int g)
	{
	int h=f*g;
	System.out.println("multi "+h);
	return h;
	}
	public void divide(int i, int j)
	{
		int k= i/j;
		System.out.println("final result "+k);
	}
public static void main(String[] args) {
	Assg1 ref=new Assg1();
	int sumresult=ref.sum(10, 2);
	int sumresult1=ref.sum(sumresult,2);
	int subresult=ref.sub(sumresult1, 2);
	int multiresult=ref.multi(subresult, 2);
	ref.divide(multiresult, 2);
}
}
