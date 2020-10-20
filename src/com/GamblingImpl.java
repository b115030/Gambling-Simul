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
		int winOrLossMoney = todayMoney - TOTAL_MONEY;
		if (winOrLossMoney < 0)
			System.out.println(" Resigned for the Day with loss of : " + winOrLossMoney);
		else
			System.out.println(" Resigned for the Day with win of : " + winOrLossMoney);
		return winOrLossMoney;
	}

	// UC4
	public void totalWinsOrLoss() {
		int totalAmountAfter20Days = 0, maxWin = -1001, maxLoss = 1001, luckiestDay = 0, unluckiestDay = 0;
		int[] array = new int[20];
		for (int i = 0; i < 20; i++) {
			System.out.print("For Day " + (i + 1));
			array[i] = gamble();
			totalAmountAfter20Days += array[i];

		}

		if (totalAmountAfter20Days < 0)
			System.out.println("Total loss " + totalAmountAfter20Days);
		else
			System.out.println("total win " + totalAmountAfter20Days);
		luckiestDay(array);
	}

	public void luckiestDay(int[] array) {
		int unluckyCount=0, luckyCount=0,maxLoss = 1001,maxWin = -1001, win = 0,loss = 0,temp;
		for (int i = 0; i < array.length; i++) {
			temp = array[i];
			if (temp < 0) {
				win = 0;
				loss += temp;
				if (loss < maxLoss) {
					maxLoss = loss;
					unluckyCount = i;

				}

			} else {
				loss = 0;
				win += temp;
				if (win > maxWin) {
					maxWin = win;
					luckyCount = i;
				}
			}
		}
		System.out.println("Luckiest Day " + luckyCount + " with win of " + maxWin);
		System.out.println("Unluckiest Day " + unluckyCount + " with loss of " + maxLoss);
	}
}