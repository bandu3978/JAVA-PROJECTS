package javaaaaa;

 public class Sample1 {
public static void main(String[] args) {
	System.out.println("odd numbers between 1 to 20");
	oddme(1);
	
}
static void oddme(int a)
{
	if(a>=20)
	{
		if(a%2!=0)
		{
			System.out.println(a);
		}
	}
	else
	{
		if(a%2!=0)
		{
			System.out.println(a);
		}
		oddme(a+1);
	}
}
}
