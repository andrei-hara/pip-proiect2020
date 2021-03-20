package proiect;
public class FruitsIterator implements Iterator 
{
	Fruits fruitsList[];
	int pos = 0;
	
	public FruitsIterator (Fruits fru[])
	{
		fruitsList=fru;
	}
	
	
	@Override
	public boolean hasNext() {
		if(pos >= fruitsList.length || fruitsList[pos]== null)
			return false;
		else
			return true;
	}

	@Override
	public Object next() {
			Fruits fruits = fruitsList[pos];
				pos+=1;
			return fruits;
		
	}

}
