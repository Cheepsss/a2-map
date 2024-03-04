package Domain;
import Domain.Cake;

import java.util.Arrays;

public class Order implements Entity<Integer>{

    private int ID;
    private int nrCakes;
    private int totalPrice;
    private Cake[] cakes;


    public Integer getID() {
        return ID;
    }

    @Override
    public void setID(Integer ID) {
        this.ID = ID;
    }
    public int getNrCakes() {
        return nrCakes;
    }

    public void setNrCakes(int nrCakes) {
        this.nrCakes = nrCakes;
    }


    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Cake[] getCakes() {
        return cakes;
    }

    public void setCakes(Cake[] cakes) {
        this.cakes = cakes;
    }
    public Order(int id,int nrCakes, int totalPrice, Cake[] cakes) {
        this.nrCakes = nrCakes;
        this.totalPrice = totalPrice;
        this.cakes = cakes;
        this.ID=id;
    }


    @Override
    public String toString() {
        return "Order{" +
                "ID=" + ID +
                "nrCakes=" + nrCakes +
                ", totalPrice=" + totalPrice +
                ", cakes=" + Arrays.toString(cakes) +
                '}';
    }
}