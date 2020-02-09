package tema3;

public class Array {
		public static void main(String[] args) {
			//Problema1
			double[] doubleArray;
			doubleArray=new double[3];
			doubleArray[0]=2.00;
			doubleArray[1]=5.00;
			doubleArray[2]=6.00;
			
			for(int i=0; i<doubleArray.length;i++)
				System.out.println("Element at index"+i+":"+doubleArray[i]);

			//Problema2
			int arr[]= new int[] {1, 3, 5, 7, 4, 8, 9, 10, 12, 22};
			
			int max=getMax(arr);
			System.out.println("Valoarea maxima este:"+max);
			
			int min=getMin(arr);
			System.out.println("Valoarea minima este:"+min);
		}
		
public static int getMax(int[] inputArr) {
	int maxValue=inputArr[0];
	for(int i=1; i<inputArr.length;i++)
		if(inputArr[i] > maxValue){ 
	         maxValue = inputArr[i]; 
	    } 
	    
	    return maxValue; 
}
public static int getMin(int[] inputArr){ 
    int minValue = inputArr[0]; 
    for(int i=1;i<inputArr.length;i++){ 
      if(inputArr[i] < minValue){ 
        minValue = inputArr[i]; 
      } 
    } 
    return minValue; 
}
}