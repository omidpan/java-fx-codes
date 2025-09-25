package champlaincollege.demo.chapter15.innerclass;

public class OuterClass {

    private String message = "Hello from OuterClass!";

    // Inner class
     class Inner {
        public void showMessage() {
            System.out.println("Inner accessing: " + message);
        }
    }

    public static void main(String[] args) {
        // Create outer object
        OuterClass outer = new OuterClass();
        // Create inner object using outer
        OuterClass.Inner inner = outer.new Inner();
        inner.showMessage();

        //can I define inner without instantiation of  OuterClass ?? check the staticInner demo
    }
}