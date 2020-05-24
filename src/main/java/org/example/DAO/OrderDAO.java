package org.example.DAO;

import org.example.Model.Order;
import org.example.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
@Service
public class OrderDAO {
    private List<Order> orders = new ArrayList<>();
    @Autowired
    UserDAO users = new UserDAO();

    @PostConstruct
    public void init() {
        orders.add(new Order(0, 20.99, users.getUserById(1)));
        orders.add(new Order(1, 9.99, users.getUserById(2)));
        orders.add(new Order(2, 6.99, users.getUserById(3)));
        orders.add(new Order(3, 149.89, users.getUserById(4)));
        orders.add(new Order(4, 28.50, users.getUserById(2)));
    }

    public List<Order> getOrders() {
        return orders;
    }

    public Order getOrderById(int id) {
        return orders.get(id);
    }
}
