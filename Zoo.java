interface Animal {
    public void makeSound();
    public void move();
}

class Bird implements Animal {
    public void makeSound() {
        System.out.println("Chirp");
    }
    public void move() {
        System.out.println("Fly");
    }
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Bark");
    }
    public void move() {
        System.out.println("Run");
    }
}
public class Zoo {
    public static void main(String[] args) {
        Bird objBird = new Bird();
        Dog objDog = new Dog();
        objBird.makeSound();
        objBird.move();
        objDog.makeSound();
        objDog.move();
        
    }
    
}
