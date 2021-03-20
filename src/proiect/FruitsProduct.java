package proiect;
public class FruitsProduct implements Product {

	static final int MAX_FRU= 7;
	int index=0; // nr de fructe adaugate
	Fruits[] fruitsList;
	
	public FruitsProduct()
	{
		fruitsList = new Fruits[MAX_FRU];
		addFruits("Piersici");
		addFruits("Ananas");
		addFruits("Mere");
		addFruits("Pere");
		
	}
	
	public void addFruits(String s)
	{
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

