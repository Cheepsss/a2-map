
import Service.OrderService;
import Repository.OrderRepository;
import Domain.Order;
import Domain.Cake;

import UI.Ui;

public class Main {
    public static void main(String[] args) {
        Cake[] cakes;
        cakes = new Cake[]{};

        OrderRepository orderRepo = new OrderRepository();
        orderRepo.add(new Order(20,2,150,cakes));
        OrderService orderserv = new OrderService(orderRepo);

        Ui ui=new Ui(orderserv);
        ui.main();
    }
}