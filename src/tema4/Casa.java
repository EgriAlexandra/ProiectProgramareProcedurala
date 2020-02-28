package tema4;

public class Casa extends Imobil {

	public Casa() {
		// TODO Auto-generated constructor stub
	}

	public Casa(String tipCasa, int nrEtaje, double pret) {
		super(tipCasa, nrEtaje, pret);
		// TODO Auto-generated constructor stub
	}
	
	public String detalii() {
		return "Tip casa:"+getTipCasa()+""+";Etaje:"+getNrEtaje()+""+";Pret:"+getPret();
}
}
