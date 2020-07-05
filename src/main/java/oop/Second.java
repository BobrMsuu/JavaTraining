package oop;

public class Second extends FirstClass{


    public void second(){
        System.out.println("Second methods.");
    }

    public static void main(String[] args) {
        FirstClass firsec = new Second();

        firsec.methodFromFirst();
        firsec.second();
        Second second = new Second();

        second.second();

        second.methodFromFirst();
    }
}
