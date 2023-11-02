package com.HelloUser.HelloUser;

import java.util.ArrayList;

public class Form {
    public String formName;
    ArrayList<Member> members;

    Form(String formName) {
        this.formName = formName;
        this.members = new ArrayList<>();
    }

    public void addMember(String name, int id, String lName, int age, String mail) {
        members.add(new Member(name, id, lName, age, mail ));
    }

    public String getFormName() {
        return formName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Member> members) {
        this.members = members;
    }

    
    
}
