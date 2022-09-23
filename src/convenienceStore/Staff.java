package convenienceStore;

import enums.Departments;

public class Staff extends Person {
    private Integer id;
    private Departments department;

    public Staff(Integer id, Departments department) {
        this.id = id;
        this.department = department;
    }

    public Staff(String name, String gender, String email, Integer id, Departments department) {
        super(name, gender, email);
        this.id = id;
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Departments getDepartment() {
        return department;
    }

    public void setDepartment(Departments department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", department=" + department +
                '}';
    }
}
