package UI;


import Domain.*;
import Service.OrderService;

import java.util.*;

public class Ui {

    private OrderService orderserv;

    public Ui(OrderService orderserv) {
        this.orderserv = orderserv;
    }

    public void menu(){
        System.out.println("-------------");
        System.out.println("1.Add");
        System.out.println("2.Update");
        System.out.println("3.Delete");
        System.out.println("4.Show all");
        System.out.println("5.Exit");

    }
    public void delete(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.print("ID: ");
        int id =sc.nextInt();
        Cake []cakes = new Cake[0];
        Order o = new Order(id, 0,0,cakes);
        this.orderserv.delete(o);

    }
    public void update(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.print("ID: ");
        int id =sc.nextInt();
        Order o = this.create_order();
        orderserv.update(id,o);

    }
    public Order create_order(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        System.out.print("ID: ");
        int id = sc.nextInt();
        System.out.print("nr of cakes: ");
        int nr_cakes=sc.nextInt();
        int cake_nr;
        Cake []cakes = new Cake[0];
        Cake cake;
        System.out.print("1.20lei  Pupu  faina\n");
        System.out.print("2.200lei  Velvet  faina si oua\n");
        System.out.print("3.150lei  Vanilie  faina si oua si vanilie\n");
        System.out.print("4.240lei  Carrot Cake  faina si oua si morcov\n");
        System.out.print("5.Custom order :D\n");

        // create a new ArrayList
        List<Cake> arrlist = new ArrayList<Cake>(
                Arrays.asList(cakes));

        for(int i =0; i<nr_cakes;i++){
            //price type si ingredient
            cake_nr=sc.nextInt();
            cake = switch (cake_nr) {
                case 2 -> new Cake(1,200, "Velvet", "fain si oua");
                case 3 -> new Cake(2,150, "Vanilie", "fain si oua si vanilie");
                case 4 -> new Cake(3,240, "Carrot cake", "faina si oua si morcov");
                case 1 -> new Cake(4,20, "Pupu", "faina si oua");
                default -> new Cake(5,20, "de implementat", "mai tarziu");
            };
            arrlist.add(cake);
        }
        cakes = arrlist.toArray(cakes);
        System.out.print("Price: ");
        int price=sc.nextInt();
        return new Order(id,nr_cakes,price,cakes);
    }
    public void add(){
        Order o = this.create_order();
        this.orderserv.addOrder(o.getID(),o.getNrCakes(),o.getTotalPrice(),o.getCakes());
    }

    public void printAll(){
        Iterable<Order> orders = this.orderserv.findALL();


        for (Order o : orders) {
            System.out.println(o);
        }
    }

    public void main(){
        boolean running = true;
        while(running) {
            this.menu();
            Scanner sc = new Scanner(System.in);
            System.out.println("Input your option: ");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    this.add();
                    break;
                case 2:
                    this.update();
                    break;
                case 3:
                    this.delete();
                    break;
                case 4:
                    this.printAll();
                    break;
                default:
                    running = false;

            }
        }
    }

}
