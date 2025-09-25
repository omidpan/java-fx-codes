package champlaincollege.demo.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionalInterfaceTutorial {

    public static void main(String[] args) {

        //create a list

        List<String> cities = new ArrayList<>();
        cities.add("New York");
        cities.add("Atlanta");
        cities.add("Dallas");
        cities.add("Madison");
        System.out.println("******************** print cities with lambda ");
        cities.forEach(item -> System.out.println(item));

        System.out.println("******************** Create object from my functional interface which is MyPrinter ");
        MyPrinter myConsumer=(item) -> System.out.println(item);

        System.out.println("******************** call myConsumer print which is like accept in consumer interface  ");

        cities.forEach(item->myConsumer.print(item));

        System.out.println("******************** Using method reference to MyPrinter ");
        cities.forEach(myConsumer::print);
        //other way is that create Consumer object from Consumer functional Interface
        Consumer<String> consumer=(item) -> System.out.println(item);

        System.out.println("******************** print cities with consumer without method reference ");
        cities.forEach(item->consumer.accept(item));


        //Function inteface has one default method named apply
        Function<String,String> myFunctionToUpperCase=(item) -> item.toUpperCase();
        System.out.println(myFunctionToUpperCase.apply("New York"));

        //using myFunction and Consumer for cities
        System.out.println("******************** print cities with Uppercase and print  ");
        cities.stream()
                .map(item->myFunctionToUpperCase.apply(item))
                .forEach(item2->myConsumer.print(item2));



    }
}
//consumer functional interface
@FunctionalInterface
interface MyPrinter{
    void print(String message);
}
// Function functional interface


