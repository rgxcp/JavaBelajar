class Hewan {
    private String jenis;
    private int kaki;

    Hewan() {
    }
    Hewan(String jenis, int kaki) {
        this.jenis = jenis;
        this.kaki = kaki;
    }
    public void Bersuara() {
        System.out.print("Suara hewan " + jenis + " berkaki " + kaki + " ");
    }
}

class Dog extends Hewan {
    Dog() {
        super();
    }
    public void Bersuara() {
        System.out.println("Guk... guk... guk...");
    }
}

class Cat extends Hewan {
    Cat(String jenis, int kaki) {
        super(jenis, kaki);
    }
    public void Bersuara() {
        super.Bersuara();
        System.out.println("Meow... Meow... Meow...");
    }
}

public class DtPolymorphism {
    public static void main(String[] args) {
        Dog doggy = new Dog();
        Cat tom = new Cat("Cat", 4);
        doggy.Bersuara();
        tom.Bersuara();
    }
}