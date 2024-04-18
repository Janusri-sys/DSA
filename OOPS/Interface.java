interface Animal{
    void walk();
}
interface Herbivore{
    void eats();
}
class Dog implements Animal,Herbivore{
    public void walk(){
        System.out.println("walk with 4 legs");
    }
    public void eats(){
        System.out.println("Eats plants");
    }
}
class Chicken implements Animal,Herbivore{
    public void walk(){
        System.out.println("walk with 2 legs");
    }
     public void eats(){
        System.out.println("Eats plants");
    }
}
class Interface{
    public static void main(String[] args){
        Dog d=new Dog();
        d.walk();
        d.eats();
    }
}