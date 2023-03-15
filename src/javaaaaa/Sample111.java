package javaaaaa;

public class Sample111 {
public static void main(String[] args) {
	String str="HELLO";
	System.out.println(str);
	String rev="";
	for (int i =str.length()-1;i>=0; i--)
	{
		rev=rev+str.charAt(i);
		
	}
	System.out.println(rev);
}
}
