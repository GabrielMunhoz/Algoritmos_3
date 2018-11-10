
public class Node<T> {
	private int elem;
	private T next;
	private T prev;
	
	public Node(){
		
	}
		
	
	public int getElem() {
		return elem;
	}
	public void setElem(int elem) {
		this.elem = elem;
	}
	public T getNext() {
		return next;
	}
	public void setNext(T next) {
		this.next = next;
	}
	public T getPrev() {
		return prev;
	}
	public void setPrev(T prev) {
		this.prev = prev;
	} 
	
	
}
