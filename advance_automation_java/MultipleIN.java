package oop;

interface p
{
	void p1();
}
interface Q
{
	void q1();
}
class R implements  p ,Q
{
	
	public void p1() {
		System.out.println("PPP");
	}
	
	public void q1() {
		System.out.println("qqq");
	}
	
}
public class MultipleIN {

	public static void main(String[] args) {
		
		R r =new R();
		r.p1();
		r.q1();
		
	}
}
