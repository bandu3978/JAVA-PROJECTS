package javaaaaa;

public class Sample2 {
public static void main(String[] args) {
	String str1="hbj@%";
	String str2="";
	int cot1=0;
	int cot2=0;
	   cot1=str1.length();
	   str2=str1.replaceAll("['@','%']", "");
	   cot2=str2.length();
	   System.out.println(cot1 -=cot2);
}
}
