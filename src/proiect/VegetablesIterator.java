package proiect;
public class VegetablesIterator implements Iterator 
{
	Vegetables vegetablesList[];
	int pos = 0;
	
	public VegetablesIterator (Vegetables veg[])
	{
		vegetablesList=veg;
	}
	
	
	@Override
	public boolean hasNext() {
		if(pos >= vegetablesList.length || vegetablesList[pos]== null)
			return false;
		else
			return true;
	}

	@Override
	public Object next() {
			Vegetables vegetables = vegetablesList[pos];
				pos+=1;
			return vegetables;
		
	}

}
