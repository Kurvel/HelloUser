package com.HelloUser.HelloUser;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

     @GetMapping("/member")
    String getIndex(Model model) {
        model.addAttribute("test", HelloUserApplication.form.members);
        return "member";
    }
    
}
