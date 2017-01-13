package clientSide;

public class theAccounts {
	String name;
	String address;
	int bankAccNum;
	String userName;
	String password;

	public theAccounts() {
		super();
	}
	
	@Override
	public String toString() {
		return "theAccounts [name=" + name + ", address=" + address + ", bankAccNum=" + bankAccNum + ", userName="
				+ userName + ", password=" + password + "]";
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getBankAccNum() {
		return bankAccNum;
	}

	public void setBankAccNum(int bankAccNum) {
		this.bankAccNum = bankAccNum;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
