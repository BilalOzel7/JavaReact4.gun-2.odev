package ýnterfaceAbstractDemo;



public class Customer {
	 int Id;
	 String FirstName;
	 String Lastname;
	 int dateOfBirthYear;
	 long NationalityId;
	 
	public Customer(int id, String firstName, String lastname, int dateOfBirthYear, long nationalityId) {
		super();
		Id = id;
		FirstName = firstName;
		Lastname = lastname;
		this.dateOfBirthYear = dateOfBirthYear;
		NationalityId = nationalityId;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public int getDateOfBirthYear() {
		return dateOfBirthYear;
	}

	public void setDateOfBirthYear(int dateOfBirthYear) {
		this.dateOfBirthYear = dateOfBirthYear;
	}

	public long getNationalityId() {
		return NationalityId;
	}

	public void setNationalityId(long nationalityId) {
		NationalityId = nationalityId;
	}
	
	

	
	
}
	
