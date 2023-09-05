package ifexample;

public class AloneSwitchCase1 {

	public static void main(String[] args) {
		int floor;
		String name;
		floor=5;
		switch(floor) {
		case 1: 
			name="약국";
			break;
		case 2:
			name="정형외과";
			break;
		case 3:
			name="피부과";
			break;
		case 4:
			name="치과";
			break;
		case 5:
			name = "헬스 클럽";
			break;
		default :
			name="없음";
			break;
		}
		System.out.println(floor+"층 "+name+"입니다.");

	}

}
