package metier;

public class Expresso extends Boisson {

	@Override
	public double cout() {
		return 1.99;
	}

	public Expresso() {
		super();
		description = "Expresso";
	}
	
	

}
