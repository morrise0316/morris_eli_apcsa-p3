
public class BasicStuff3 {

	public BasicStuff3() {
		// TODO Auto-generated constructor stub
	}
	
	public static boolean isGoofy (int num) {
		int count = 0;
		int totalGoofyNums = 0;
		for (int tenPwr = 1; tenPwr < 4; tenPwr++)
		{
			int checkNum = (int) ((num % Math.pow(10, tenPwr))/ Math.pow(10,tenPwr-1));
			if (checkNum != 0 && num % checkNum == 0)
				totalGoofyNums += checkNum;
		}
		if (totalGoofyNums % 2 == 1)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		System.out.println(BasicStuff3.isGoofy(777));
	}

}
