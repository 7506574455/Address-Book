package addressbook;

public interface IAddressBook {

	void add();

	void display();

	void edit();

	void delete(String firstName);

	void addMultiplePerson();

	void duplicateCheck(String firstName);
	
    //Uc7 Ability to ensure there is no Duplicate Entry of the same Person 
    void searchPersonByName(String firstname);
    
    // Uc8 Ability to search person in a city or state across the multiple
	 void searchPersonByState(String firstname);

}

