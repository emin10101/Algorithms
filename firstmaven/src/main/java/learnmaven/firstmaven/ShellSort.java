package learnmaven.firstmaven;

public class ShellSort {

	
	
	
	public void insertionSort(int[] array) {

		int space = 0;
		for (int i = 1; i < array.length; i++) {
			for (int k = i; k > 0; k--) {
				if (array[k] < array[k - 1]) {
					space = array[k - 1];
					array[k - 1] = array[k];
					array[k] = space;
				}

			}

		}

	}

	// Sütunu Sıralamak için dizayn edilmiş hali
	public void insertionSort(int[] array, int totalSütun, int totalSatir, int currentySütun) {

		int space = 0;
		for (int i = currentySütun + totalSütun; i < array.length; i = i + totalSütun) {
			for (int k = i; k > 0; k--) {
				if (array[k] < array[k - 1]) {
					space = array[k - 1];
					array[k - 1] = array[k];
					array[k] = space;
				}

			}

		}

	}

	public void sortArray(int[] array, int sütun) {

		if (sütun < 1) {
			return;
		}

		int satir = array.length / sütun;

		int[][] shellArray = new int[satir][sütun];
		int x = 0;

		for (int i = 0; i < satir; i++) {
			for (int k = 0; k < sütun; k++) {
				if (x < array.length) {
					shellArray[i][k] = array[x];
					x++;

				} else {
					break;
				}

			}
		}

		for (int i = 0; i < sütun; i++) {

			insertionSort(array, sütun, satir, i);

		}
		sütun = sütun / 2;
		sortArray(array, sütun);

	}

	public void sortArray(int[] array) {
		// Sütun Sayısı
		int gap = array.length / 2;
		sortArray(array, gap);
	}

}
