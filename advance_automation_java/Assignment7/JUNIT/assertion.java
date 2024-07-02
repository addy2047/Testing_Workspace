package test1;
import junit.framework.Assert;
@SuppressWarnings("deprecation")
public class assertion {

	public void test()
	{
		int a=10, b=20;
		String s1=null, s2="ADDY", s3="addy";
		int[] x= {1,2,3,4,5};
		int[] y= {1,2,3,4,5};
		assertEquals(s1,s2);
		//assertTrue(a<b);
		//assertFalse(a>b);
		//assertNull(s1);
		//assertNotnull(s2);
		//assertSame(s2,s3);
		//assertNotSame(s2,s3);
		//assertArrayEquals(null,null);
		//fail("self failed");
		Assert.assertEquals(a, b);
		
	}

	private void assertEquals(String s1, String s2) {
		// TODO Auto-generated method stub
		
	}

}
