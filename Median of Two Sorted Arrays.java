//Given two sorted arrays nums1 and nums2 of size m and n respectively, return t
//he median of the two sorted arrays. 
//
// The overall run time complexity should be O(log (m+n)). 
//
// 
// Example 1: 
//
// 
//Input: nums1 = [1,3], nums2 = [2]
//Output: 2.00000
//Explanation: merged array = [1,2,3] and median is 2.
// 
//
// Example 2: 
//
// 
//Input: nums1 = [1,2], nums2 = [3,4]
//Output: 2.50000
//Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
// 
//
// Example 3: 
//
// 
//Input: nums1 = [0,0], nums2 = [0,0]
//Output: 0.00000
// 
//
// Example 4: 
//
// 
//Input: nums1 = [], nums2 = [1]
//Output: 1.00000
// 
//
// Example 5: 
//
// 
//Input: nums1 = [2], nums2 = []
//Output: 2.00000
// 
//
// 
// Constraints: 
//
// 
// nums1.length == m 
// nums2.length == n 
// 0 <= m <= 1000 
// 0 <= n <= 1000 
// 1 <= m + n <= 2000 
// -106 <= nums1[i], nums2[i] <= 106 
// 
// Related Topics Array Binary Search Divide and Conquer 
// 👍 11672 👎 1631


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int firstArrayIt = 0;
        int secondArrayIt = 0;
        int[] mergedArray = new int [nums1.length + nums2.length];
        double finalDouble ;


        for (int i = 0; i < mergedArray.length ; i++){
            if(firstArrayIt < nums1.length && secondArrayIt < nums2.length) {
                    int firstArrayElememt = nums1[firstArrayIt];
                    int secondArrayElememt = nums2[secondArrayIt];

                     if (firstArrayElememt == secondArrayElememt) {
                            mergedArray[i] = firstArrayElememt;
                            i++;
                            mergedArray[i] = secondArrayElememt;
                            firstArrayIt++;
                            secondArrayIt++;
//                            System.out.println("equal");
//                         System.out.println("Nums1 it"+firstArrayIt+" Nums2 it "+secondArrayIt );
//                         System.out.println (Arrays.toString(mergedArray));
        }
                     else if (firstArrayElememt == Math.min(firstArrayElememt, secondArrayElememt)) {
                            mergedArray[i] = firstArrayElememt;
                            firstArrayIt++;
//                         System.out.println("first elemnt smaller");
//                         System.out.println("Nums1 it"+firstArrayIt+" Nums2 it "+secondArrayIt );
//                         System.out.println (Arrays.toString(mergedArray));
        }
                     else {
                            mergedArray[i] = secondArrayElememt;
                            secondArrayIt++;
//                         System.out.println("first elemnt Bigger");
//                         System.out.println("Nums1 it"+firstArrayIt+" Nums2 it "+secondArrayIt );
//                         System.out.println (Arrays.toString(mergedArray));
        }

    }
            else {

                if (firstArrayIt < nums1.length) {
                    mergedArray[i] = nums1[firstArrayIt];
                    firstArrayIt++;

                }
                if (secondArrayIt < nums2.length) {
                    mergedArray[i] = nums2[secondArrayIt] ;
                    secondArrayIt++;
                }

            }



        }

        if(mergedArray.length % 2 != 0 ){

            finalDouble = mergedArray[mergedArray.length /2];
            System.out.println (finalDouble);

        }
        else {

            int MedianUpperIndex = mergedArray.length / 2;
            finalDouble = ( mergedArray[MedianUpperIndex] + mergedArray[MedianUpperIndex-1])/2.0;
//            System.out.println (finalDouble);

        }


//        System.out.println (Arrays.toString(mergedArray));
        return finalDouble;

        
    }
}

