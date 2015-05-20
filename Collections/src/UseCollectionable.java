
public class UseCollectionable {
	
	Collectionable p;
	
	UseCollectionable(){
	}
	
	UseCollectionable(Collectionable p){
		this.p = p;
	}

	public void showInfo(){
		p.showHeader();
		System.out.println(p.getSum());
		System.out.println(p.toString());
		System.out.println();
	}
	
	public boolean add(Object o) {
		return p.add(o);
	}

	public boolean addRandom() {
		return p.addRandom();
	}

	public Object remove() {
		return p.remove();
	}

	public boolean isEmpty() {
		return p.isEmpty();
	}

	public boolean hasSpace() {
		return p.hasSpace();
	}

	public int getSum() {
		return p.getSum();
	}
}
