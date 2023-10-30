package TOP;
import java.io.*;

import java.util.*;

public class UpdateArr {

	  public static void main(String[] args) {
	    try {

	      ArrayList<String> list = new ArrayList<>();

	      list.add("AD");

	      list.add("BC");

	      list.add("CD");

	      list.add("DJ");
	      System.out.println(list);
	 
	      list.set(2, "IM");

	      System.out.println(list);
	    }

	    catch (Exception e) {

	      System.out.println(e);

	    }

	  }
	}

