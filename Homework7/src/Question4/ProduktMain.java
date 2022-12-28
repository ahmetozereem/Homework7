package Question4;

import java.util.Arrays;
import java.util.Scanner;

public class ProduktMain {

	public static void main(String[] args) {
		
		System.out.println("Tebrikler, Bu internet sitesinde 5 adet ürünü ücretsiz alma hakkı kazandınız");
		
		Scanner scan = new Scanner (System.in);
		
		Product product1 = new Product (); 
		
		String arr1 [] = product1.newMethod();
		
		System.out.println(" ");
		System.out.println (Arrays.toString(arr1));
		System.out.println(" ");
				
		System.out.println (arr1 [0]);
		
		System.out.println (arr1 [1]);
		
		System.out.println (arr1 [2]);
		
		System.out.println (arr1 [3]);
		
		System.out.println (arr1 [4]);
		System.out.println(" ");
		
		Arrays.sort(arr1);
		System.out.println (Arrays.toString(arr1));
		System.out.println(" ");
		
		arr1 [2]="Audi";
		
		System.out.println (Arrays.toString(arr1));
		System.out.println(" ");
		
		if (Arrays.binarySearch(arr1, "Audi")>=0) {
			
		System.out.println("Değişiklik yaptıgınız urun listeye eklenmistir");
			
		}
		
					
		}

	}


