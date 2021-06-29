
public class ObjectAndString {

	public static void main(String[] args) {
		
		long x = 1000; //prim
		
		Long y = Long.valueOf(x); //prim to obj
		
		String s = y.toString(); //obj to str
		
		Long z = Long.valueOf(s); //str to obj
		
	}

}
