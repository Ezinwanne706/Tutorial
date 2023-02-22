class Dog {
    public void barks() {
        System.out.println("Whoo Whoo");
    }
}
    class Bulldog extends Dog{
        public void barks(){
            System.out.println("WHHHHHOOOOOO WHOOOOOOOOO");
        }
}
    class Pitbull extends Dog{
    public void barks(){
        System.out.println("Silence");
    }
    }
    public class polymorphism {
        public static void main(String[] args) {
            Dog b =new Dog();
            b.barks();
        }
}

