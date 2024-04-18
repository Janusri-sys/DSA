import bank.*;
class Animal{
    String color="black";
    public void run(){
        System.out.println("Running");
    }
}
class Dog extends Animal{
    public void bark(){
        System.out.println("Barking");
    }
}

class Inheritance{
    public static void main(String[] args){
        Dog d=new Dog();
        System.out.println(d.color);
        d.run();
        d.bark();
        bank.Account ac1=new bank.Account();
        ac1.name="customer1";
    }
}