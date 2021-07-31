package com.level01.다트게임;

public class MTest {
	public static void main(String[] args) {
		
		String dartResult = "1S2D*3T";
		
		Solution solution = new Solution();
		System.out.println(solution.solution(dartResult));
	}
}

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] tmp = new int [3];
        int arrNum = -1;
        
        // S : 1제곱 / D : 제곱 / T : 세제곱
        // * : 해당 점수와 바로 전에 얻은점수 2배 / # : 해당점수 마이너스
        
        char[] dartResultArray = dartResult.toCharArray();
        
        for(int i = 0; i < dartResultArray.length; i++){
            if(dartResultArray[i] >= '0' && dartResultArray[i] <= '9'){
                arrNum++;
                if(dartResultArray[i] == '1' && dartResultArray[i+1] == '0'){
                    tmp[arrNum] = 10;
                    i++;
                }else{
                    tmp[arrNum] = dartResultArray[i] - '0';
                }
            }else if(dartResultArray[i] == 'S'){
                tmp[arrNum] *= 1;
            }else if(dartResultArray[i] == 'D'){
                tmp[arrNum] *= tmp[arrNum];
            }else if(dartResultArray[i] == 'T'){
                tmp[arrNum] *= tmp[arrNum] * tmp[arrNum];         
            }else if(dartResultArray[i] == '*'){
                if(arrNum > 0){
                    tmp[arrNum-1] *= 2;
                }
                tmp[arrNum] *= 2;
            }else if(dartResultArray[i] == '#'){
                tmp[arrNum] *= -1;
            }
        }
        
        for(int i = 0; i < tmp.length; i++){
            answer += tmp[i];
        }
        
        return answer;
    }
}