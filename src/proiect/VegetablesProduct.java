package proiect;
public class VegetablesProduct implements Product {

	static final int MAX_VEG= 7;
	int index=0; // nr de legume adaugate
	Vegetables[] vegetablesList;
	
	public VegetablesProduct()
	{
		vegetablesList = new Vegetables[MAX_VEG];
		addVegetables("Castraveti");
		addVegetables("Ardei");
		addVegetables("Dovlecei");
		addVegetables("Vinete");
	}
	
	public void addVegetables(String s)
	{
		Vegetables leguma = new Vegetables(s);
		if (index >= MAX_VEG) 
            System.out.println("Full la legume"); 
        else
        { 
            vegetablesList[index]=leguma; 
            index++; 
        } 
	}
	
	
	@Override
	public Iterator createIterator() {
		
		return new VegetablesIterator(vegetablesList);
	}
	

}
