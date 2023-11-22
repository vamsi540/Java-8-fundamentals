<<<<<<< HEAD
package com.demoproject;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Details")
public class Details {
	private String name;
	private String no;
	private String rollno;
	public String getName() {
		return name;
	}
	public Details() {
		super();
	}
	public Details(String name, String no, String rollno) {
		super();
		this.name = name;
		this.no = no;
		this.rollno = rollno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	

}
=======
package com.demoproject;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Details")
public class Details {
	private String name;
	private String no;
	private String rollno;
	public String getName() {
		return name;
	}
	public Details() {
		super();
	}
	public Details(String name, String no, String rollno) {
		super();
		this.name = name;
		this.no = no;
		this.rollno = rollno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	

}
>>>>>>> 5ba0185ccab11fc186042f1f28b523ef0256359a
