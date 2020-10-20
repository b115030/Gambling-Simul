import java.util.*;

public class GamblingImpl {
	//UC1
	public static final int TOTAL_MONEY = 100;
	public static final int BET_MONEY = 1;
	//UC2
	public boolean checkWin() {
		Random random = new Random();
		int status = random.nextInt(2);
		if (status == 0) {
			System.out.println("Win");
			return true;
		}
		System.out.println("loss");
		return false;
	}
	//UC3
	public void gamble() {
		int todayMoney = TOTAL_MONEY;
		while (todayMoney > 50 && todayMoney < 150) {
			if (checkWin()) {
				todayMoney+=BET_MONEY;
				System.out.println("Money after Gamble " + todayMoney);
			} else {
				todayMoney-=BET_MONEY;
				System.out.println("Money after Gamble " + todayMoney);
			}
		}
		System.out.println("Resigned for the Day with money: " + todayMoney);
	}
}