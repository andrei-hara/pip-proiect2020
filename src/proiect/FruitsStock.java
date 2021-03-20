package proiect;
/**
 * 
 * @author Andrei+Marian
 *
 */
public class FruitsStock {
	
	FruitsProduct fruits;
	
	/**
	 * 
	 * @param fruits-creeaza un obiect de tip fruits care este de tipul clasei fruitsproduct
	 */
	public FruitsStock(FruitsProduct fruits)
	{
		this.fruits=fruits;
	}
	
	/**
	 * functie de printare 
	 */
	public void printFruits()
	{
		
		Iterator iterator=fruits.createIterator();
		System.out.println("---------Fruits STOCK----------");
		while(iterator.hasNext())
		{
			Fruits f = (Fruits)iterator.next();
			System.out.println(f.getFruits());
		}
	}

}
