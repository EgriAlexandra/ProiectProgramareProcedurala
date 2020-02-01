package main;
//Problema 1- Rezultatul va fi: a=2, b=5, c=20 ;
//Problema 2- Programul va compila si va aflisa 4.0 deaorece int se transforma in double;
//Problema 3- Nu va afisa nimic, deoarece primul if nu este indeplinit;
//Problema 4- Prima suna va fi 0+0+1=1, apoi 1+1+2=4 si tot asa pana la epuizarea termenilor, in final afisandu-se suma tuturor sumelor calculate;
public class ProiectProgramareProcedurala {
	public static void main(String[] args) {
		//tema 5  
		System.out.println("N!="+factorial(14));
		
		//tema 6
		System.out.println("Minimul este:"+minim(5, 3, 6));
		
		//tema7
		parImpar(6);
		
		//tema8
	    ziuaSaptamanii(2);
	}
	
	//tema5
	public static int factorial(int n) {
		if (n<13) {
		if (n==0)
			return 0;
		if(n==1)
			return 1;
		else 
			return n*factorial(n-1);
		}
		else {
			System.out.println("Eroare!");
			return 0;
		}
		//return 0;		
	}
	
	//tema 6
	public static int minim(int a, int b, int c) {
		if(a<b) {
			if(a<c)
				return a;
		}
		else if(a>b) {
			if(b<c)
				return b;
		}
		else if(a>c) {
			if(b>c)
				return c;
		}
		return 0;	
			
	}
	
	//tema 7
	public static void parImpar(int a) {
		if(a%2==0)
			System.out.println("numarul este par");
		else {
			System.out.println("numarul este impar");
		}
	}
	
	//tema 8
	public static void ziuaSaptamanii(int a) {
		switch (a) {
		case 1: 
			System.out.println("Luni");
			break;
		case 2:
			System.out.println("Marti");
			break;
		case 3:
			System.out.println("Miercuri");
			break;
		case 4:
			System.out.println("Joi");
			break;
		case 5:
			System.out.println("vineri");
			break;
		case 6:
			System.out.println("Sambata");
			break;
		case 7:
			System.out.println("Duminica");
			break;
		}
			
	}
}
