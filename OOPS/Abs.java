abstract class Animal{
    abstract void walk();
    public void eats(){
        System.out.println("animal eats");
    }
}
class Dog extends Animal{
    public void walk(){
        System.out.println("walk with 4 legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("walk with 2 legs");
    }
}
class Abs{
    public static void main(String[] args){
        Dog d=new Dog();
        d.eats();
        d.walk();
    }
}