package myPackageTest;

import java.util.ArrayList;
import java.util.Iterator;

public class TheOtherClass {
	
	ArrayList<String> alist = new ArrayList<String>();

	public void printAList(ArrayList<String> al) {
		Iterator itr = al.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}

	public static void main(String... args){
		
		TheOtherClass oc = new TheOtherClass();
		TheOtherClass oc2 = new TheOtherClass();
		
		oc.alist.add("Arun");
		oc2.alist.add("Divakar");
		oc2.alist.add("Valar");
	
		oc.printAList(oc.alist);
		oc.printAList(oc2.alist);
	}



}
