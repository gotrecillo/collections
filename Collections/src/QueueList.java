
public class QueueList extends MyListCollection implements Collectionable{

	@Override
	//get and remove the first element in a queue and redefine the new begin
	public Object remove() {
		Object o = null;
		if (begin != null){
			if (!isEmpty()){
				o = begin.getInfo();
				MyNode p = begin.getNext();
				begin = p;
			}
		}
		return o;
	}
	
	@Override
	//show that this is a queue
	public void showHeader(){
		System.out.println("Esto es una cola\n==========");
		super.showHeader();
	}
}
