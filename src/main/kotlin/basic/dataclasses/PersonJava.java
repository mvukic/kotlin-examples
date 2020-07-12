package basic.dataclasses;

import java.util.Objects;

public class PersonJava {

    private String name;

    private Integer age;

    private String email;

    public PersonJava(String name, Integer age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonJava)) return false;
        PersonJava that = (PersonJava) o;
        return Objects.equals(getName(), that.getName()) &&
                Objects.equals(getAge(), that.getAge()) &&
                Objects.equals(getEmail(), that.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getEmail());
    }

    @Override
    public String toString() {
        return "PersonJava{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
