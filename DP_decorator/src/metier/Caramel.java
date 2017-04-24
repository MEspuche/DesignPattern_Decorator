package metier;

public class Caramel extends DecorateurIngredient {

	public Caramel(Boisson boisson)
	{
		super(boisson);
	}
	
	@Override
	public String getDescription() {
		return boisson.getDescription() + " + caramel";
	}

	@Override
	public double cout() {
		return boisson.cout() + 0.22;
	}

}
