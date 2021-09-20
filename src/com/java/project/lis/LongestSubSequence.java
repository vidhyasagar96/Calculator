package com.java.project.lis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LongestSubSequence {
	 public static void main(String[] args){
		 	Scanner input = new Scanner(System.in);
		 	System.out.println("Enter numbers less than 100 and Enter any letter to show the largest increasing subsequence");
		 	ArrayList<Integer> num = new ArrayList<>();
		 	while(input.hasNextInt()) {
		 		num.add(input.nextInt());
		 	}
	        int[] arr = num.stream().mapToInt(i->i).toArray();
	        System.out.println("Entered array is "+Arrays.toString(arr));
	        int[][] lssOp = LongestSubSequence.lssIteration(arr);
	        int[] lengthArray = lssOp[0];
	        int[] subSequenceArray = lssOp[1];
	        //System.out.println(Arrays.toString(lssOp[0]));
	        //System.out.println(Arrays.toString(lssOp[1]));


	        int[] maxElementInfo = LongestSubSequence.getMaxElementIndex(lengthArray);
	        int maxElement = maxElementInfo[0];
	        int maxElementIndex = maxElementInfo[1];
	        //System.out.println(maxElement + ":" + maxElementIndex);


	        int[] longestSubSequenceArray = LongestSubSequence.getOriginalElements(arr, subSequenceArray, maxElement, maxElementIndex);
	        System.out.println("\nLongest increasing Subsequent array is "+Arrays.toString(longestSubSequenceArray));
	        input.close();
	    }

	    public static int[][] lssIteration(int[] arr){
	        int[] lengthArray = new int[arr.length];
	        int[] subSequenceArray = new int[arr.length];
	        Arrays.fill(lengthArray, 1);
	        Arrays.fill(subSequenceArray, -1);

	        for (int i = 1; i < arr.length; i++) {
	            int maxEleForI = Integer.MIN_VALUE;
	            for (int j = 0; j < i; j++) {
	                if(arr[i] > arr[j]){
	                    if(lengthArray[j] + 1 >= maxEleForI){
	                        lengthArray[i] = lengthArray[j] + 1;
	                        subSequenceArray[i] = j;
	                        maxEleForI = lengthArray[j] + 1;
	                    }
	                }
	            }
	        }
	        return new int[][] {lengthArray, subSequenceArray};
	    }

	    public static int[] getOriginalElements(int[] originalArray, int[] subSequentArray, int sequenceLength, int startPosition){
	        int[] longestSequence = new int[sequenceLength];

	        int index =startPosition;

	        while(true){
	            longestSequence[sequenceLength - 1] = originalArray[index];
	            index = subSequentArray[index];
	            sequenceLength--;
	            if(index < 0) {
	            	break;
	            }
	        }
	        return longestSequence;
	    }

	    public static int[] getMaxElementIndex(int[] arr){
	        int result = Integer.MIN_VALUE;
	        int resultIndex = -1;

	        for (int i = 0; i < arr.length; i++) {
	        	if(result<arr[i]) {
	        		result=arr[i];
	        		resultIndex = i;
	        	}
				
			}

	        return new int[]{result, resultIndex};
	    }

}
