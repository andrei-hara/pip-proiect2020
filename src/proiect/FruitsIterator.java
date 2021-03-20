package proiect;
/**
 * 
 * @author Andrei+Hara
 *
 */
public class FruitsIterator implements Iterator 

/**
 * Aarray ce continte ob de tip fructe
 */

{
	Fruits fruitsList[];
	int pos = 0;
	
	public FruitsIterator (Fruits fru[])
	{
		
	/**
	 * Constr pt iterator
	 */
		
		fruitsList=fru;
	}
	
	
	@Override
	public boolean hasNext() {
		
		/**
		 * Fct care verifica daca mai sunt elem de parcurs in array
		 */
		if(pos >= fruitsList.length || fruitsList[pos]== null)
			return false;
		else
			return true;
	}

	@Override
	public Object next() {
		
		/**
		 * fct care itereaza prin array  
		 */
			Fruits fruits = fruitsList[pos];
				pos+=1;
			return fruits;
		
	}

}
