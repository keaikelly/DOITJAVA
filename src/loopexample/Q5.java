package loopexample;

public class Q5 {

	public static void main(String[] args) {
		int i;
		int j;
		int linecount=4;
		int spacecount=linecount-1;
		int starcount=1;
		
		for(i=1;i<=linecount;i++) {
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
		spacecount=linecount-3;
		starcount=5;
		for(i=1;i<=linecount-1;i++) {
			for(j=1;j<=spacecount;j++) {
				System.out.print(' ');
			}
			for(j=1;j<=starcount;j++) {
				System.out.print('*');
			}
			System.out.println();
			spacecount+=1;
			starcount-=2;
		}

	}

}
