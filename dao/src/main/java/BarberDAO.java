import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface BarberDAO {
    Optional<Barber> get(Long id);
    List<Barber> getAll() throws IOException, ClassNotFoundException;
    void add(List<Barber> barbers) throws IOException;
    void update(Barber barber);
    void remove(Barber barber);
}
