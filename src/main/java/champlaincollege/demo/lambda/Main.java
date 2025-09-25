package champlaincollege.demo.lambda;

interface Iprinter{
    void print(String message);
}
public class Main {
    public static void main(String[] args) {

        //************************ with lambda **********************

        // Java looks at method signature and if it is matched it will override the method
        Iprinter printerUsingLambda=(message)->System.out.println(message);
        printerUsingLambda.print("Hello World from lambda");

//        //use method reference (concise version of lambda expression)
        Iprinter printerWithMethodReference=System.out::println;

        printerWithMethodReference.print("Hello World from Lambda with method reference");

    }

}


/**
 *     //use method reference
 *         Iprinter printerWithMethodReference=System.out::println;
 *         printerWithMethodReference.print("Hello World from Lambda with method reference");
 */