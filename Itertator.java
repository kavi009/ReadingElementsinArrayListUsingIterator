package session8;

import java.util.*;


public class Itertator {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an array list
	      @SuppressWarnings("rawtypes")
		ArrayList al = new ArrayList();
	      // add elements to the array list
	      al.add("C");
	      al.add("A");
	      al.add("E");
	      al.add("B");
	      al.add("D");
	      al.add("F");

	      // Use iterator to display contents of al
	      System.out.print("Original contents of al: ");
	      @SuppressWarnings("rawtypes")
		Iterator itr = al.iterator();
	      while(itr.hasNext()) {
	         Object element = itr.next();
	         System.out.print(element + " ");
	      }
	      System.out.println();
		
	}
}
