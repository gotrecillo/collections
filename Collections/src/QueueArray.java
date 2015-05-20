
public class QueueArray extends MyArrayCollection implements Collectionable{
	
	//remove and get the first element in the queue and move the others forward
	public Object remove(){
		Object aux = null;
		if (!isEmpty()){
			aux = pile[0];
			for (int i = 0; i < peak; i++) {
				pile[i] = pile[i+1];
			}
			pile[peak] = null;
			peak--;
		}
		return aux;
	}
	
	//show that this is a queue
	@Override
	public void showHeader(){
		System.out.println("Esto es una cola\n==========");
		super.showHeader();
	}
}
