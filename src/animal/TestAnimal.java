package animal;

public class TestAnimal {

	public static void main(String[] args) {
		Animal animal1= new Animal();
		animal1.setTipAnimal("Dog");
		animal1.setCuloare("Black");
		animal1.setVarsta(5);
		
		Animal animal2= new Animal("Cat");
		animal2.setCuloare("Grey");
		animal2.setVarsta(3);
		
		Animal animal3= new Animal("Cow","Black&White",7);
		
		System.out.println("TipAnimal: "+animal1.getTipAnimal()+"\nCuloare: "+animal1.getCuloare()+"\nVarsta: "+animal1.getVarsta());
		System.out.println();
		System.out.println("TipAnimal: "+animal2.getTipAnimal()+"\nCuloare: "+animal2.getCuloare()+"\nVarsta: "+animal2.getVarsta());
		System.out.println();
		System.out.println("TipAnimal: "+animal3.getTipAnimal()+"\nCuloare: "+animal3.getCuloare()+"\nVarsta: "+animal3.getVarsta());
		
		Pisica pisica1=new Pisica("British","Gri",2);
		System.out.println("\nPisica:"+pisica1.getTipAnimal()+" \nCuloare: "+pisica1.getCuloare()+" \nVarsta: "+pisica1.getVarsta());
		System.out.println(pisica1.afiseazaDetalii());
		
		Caine caine1=new Caine("GoldenRietriver", "Gold", 1);
		System.out.println("\nCaine:"+caine1.getTipAnimal()+" \nCuloare: "+caine1.getCuloare()+" \nVarsta: "+caine1.getVarsta());
		System.out.println(caine1.afiseazaDetalii());

	}

}
