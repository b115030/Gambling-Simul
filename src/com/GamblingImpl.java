import java.util.*;

public class GamblingImpl {
	// UC1
	public static final int TOTAL_MONEY = 100;
	public static final int BET_MONEY = 1;

	// UC2
	public boolean checkWin() {
		Random random = new Random();
		int status = random.nextInt(2);
		if (status == 0) {
			return true;
		}
		return false;
	}

	// UC3
	public int gamble() {
		int todayMoney = TOTAL_MONEY;
		while (todayMoney > 50 && todayMoney < 150) {
			if (checkWin()) {
				todayMoney += BET_MONEY;
			} else {
				todayMoney -= BET_MONEY;
			}
		}
		System.out.println("Resigned for the Day with : " + todayMoney);
		return (todayMoney - TOTAL_MONEY);
	}

	// UC4
	public void totalWinsOrLoss() {
		int totalAmountAfter20Days = 0;
		for (int i = 0; i < 20; i++) {
			totalAmountAfter20Days += gamble();
		}
		if (totalAmountAfter20Days < 0)
			System.out.println("Total loss " + totalAmountAfter20Days);
		else
			System.out.println("total win " + totalAmountAfter20Days);
	}
}