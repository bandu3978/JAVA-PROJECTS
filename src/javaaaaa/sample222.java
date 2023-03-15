package javaaaaa;

interface Justdial
{
	void book();
}
class Redbus implements Justdial
{
	public void book()
	{
		System.out.println("bus ticket is booked");
	}
}
class Bookmyshow implements Justdial
{
	public void book()
	{
		System.out.println("movie is  ticket booked");
	}
}
class Stimulator
{
	static void ansim(Justdial a1)
	{
		if(a1 instanceof Justdial)
		{
			a1.book();
		}
	}
}
public class sample222 {
public static void main(String[] args) {
Redbus r1=new Redbus();
Bookmyshow b1=new Bookmyshow();
Stimulator.ansim(r1);
Stimulator.ansim(b1);
}
}
