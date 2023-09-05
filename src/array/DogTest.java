package array;

public class DogTest {

	public static void main(String[] args) {
		Dog[] dog=new Dog[5];
		dog[0]=new Dog("name1", "type1");
		dog[1]=new Dog("name2", "type2");
		dog[2]=new Dog("name3", "type3");
		dog[3]=new Dog("name4", "type4");
		dog[4]=new Dog("name5", "type5");
	
		for(int i=0;i<dog.length;i++) {
			System.out.println(dog[i].showDogInfo());
}
		
		for(Dog DOG:dog) {
			System.out.println(DOG.showDogInfo());
		
		}

	}
}


