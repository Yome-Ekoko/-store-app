package convenienceStore;

import enums.Role;

public abstract class Person {
    private String name;
    private String Gender;
    private String email;
    private Role role;

    public Person() {
    }

    public Person(String name, String gender, String email) {
        this.name = name;
        Gender = gender;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
