package edu.list;

import java.util.ArrayList;
import java.util.List;

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

    public Object get(int index) {
        return list.get(index);
    }

    public int size() {
        return list.size();
    }
}
