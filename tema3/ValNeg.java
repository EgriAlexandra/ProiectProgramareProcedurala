package tema3;
//Tema3
public class ValNeg {

	public static void main(String[] args) {
		int arr[]= new int[] {1, 3, 5, -7, 4, 8, 9};
		for(int i=0; i<arr.length;i++)
			if(arr[i]<0)
			System.out.println("Elementul negativ se afla pe pozitia "+i);
	}

}
