package tw.brad.beans;

import java.io.Serializable;

public class Member{
	// Field => property
	private String id, name;
	
	public Member() {
		this("000","no name");
	}
	private Member(String id, String name) {
		this.id = id; this.name = name;
	}
	
	// getter & setter
	public String getId() {return id;}
	public String getName() {return name;}
	public void setId(String id) {this.id = id;}
	public void setName(String name) {this.name = name;}
	
	@Override
	public String toString() {
		return id + ":" + name;
	}
}
