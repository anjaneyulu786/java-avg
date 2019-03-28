public class polymorphism
{
    public static void main(String[] args) {
        Animal a1 = new Cat();
        a1.makeNoise(); //Prints Meowoo
         
        Animal a2 = new Dog();
        a2.makeNoise(); //Prints Bark
    }
}