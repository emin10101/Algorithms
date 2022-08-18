package learnmaven.firstmaven;

public class QuickSort {

	private void swap(int[] array, int a, int b) {
		int temp = 0;
		temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

	public void sortArray(int[] arrayWillBeSort, int nowArrayLeftIndex, int nowArrayRightIndex) {

		// Eğer dizi tek elemanlı ise geri döndürüyor.
		if (nowArrayLeftIndex >= nowArrayRightIndex) {
			return;
		}
		// Dizinin şuanki indexleri tutucalara atanıyor üzerinde işlem yapılacağı için.
		int leftPointer = nowArrayLeftIndex;
		int rightPointer = nowArrayRightIndex;
		// pivot belirleniyor.
		int pivot = arrayWillBeSort[nowArrayRightIndex];

		while (leftPointer < rightPointer) {

			while (arrayWillBeSort[leftPointer] <= pivot && leftPointer < rightPointer) {
				/*
				 * lefPointer'ın tuttuğu sayı pivottan küçük veya eşit olduğunda left pointer
				 * bir sonraki elemana geçicek
				 */
				leftPointer++;
			}

			while (arrayWillBeSort[rightPointer] >= pivot && leftPointer < rightPointer) {
				/*
				 * rightPointer'ın tuttuğu sayı pivottan büyük veya eşit olduğunda right pointer
				 * bir önceki elemana geçicek
				 */
				rightPointer--;
			}
			/*
			 * lef pointerın tuttuğu eleman ile right pointerın tuttuğu eleman yer değişiyor
			 */
			swap(arrayWillBeSort, leftPointer, rightPointer);

		}
		// left pointerın tuttğu eleman ile pivot yer değiştiriliyor ve pivotun yeri
		// belirleniyor.
		swap(arrayWillBeSort, leftPointer, nowArrayRightIndex);

		// Dizinin solunda kalan elemanlar gönderiliyor
		sortArray(arrayWillBeSort, nowArrayLeftIndex, leftPointer - 1);
		// Dizinin sağında kalan elemanlar gönderiliyor
		sortArray(arrayWillBeSort, leftPointer + 1, nowArrayRightIndex);

	}

	public void sortArray(int[] array) {
		// 5 1 9 3 6 2
		int left = 0;
		int right = array.length - 1;

		sortArray(array, left, right);

	}

}
