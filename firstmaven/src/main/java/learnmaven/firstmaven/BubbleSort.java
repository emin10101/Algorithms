package learnmaven.firstmaven;

public class BubbleSort {

	
	public void sortArray(int[] array) {
		
	int space = 0;	
		
	for(int k=0; k<array.length-1; k++)
	{
		for(int i=0; i<array.length-1; i++) 
	{
		if(array[i+1]<array[i])
		{
			 space=array[i];
		     array[i]=array[i+1]; 
		     array[i+1]=space;
	    }
		
		
	}
	}
	
	
	
	
	}

}
