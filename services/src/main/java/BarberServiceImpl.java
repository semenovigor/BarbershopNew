import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BarberServiceImpl {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        BarberDAO barberDAO = new BarberDAOImplFile();

        List<Barber> barbers = new ArrayList<>();
        barbers.add(new Barber(1L,"Igor","Semenov"));
        barbers.add(new Barber(2L,"Igor","Semenov"));
        barbers.add(new Barber(3L,"Igor","Semenov"));
        barbers.add(new Barber(4L,"Igor","Semenov"));
        barbers.add(new Barber(5L,"Igor","Semenov"));
        barberDAO.add(barbers);
        barberDAO.getAll();

        ClientDAO clientDAO = new ClientDAOImplFile();

        List<Client> clients = new ArrayList<>();
        clients.add(new Client(1L,"Roma", "Kashko",21, "+375293753753"));
        clients.add(new Client(2L,"Roma", "Kashko",21, "+375293753753"));
        clients.add(new Client(3L,"Roma", "Kashko",21, "+375293753753"));
        clients.add(new Client(4L,"Roma", "Kashko",21, "+375293753753"));
        clients.add(new Client(5L,"Roma", "Kashko",21, "+375293753753"));
        clientDAO.add(clients);
        clientDAO.getAll();

        OrderDAO orderDAO = new OrderDAOImplFile();

        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1L,1L, 1L, new Date(), new Date(), Haircuts.STRIZHKA));
        orders.add(new Order(2L,2L, 2L, new Date(), new Date(), Haircuts.COMPLEX));
        orders.add(new Order(3L,3L, 3L, new Date(), new Date(), Haircuts.DADANDSON));
        orders.add(new Order(4L,4L, 4L, new Date(), new Date(), Haircuts.BORODA));
        orders.add(new Order(5L,5L, 5L, new Date(), new Date(), Haircuts.STRIZHKA));
        orderDAO.add(orders);
        orderDAO.getAll();
    }
}
