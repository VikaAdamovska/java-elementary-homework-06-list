package edu.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ListMethods {

    public static void fillList(int minValue, int maxValue, List<Integer> list) {
        Random random = new Random();
        int listSize = (int) (Math.random() * ((maxValue - minValue) + 1) + minValue);
        System.out.println("List size is " + listSize);

        for (int i = 0; i < listSize; i++) {
            int element = (int) (Math.random() * ((maxValue - minValue) + 1) + minValue);
            list.add(element);
        }
    }

    public static void showListElements(List list) {
        System.out.println("My List: ");
        for (Object element : list) {
            System.out.print(element + "; ");
        }
        System.out.println();
    }

    public static List multipl(List list1, List list2) {
        int newListSize = 0;
        if (list1.size() > list2.size()) {
            newListSize = list1.size();
        } else {
            newListSize = list2.size();
        }
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < newListSize; i++) {
            int newFirstFactor = 1;
            int newSecondFactor = 1;

            if (list1.size() > i) {
                newFirstFactor = (Integer) list1.get(i);
            }
            if (list2.size() > i) {
                newSecondFactor = (Integer) list2.get(i);
            }
            resultList.add(newFirstFactor * newSecondFactor);
        }
        return resultList;
    }

    public static void elementsListInteger(List list) {
        Iterator iterator = list.iterator();
        System.out.println("Elements of listInteger: ");
        while (iterator.hasNext()) {
            Integer element = (Integer) iterator.next();
            System.out.print(element + "; ");
        }
    }

    public static int sumOddNumbers(List listInteger) {
        Iterator iterator = listInteger.iterator();
        int sum = 0;
        System.out.println();
        while (iterator.hasNext()) {
            Integer element = (Integer) iterator.next();
            if (element % 2 != 0) {
                sum += 1;
            }
        }
        return sum;
    }

    public static void removeEvenNumbers(List list) {
        System.out.println("New listInteger with only odd number: ");
        for (Iterator iterator = list.iterator(); iterator.hasNext(); ) {
            Integer number = (Integer) iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            } else {
                System.out.print(number + "; ");
            }
        }
    }
}
