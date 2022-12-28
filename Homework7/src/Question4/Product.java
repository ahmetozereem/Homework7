package Question4;

import java.util.Arrays;
import java.util.Scanner;

public class Product {
		
	public String [] newMethod () {
		
		
		String [] products = new String [5];
		
		Scanner scan = new Scanner (System.in);
				
		for (int i=0; i<products.length;i++) { 
			
		System.out.println(" ");				
		System.out.println("Lütfen seçtiğiniz " + (i+1)+". "+"ürün adını giriniz");
		products [i] = scan.next();
					
		}
							
		return products;		
	}
}
