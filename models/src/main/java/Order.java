import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {
    Long id;
    Long idClient;
    Long idBarber;
    Date startTime;
    Date endTime;
    Haircuts haircuts;

    public Order(Long id, Long idClient, Long idBarber, Date startTime, Date endTime, Haircuts haircuts) {
        this.id = id;
        this.idClient = idClient;
        this.idBarber = idBarber;
        this.startTime = startTime;
        this.endTime = endTime;
        this.haircuts = haircuts;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public Long getIdBarber() {
        return idBarber;
    }

    public void setIdBarber(Long idBarber) {
        this.idBarber = idBarber;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Haircuts getHaircuts() {
        return haircuts;
    }

    public void setHaircuts(Haircuts haircuts) {
        this.haircuts = haircuts;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", idClient=" + idClient +
                ", idBarber=" + idBarber +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", haircuts=" + haircuts +
                '}';
    }
}
