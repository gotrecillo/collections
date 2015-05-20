
public class MyNode {
	private MyNode next;
	private Object info;
	
	public MyNode(){
		info = null;
	}
	
	public MyNode(Object info){
		this.info = info;
	}
	
	public MyNode getNext() {
		return next;
	}

	public void setNext(MyNode next) {
		this.next = next;
	}

	public Object getInfo() {
		return info;
	}

	public void setInfo(Object info) {
		this.info = info;
	}

	public String toString(){
		if (info == null){
			return "";
		}
		return info.toString();
	}
}
