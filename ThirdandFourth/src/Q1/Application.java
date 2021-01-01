package Q1;

public class Application {
public static void main(String[] args) {
		
	 TwoWayList<Integer> list = new  TwoWayList<Integer>();

		list.addBeginning(19);
		list.addBeginning(96);
		list.addBeginning(47);
		
		list.addEnd(72); 
		list.addEnd(81);
		list.addEnd(61);

		list.print(); 

		list.deleteBeginning(); 
		list.deleteEnd(); 
		list.deleteSelected(96); 
		list.print(); 
		list.addEnd(19, 20); 
		list.addEnd(81, 80); 

		list.print(); 
		
		 TwoWayList<String> list2 = new  TwoWayList<String>();

		list2.addBeginning("o"); 
		list2.addBeginning("l");
		list2.addBeginning("a");

		list2.addEnd("s"); 
		list2.addEnd("h");
		list2.addEnd("i");
		list2.addEnd("k");
		list2.addEnd("h");
		list2.print(); 

	} 
		

	
}
