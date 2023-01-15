public class CustomerManager {

    private static CustomerManager customerManager;
    
    private CustomerManager(){}
    public static CustomerManager createSingleton(){
        if(customerManager == null){
            customerManager = new CustomerManager();
        }
        return customerManager;
    }
    public void Kaydet(){
        System.out.println("kayit gerçeklestirildi");
    }
}
