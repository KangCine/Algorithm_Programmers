package com.level01.ũ���������̱�;

import java.util.*;

public class MTest {
    public static void main(String[] args) {
    	int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
    	int[] moves = {1,5,3,5,1,2,1,4};
    	
    	Solution solution = new Solution();
    	System.out.println(solution.solution(board, moves));
	}
}

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<Integer>();
        
        for(int i = 0; i < moves.length; i++){
            // ������ stack�� ����
            for(int j = 0; j < board.length; j++){
                if(board[j][moves[i]-1] != 0){
                    
                    // stack�� ����ִٸ� stack.peek()�� ������ �ȵ�!
                    if(!stack.empty()){
                        if(board[j][moves[i]-1] == stack.peek()){
                            stack.pop();
                            // �����Ҷ����� ī��Ʈ��
                            answer++;
                        } else {
                            stack.push(board[j][moves[i]-1]);
                        }
                    // stack�� ����ִٸ� �����(������ �ѹ�, �ߺ����� ���� pop ���� ���)
                    }else {
                        stack.push(board[j][moves[i]-1]);
                    }
                    
                    board[j][moves[i]-1] = 0;
                    
                    break;
                }
            }
        }
        return answer *= 2;
    }
}