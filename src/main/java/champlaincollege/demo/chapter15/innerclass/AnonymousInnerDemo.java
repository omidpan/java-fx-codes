package champlaincollege.demo.chapter15.innerclass;

public class AnonymousInnerDemo {

    // Define an interface

    interface Greeting {
        void sayHello();
    }

    public static void main(String[] args) {
        // Anonymous inner class implementing Greeting
        Greeting greet = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello from Anonymous Inner Class!");
            }
        };

        greet.sayHello();
        // tell me, is Greeting interface similar to  functional interface?? if Yes , can I use Lambda
        //let's try with lambda
        Greeting greetWithLambda =()->System.out.println("Hello from Anonymous Inner Class with Lambda!");
        greetWithLambda.sayHello();
    }
}