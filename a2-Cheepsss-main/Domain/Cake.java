package Domain;

public class Cake implements Entity<Integer>{
    private int price;
    private String type, ingredients;
    private int ID;


    public Cake(int id,int price, String type, String ingredients) {
        this.price = price;
        this.type = type;
        this.ingredients = ingredients;
        this.ID=id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "price=" + price +
                ", type='" + type + '\'' +
                ", ingredients='" + ingredients + '\'' +
                '}';
    }

    @Override
    public Integer getID() {
        return null;
    }

    @Override
    public void setID(Integer id) {

    }
}