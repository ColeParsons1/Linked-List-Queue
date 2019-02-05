/**
 * 
 * @author David Parsons
 *date-9/25/11
 */
public class LinkedListQueue{ //the class
	
	private Customer first, last;  //space for first and last position
	
	
	
	public LinkedListQueue() {//constructor
		
		first =  last = null;//create transition
		
		
		
		
	}
	
	public void enqueue(Customer c) {  //enqueue method
		
		
			
			if(isEmpty()) {//sets customer object equal to first
				
				first =  c;
				
				
			}
			
			else {
				
				last.setNext (c);  //sets next customer
			}
			
			last =  c;  //sets customer equal to last
		
		
		
		
		
	}
	
	
	
	
	
	public Customer dequeue() {  //dequeue method
		
		if(isEmpty()) {  //condition for empty
			
			System.out.println ("The queue is already empty"); //display empty
			
			return null;  //return null
		}
		
		Customer temp =  first;//set temp to first
		first =  first.getNext ();//set first equal to the next customer
		
		if(isEmpty ()) {
			
			last =  null;  //sets last equal to null
			
			}
		
		return temp;  //return temp
		
		
		
	
	
	


	}
	public boolean isEmpty() { //isEmpty method
		
		return first ==   null; //sets first equal to null
		 
		
		
		
		
		
		
		
		
	}//end method
}//end class