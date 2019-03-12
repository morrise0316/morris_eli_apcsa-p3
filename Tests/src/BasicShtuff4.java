import java.util.ArrayList;
import java.util.List;

public class BasicShtuff4 {

	public BasicShtuff4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		List<Integer> ray;

		ray = new ArrayList<Integer>();
		ray.add(23);

		ray.add(0, 11);

		ray.set(1,66);

		System.out.println(ray);
	}

}
