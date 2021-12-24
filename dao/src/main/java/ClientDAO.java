import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface ClientDAO {
    Optional<Client> get(Long id);
    List<Client> getAll() throws IOException, ClassNotFoundException;
    void add(List<Client> clients) throws IOException;
    void update(Client client);
    void remove(Client client);
}
