import java.util.Scanner;


public class Test
{
	public static void main(String [] args)
	{
	
	    Scanner input=new Scanner(System.in);
	    double budget;
	    int option=0;
	    
		House h1=new House(5,2,6,new Address(45,3,"valencia","Lhr"));
		House h2=new House(8,3,7,new Address(22,8,"Pak arab","Lhr"));
		House h3=new House(11,2,8,new Address(74,1,"Spring homes","ISL"));
	    Luxurioushouse l1=new Luxurioushouse(19,2,6,new Address(14,2,"Bharia homes","ISL"),2,true);
		Luxurioushouse l2=new Luxurioushouse(25,3,10,new Address(41,8,"Engineers town","Lhr"),4,false);
		Luxurioushouse l3=new Luxurioushouse(15,3,8,new Address(15,8,"Valencia","Lhr"),4,true);
        Villa v1=new Villa(45,2,10,new Address(19,1,"Bahria Town","Lhr"),3,true,new Pool(1,4,29.1f));
		Villa v2=new Villa(50,3,13,new Address(26,10,"DHA","Lhr"),4,true,new Pool(2,8,32.12f));
		Villa v3=new Villa(30,2,9,new Address(49,4,"Model Town","Lhr"),5,false,new Pool(2,4,39.12f));
		
        House[] house={h1,h2,h3};
        Luxurioushouse[] luxury={l1,l2,l3};
        Villa[] villa={v1,v2,v3};
        
        
        System.out.println("\t\tList of Houses Available \n");
        for(int i=0;i<house.length;i++)
        {
        	 System.out.println(house[i].toString());
        }
        for(int i=0;i<luxury.length;i++)
        {
        	 System.out.println(luxury[i].toString());
        }
        for(int i=0;i<villa.length;i++)
        {
        	 System.out.println(villa[i].toString());
        }
       
		System.out.println("\nPlease Enter your Budget = ");
		budget=input.nextDouble();
		System.out.println("\t-----------------------------------------------------------------------------------------");
		
		do
		{
			
			House held = null;
			for(int i=0;i<house.length;i++)
	        {
				if(house[i].computePrice()<budget)
				{
					held=house[i];
				}
	        }
			
			for(int i=0;i<luxury.length;i++)
			{
				if(luxury[i].computePrice()<budget)
				{
					held=luxury[i];
				}
			}
			
			for(int i=0;i<villa.length;i++)
			{
				
				if(villa[i].computePrice()<budget)
				{
					held=villa[i];
				}
			}
				
			System.out.println("\t-----------------------------------------------------------------------------------------");
			System.out.println("\n We had found a house for you \n");
       	 System.out.println(held.toString());
       	 System.out.println("\nTo buy press 1\n to see another house press 2 and\n to exit press 3 = ");
             option=input.nextInt();
             if(option==1)
             {
           	  double leftamount=budget-held.computePrice();
           	  System.out.println("Thankyou for buying the house your left amount is = "+leftamount);
           	  option=3;
             }
             if(option==2)
             {
           	  budget=held.computePrice();
             }
		
		}while(option!=3);
	
	System.out.println("\nThank you for visiting us !");
	
	
	
	}
	

}
