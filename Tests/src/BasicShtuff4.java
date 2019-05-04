import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasicShtuff4 {

	public BasicShtuff4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ArrayList<int[]> xyList = new ArrayList<int[]>();
		xyList.add(new int[] {4,3});
		xyList.add(new int [] {4,234,43});
		
		for (int[] t : xyList)
		System.out.print(Arrays.toString(t));
	}

}
