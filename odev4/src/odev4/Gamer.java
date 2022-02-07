package odev4;

public class Gamer {
	
	private int TcNo;
	private String firstName;
	private String lastName;
	private String birthOfYear;
	private String genderOfGamer;
	private String ageOfGamer;
	
	public Gamer(int TcNo, String firstName, String lastName, String birthOfYear ,String genderOfGamer, String ageOfGamer) {
		
		this.TcNo = TcNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthOfYear = birthOfYear;
		this.genderOfGamer = genderOfGamer;
		this.ageOfGamer = ageOfGamer;
	}

	public int getTcNo() {
		return TcNo;
	}

	public void setTcNo(int TcNo) {
		this.TcNo = TcNo;
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
	
	public String getBirthOfYear() {
		return birthOfYear;
	}

	public void setBirthOfYear(String birthOfYear) {
		this.birthOfYear = birthOfYear;
	}

	public String getGenderOfGamer() {
		return genderOfGamer;
	}

	public void setGenderOfGamer(String genderOfGamer) {
		this.genderOfGamer = genderOfGamer;
	}

	public String getAgeOfGamer() {
		return ageOfGamer;
	}

	public void setAgeOfGamer(String ageOfGamer) {
		this.ageOfGamer = ageOfGamer;
	}
	
	

}
