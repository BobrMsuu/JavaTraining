package list;

import sun.applet.Main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTraning {
    public static void main(String[] args) {
        LinkedList<String> toDoList = new LinkedList();
        ArrayList<String> toDoList2 = new ArrayList<String>();
        toDoList.add("First1");
        toDoList.add("First2");
        toDoList.add("First3");
        toDoList.add("First4");
        toDoList.add("First5");
        ListIterator<String> listIter = toDoList.listIterator();
        ListIterator<String> listIter2 = toDoList2.listIterator();


//        System.out.println(toDoList.get(0));
//        System.out.println(listIter.hasNext());
//        System.out.println(listIter.next());
//        System.out.println(listIter.next());
//        listIter.add("FirstRemoved");
//        System.out.println(listIter.previous());
//        System.out.println(toDoList.size());
        for (int i =0; i<toDoList.size();i++){
            System.out.println(toDoList.get(i));
        }





    }
}
