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
public class OrderController {
    @Autowired
    UserDAO userDAO;
    @Autowired
    OrderDAO orderDAO;

    @RequestMapping("orders")
    public String orderPage (Model model) {
        model.addAttribute("orders",orderDAO.getOrders());
        return "orders";
    }

}
