package oop;
class DD
{
	void d3()
	{
		System.out.println("D");
	}
}
class E extends DD
{
	void e()
	{
		System.out.println("E");
	}
}
interface F
{
	void f();
}
class G extends E implements F
{
	void g()
	{
		System.out.println("G");
	}
	public void f() {
		System.out.println("F");
	}
	
}
public class HybridIN {
	public static void main(String[] args) {
		G g1 =new G();
		g1.d3();
		g1.e();
		g1.f();
		g1.g();
		
	}
}
