
public class BasicStuff2 {

	public BasicStuff2() {
		
	}
	private static int greatestCommonFactor(int a, int b, int c)
	{
		int [] numTestArray = {a,b,c};
		int max = 0;
		for (int testNum : numTestArray)
		{
			for (int start = 1; start < testNum; start++) 
			{
				if ((a % start == 0) && (b % start == 0) && (c % start == 0) && (start > max)) 
				{
					max = start;
				}
			}
		}
		return max;
	}
	public static void main(String[] args) {
		System.out.println(BasicStuff2.greatestCommonFactor(3,4,5));

	}

}
