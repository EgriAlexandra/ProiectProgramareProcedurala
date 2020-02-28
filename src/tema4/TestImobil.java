package tema4;

public class TestImobil {

	public static void main(String[] args) {
		Imobil imobil1= new Imobil("Bloc",10,500000);
		Imobil imobil2=new Imobil("Casa",1,30000);
		Imobil imobil3= new Imobil("Vila",3,100000);
		
		System.out.println("TipImobil: "+imobil1.getTipCasa()+"\nNrEtaje: "+imobil1.getNrEtaje()+"\nPret: "+imobil1.getPret());
		System.out.println();
		System.out.println("TipImobil: "+imobil2.getTipCasa()+"\nNrEtaje: "+imobil2.getNrEtaje()+"\nPret: "+imobil2.getPret());
		System.out.println();
		System.out.println("TipImobil: "+imobil3.getTipCasa()+"\nNrEtaje: "+imobil3.getNrEtaje()+"\nPret: "+imobil3.getPret());	
		
		Vila vila1=new Vila("mare",3,100000);
		System.out.println("\nVila:"+vila1.getTipCasa()+" \nNrEtaje: "+vila1.getNrEtaje()+" \nPret: "+vila1.getPret());
		System.out.println(vila1.detalii());
		
		Casa casa1=new Casa("cu 4 camere",1,70000);
		System.out.println("\nCasa:"+casa1.getTipCasa()+" \nNrEtaje: "+casa1.getNrEtaje()+" \nPret: "+casa1.getPret());
		System.out.println(casa1.detalii());

	}

}
