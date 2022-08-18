package learnmaven.firstmaven;

public class InsertionSort {

	
	public void sortArray(int[] array) {
		// TODO Auto-generated method stub
		
		int space = 0;
		for(int i=1; i<array.length; i++)
		    {
		 for(int k=i; k>0; k--) 
			{
			 if(array[k]<array[k-1]) 		
			{	
				 space=array[k-1];
			     array[k-1]=array[k]; 
			     array[k]=space;	
			}
			
			}
			
		    }
		
	}

}
