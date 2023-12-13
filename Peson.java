import java.time.LocalDate;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;

class Person implements PersonInterface {
    private String name;
    private List<Person> children;
    private LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void addChild(Person child) {
        children.add(child);
    }

    public List<Person> getSortedChildrenByBirthDate() {
        List<Person> sortedChildren = new ArrayList<>(children);
        sortedChildren.sort(Comparator.comparing(Person::getBirthDate));
        return sortedChildren;
    }
}