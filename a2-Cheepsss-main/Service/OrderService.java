package Service;
import Domain.*;
import Repository.OrderRepository;

public class OrderService {
    private OrderRepository orderRepo;

    public OrderService(OrderRepository orderRepo) {
        this.orderRepo = orderRepo;
    }

    public void setOrderRepo(OrderRepository orderRepo) {
        this.orderRepo = orderRepo;
    }

    public void addOrder(int ID,int nrCakes, int totalPrice, Cake[] cakes){
        Order o = new Order(ID, nrCakes, totalPrice, cakes);
        this.orderRepo.add(o);
    }

    public Order findById(int id){
        return orderRepo.findById(id);
    }
    public void update(int id, Order o){
        orderRepo.update(o,id);
    }

    public void delete(Order o){
        orderRepo.delete(o);
    }


    public Iterable<Order> findALL()
    {
        return orderRepo.findAll();
    }
}
