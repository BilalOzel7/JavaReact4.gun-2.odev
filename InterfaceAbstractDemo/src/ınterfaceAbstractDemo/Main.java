package ýnterfaceAbstractDemo;

public class Main {

	public static void main(String[] args) throws Exception {
		
		BaseCustomerManager customerManager= new NeroCustomerManager();
		customerManager.save(new Customer(1,"Muhammet Bilal","Özel",1989,(long)13555562596L));

	}

}
