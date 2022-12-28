package Question3;

public class StaticMember {
	
	/*
	 * Tahminlerim: 
	 * sm1 x=2, y=1
	 * sm2 x=4, y=1
	 * z=16
	 * Tahminim : -x16-y1
	 */
	
	static int x;
	int y;
	
	StaticMember () {
		x+=2;
		y++;
	}
	
	static int getSquare () {
		return x*x;
	}
			
	public static void main(String[] args) {
	
		StaticMember sm1= new StaticMember();
		StaticMember sm2= new StaticMember();
		
		int z = sm1.getSquare();
		
		System.out.println("-x"  +z+"-y"+sm2.y);
	
		
	}

}
