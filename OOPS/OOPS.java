class Student{
    String name;
    int age;

    public void  printInfo(String name){
        System.out.println(name);
    }
    public void  printInfo(String name,int age){
        System.out.println(name+" "+age);
    }
    

}
class OOPS{
    public static void main(String[] args){
    Student s=new Student();
    s.name="janu";
    s.age=22;
    s.printInfo(s.name);
    s.printInfo(s.name,s.age);
    }
}