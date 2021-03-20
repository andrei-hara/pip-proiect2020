package proiect;
public class FruitsStock {
	FruitsProduct fruits;
	
	public FruitsStock(FruitsProduct fruits)
	{
		this.fruits=fruits;
	}
	
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
