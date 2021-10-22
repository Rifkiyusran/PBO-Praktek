package Dependence;

public class Main{
public static void main(String[] args) {
        Customer pelanggan1 = new Customer();
        Customer pelanggan2 = new Customer();
        Customer pelanggan3 = new Customer();
        Customer pelanggan4 = new Customer();
        pelanggan1.setCustomerId(1);
        pelanggan1.setCustomerName("sron");
        pelanggan2.setCustomerId(2);
        pelanggan2.setCustomerName("con");
		pelanggan3.setCustomerId(3);
        pelanggan3.setCustomerName("ucon");
        pelanggan4.setCustomerId(4);
        pelanggan4.setCustomerName("marcel");
        
        Order wira1 = new Order(pelanggan1);
        Order wira2 = new Order(pelanggan2);
        Order wira3 = new Order(pelanggan3);
        Order wira4 = new Order(pelanggan4);
    }
}