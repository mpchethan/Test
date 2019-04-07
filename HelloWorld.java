import java.util.HashMap;

public class HelloWorld {
	public static void main(String[] args) {
		HashMap map =new HashMap();
		map.put(101, "Chethan");
		map.put(102, "ravi");
		map.put(102, "radha");
		map.put(null,null);
		map.put(null,"lak");
		System.out.println(map);
		
	}

}