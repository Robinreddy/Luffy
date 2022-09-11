package inherit;

public class Inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	marks( 10);
	

}
	public static void marks(int x) {
		System.out.println(x);
		hide();
	}
	public static void hide() {
		int k=0;
		for(int i=0;i<4;i++) {
			for(int j=1;j<4;j++) {
				k++;
				System.out.print(k);
			}
			System.out.println("");
			
		}
		}
			
	}

