package array;
import java.util.ArrayList;
public class DogTestArrayList {

	public static void main(String[] args) {
		ArrayList<Dog> DogList=new ArrayList<Dog>();
		DogList.add(new Dog("name1", "type1"));
		DogList.add(new Dog("name2", "type2"));
		DogList.add(new Dog("name3", "type3"));
		DogList.add(new Dog("name4", "type4"));
		DogList.add(new Dog("name5", "type5"));
		
		for(int i=0;i<DogList.size();i++) {
			System.out.println(DogList.get(i).showDogInfo());
		}
		
		for(Dog DOG:DogList) {
			System.out.println(DOG.showDogInfo());
		}

	}

}
