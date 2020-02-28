package tema4;

public class Vila extends Imobil {

	public Vila() {
		// TODO Auto-generated constructor stub
	}

	public Vila(String tipCasa, int nrEtaje, double pret) {
		super(tipCasa, nrEtaje, pret);
		// TODO Auto-generated constructor stub
	}
	
	public String detalii() {
		return "Tip casa:"+getTipCasa()+""+";Etaje:"+getNrEtaje()+""+";Pret:"+getPret();
	}

}
