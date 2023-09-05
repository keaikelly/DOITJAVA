package array;

public class AlphaArray {

	public static void main(String[] args) {
		char[][] alphaarray= new char[13][2];
		char ch='a';
		for(int i=0;i<alphaarray.length;i++) {
			for(int j=0;j<alphaarray[i].length;j++) {
				alphaarray[i][j]=ch;
				System.out.print(alphaarray[i][j]);
				ch++;
			}
			System.out.println();
		}
		
	}

}
