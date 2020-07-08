package basic.dataclasses;

import java.util.Objects;

// Can be achieved using Lombok
public class PersonJava {

    public PersonJava(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public PersonJava() { }

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonKotlin)) return false;
        PersonKotlin that = (PersonKotlin) o;
        return Objects.equals(getName(), that.getName()) &&
                Objects.equals(getAge(), that.getAge());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

    @Override
    public String toString() {
        return "PersonJava{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
