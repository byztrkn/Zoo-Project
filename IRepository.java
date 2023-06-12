import java.util.List;

public interface IRepository<T> {
    void add(T entity);
    void delete(T entity);
    List<T> list();
}
