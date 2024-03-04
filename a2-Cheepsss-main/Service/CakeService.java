package Service;
import Domain.*;
import Repository.CakeRepository;

public class CakeService {
    private CakeRepository cakeRepo;

    public CakeService(CakeRepository cakeRepo) {
        this.cakeRepo = cakeRepo;
    }

    public void setCakeRepo(CakeRepository cakeRepo) {
        this.cakeRepo = cakeRepo;
    }

    public void addCake(int ID,int price, String type, String ingredients){
        Cake c = new Cake(ID, price, type, ingredients);
        this.cakeRepo.add(c);
    }

    public Cake findById(int id){
        return cakeRepo.findById(id);
    }
    public void update(int id, Cake c){
        cakeRepo.update(c,id);
    }

    public void delete(Cake c){
        cakeRepo.delete(c);
    }


    public Iterable<Cake> findALL()
    {
        return cakeRepo.findAll();
    }
}
