public class Person implements Comparable<Person>
{

	private String firstName;
	private String lastName;
	private int personCode;
	
	public Person(String fistName,String lastName,int personCode){
		this.firstName = fistName;
		this.lastName = lastName;
		this.personCode = personCode;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getEmplyeeCode() {
		return personCode;
	}

	public void setEmplyeeCode(int personCode) {
		this.personCode = personCode;
	}

	public String toString(){
		return "Person Code: "+getEmplyeeCode()+", Name:"+getFirstName()+" "+getLastName();
	}

	public int compareTo(Person o) {
		Person e = (Person)o;
		if(this.personCode > e.getEmplyeeCode())
			return 1;
		if(this.personCode < e.getEmplyeeCode())
			return -1;
		if(this.personCode == e.getEmplyeeCode())
			return 0;
		return 0;
	}
}