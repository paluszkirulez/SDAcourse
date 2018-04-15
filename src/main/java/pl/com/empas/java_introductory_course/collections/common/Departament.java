package pl.com.empas.java_introductory_course.collections.common;

import java.util.Objects;

public class Departament {

    public Departament(String name, Long budget) {
        this.name = name;
        this.budget = budget;
    }

    private final String name;
    private final Long budget;

    @Override
    public String toString() {
        return "Departament{" +
                "name='" + name + '\'' +
                ", budget=" + budget +
                '}';
    }

    public String getName() {
        return name;
    }

    public Long getBudget() {
        return budget;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departament that = (Departament) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(budget, that.budget);

    }

    @Override
    public int hashCode() {

        return Objects.hash(name, budget);
    }
}
