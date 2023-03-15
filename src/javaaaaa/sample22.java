package javaaaaa;

import java.util.ArrayList;

public class sample22 {
public static void main(String[] args) {
	ArrayList l1=new ArrayList();
      l1.add((String)"hhjhjkf");
	  l1.add((String)"jhdsjf");
      l1.add((String)"lfhkndnvk");
	 l1.add((String)"kjhfkhk");
		 System.out.println(l1);
String[] arr=new String[l1.size()];
for (int i = 0; i < l1.size(); i++)
{
	arr[i]=(String)l1.get(i);
}
for (int i = 0; i < arr.length; i++) {
	System.out.println(arr[i]);
}

} 
}
