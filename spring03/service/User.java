package entity;

public class User {
	private int id;
	private String userName;
	private String userPassword;
	private int userAge;
	private Double userSal;
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", userPassword=" + userPassword + ", userAge=" + userAge
				+ ", userSal=" + userSal + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public Double getUserSal() {
		return userSal;
	}
	public void setUserSal(Double userSal) {
		this.userSal = userSal;
	}


	
}
