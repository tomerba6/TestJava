public class sorting {
	public static void sort(int[] array){
		for (int i = 0; i < array.length; i = i + 1) {
            swap(array, i, minIndex(array, i));
        }
	} 

	// Assumes a!=null & from < a.length
	public static int minIndex(int[] array, int from) {
		int minIndex = from;
		for(int i = from + 1; i < array.length; i = i + 1) 
			if (array[i] < array[minIndex]) 
				minIndex = i;  
		return minIndex;
	}

	//swap element a[i] with a[j]
	public static void swap(int[] array, int i, int j){
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}

	//----------------------------------------------------------
	public static void printArray(int[] array){
		if (array == null)
			System.out.print(array);
		else{
			System.out.print("{ ");
			for(int element: array)
				System.out.print(element+" ");
			System.out.println("}");
		}
	}
}