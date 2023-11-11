package int101.homework02;
import work01.Utilitor;
import work02.Person;
import work03.Account;

public class Int101Homework02Updated {
    public static void main(String[] args) {
       work01Utilitor();
       work02Person();
       work03Account();
    }
    
     static void work01Utilitor() {
        try{
            System.out.println(Utilitor.testString(null));
        }catch(Exception e){
            System.out.println("Error : " + e);
        }
        try{
            System.out.println(Utilitor.testString(""));
        }catch(Exception e){
            System.out.println("Error : " + e);
        }
        
        System.out.println(Utilitor.testString("hallo"));
        
        try{
            System.out.println(Utilitor.testPositive(-1));
        }catch(Exception e){
            System.out.println("Error : " + e);
        }
        
        System.out.println(Utilitor.testPositive(1));

        System.out.println(Utilitor.computeIsbn10(188_879_997));
        
        System.out.println(Utilitor.computeIsbn10(12345678));
    }

 

    static void work02Person() {
        Person p1 = new Person("Chaiyanan","Sirinitsriwong");
        Person p2 = p1;
        System.out.println(p1);
        System.out.println(p1.getId());
        System.out.println(p1.getFirstname());
        System.out.println(p1.getLastname());

        p1.setFirstname("Chai");
        p1.setLastname("yanan");

        System.out.println(p1);

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(new Person("test","test")));
    }

 

    static void work03Account() {
        Person person1 = new Person("person1","a");
        Person person2 = new Person("person2","b");
        Account account1 = new Account(person1);
        Account account2 = new Account(person2);
        try{
            Account account3 = new Account(null);
        }catch(Exception e){
            System.out.println("Error : " + e);
        }
        System.out.println(account1);
        System.out.println(account1.getNo());
        System.out.println(account1.getOwner());
        System.out.println(account1.getBalance());

        account1.deposit(100.0);
        System.out.println("deposit 100.0 : " + account1.getBalance());
        
        account1.withdraw(20.0);
        System.out.println("withdraw 20.0 : " + account1.getBalance());
        
        try{
            account1.withdraw(120.0);
        }catch(Exception e){
            System.out.println("Error : " + e);
        }
        
        account1.transfer(30.0, account2);
        System.out.println("tranfer 30.0: " + account1.getBalance());
        System.out.println("tranfer 30.0: " + account2.getBalance());

        System.out.println("account1.toString(): " + account1.toString());

        System.out.println("account1.equals(account2): " + account1.equals(account2));
        System.out.println("account1.equals(account1): " + account1.equals(account1));

        Account account1Copy = account1;

        System.out.println("account1.equals(account1Copy): " + account1.equals(account1Copy));
        
    }
}