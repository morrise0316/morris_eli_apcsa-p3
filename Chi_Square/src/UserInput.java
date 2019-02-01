import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class UserInput {
	public static observed ob;
	public static Expected exp;
	public static int liSize;
	public static int superListIndex = 0;
	public static double chiSum;
	public static int test;
	public static double[][] chiSqValues = {{0,.004,.016,.102,.455,1.32,2.71,3.84,6.63},{.02,.103,.211,.575,1.386,2.77,4.61,5.99,9.21},
			{.115,.352,.584,1.212,2.366,4.11,6.25,7.81,11.34},{.297,.711,1.064,1.923,3.357,5.39,7.78,9.49,13.28},{.554,1.145,1.610,2.675,4.351,
				6.63,9.24,11.07,15.09},{.872,1.635,2.204,3.455,5.348,7.84,10.64,12.59,16.81},{1.239,2.167,2.833,4.255,6.346,9.04,12.02,
					14.07,18.48},{1.647,2.733,3.490,5.071,7.344,10.22,13.36,15.51,20.09},{2.088,3.325,4.168,5.899,8.343,11.39,14.68,16.92,21.67},
					{2.558,3.940,4.865,6.737,9.342,12.55,15.99,18.31,23.21},{3.053,4.575,5.578,7.584,10.341,13.70,17.28,19.68,24.72},{3.571,5.226,6.304,8.438,
						11.340,14.85,18.55,21.03,26.22},{4.107,5.892,7.042,9.299,12.340,15.98,19.81,22.36,27.69},{4.660,6.571,7.790,10.165,13.339,17.12,21.06,
							23.68,29.14},{5.229,7.261,8.547,11.037,14.339,18.25,22.31,25.00,30.58},{5.812,7.962,9.312,11.912,15.338,19.37,23.54,26.30,32.00},
								{6.408,8.672,10.085,12.792,16.338,20.48,24.77,27.59,33.41},{7.015,9.390,10.865,13.675,17.338,21.60,25.99,28.87,34.80},
									{7.633,10.117,11.651,14.562,18.338,22.72,27.20,30.14,36.19},{8.260,10.851,12.443,15.452,19.337,23.83,28.41,31.41,37.57}};
	public static Scanner stdin = new Scanner(System.in);
	public static List<ArrayList<String>> listOfLists = new ArrayList<ArrayList<String>>();

	public void createList(String z) {
	     ArrayList<String> li = new ArrayList<String>();
		System.out.println("Enter your " + z + " values");

		while (true) {
            System.out.println("Current " + z + " values is/are " + li);
            System.out.println("Add more? (y/n)");
            String ans = stdin.next();
            
            if (ans.equals("y") || ans.equals("Y")) {
                System.out.println("Enter : ");
                li.add(stdin.next());
            } 
            else {
                break;
            }
        } 
        superListIndex++;
        liSize = li.size();
        System.out.println(z + " values are " + li);
        System.out.println("You are done creating the list of " + z + " values \n");
        listOfLists.add(li);
	}
	
	public static void chiSquareEval(List<String> x, List<String> y) {
		double critValue;
		
		if (x.size() == y.size()) {
			for (int i=0; i < liSize;i++) {
				chiSum += (Math.pow((Double.parseDouble(x.get(i))- Double.parseDouble(y.get(i))), 2)/Double.parseDouble(y.get(i)));
		
			}
			System.out.println("\n" +"Your chi square value:\n" + chiSum);
			System.out.print("Please state your statistical significance. The significance level is ");
			System.out.println("usually 5%.\n");
			System.out.println("Options:0-99%,1-95%,2-90%,3-75%,4-50%,5-25%,6-10%,7-5%,8-1% \n");
			critValue = chiSqValues [(liSize -1)][stdin.nextInt()];
			if (chiSum < critValue) {
				System.out.println("Your null hypothesis is accepted.");
			}
			else {
				System.out.println("Your null hypothesis is rejected.");
			}
	 }
		 else {
			 System.out.println("Your observed and expected values do not match in length size.");
			 System.out.println("Please try restarting the program.");
		 }
	}

	public static void main(String[] args) {
		observed.ob = new observed();
	    Expected.exp = new Expected();

		ob.createList("observed");
		exp.createList("expected");
		
		UserInput.chiSquareEval(listOfLists.get(0), listOfLists.get(1));
	}

}
