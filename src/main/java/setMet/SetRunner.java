package setMet;



import java.util.*;

public class SetRunner {


    public static void main(String[] args) {

//        String []cars = {"Mini","Mercedes-Benz","Audi","VW","Smart","Toyota","Porsche"};
//        String[] otherCars ={"Audi","Ford","GMC","Toyota","Chevrolet"};
//
//        Set<String> carSet =new TreeSet<>(Arrays.asList(cars));
//
//        Set<String>OtherCarSet =new TreeSet<>(Arrays.asList(otherCars));
//
//
//         Set<String>uniueCars = new TreeSet<>(carSet);
//         uniueCars.addAll(OtherCarSet);
//
//         print(uniueCars);


        Set<Car> sixCars = new HashSet<>();
        sixCars.add(new Car("VW", "Golf", 45));
        sixCars.add(new Car("Audi", "A3", 60));
        sixCars.add(new Car("VW", "Polo", 35));
        sixCars.add(new Car("BMW", "Z4", 120));
        sixCars.add(new Car("BMW", "440i", 200));


        Set<Car> europaCars = new HashSet<>();
        europaCars.add(new Car("Toyota", "Auris", 40));
        europaCars.add(new Car("Reno", "Clio", 30));
        europaCars.add(new Car("Reno", "Megan", 50));
        europaCars.add(new Car("VW", "Golf", 45));
        europaCars.add(new Car("VW", "Polo", 35));

        NavigableSet<Car> uniqueCars = new TreeSet<>(sixCars);
        uniqueCars.addAll(europaCars);
        print(uniqueCars);
        System.out.println();

        System.out.println("New cars" +"\n");
//        SortedSet<Car> cars = uniqueCars.tailSet(new Car("Toyota", "Auris", 40));
        SortedSet<Car> cars = uniqueCars.subSet(new Car("Toyota", "Auris", 40),true,new Car("Audi", "A3", 60),true);

        print(uniqueCars);

        System.out.println("Higher");
        System.out.println(uniqueCars.higher(new Car("Toyota", "Auris", 40)));
        System.out.println("Lower");
        System.out.println(uniqueCars.lower(new Car("Toyota", "Auris", 40)));

        System.out.println("Ceiling");
        System.out.println(uniqueCars.ceiling(new Car("Toyota", "Auris", 42)));

        System.out.println("Floor");
        System.out.println(uniqueCars.floor(new Car("Toyota", "Auris", 39)));





    }

    private static void print(Set<Car> cars) {
        System.out.printf("%-20s %-20s %-20s \n", "Car brand", "Model", "Price per day");
        for (Car car : cars) {
            System.out.printf("%-20s %-20s %-20s \n", car.getCarBrand(), car.getModel(), car.getPricePerDay());
        }

    }



}


