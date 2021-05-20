// 완주하지 못한 선수
package com.level.level01;

import java.util.Arrays;

public class level01_01완주하지못한선수 {

    public static void main(String[] args) {
    	
    	String [] participant = {"leo", "kiki", "eden", "leo"};
    	String [] completion = {"eden", "kiki", "leo"};
    	
    	Solution solution = new Solution();
    	System.out.println(solution.solution(participant, completion));
    	
	}
}

class Solution {
    public String solution(String[] participant, String[] completion) {
    	
    	String tmp = null;
    	
    	Arrays.sort(participant);
    	Arrays.sort(completion);
    	
    	for(int i = 0; i < completion.length; i++) {
    		if(!(participant[i].equals(completion[i]))) {
    			tmp = participant[i];
    			if(tmp != null) {
    				break;
    			}
    		}
    	}
    	
    	if(tmp == null) {
    		tmp = participant[participant.length-1];
    	}
    	
        String answer = tmp;
        return answer;
    }
}

/*
효율성 테스트에 통과하지 못한 코드

class Solution {
    public String solution(String[] participant, String[] completion) {
    	
    	for(int i = 0; i < participant.length; i++) {
    		//System.out.println(participant[1]);
    		for(int j = 0; j < completion.length; j++) {
    			
    			if(participant[i].equals(completion[j])) {
    				participant[i] = "";
    				completion[j] = "";
    				break;
    			}
    		}
    	}
    	
    	String tmp = null;
    	
    	for(int i = 0; i < participant.length; i++) {
    		if(participant[i] != "") {
    			tmp = participant[i];
    		}
    	}
    	
        String answer = tmp;
        return answer;
    }
}

*/