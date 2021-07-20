package com.level01.ÆùÄÏ¸ó;

import java.util.HashSet;
import java.util.Set;

public class MTest {

   public static void main(String[] args) {

      int[] nums = { 3, 2, 1, 3 };

      Soulution solution = new Soulution();
      System.out.println(solution.solution02(nums));

   }
}

class Soulution {
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