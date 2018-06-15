package sdet;

import java.util.ArrayList;
import java.util.List;

public class SS {

	public static void main(String[] args) {

		int num =1456;
		repeated(num);

	}

	
	private static void repeated(int num) {


        List<Integer> digits = new ArrayList<Integer>();
        
        for (; num != 0; num /= 10)
            digits.add(num % 10);

        Object[] array = digits.toArray();
        
        for(int t=0;t<array.length;t++) {
        	System.out.println(array[t]);
        }
       // System.out.println(array);
	}
}
