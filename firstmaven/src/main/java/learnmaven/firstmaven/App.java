package learnmaven.firstmaven;


import java.util.Random;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		// daha hızlı System.out.print(kelime.charAt(i));
		 
		
		
		
		
		
		
	    Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int max;
		int sayiLengths;

		System.out.print("Sıralanacak sayılardaki max değeri giriniz:");
		max = scanner.nextInt();
		System.out.print("Sıralanacak sayıların sayısını giriniz:");
		sayiLengths = scanner.nextInt();

		int[] sayilar = new int[sayiLengths];
		for (int i = 0; i < sayilar.length; i++) {
			sayilar[i] = random.nextInt(max);
		}

		System.out.println("\nSıralanacak Dizi");
		for (int sayi : sayilar) {
			System.out.print(sayi + " ");
		}
        System.out.println("\n");
		System.out.println(
"Sıralamak istediğiniz türü seçiniz.\n 1.Bubble sort\n 2.Insertion sort\n 3.Merge sort\n 4.Quick sort\n 5.Shell sort");
		System.out.print("İstediğiniz sıralama türü:");
		int choose = scanner.nextInt();
		scanner.close();
		
		
		switch(choose) {
		    
		case 1:
			BubbleSort sortBubble = new BubbleSort();
			long start0Time = System.nanoTime();
			sortBubble.sortArray(sayilar);
			long end0Time = System.nanoTime();
			System.out.println("Çalışma süresi:"+(double)(end0Time-start0Time)/1000000+" milisaniyedir.\n");
	        break;
			
		case 2:
			InsertionSort sortInsertion = new InsertionSort();
			long start1Time = System.nanoTime();
			sortInsertion.sortArray(sayilar);
			long end1Time = System.nanoTime();
			System.out.println("Çalışma süresi:"+(double)(end1Time-start1Time)/1000000+" milisaniyedir.\n");
			break;
			
		case 3:
			 MergeSort sortMerge = new MergeSort();
             int son = sayilar.length - 1;
             long start2Time = System.nanoTime();
			 sortMerge.mergeSort(sayilar, 0, son);
			 long end2Time = System.nanoTime();
			 System.out.println("Çalışma süresi:"+(double)(end2Time-start2Time)/1000000+" milisaniyedir.\n");
			break;
			
		case 4:
			QuickSort sortQuick = new QuickSort();
			long start3Time = System.nanoTime();
			sortQuick.sortArray(sayilar);
			long end3Time = System.nanoTime();
		    System.out.println("Çalışma süresi:"+(double)(end3Time-start3Time)/1000000+" milisaniyedir.\n");
			break;
			
		case 5:
			ShellSort sortShell = new ShellSort();
			long start4Time = System.nanoTime();
			sortShell.sortArray(sayilar);
			long end4Time = System.nanoTime();
			System.out.println("Çalışma süresi:"+(double)(end4Time-start4Time)/1000000+" milisaniyedir.\n");
			
			break;
			
		}

		System.out.println("Sıralanmış Hali");

		for (int sayi : sayilar) {
			System.out.print(sayi + " ");
		}
		
	

	
	}
}
