package Day6;

import java.util.*;
public class VendingMachineJUC1 
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter the amount=");
	  int money=sc.nextInt();
	  sc.close();
	
	  
	 Map map=new HashMap(); 
	  int totalnotes=0;
	  int rem=money;
	  int[] notes= {1000,500,100,50,10,5,2,1};
	 for(int i=0;i<notes.length;i++)
        { 
		 int tempnumbernotes=rem/i;
		 if(tempnumbernotes>0)
		 {
			 map.put(i, tempnumbernotes);
			 Set set=map.entrySet();
			 Iterator itr=set.iterator();
			 while(itr.hasNext())
					 {
			Map.Entry entry=(Map.Entry)itr.next();	 
			 
			 totalnotes=totalnotes+tempnumbernotes;
			 rem=rem%i;
			 System.out.println(notes[i]+  "Notes--" +rem);
			 } 
		 }
        	
        	System.out.println(notes[i]+  "Notes--" +rem);
        }
		  
  }
}
