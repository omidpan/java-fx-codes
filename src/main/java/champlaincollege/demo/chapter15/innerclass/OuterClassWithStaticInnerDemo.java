package champlaincollege.demo.chapter15.innerclass;

public class OuterClassWithStaticInnerDemo {

    // Static nested class
    static class StaticInner {
         void display() {
            System.out.println("Inside static nested class!");
        }
    }

    public static void main(String[] args) {
        // Create static inner class directly (no outer object needed)
        OuterClassWithStaticInnerDemo.StaticInner inner = new OuterClassWithStaticInnerDemo.StaticInner();
        inner.display();
    }
}
