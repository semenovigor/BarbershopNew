import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BarberDAOImplFile implements BarberDAO{
    private List<Barber> barbers = new ArrayList<>();
    @Override
    public Optional<Barber> get(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Barber> getAll() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Barber.txt"));
        barbers = (List<Barber>) ois.readObject();
        System.out.println(barbers);
        return barbers;
    }

    @Override
    public void add(List<Barber> barbers) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Barber.txt"));
        oos.writeObject(barbers);
        System.out.println(barbers);
    }

    @Override
    public void update(Barber barber) {

    }

    @Override
    public void remove(Barber barber) {

    }
}
