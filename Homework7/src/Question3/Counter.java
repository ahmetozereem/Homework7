package Question3;

public class Counter {
	
	/* Tahminlerim: 
	 * 
	 * 1
	 * 1
	 * 1
	 * 
	 * */
	
	int count=0;
	
	Counter () {
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
		
	Counter c1 = new Counter ();
	Counter c2 = new Counter ();
	Counter c3 = new Counter ();
	
	}

}
