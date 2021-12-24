import java.io.Serializable;

public enum Haircuts implements Serializable {
    STRIZHKA("Стрижка", "25BYN", 1L),
    BORODA("Борода", "15BYN", 2L),
    DADANDSON("Отец и сын","45BYN",3L),
    COMPLEX("Стрижка и борода","35BYN",4L);


    private String title;
    private String price;
    private Long id;

    Haircuts(String title, String price, Long id) {
        this.title = title;
        this.price = price;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Haircuts{" +
                "title='" + title + '\'' +
                ", price='" + price + '\'' +
                ", id=" + id +
                '}';
    }
}
