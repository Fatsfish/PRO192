/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.HashMap;

public class ExamSet {

    public static void main(String[] args) {
        Set<String> setA = new HashSet<String>();
        setA.add("java");
        setA.add("PHP");
        System.out.println("Số phần tử của setA:" + setA.size());
        System.out.println("Số phần tử của setA:" + setA);
        System.out.println("Có java ko?: " + setA.contains("java"));
        System.out.println("Có C++ ko?: " + setA.contains("C++"));
    }
}

class treeSet {

    public static void main(String[] args) {
        TreeSet<String> setB = new TreeSet<String>();
        setB.add("sakalaka");
        setB.add("chakalaka");
        setB.add("boom boom");
        setB.add("boom boom");
        for (String i : setB) {
            System.out.println(i);
        }

    }

}

class UseTreeSet {

    public static void main(String[] args) {
        TreeSet t = new TreeSet();
        t.add(5);
        t.add(2);
        t.add(9);
        t.add(30);
        t.add(9);
        System.out.println(t);
        t.remove(9);
        System.out.println(t);
        Iterator it = t.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + ", ");
        }
        System.out.println();
    }
}
class hashMap{
    public static void main(String[] args) {
        HashMap mymap = new HashMap();
        mymap.put(1, "One");
        mymap.put(2, "Two");
        mymap.put(3, "Three");
        mymap.put(4, "Four");
        //using Iterator
        Iterator iter = mymap.keySet().iterator();
        while (iter.hasNext()) {
            Object key = iter.next();
            System.out.println(key + ": " + mymap.get(key));
        }
    }
}
class UseHashMap{
     public static void main(String[] args) {
        HashMap mymap = new HashMap();
        mymap.put(1, "One");
        mymap.put(2, "Two");
        mymap.put(3, "Three");
        mymap.put(4, "Four");
        System.out.println(mymap);
        mymap.put(4, "Shakalaka");
        mymap.remove(1);
        System.out.println(mymap);
        //using Iterator
        Iterator iter = mymap.keySet().iterator();
        while (iter.hasNext()) {
            Object key = iter.next();
            System.out.println(key + ": " + mymap.get(key));
        }
    }
}