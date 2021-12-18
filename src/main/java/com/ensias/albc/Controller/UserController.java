package com.ensias.albc.Controller;

import com.ensias.albc.model.Users;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/profil")
    public String getProduitInterfaceEmployee(Model model) {
        Users u = new Users();
        model.addAttribute("users", u);
        //model.addAttribute("users", usersService.usersByname());
        return "index";
    }
}
