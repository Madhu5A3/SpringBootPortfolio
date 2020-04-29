import java.util.*;

class encapsulated{
	private int i;
	public int getvalueofi() {
		return 10;
	}
}

/*
 * class a extends encapsulated{ // a a1=new encapsulated();
 * System.out.println(getvalueofi()); }
 */

public class string_experimentation extends encapsulated{
	
	public static void main(String[] args) {
		encapsulated s = new encapsulated();
		System.out.println(s.getvalueofi());
		/*String s = "abc";
		s="def";
		System.out.println(s);*/
	}
}
