
public class PileList extends MyListCollection implements Collectionable{
	
	//get and remove the last element in a pile
	public Object remove() {
		if (getSize() > 1){
			MyNode preLast = getPreLast();
			MyNode last = getLast();
			preLast.setNext(null);
			return last.getInfo();
			}
		Object info = begin.getInfo();
		begin = new MyNode();
		return info;
	}

	//show that this is a pile
	public void showHeader(){
		System.out.println("Esto es una pila\n==========");
		super.showHeader();
	}
}
