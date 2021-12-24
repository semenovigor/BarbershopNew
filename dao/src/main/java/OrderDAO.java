import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface OrderDAO {
    Optional<Order> get(Long id);
    List<Order> getAll() throws IOException, ClassNotFoundException;
    void add(List<Order> orders) throws IOException;
    void update(Order order);
    void remove(Order order);
}
