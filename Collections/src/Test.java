public class Test {

	public static void main(String[] args) {
		
		//Creo los UseCollectionables para añadir elementos, visualizarlos y visualizar la suma
		PileArray pA = new PileArray();
		UseCollectionable uPA = new UseCollectionable(pA);
		
		QueueArray qA = new QueueArray();
		UseCollectionable uQA = new UseCollectionable(qA);
		
		PileList pL = new PileList();
		UseCollectionable uPL = new UseCollectionable(pL);
		
		QueueList qL = new QueueList();
		UseCollectionable uQL = new UseCollectionable(qL);
		
		//Los lleno con numeros o strings que representen numeros al azar
		for (int i = 0; i < MyMaths.random(100); i++) {
			uPA.addRandom();
		}
		
		for (int i = 0; i < MyMaths.random(100); i++) {
			uQA.addRandom();
		}
		
	
		for (int i = 0; i < MyMaths.random(100); i++) {
			uQL.addRandom();
		}
		
		for (int i = 0; i < MyMaths.random(100); i++) {
			uPL.addRandom();
		}
		
		//Veo la informacion antes de eliminar nada
		
		uPA.showInfo();
		uQA.showInfo();
		uPL.showInfo();
		uQL.showInfo();
		
		//Vemos los elementos a la vez que los eliminamos
		System.out.println("\nQuitamos un elemento de cada lista\n");
		System.out.println(uPA.remove());
		System.out.println(uQA.remove());
		System.out.println(uPL.remove());
		System.out.println(uQL.remove());
		
		//Vemos la informacion despues de eliminar los elementos
		uPA.showInfo();
		uQA.showInfo();
		uPL.showInfo();
		uQL.showInfo();
		
	}
	


}
