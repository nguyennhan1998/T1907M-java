package session6;
import java.util.ArrayList;

public interface DataAccessObjectConcrete <E> {
    ArrayList<E> list();
    Boolean create(E e);
    Boolean update(E e);
    Boolean delete(E e);
}