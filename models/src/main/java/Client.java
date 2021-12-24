import java.io.Serializable;

public class Client implements Serializable {
    Long id;
    String name;
    String surname;
    int age;
    String numberPhone;

    public Client(Long id, String name, String surname, int age, String numberPhone) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.numberPhone = numberPhone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", numberPhone='" + numberPhone + '\'' +
                '}';
    }
}
