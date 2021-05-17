import lombok.Getter;

import javax.persistence.Entity;

@Getter
@Entity
public class Employee {
    private int id;
    private String name;
    private String address;
    private int rank;
    private Employee manager;

    public Employee(int id, String name, String address, int rank, Employee manager) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.rank = rank;
        this.manager = manager;
    }
}
