package Q1;

public class TwoWayList<S> {

	private Link <S> first;
	private Link <S> last;

	public TwoWayList() {
		this.first = null; 
		this.last = null;
	}
	
	public boolean IsEmpty() {
		return first == null;
	}

	public void addBeginning(S nn) {
		Link <S> newNode = new Link<S>(nn); 

		if (IsEmpty()) { 
			last = newNode;
		}
		else {
			first.previous = newNode; 
			newNode.next = first; 
			first = newNode; 
		}
	}
	
	public void addEnd(S nn) {
		
		Link <S> newNode = new Link<S>(nn); 
		if (IsEmpty()) {
			first = newNode; 
		}
		else {
			last.next = newNode; 
			newNode.previous = last;
		}
		last = newNode; 
	}

	public Link <S> deleteBeginning() {
		
		Link <S> backup = first;
		if (first.next == null) {
			last = null; 
		}
		else {
			first.next.previous = null; 
		}
		first = first.next; 
		return backup;
	}

	
	public Link <S> deleteEnd() {
		
		Link <S> backup = last;
		
		if (first.next == null) {
			first = null;
		}
		else {
			last.previous.next = null;
		}
		
		last = last.previous;
		
		return backup;
	}

	public boolean addEnd(S key, S nn) { 
		
		Link <S> active = first;
		while (active.data != key) {
			
			active = active.next;
			if (active == null)
				return false; 
		}
		
		Link <S> newNode = new Link <S>(nn); 

		if (active == last) {
			newNode.next = null; 
			last = newNode;
		}
		else {
			newNode.next = active.next; 		
			active.next.previous= newNode;
		}
		
		newNode.previous = active; 
		active.next= newNode;
		
		return true; 
	}

	public Link <S> deleteSelected(S key) { 
		Link <S> active = first; 
		
		while (active.data != key) {
			active = active.next; 
			if (active == null)
				return null; 
		}
		
		if(active == first) {
			first = active.next; 
		}
		else {				
			active.previous.next = active.next;
		}

		if(active == last) {
			last = active.previous;
		}
		else {
			active.next.previous = active.previous;
		}
		
		return active;
		
	}

	public void print() {
		
		System.out.print("List : ");
		Link <S> active = first; 
		
		while (active != null) {
			active.list(); 
			active = active.next; 
		}
		
		System.out.println("");
	}

}


