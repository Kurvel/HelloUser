package com.HelloUser.HelloUser;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

    public static Form form = new Form("MemberForm");

    @GetMapping("/form")
    String getIndex(Model model) {
        model.addAttribute("test", HelloUserApplication.form.members);
        model.addAttribute("newMember", new Member(null, 0));
        return "form";
    }

    
    
      @PostMapping("/new-member")
      String newMember(@RequestParam("name") String name) {
          System.out.println("PostMapping " + name);
         
          HelloUserApplication.form.members.add(new Member(name, form.members.size() + 1));

          
          return "redirect:/member";
        
      }
}
