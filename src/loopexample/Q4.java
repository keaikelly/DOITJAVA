package loopexample;

public class Q4 {

	public static void main(String[] args) {
		int i;
		int j;
		int linecount=4;
		int spacecount=linecount-1;
		int starcount=1;
		
		for (i=1;i<=linecount;i++) {
			for(j=1;j<=spacecount;j++) {
				System.out.print(' ');
			}
			for(j=1;j<=starcount;j++) {
				System.out.print('*');
			}
			System.out.println();
			spacecount-=1;
			starcount+=2;
		}

	}

}

