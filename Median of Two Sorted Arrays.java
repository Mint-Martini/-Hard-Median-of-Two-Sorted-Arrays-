//Given two sorted arrays nums1 and nums2 of size m and n respectively, return t
//he median of the two sorted arrays. 
//
// The overall run time complexity should be O(log (m+n)). 
//



import java.util.Arrays;

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

