
package com.linklist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Uniquelist {

	public static void main(String[] args) {
	    List<Integer> abc=Arrays.asList(10,20,30,2,1,3,5,3,2);
	    System.out.println("Orginal"+abc);
	    
	    //way 2
	    List<Integer> uniquelist1=new ArrayList<>(new HashSet(abc));
	    System.out.println(uniquelist1);
	    
	    //way 2
	    List<Integer> uniquelist2=new ArrayList<>(new LinkedHashSet(abc));
	    System.out.println(uniquelist2);
	    
	    //way3
	     List<Integer> uniquelist3=abc.stream().distinct().collect(Collectors.toList());
	     System.out.println(uniquelist3);
	        

	}

}