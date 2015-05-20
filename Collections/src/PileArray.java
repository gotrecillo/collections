
public class PileArray extends MyArrayCollection implements Collectionable{
	
	//remove and get the last object in a pile and decrease the peak
	public Object remove(){
		Object aux = null;
		
		if(!isEmpty()){
			aux = pile[peak];
			peak--;
			
		}else{
			System.out.println("La pila está vacía");
		}
		return aux;
	}
	
	//show that this is a pile
	public void showHeader() {
		System.out.println("Esto es una pila\n==========");
		super.showHeader();
	}
}
