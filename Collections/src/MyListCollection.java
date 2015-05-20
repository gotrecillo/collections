
public abstract class MyListCollection implements Collectionable {
	
	protected MyNode begin;
	
	//constructors
	public MyListCollection(){
		begin = new MyNode();
		begin.setInfo(null);
		begin.setNext(null);
	}
	
	public MyListCollection(MyNode begin){
		this.begin = begin;
	}
	
	
	//get the node before the last element
	protected MyNode getPreLast(){
		int size = getSize();
		if (size == 1 || size == 0){
			return new MyNode();
		}else{
			MyNode preLast = begin;
			while(preLast.getNext().getNext() != null){
				preLast = preLast.getNext();
			}
			return preLast;
			}
		}
	
	//get the last node
	protected MyNode getLast(){
		if(begin.getInfo() == null){
			return begin;
		}
		MyNode last = begin;
		while(last.getNext() != null){
			last = last.getNext();
		}
		return last;
	}
	
	//get the size of the list
	public int getSize(){
		int size = 0;
		MyNode actual = begin;
		if (!isEmpty()){
			while (actual != null){
				size++;
				actual = actual.getNext();
			}
		}
		return size;
	}
	
	@Override
	//add an element to the list, always return true;
	public boolean add(Object o) {
		if (isEmpty()){
			begin = new MyNode(o);
		}else{
			MyNode n = new MyNode(o);
			getLast().setNext(n);
		}
		return true;
	}

	@Override
	//Add a random element (String, Integer or int) with a value between 0 and 100, return true if it was correctly added.
	public boolean addRandom() {
		int type, random;
		if(hasSpace()){
			random = MyMaths.random(100);
			type = MyMaths.random(2);
			switch (type) {
			case 0:
				String s ="" + random;
				return add(s);
			case 1:
				Integer i = new Integer(random);
				return add(i);
			case 2:
				return add(random);
			}
		}
		return false;
	}

	@Override
	//check if the list if empty
	public boolean isEmpty() {
		if (begin.getInfo() != null){
			return false;
		}
		return true;
	}

	@Override
	//check if the list is full
	public boolean hasSpace() {
		return true;
	}

	@Override
	// get the value of the sum of the elements in the list
	public int getSum() {
		int sum = 0, actualValue;
		MyNode actual = begin;
		if (!isEmpty()){
			while (actual != null){
				actualValue = Integer.parseInt(actual.getInfo().toString());
				sum = sum + actualValue;
				actual = actual.getNext();
			}
		}
		return sum;
	}

	//toString method
	public String toString(){
		String s = "";
		if(!isEmpty()){
			MyNode actual = begin;
			if (true){
				s = "|";
			}
			while (actual != null){
				s = s + actual.toString() + "|";
				actual = actual.getNext();
			}
		}
		return s;
	}
	
	@Override
	//show that this is a list
	public void showHeader() {
		System.out.println("Esto es una lista");
	}
}
