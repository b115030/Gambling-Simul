import java.util.*;

public class GamblingImpl {
	public static final int TOTAL_MONEY = 100;
	public static final int BET_MONEY =1;
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
}
