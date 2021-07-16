/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.ArrayList;
import java.util.Iterator;

public class Ex01 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("JAva");
        list.add("PHP");
        list.add("C++");
        list.add("Java");
        System.out.println("List: " + list);
    }
}

class Ex02 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("JAva");
        list.add("PHP");
        list.add("C++");
        list.add("Java");
        System.out.println("List: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (String n : list) {
            System.out.println(n);
        }
    }
}

class Ex03 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("JAva");
        list.add("PHP");
        list.add("C++");
        list.add("Java");
        Iterator<String> iterator = list.iterator();
        System.out.println("List: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

class Ex04 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("JAva");
        list.add("PHP");
        list.add("C++");
        list.add("Java");
        Iterator<String> iterator = list.iterator();
        System.out.println("List: ");
        System.out.println(list.get(3));
    }
}

class Ex05 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("JAva");
        list.add("PHP");
        list.add("C++");
        list.add("Java");
        Iterator<String> iterator = list.iterator();
        System.out.println("List: ");
        System.out.println(list);
        list.set(3, "Python");
        System.out.println("List: ");
        System.out.println(list);
    }
}

class Ex06 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("JAva");
        list.add("PHP");
        list.add("C++");
        list.add("Java");
        System.out.println("List: " + list.size());
        System.out.println(list);
        list.clear();
        System.out.println("List: " + list.size());
        System.out.println(list);
    }
}

class Ex07 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("JAva");
        list.add("PHP");
        list.add("C++");
        list.add("Java");
        System.out.println("List: " + list.size());
        System.out.println(list);
        list.remove(3);
        System.out.println("List: " + list.size());
        System.out.println(list);
        list.remove("JAva");
        System.out.println("List: " + list.size());
        System.out.println(list);
    }
}

class Ex08 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("PHP");
        list.add("C++");
        list.add("Java");
                list.add("Java");

                        list.add("Java");

                                list.add("Java");

                                        list.add("Java");

                                                list.add("Java");

                                                        list.add("Java");

                                                                list.add("Java");

                                                                        list.add("Java");                   
        System.out.println("List: " + list.size());
        System.out.println(list.contains("PHP"));
        System.out.println(list.indexOf("Java"));
        System.out.println(list.lastIndexOf("Java"));
        list.clear();
        System.out.println("List: " + list.size());
        System.out.println(list.contains(null));//What the helllllll???? false ???
    }
}

