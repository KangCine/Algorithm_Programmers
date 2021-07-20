// [카카오 인턴] 키패드 누르기
package com.level01.키패드누르기;

public class MTest {

	public static void main(String[] args) {
		int[] numbers = { 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5 };
		String hand = "right";

		Soulution solution = new Soulution();
		System.out.println(solution.solution(numbers, hand));
	}

}

class Soulution {
	public String solution(int[] numbers, String hand) {
		String answer = "";

		int LHand = 10;
		int RHand = 12;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
				answer += "L";
				LHand = numbers[i];
			} else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
				answer += "R";
				RHand = numbers[i];
			} else if (numbers[i] == 2 || numbers[i] == 5 || numbers[i] == 8 || numbers[i] == 0) {
				if ((NumArray(numbers[i], LHand)) < (NumArray(numbers[i], RHand))) {
					answer += "L";
					LHand = numbers[i];
				} else if ((NumArray(numbers[i], LHand)) > (NumArray(numbers[i], RHand))) {
					answer += "R";
					RHand = numbers[i];
				} else if ((NumArray(numbers[i], LHand)) == (NumArray(numbers[i], RHand))) {
					answer += hand.split("")[0].toUpperCase();
					if (hand.equals("right")) {
						RHand = numbers[i];
					} else {
						LHand = numbers[i];
					}
				}
			}

		}

		return answer;
	}

	public int NumArray(int number, int handNum) {

		int[][] numArray = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 0, 12 } };

		int[] numberArr = new int[2];
		int[] handNumArr = new int[2];

		int res = 0;

		// 1 = [0][0]
		// 2 = [0][1]
		// 3 = [0][2]
		// 4 = [1][0]
		// 5 = [1][1]
		// 6 = [1][2]
		// 7 = [2][0]
		// 8 = [2][1]
		// 9 = [2][2]
		// * = [3][0]
		// 0 = [3][1]
		// # = [3][2]

		for (int i = 0; i < numArray.length; i++) {
			for (int j = 0; j < numArray[i].length; j++) {
				if (number == numArray[i][j]) {
					numberArr[0] = i;
					numberArr[1] = j;
				}

				if (handNum == numArray[i][j]) {
					handNumArr[0] = i;
					handNumArr[1] = j;
				}
			}
		}

		if (numberArr[0] > handNumArr[0]) {
			res += (numberArr[0] - handNumArr[0]);
		} else {
			res += (handNumArr[0] - numberArr[0]);
		}

		if (numberArr[1] > handNumArr[1]) {
			res += (numberArr[1] - handNumArr[1]);
		} else {
			res += (handNumArr[1] - numberArr[1]);
		}

		return res;
	}
}