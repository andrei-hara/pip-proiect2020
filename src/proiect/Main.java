package proiect;

public class Main {

	public static void main(String[] args) {
		VegetablesProduct vp = new VegetablesProduct();
		VegetablesStock vs = new VegetablesStock(vp);
		vs.printVegetables();
		FruitsProduct fp=new FruitsProduct();
		FruitsStock fs= new FruitsStock(fp);
		fs.printFruits();

	}

}
