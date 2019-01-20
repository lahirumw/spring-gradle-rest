package com.student.model;

public class Student {
    
    private String id;
    
    private String firstName;
    
    private String lastName;
    
    private int age;
    
    public Student() {
	
    }
    
    public Student(String id) {
	this.id = id;
	this.firstName = "Jeo";
	this.lastName = "Lee";
	this.age = 16;
    }

    public Student(Student student) {
	this.id = student.getId();
	this.firstName = student.getFirstName();
	this.lastName = student.getLastName();
	this.age = student.getAge();
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    

}
