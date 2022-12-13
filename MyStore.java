//paste all files in ur eclipse workspace and Run them using this main function
package project;
import java.util.ArrayList;
import java.util.Scanner;

public class MyStore {

	public static void main(String[] args) {
		System.out.println("Welcome To my Store\n");
		Product p1= new LedTv("Sony",23,50000);
		Product p2= new Pant("Loca",40,400);
		Product p3= new Shirt("Louis-Philip",40,300);
		Product p4= new SmartPhone("One-Plus",20,10000);
		Product p5= new ThrillerClassic("Gone With The Wind",40,100);
		Product p6= new OledTv("Samsung",30,40000);
		
//		Product [] prods = new Product[6];
//		prods[0]=new LedTv("Sony",23,50000);
//		prods[1]=new Pant("Loca",40,4000);
//		prods[2]=new Shirt("louis Philip",40,3000);
//		prods[3]=new SmartPhone("One-Plus",20,25000);
//		prods[4]=new ThrillerClassic("Gone With The Wind",40,400);
//		prods[5]=new OledTv("Samsung",30,40000);
		
		ArrayList<Product> prods= new ArrayList <Product>();
		ArrayList<String> billname = new ArrayList<String>();
		ArrayList<Integer> billqty = new ArrayList<Integer>();
		
		prods.add(p1);
		prods.add(p2);
		prods.add(p3);
		prods.add(p4);
		prods.add(p5);
		prods.add(p6);
		
		System.out.println("Please BROWSE through the CATALOGUE on display\n");
		for(Product p:prods) 
		{
			//System.out.println("Name is"+ p.getPname() +"quantity available is "+p.getQuantity() + "Price per Piece is "+ p.getPrice());
			System.out.println(p);
		}
		
//		Product bpass = prods[3];
//		int quo=bpass.getQuantity();
//		bpass.setQuantity(quo+10);
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter the Product NAME and the QUANTITY you want to buy");
		
		String myname;
		int qty;
		String choice;
		Product po=null;
		
//		int counter =0;
		ArrayList<Product> mybasket=new ArrayList<Product>();
		
		double totalprice=0;
		
		while(scan.hasNext())
		{
			myname=scan.next();
			billname.add(myname);			
			
			qty=scan.nextInt();
			billqty.add(qty);
			
			switch(myname) 
			{
			case "Sony":po = new LedTv(myname);
						po.setQuantity(qty);
						po.setPrice(p1.getPrice());
						totalprice= (p1.getPrice()*qty)+totalprice;
						break;
						
			case "Loca":po = new Pant(myname);
						po.setQuantity(qty);
						po.setPrice(p2.getPrice());
						totalprice= (p2.getPrice()*qty)+totalprice;
						break;
						
			case "Louis-Philip":po = new Shirt(myname);
								po.setQuantity(qty);
								po.setPrice(p3.getPrice());
								totalprice=(p3.getPrice()*qty)+totalprice;
								break;
								
			case "One-Plus":po = new SmartPhone(myname);
							po.setQuantity(qty);
							po.setPrice(p4.getPrice());
							totalprice= (p4.getPrice()*qty)+totalprice;
							break;
							
			case "Gone-With-The-Wind":po = new ThrillerClassic(myname);
									  po.setQuantity(qty);
									  po.setPrice(p5.getPrice());
									  totalprice= (p5.getPrice()*qty)+totalprice;
									  break;
									  
			case "Samsung": po = new OledTv(myname);
							po.setQuantity(qty);
							po.setPrice(p6.getPrice());
							totalprice= (p6.getPrice()*qty)+totalprice;
							break;
			}
			
			mybasket.add(po);
//			mybasket[counter++]=po;
			po =new Product(myname);
			po.setQuantity(qty);
			System.out.print("Press Y to buy more and N to Generate Bill :");
			choice=scan.next();
			if(choice.equalsIgnoreCase("y"))
				{
					System.out.print("\nEnter PRODUCT name and QUANTITY :");
					continue;
				}
			else{break;}
			
		}
		scan.close();
		for(Product see: mybasket) 
		{
			System.out.println(see);
		}
		
//		for(Product p:mybasket)
//		System.out.println(p);
		
		BillGenerator display = new BillGenerator();
		display.billDisplay(billname, billqty, totalprice);
		
	}
}

