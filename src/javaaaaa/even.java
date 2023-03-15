package javaaaaa;

public class even {
public static void main(String[] args) {
	System.out.println("even numbers between 1 to 20");
	even1(1);
}
 static void even1(int a)
 {
	 if(a>=20)
	 {
		 if(a%2==0)
		 {
			 System.out.println(a);
		 }
		 
	 }
	 else
	 {
		 if(a%2==0)
		 {
			 System.out.println(a);
		 }
		 even1(a+1);
	 }
 }
}
