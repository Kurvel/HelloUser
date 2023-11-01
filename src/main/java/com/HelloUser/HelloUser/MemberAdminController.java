package com.HelloUser.HelloUser;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MemberAdminController {
    
     @GetMapping("/memberAdmin")
    String getIndex(Model model) {
        model.addAttribute("memberList", HelloUserApplication.form.members);
        model.addAttribute("newMember", new Member(null, 0, null, 0, null));
        return "memberAdmin";
    }
    
    @GetMapping("remove-member/{memberId}")
    String removeMember(@PathVariable int memberId) {
        System.out.println("removeMember: " + memberId);
        HelloUserApplication.form.members.removeIf(member -> member.getId() == memberId);
        return "redirect:/memberAdmin";
    }
}
