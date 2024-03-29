package �nterfaceAbstractDemo;



public class StarbucksCustomerManager extends BaseCustomerManager  {
	
	private CustomerCheckService _customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this._customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) throws Exception   {
		if (_customerCheckService.CheckIfRealPerson(customer)) {
			
		} else {
			throw new Exception("Not a valid person");
		}
	}
}
