package edu.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        //1) реализовать свою имплементацию интерфейса List - список в котором не может быть дубликатов;
        ListWithoutDuplicates withoutDuplicates = new ListWithoutDuplicates();
        withoutDuplicates.add("Dnipro");
        withoutDuplicates.add("Kiev");
        withoutDuplicates.add("Dnipro");
        System.out.println(withoutDuplicates.get(0));
        System.out.println(withoutDuplicates.get(1));
        System.out.println(withoutDuplicates.size());


       /*2)-создать два списка;
           - сгенерировать 2 случайных числа от 100 до 200 (M, N)
           - заполнить список 1 M случайными числами
           - заполнить список 2 N случайными числами
           - перемножить все элементы списка, и результат сохранить в третий список*/
        int minValue = 100;
        int maxValue = 200;

        List<Integer> firstFactor = new ArrayList<>();
        ListMethods.fillList(minValue, maxValue, firstFactor);
        ListMethods.showListElements(firstFactor);

        List<Integer> secondFactor = new ArrayList<>();
        ListMethods.fillList(minValue, maxValue, secondFactor);
        ListMethods.showListElements(secondFactor);

        List resultList = ListMethods.multipl(firstFactor, secondFactor);
        ListMethods.showListElements(resultList);

       /*3) создать список, заполнить его 100 случайными числами, с помоцью итератора списка:
        - определить, сколько нечетных чисел в списке.
        - Удалить все четные элементы через итератор*/

        List<Integer> listInteger = new ArrayList<>();
        ListMethods.fillList(minValue, maxValue, listInteger);
        ListMethods.elementsListInteger(listInteger);
        System.out.println("Sum of odd numbers are: " + ListMethods.sumOddNumbers(listInteger));
        ListMethods.removeEvenNumbers(listInteger);
    }
}

