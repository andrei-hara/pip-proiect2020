package proiect;

/**
 * 
 * @author Andrei+Marian
 *
 */
public class FruitsProduct implements Product {

	/**
	 *  Fruits[] fruitslist - array de obiecte fruits
	 */
	
	static final int MAX_FRU= 7;
	int index=0; // nr de fructe adaugate
	Fruits[] fruitsList;
	
	public FruitsProduct()
	{
		/**
		 * constr ce adauga obiecte de tip fruits in lista
		 */
		fruitsList = new Fruits[MAX_FRU];
		addFruits("Piersici");
		addFruits("Ananas");
		addFruits("Mere");
		addFruits("Pere");
		
	}
	
	public void addFruits(String s)
	{
		
	/**
	 * functie pt adaugarea obiectelor in lista
	 */
		Fruits fruct = new Fruits(s);
		if (index >= MAX_FRU) 
            System.out.println("Full la fructe"); 
        else
        { 
            fruitsList[index]=fruct; 
            index++; 
        } 
	}
	
	
	@Override
	public Iterator createIterator() {
		
		return new FruitsIterator(fruitsList);
	}
	

}

