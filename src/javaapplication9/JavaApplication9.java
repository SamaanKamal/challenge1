/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author User
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numbers = { 2,7,11,15 };
        int [] result = twoSum(numbers,9);
        System.out.print("index of the two numbers are :");
        for(int i=0;i<result.length;i++) {
            System.out.print(result[i]);
            System.out.print(" ");
        }
        System.out.println("");
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> previousValue = new HashMap<Integer,Integer>();
        int difference;
        for (int i =0;i<nums.length;i++) {
            difference = target - nums[i];
            if (previousValue.containsKey(difference)) {
                return new int[]{previousValue.get(difference),i};
            }
            previousValue.put(nums[i],i);
        }
        return new int[] {};
    }
    
}
