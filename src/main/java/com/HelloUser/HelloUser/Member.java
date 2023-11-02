package com.HelloUser.HelloUser;

public class Member {
    private String name;
    private String lName;
    private int id;
    private int age; 
    private String mail;

    Member(String name, int id, String lName, int age, String mail) {
        this.name = name;
        this.id = id;
        this.lName = lName;
        this.age = age;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    
    
}
