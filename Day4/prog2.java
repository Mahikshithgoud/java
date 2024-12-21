package Day4;

public class prog2 {

	public static void main(String[] args) {
		for(int r=1;r<=20;r++) {
			if(r==1||r==20) {
			for(int c=1;c<=20;c++) {
				System.out.print("*");
		 }	
	}
			else {
				for(int c=1;c<=35;c++) {
					if(c==1||c==20)
					{
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
					
				}
			}
			System.out.println();
}
}
}