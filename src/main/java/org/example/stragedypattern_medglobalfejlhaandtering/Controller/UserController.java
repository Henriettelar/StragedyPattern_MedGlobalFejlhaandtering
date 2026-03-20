package org.example.stragedypattern_medglobalfejlhaandtering.Controller;

import org.example.stragedypattern_medglobalfejlhaandtering.Model.RegisterUserModel;
import org.example.stragedypattern_medglobalfejlhaandtering.Service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    private UserService userService = new UserService();

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping("/submit")
    public String submit(@RequestParam String username, @RequestParam String email, @RequestParam String password, @RequestParam String password1, @RequestParam String mode, Model model) {

        RegisterUserModel userModel = new RegisterUserModel(username, email, password, password1);

        userService.registerUser(userModel, mode);

        model.addAttribute("username", userModel.getUsername());
        model.addAttribute("email", userModel.getEmail());

        return "success";
    }
}
