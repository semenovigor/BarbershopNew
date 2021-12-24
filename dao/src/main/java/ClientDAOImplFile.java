import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ClientDAOImplFile implements ClientDAO{
    private List<Client> clients = new ArrayList<>();
    @Override
    public Optional<Client> get(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Client> getAll() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Client.txt"));
        clients = (List<Client>) ois.readObject();
        System.out.println(clients);
        return clients;
    }

    @Override
    public void add(List<Client> clients) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Client.txt"));
        oos.writeObject(clients);
        System.out.println(clients);
    }

    @Override
    public void update(Client client) {

    }

    @Override
    public void remove(Client client) {

    }
}
