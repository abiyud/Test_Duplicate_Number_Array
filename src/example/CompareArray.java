package example;

import java.util.HashSet;
import java.util.Set;

public class CompareArray {

	public static void main(String[] args) {
		int number1[] = { 9, 3, 7, 1, 1, 1, 1, 1, 5, 4, 6 };
		int number2[] = { 6, 1, 1, 7, 1, 4, 6, 3, 8, 1, 1 };
		CompareArray t = new CompareArray();
		System.out.println(t.compareTwoArray(number1, number2));
	}

	public Set<Integer> compareTwoArray(int[] number1, int[] number2) {
		Set<Integer> listSameNumber = new HashSet<Integer>();
		
		//If array has same length
		if (number1.length == number2.length) {
			for (int i = 0; i < number1.length; i++) {
				for (int j = 0; j < number1.length; j++) {
					if (number1[i] == number2[j]) {
						listSameNumber.add(number1[i]);
					}
				}
			}	
		}//If array 2 has more length than array 1
		else if (number1.length > number2.length) {
			for (int i = 0; i < number2.length; i++) {
				for (int j = 0; j < number1.length; j++) {
					if (number2[i] == number1[j]) {
						listSameNumber.add(number1[j]);
					}
				}
			}
		}//If array 1 has more length than array 2
		else {
			for (int i = 0; i < number1.length; i++) {
				for (int j = 0; j < number2.length; j++) {
					if (number1[i] == number2[j]) {
						listSameNumber.add(number2[j]);
					}
				}
			}
		}
		return listSameNumber;
	}
}
