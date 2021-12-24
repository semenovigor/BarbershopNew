import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OrderDAOImplFile implements OrderDAO{
    private List<Order> orders = new ArrayList<>();
    @Override
    public Optional<Order> get(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Order> getAll() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Order.txt"));
        orders = (List<Order>) ois.readObject();
        System.out.println(orders);
        return orders;
    }

    @Override
    public void add(List<Order> orders) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Order.txt"));
        oos.writeObject(orders);
        System.out.println(orders);
    }

    @Override
    public void update(Order order) {

    }

    @Override
    public void remove(Order order) {

    }
}
