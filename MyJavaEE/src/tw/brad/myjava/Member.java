package tw.brad.myjava;

public class Member {
	private String account, realname;
	private int age;
	public Member(String account, String realname, int age) {
		this.account = account;
		this.realname = realname;
		this.age = age;
	}
	
	public String getAccount() {return account;}
	public String getRealname() {return realname;}
	public int getAge() {return age;}
	
}
