package Q5;

public class StarCoffee {

	int money;
	
	public String brewing(int money) {
		this.money+=money;
		if(money==Menu.STARAMERICANO) {
			return "별다방아메리카노";
		}
		else if(money==Menu.STARLATTE) {
			return "별다방라떼";
		}
		else {
			return null;
		}
	}
}
