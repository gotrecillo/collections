
public abstract class MyArrayCollection implements Collectionable{
	protected Object [] pile;
	protected int peak;
	
	//Constructor and initiate method
	public MyArrayCollection(){
		initiate();
	}
	
	
	public void initiate(){
		this.pile = new Object [100];
		this.peak = -1;
	}
	
	//Add an object to the array, return true if it was correctly added.
	public boolean add(Object o){
		if(hasSpace()){
			peak++;
			pile[peak] = o;
			return true;
		}else{
			return false;
		}
	}
	
	//Add a random element (String, Integer or int) with a value between 0 and 100, return true if it was correctly added.
	public boolean addRandom(){
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
	
	//check if the array is full
	public boolean hasSpace(){
		if(peak != pile.length){
			return true;
		}else{
			return false;
		}
	}
	
	//check if the array is empty
	public boolean isEmpty(){
		if(peak != -1){
			return false;
		}
		return true;
	}
	
	/**
	 * get the object at the index i
	 * @param i
	 * @return
	 */
	protected Object getObjectAtIndex(int i){
		return pile[i];
	}
	
	// get the value of the sum of the elements in the array
	public int getSum(){
		int suma = 0;
		
		for (int i = 0; i <= peak; i++) {
			suma += Integer.parseInt(getObjectAtIndex(i).toString());
		}
		return suma;
	}
	
	//toString method
	public String toString(){
		String s = "";
		
		if (!isEmpty()){
			s = "|";
			for (int i = 0; i <= peak; i++) {
				s = s + getObjectAtIndex(i) + "|";
			}			
		}
		return s;
	}
	
	//show that this is an array
	public void showHeader() {
		System.out.println("Esto es un array");
	}
	
	
}
