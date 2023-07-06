package web.model;
import javax.persistence.*;



@Entity
@javax.persistence.Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Last_name")
    private String lastName;
    @Column(name = "Age")
    private int age;
    @Column(name = "Nation")
    private String national;

    public User(String name, String lastName, int age, String national) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.national = national;
    }

    public User(){
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }
}