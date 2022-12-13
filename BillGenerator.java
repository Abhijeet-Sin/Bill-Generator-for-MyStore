package project;
import java.util.ArrayList;
import java.util.Iterator;

public class BillGenerator {

	public void billDisplay(ArrayList<String> billname, ArrayList<Integer> billqty, double total) 
	{
		int space=0;
		String name;
		System.out.println("\n\nGenerating you TOTAL BILL:");
		System.out.println("Product                         Quantity");
		Iterator < String > iterator = billname.iterator();
		Iterator < Integer > iterator1 = billqty.iterator();
		
		while(iterator.hasNext()&&iterator1.hasNext()) 
		{
			 name= iterator.next();
			 System.out.print(name);
			 space=36-name.length();
			 
			 for(int i=0;i<space;i++)
			 {System.out.print(" ");}
			 
			 System.out.println(iterator1.next());
		}		
		System.out.println("Please Pay : "+total+" At the COUNTER");
		
	}

}
