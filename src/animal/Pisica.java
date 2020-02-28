package animal;

public class Pisica extends Animal {

	public Pisica() {
		// TODO Auto-generated constructor stub
	}

	public Pisica(String tipAnimal) {
		super(tipAnimal);
		// TODO Auto-generated constructor stub
	}

	public Pisica(String tipAnimal, String culoare, int varsta) {
		super(tipAnimal, culoare, varsta);
		// TODO Auto-generated constructor stub
	}
	
	public String afiseazaDetalii() {
		return "Animalul pisica:"+getTipAnimal()+" "+"\nCuloare:"+getCuloare()+" "+"\nVarsta:"+getVarsta();
	}

}
