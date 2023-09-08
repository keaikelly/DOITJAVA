package gameLevel;

public class BeginnerLevel extends PlayerLevel{
	public void run() {
		System.out.println("천천히 달립니다.");
	}
	public void jump() {
		System.out.println("Jump할 줄 모르지롱.");
	}
	public void turn() {
		System.out.println("Turn할 줄 모르지롱.");
	}
	public void showLevelMessage() {
		System.out.println("***** 초보자 레벨입니다. *****");
	}
}
