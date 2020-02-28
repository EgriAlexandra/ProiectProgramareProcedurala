package animal;

public class Caine extends Animal {

	public Caine() {
		// TODO Auto-generated constructor stub
	}

	public Caine(String tipAnimal) {
		super(tipAnimal);
		// TODO Auto-generated constructor stub
	}

	public Caine(String tipAnimal, String culoare, int varsta) {
		super(tipAnimal, culoare, varsta);
		// TODO Auto-generated constructor stub
	}
	
	public String afiseazaDetalii() {
		return "Animalul caine:"+getTipAnimal()+" "+";Culoare:"+getCuloare()+" "+";Varsta:"+getVarsta();
	}


}
