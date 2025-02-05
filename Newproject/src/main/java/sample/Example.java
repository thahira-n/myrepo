package sample;

public class Example {

	public static void main(String[] args) {
		String s="hello";
		System.out.println(s);
				String s1=new String("hii");
				System.out.println(s1);	
				//converting character array into string using new keyword
		char a[]= {'a','s','d','f'};//character defined as array
				String s2=new String(a);
				System.out.println(s2);
				//charAt - to differentiate a specific character from a string
				char b=s.charAt(2);
				System.out.println(b);
				
				//length -to find the length of string
				System.out.println(s.length());
				//concat to combine two strings
				System.out.println(s.concat(s1));
				//contains-to check whether a string is inside
				
				String ns="this is my world";
				System.out.println(ns.contains("is"));
				System.out.println(ns.contains("you"));
				String x="java";
				String y="java";
				String c="Java";
				String d="selenium";
				//equals
				System.out.println(x.equals(y));
				System.out.println(x.equals(c));
				System.out.println(x.equals(d));
				//equals ignore case
				
				System.out.println(x.equalsIgnoreCase(c));
				//to uppercase
				System.out.println(x.toUpperCase());
				//to lowercase
				String z="SUNDAY";
				System.out.println(z.toLowerCase());
				System.out.println(x.toLowerCase());
				//is empty
				String q=" ";
				System.out.println(q.isEmpty());
				String w="thahira";
				String e="thahira";//reference is created.so w&e are equal
				System.out.println(w==e);
				String r=new String("thahira");//new object is created.w & r are not equal
				System.out.println(w==r);
	
						
				
		// TODO Auto-generated method stub

	}

}
