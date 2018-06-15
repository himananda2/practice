package arrays;

import java.util.ArrayList;

public class CC {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		
		//HashMap map=new 

		for (int i = 0; i < 10; i++) {
			list.add(i);
		}

		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(5)) {
				list.add(i, 11);
			}
		}
		System.out.println(list);
	}

}
