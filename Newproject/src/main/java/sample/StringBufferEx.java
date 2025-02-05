package sample;

public class StringBufferEx {

	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("hello");
		System.out.println(s1);
		StringBuilder s2=new StringBuilder("hii");
	System.out.println(s2);
	//append
	s1.append("world");
	System.out.println(s1);
	//insert
	s1.insert(5,"my");
	System.out.println(s1);
	//replace
	s1.replace(5, 7, "your");
	System.out.println(s1);
	//reverse
	s1.reverse();
	System.out.println(s1);
	//delete
	s1.delete(5,7);
	System.out.println(s1);
		// TODO Auto-generated method stub

	}

}
