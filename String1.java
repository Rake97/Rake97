package org.string;

public class String1 {
	public static void main(String[] args) {
	String a= "Java";
	String b="Java";
	String c="Selinium";
	//Literal string
	System.out.println("Literal string");
	System.out.println(System.identityHashCode(a));
	System.out.println(System.identityHashCode(b));
	System.out.println(System.identityHashCode(c));
	
	//Non literal string
	String d =new String("Java");
	String e= new String("Java");
	String f=new String("Selinium");
	System.out.println("non literal");
	System.out.println(System.identityHashCode(d));
	System.out.println(System.identityHashCode(e));
	System.out.println(System.identityHashCode(f));
	
	//IM Mutable String
	System.out.println(System.identityHashCode(a));
	System.out.println(System.identityHashCode(b));
	System.out.println(System.identityHashCode(c));
	String g= a.concat(c);
	System.out.println(g);
	System.out.println(System.identityHashCode(g));
	
//Mutable
	StringBuffer h=new StringBuffer("Java");
	StringBuffer i=new StringBuffer("Java");
	StringBuffer j=new StringBuffer("Selinium");
	StringBuffer k = h.append(j);
	
	System.out.println(k);
	
	System.out.println(System.identityHashCode(h));
	System.out.println(System.identityHashCode(i));
	System.out.println(System.identityHashCode(j));
	System.out.println(System.identityHashCode(k));
	
	
	

}
}
