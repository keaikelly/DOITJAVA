package inheritance;

public class VIPCustomer extends Customer{
	private int agentID;
	double saleRatio;
	
	@Override
	public int calcPrice(int price) {
		bonusPoint+=price*bonusRatio; //적립
		return price-(int)(price*saleRatio); //가격
	}
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade="VIP";
		bonusRatio=0.05;
		saleRatio=0.1;
		//System.out.println("VIPCustomer() 생성자 호출 ");
	} 
	
	public int getAgentID() {
		return agentID;
	}

}
