package org.example.Controller;

import org.example.DAO.OrderDAO;
import org.example.DAO.UserDAO;
import org.example.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    UserDAO userDAO;


    @RequestMapping("main")
    public String mainPage(Model model) {
        model.addAttribute("users",userDAO.getUsers());
        return "index";
    }

    @RequestMapping("main/{id}")
    public String mainPageId(@PathVariable("id") int id, Model model){
        model.addAttribute("user",userDAO.getUserById(id));
        return "index";
    }

    @RequestMapping("post")
    public String postPage (Model model) {
        model.addAttribute("user",new User());
        return "post";
    }
    @PostMapping("/save")
    public String postAction(User user){
        user.setId(userDAO.getUsers().size());
        return "index";
    }



}
