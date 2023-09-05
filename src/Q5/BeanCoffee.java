package Q5;

public class BeanCoffee {
	int money;
	
	public String brewing(int money) {
		this.money+=money;
		if(money==Menu.BEANAMERICANO) {
			return "콩다방아메리카노";
		}
		else if(money==Menu.BEANLATTE) {
			return "콩다방라떼";
		}
		else {
			return null;
		}
	}
}

