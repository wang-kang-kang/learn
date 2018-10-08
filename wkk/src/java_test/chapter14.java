package java_test;

import java.util.*;


public class chapter14 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i < 101; i++) {
            list.add(String.valueOf(i));
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.remove(10);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.add("A");
        list.add("a");
        list.add("c");
        list.add("C");
        list.add("a");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("a");
        set.add("c");
        set.add("C");
        set.add("a");
        Iterator<String> it = set.iterator();
        System.out.println("haha");
        while (it.hasNext()) {
            String setstring = (String) it.next();
            System.out.println(setstring);
        }

        Map<String,String> map = new HashMap<>();

        Emp emp0 = new Emp("351","张三");
        Emp emp1 = new Emp("015","张三1");
        Emp emp2 = new Emp("016","张三2");

        map.put(emp0.getE_id(),emp0.getE_name());
        map.put(emp1.getE_id(),emp1.getE_name());
        map.put(emp2.getE_id(),emp2.getE_name());

        Set<String> set1 = map.keySet();
        Iterator<String> it1 = set1.iterator();
        while (it1.hasNext()){
            String str = (String) it1.next();
            String name = (String) map.get(str);
            System.out.println(str + " " +name);
        }

        map.remove("015");

        set1 = map.keySet();
        it1 = set1.iterator();
        while (it1.hasNext()){
            String str = (String) it1.next();
            String name = (String) map.get(str);
            System.out.println(str + " " +name);
        }

    }


}
