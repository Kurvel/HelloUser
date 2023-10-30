package com.HelloUser.HelloUser;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

    public static Form form = new Form("MemberForm");

    static {
       
        
    }
    
    @PostMapping("/form")
    String newMember(@RequestParam("name") String name,@RequestParam("id")int id) {
        System.out.println("PostMapping " + name);
        // form.addMember(new Member (name, form.members.size() + 1));
        form.members.add(new Member(name, form.members.size() + 1));
        return "/form";
        
    }
}
