package example;

import java.util.HashSet;
import java.util.Set;

public class CompareArray {
	public static void main(String[] args) {
		int numberOne[] = { 9, 3, 7, 1, 2, 1, 1, 1, 5, 4, 8 };
		int numberTwo[] = { 6, 1, 2, 7, 1, 4, 6, 3, 8, 0, 2 };
		
		CompareArray t = new CompareArray();
		System.out.println(t.compareTwoArray(numberOne, numberTwo));
	}

	public Set<Integer> compareTwoArray(int[] numberOne, int[] numberTwo) {
		Set<Integer> listSameNumber = new HashSet<Integer>();
		if (numberOne.length == numberTwo.length) {
			for (int i = 0; i < numberOne.length; i++) {
				for (int j = 0; j < numberOne.length; j++) {
					if (numberOne[i] == numberTwo[j]) {
						listSameNumber.add(numberOne[i]);
					}
				}
			}
		} else if (numberOne.length > numberTwo.length) {
			for (int i = 0; i < numberTwo.length; i++) {
				for (int j = 0; j < numberOne.length; j++) {
					if (numberTwo[i] == numberOne[j]) {
						listSameNumber.add(numberOne[j]);
					}
				}
			}
		} else {
			for (int i = 0; i < numberOne.length; i++) {
				for (int j = 0; j < numberTwo.length; j++) {
					if (numberOne[i] == numberTwo[j]) {
						listSameNumber.add(numberTwo[j]);
					}
				}
			}
		}
		return listSameNumber;
	}
}
