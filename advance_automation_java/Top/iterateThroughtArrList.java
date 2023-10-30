package TOP;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iterateThroughtArrList {

	
	   public static void main(String[] args) {
	      List<String> aList = new ArrayList<String>();
	      aList.add("Nik");
	      aList.add("jay");
	      Iterator i = aList.iterator();
	      System.out.println("The ArrayList elements are:");
	      while (i.hasNext()) 
	      {
	         System.out.println(i.next());
	      }
	   }
	}

