package bank;
class Account{
    public String name;
    protected String email;
    private String password;
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password=password;
    }
}
public class Bank{
    public static void main(String[] args){
        Account ac1=new Account();
        ac1.name="Apna college";
        ac1.email="apna@gmail.com";
        //ac1.password="abcd";
        ac1.setPassword("abcd");
        System.out.println(ac1.getPassword());
    }
}