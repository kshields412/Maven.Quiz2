package com.zipcodewilmington.assessment2.part1;

import com.j256.ormlite.stmt.query.In;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        Boolean result = false;
        if (array.length % 2 == 0) {
            return true;
        } else {
            return result;
        }
    }

    public Integer[] range(int start, int stop) {
        List<Integer> list = new LinkedList();
        for (int i = start; i <= stop; i++) {
            list.add(i);
        }
        Integer[] result = list.toArray(new Integer[list.size()]);
        return result;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        int sum = 0;
        for (int i = 0; i <= 1; i++) {
            sum += array[i];
        }
        return sum;
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        int product = 1;
        for (int i = array.length - 2; i < array.length; i++) {
                product = product * array[i];
            }
        return product;
    }
}
