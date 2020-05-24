package org.example.Model;

/*1.Na stronie index.html utwórz link do nowej strony - order/list
Strona ta zawierać będzie zamówienia - dla zamówień utwórz nowy obiekt w pakiecie model - Order.
Niech order zawiera id, tytuł, cenę oraz użytkownika, który jest związany z danym zamówieniem.
Utwórz DAO podobne do UserDAO - wypełnij je 5 zamówieniami, przypisz do nich różnych użytkowników.
Wyświetl dane w tabeli - niech imię i nazwisko użytkownika znajdą się w jednej kolumnie.*/

public class Order {
    private int ID;

    private double price;

    private User user;

    public Order(int ID, double price, User user) {
        this.ID = ID;
        this.price = price;
        this.user = user;
    }

    public Order() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
