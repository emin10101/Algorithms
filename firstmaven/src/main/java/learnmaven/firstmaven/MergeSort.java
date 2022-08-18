package learnmaven.firstmaven;


//İnternetten video ile yapıldı.
public class MergeSort {
	
	public void mergeSort(int[] S, int left, int right){
	    if (right <= left) { return; }
	    
	    int mid = (right + left) / 2;
	    mergeSort(S, left, mid);
	    mergeSort(S, mid+1, right);
	    merge(S, left, mid, right);

	    }

	
	
	// BURAYI TEKRAR ET.
	public  void merge(int[] S, int left, int mid, int right){
	    int i, j;
	    int[] aux = new int[S.length];

	    for (i = mid+1; i > left; i--) {aux[i-1] = S[i-1];}
	    for (j = mid; j < right; j++) {aux[right+mid-j] = S[j+1];}
	    for (int k = left; k <= right; k++){
	        if (aux[j] < aux[i]) {
	            S[k] = aux[j--]; 
	        } else{
	            S[k] = aux[i++];
	        }
	    }
	}
	


}
