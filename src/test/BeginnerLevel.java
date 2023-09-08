package test;

public class BeginnerLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("달립니다");
	}

	@Override
	public void jump() {
		System.out.println("몰라");
	}

	@Override
	public void turn() {
		System.out.println("몰라");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***** 초급자 레벨입니다 *****");
	}
	
	

}
