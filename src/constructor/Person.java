package constructor;

public class Person {
	String name;
	float height;
	float weight;
	
	public Person() {}
	
	public Person(String pname) {
		name=pname;
	}
	public Person(String name1, float height1, float weight1) {
		name=name1;
		height=height1;
		weight=weight1;
	}

}
