package com.zipcodewilmington.assessment2.part2;

import java.util.Arrays;
import java.util.Collections;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        int length = array1.length + array2.length;
        Integer[] result = new Integer[length];
        int count = 0;
        for (int i : array1){
            result[count] = i;
            count++;
        }
        for (int i : array2){
            result[count] = i;
            count++;
        }
        return result;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        return null;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == valueToEvaluate) {
                    count++;
                    break;
                }
                if (array2[j].equals(valueToEvaluate)) {
                    count++;
                    break;
                }
//                if (array1[i].equals(valueToEvaluate) && array2[j].equals(valueToEvaluate)) {
////                        count++;
////                        break;
////                    }
////                }
            }
        }
        return count;
    }

    public Integer mostCommon(Integer[] array) {
        int count = 1, tempCount;
        int mostCommon = array[0];
        int temp;
        for (int i = 0; i < (array.length - 1); i++) {
            temp = array[i];
            tempCount = 0;
            for (int j = 1; j < array.length; j++) {
                if (temp == array[j])
                    tempCount++;
            }
            if (tempCount > count) {
                mostCommon = temp;
                count = tempCount;
            }
        }
        return mostCommon;
    }

}
