package javaaaaa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SwitchArrayList {
public static void main(String[] args)
{
	ArrayList l1=new ArrayList();
	l1.add(10);
	l1.add('A');
	l1.add("hello");
	l1.add(20);
	ArrayList l2=new ArrayList();
	l2.add(20);
	l2.add('B');
	l2.add("hi");
	l2.add(10);
	
	Scanner s1=new Scanner(System.in);
	System.out.println("enter the case operation");
	String str=s1.next();
	switch(str)
	{
	case "add":System.out.println("l1--->"+l1);
	           System.out.println("l2---->"+l2);
		      l1.add(2, 'B');
	            System.out.println("add B in indexed 2 l1-->"+l1);
	            l1.addAll(l2);
	            System.out.println("adding l1 and l2 "+l1);	
	             break;
	case "remove":System.out.println("l1--->"+l1);
	              System.out.println("l2---->"+l2);
		        l1.remove(1);
	             System.out.println(" remove "+l1);
	              l1.removeAll(l2);
	            System.out.println(" remove duplicates  "+l1);
	               break;
	case "retain":System.out.println("l1--->"+l1);
	              System.out.println("l2---->"+l2);
		          l1.add(20);
	               System.out.println(" l1   "+l1);
	               System.out.println(" l2 "+l2);
                   l1.retainAll(l2);
                  System.out.println(" retain duplicates "+l1);              
	              break;
	case "contain":System.out.println("l1--->"+l1);
	               System.out.println("l2---->"+l2);
		        System.out.println("is l2 contains hi ="+l2.contains("hi"));
	              break;
	case "size":System.out.println("l1--->"+l1);
	           System.out.println("l2---->"+l2);
		
		      System.out.println(" l2 size "+ l2.size());
	                break;
	case "get":System.out.println("l1--->"+l1);
	            System.out.println("l2---->"+l2);  
		System.out.println(l2.get(1));
                    	break;
	default:System.out.println("enter valide case");
	}
	
}
}
