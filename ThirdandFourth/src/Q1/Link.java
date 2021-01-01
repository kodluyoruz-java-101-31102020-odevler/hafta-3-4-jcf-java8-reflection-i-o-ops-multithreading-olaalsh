package Q1;

public class Link<T> {

	public T data;
	public Link<T> next;
	public Link<T> previous;
	
	public Link(T d) {
		this.data = d;
	}

	public void list() {
		System.out.print(data + " ");
	}
}
