package polymorphism;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee=new Customer();
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("이순신");
		customerLee.bonusPoint=1000;
		
		System.out.println(customerLee.showCustomerInfo());
		
		Customer customerKim=new VIPCustomer(10020, "김유신", 12345);
		customerKim.bonusPoint=1000;
		
		System.out.println(customerKim.showCustomerInfo());
		System.out.println("====== 할인율과 보너스 포인트 계산 ======");
		
		int price=10000;
		int LeePrice =customerLee.calcPrice(10000);
		int KimPrice =customerKim.calcPrice(10000);
		
		System.out.println(customerLee.getCustomerName()+"님이 "+ LeePrice+"원 지불하셨습니다.");
		System.out.println(customerKim.getCustomerName()+"님이 "+ KimPrice+"원 지불하셨습니다.");
		System.out.println(customerKim.showCustomerInfo());
	}

}
