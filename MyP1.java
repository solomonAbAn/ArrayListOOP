package Pack1;

import java.util.ArrayList;

public class MyP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// fancy array always use this

		// array-list

		// in work they always use array lists

		// the problem with regular array is the length of the array

		// array list is expandable === no length

		int[] myarray = new int[6];// regular
		myarray[0] = 45;
		System.out.println(myarray);

		// creating array list
		ArrayList<Integer> myarrayList = new ArrayList<Integer>();
		// class<object>

		myarrayList.add(20);
		myarrayList.add(32);
		myarrayList.add(42);
		myarrayList.add(52);
		myarrayList.add(62);

		System.out.println(myarrayList);

		myarrayList.add(1, 100);// inserting and pushing the rest
		System.out.println(myarrayList);

		myarrayList.add(4, 200);
		System.out.println(myarrayList);

		// add in bulk
		ArrayList<Integer> myarrayList2 = new ArrayList<Integer>();

		myarrayList2.add(-200);
		myarrayList2.add(3200);
		myarrayList2.add(15200);

		myarrayList.addAll(myarrayList2);

		System.out.println(myarrayList2);

		myarrayList.addAll(3, myarrayList2);

		System.out.println(myarrayList2);

		// clearing arrays

		myarrayList.clear();
		System.out.println(myarrayList);

		// contain
		myarrayList.addAll(myarrayList2);

		boolean check = myarrayList.contains(-200);

		System.out.println(check);

		// get the index of a variable
		int posof = myarrayList.indexOf(-200);
		System.out.println(posof);

		// get the variable of an index
		int pos = myarrayList.get(2);
		System.out.println(pos);

		// check if an array is empty
//		myarrayList.clear();
		boolean empty = myarrayList.isEmpty();
		System.out.println(empty);

		// last index that contains a certain variable

		System.out.println(myarrayList.lastIndexOf(2));
		System.out.println(myarrayList.lastIndexOf(3200));

		// remove an index
		myarrayList.remove(2);
		System.out.println(myarrayList);
		// remove the value of an index
		myarrayList.remove(Integer.valueOf(-200));
		System.out.println(myarrayList);
		// set
		System.out.println("set");
		myarrayList.set(0, 200);
		System.out.println(myarrayList);

		// remove a string
		ArrayList<String> t = new ArrayList<String>();
		t.add("pargol");
		t.add("daniel");
		t.add("rich");
		boolean test = t.remove("pargol");//why did she use boolean//what if i removed it
		System.out.println(t);
		System.out.println(test);

		
		
		//check docs.oracle.com oracle website
		//oracle is helpful with codes
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
