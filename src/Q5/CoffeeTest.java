package Q5;

public class CoffeeTest {

	public static void main(String[] args) {
		Person Kim=new Person("Kim", 4000);
		StarCoffee starCoffee = new StarCoffee();
		BeanCoffee beanCoffee = new BeanCoffee();
		
		Kim.buyStarCoffee(starCoffee, 4000);
		Kim.buyBeanCoffee(beanCoffee, 4500);
		
		
		

	}

}
