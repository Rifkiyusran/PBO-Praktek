package Aggregation;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Address address1=new Address("Mogi das Cruzes","Sao Paulo","Brazil");  
			Address address2=new Address("Manchester","City of Bristol","Inggris");  
			  
			Employee e=new Employee(1,"Neymar da Silva Santos Júnior",address1);  
			Employee e2=new Employee(2,"Jesse Ellis Lingard",address2);  
			      
			e.display();  
			e2.display();  

	}

}