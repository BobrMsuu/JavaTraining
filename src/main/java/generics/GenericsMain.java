package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsMain {

    public static void main(String[] args) {

        Container<Integer> box = new Container(1);
        Container<String> box2 = new Container("2");

        System.out.println((Integer) box.getObject() * 2);

        List <Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
//        list.add("3");
        list.add(4);
        list.add(5);


//        Container<Integer> box = new Container<>(1);
//
//        Container<String> stringBox = new Container<>("name");
//
//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
////        numbers.add(2);
////        numbers.add(3);
////        numbers.add(4);
////        numbers.add(5);
//
//
//        for (Object n : numbers){
//            System.out.println((Integer)n*2);
//        }

//        System.out.println("Number "+(Integer)box.getObject1()*2);

    }
}