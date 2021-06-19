package com.codingtest.level01;

import java.util.HashSet;
import java.util.Set;

public class ���ϸ� {

   public static void main(String[] args) {

      int[] nums = { 3, 2, 1, 3 };

      Solution���ϸ� solution���ϸ� = new Solution���ϸ�();
      System.out.println(solution���ϸ�.solution02(nums));

   }
}

class Solution���ϸ� {
   public int solution02(int[] nums) {

      int answer = nums.length / 2;

      Set<Integer> set = new HashSet<>();

      for (int i = 0; i < nums.length; i++) {
         set.add(nums[i]);
      }

      if (!(set.size() > answer)) {
         answer = set.size();
      }
      
      return answer;
   }
}