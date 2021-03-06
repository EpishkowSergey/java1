package ru.progwards.java1.lessons.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Creator {
    public static Collection<Integer> fillEven(int n) {
        List<Integer> even = new ArrayList<>(n);

        Integer num = 2;
        for (int i = 0; i < n; i++) {
            even.add(num);
            num = num + 2;
        }

        return even;
    }

    public static Collection<Integer> fillOdd(int n) {
        List<Integer> arrayList = new ArrayList<>(n);
        List<Integer> odd = new ArrayList<>(n);

        Integer num = 1;
        for (int i = 0; i < n; i++) {
            arrayList.add(num);
            num = num + 2;
        }

        for (int i = 0; i < arrayList.size(); i++) {
            odd.add(arrayList.get(arrayList.size() - 1 - i));
        }

        return odd;
    }

    public static Collection<Integer> fill3(int n) {
        List<Integer> arrayList = new ArrayList<>(n * 3);

        int index = 0;

        for (int i = 0; i < n; i++) {
            arrayList.add(index);
            arrayList.add(index * index);
            arrayList.add(index * index * index);
            index = index + 3;
        }

        return arrayList;
    }
}
