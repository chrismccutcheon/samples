
public class linkedList {
	linkedList next;
	Object value;
	linkedList first = null;
	linkedList last = null;
	linkedList(){
		this.value = null;
	}
	linkedList(Object value){
		this.value = value;
		
	}
	linkedList(linkedList next, Object value){
		this.value = value;
		this.next = next;
	}
	void insertchosenplace (Object value,linkedList next){
		if (first == null){
			linkedList node = new linkedList(value);
			first = node;
			last = node;
		}
		else
		{
			linkedList node = new linkedList(next, value);
			last = node;
		}
	}
	void insertfirst(Object value){
		if(first == null){
			linkedList node = new linkedList(value);
			first = node;
			last = node;
		}
		else{
			linkedList node = new linkedList(first, value);
			first = node;
		}
	}
	void remove (Object value){
		if(first == null){
			System.out.println("The list is empty");
		}
		else{
			linkedList cur = first;
			if (first.value == value){
				first = first.next;
			}
			else if(cur.next.value == value){
				cur.next = cur.next.next;
			}
		}
	}
}
