package tema3;

public class UpC {
	public static void main(String[] args) {
		//Problema5
		String sir=new String("hello world");
		char[] ch=sir.toCharArray();
		
		for(int i=0; i<sir.length();i++) {
			if(i%2==0)
				ch[i]=Character.toUpperCase(ch[i]);
		
	}
	String newString=new String(ch);
	System.out.println(newString);
	
	//Problema6
	int[] intArray = new int[] {3, 4, 2, 6};
	double[] doubleArray = new double[intArray.length];
	double nr = 0.05;
	
	for(int i = 0; i < intArray.length; i++)
		doubleArray[i] = intArray[i] + nr;
	
	System.out.print("Elementele noului vector:");
	for(int i = 0; i < doubleArray.length; i++)
		System.out.print(doubleArray[i]+" ; ");

}
}
