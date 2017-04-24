package presentation;

import metier.Boisson;
import metier.Caramel;
import metier.Chocolat;
import metier.Columbia;
import metier.Expresso;

public class lanceur {

	public static void main(String[] args) {
		
		Boisson expresso = new Expresso(); 
		Boisson columbia1 = new Columbia();
		columbia1 = new Caramel(columbia1);
		columbia1 = new Chocolat(columbia1);
		columbia1 = new Chocolat(columbia1);
				
		System.out.println(expresso.getDescription() +" : " +expresso.cout() +" euros");
		System.out.println(columbia1.getDescription()+ " : "+ columbia1.cout()+ " euros");
		
		
		
		

	}

}
