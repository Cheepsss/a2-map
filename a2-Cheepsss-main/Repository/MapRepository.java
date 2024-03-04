package Repository;

import Domain.Entity;

import java.util.HashMap;
import java.util.Map;

public abstract class MapRepository<T extends Entity<ID>, ID> implements GenericRepository<T, ID> {
    private Map<ID, T> elem;

    public MapRepository() {
        elem = new HashMap<>();
    }

    public void add(T el) {
        if (elem.containsKey(el.getID()))
            throw new RuntimeException("Element already in list");
        else
            elem.put(el.getID(), el);
    }

    public void delete(T el) {
        if (elem.containsKey(el.getID()))
            elem.remove(el.getID());
    }

    public void update(T el, ID id) {
        if (elem.containsKey(id))
            elem.put(el.getID(), el);
        else
            throw new RuntimeException("Element doesn't exist");
    }

    public T findById(ID id) {
        if (elem.containsKey(id))
            return elem.get(id);
        else
            throw new RuntimeException("Element doesn't exist");
    }

    public Iterable<T> findAll() {
        return elem.values();
    }

    public boolean checkID(ID id) {
        if (elem.containsKey(id))
            return true;
        else
            return false;
    }
}