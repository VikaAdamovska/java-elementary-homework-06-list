package edu.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListWithoutDuplicates {
    private List<Object> list;

    public ListWithoutDuplicates() {
        list = new ArrayList<>();
    }

    public void add(Object o) {
        if (list.size() == 0) {
            list.add(o);
        } else {
            boolean duplicateExist = false;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(0).equals(o)) {
                    duplicateExist = true;
                }
            }
            if (duplicateExist) {
                System.out.println("We cannot add duplicate");
            } else {
                list.add(o);
            }
        }
    }

    public void iterList() {
        System.out.println("My list without duplicates: ");
        ListIterator iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public int size() {
        return list.size();
    }
}
