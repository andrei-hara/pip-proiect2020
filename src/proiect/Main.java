package proiect;
/**
 * 
 * @author Andrei+Marian
 *
 */

public class Main {
	
	/**
	 * 
	 * @param args- mainul ce construieste iteratorul pt fruits
	 */

	public static void main(String[] args) {
		VegetablesProduct vp = new VegetablesProduct();
		VegetablesStock vs = new VegetablesStock(vp);
		vs.printVegetables();
		FruitsProduct fp=new FruitsProduct();
		FruitsStock fs= new FruitsStock(fp);
		fs.printFruits();

	}

}
