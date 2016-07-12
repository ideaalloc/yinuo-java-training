package com.yinuo.training.collection;

import com.google.common.collect.ImmutableMap;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Title.
 * <p>
 * Description.
 *
 * @author Bill Lv {@literal <billcc.lv@hotmail.com>}
 * @version 1.0
 * @since 2016-07-12
 */
public class Collection {
    static final String[] stringArray = new String[]{
            "Bill", "Gary", "Cathy", "Tom", "Amy"
    };

    static final Map<Long, String> map = ImmutableMap.of(1L, "Bill", 2L, "Gary", 3L, "Cathy", 4L, "Tom");

    public void sort() {
        Arrays.sort(stringArray);
        for (int pos = 0; pos < stringArray.length; pos++) {
            final String str = stringArray[pos];
            System.out.println(str);
        }
        for (String str : stringArray) {
            System.out.println(str);
        }

        int[] intArray = {1, 2, 3, 4};
        int[] anotherIntArray = new int[]{1, 2, 3, 4};
        for (int intValue : intArray) {
            System.out.println(intValue);
        }
    }

    public void arrayToList() {
        List<String> linkedListSample = new LinkedList<>();

        final List<String> listSample1 = new ArrayList<>();
        listSample1.add("4");
        listSample1.add("5");

        final List<String> listSample = new ArrayList<>();
        listSample.add("1");
        listSample.add("2");
        listSample.add("3");
        listSample.addAll(listSample1);

        System.out.println(listSample);


        List<String> list = Arrays.asList(stringArray);
        Collections.sort(list);
        System.out.println(list);

        listSample.forEach(anything -> System.out.println(anything));

        for (String anyName : listSample) {
            System.out.println(anyName);
        }

        for (int pos = 0; pos < listSample.size(); pos++) {
            System.out.println(listSample.get(pos));
        }

        Iterator<String> iterable = listSample.iterator();
        while (iterable.hasNext()) {
            final String elem = iterable.next();
            System.out.println(elem);
        }


    }

    public void aggregateMethods() {
        final List<String> list = Arrays.asList(stringArray);
        String jsonResult = "[" +
                list.parallelStream().map(nameValue -> "{\"name\":\"" + nameValue + "\"}").
                        sorted().collect(Collectors.joining(",")) +
                "]";
        System.out.println(jsonResult);
    }

    public void map() {
        Map<String, String> sample = new HashMap<>();
        sample.put("name", "Bill");
        System.out.println(sample.get("name"));

    }

}
