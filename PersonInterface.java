import java.time.LocalDate;
import java.util.List;

interface PersonInterface {
    String getName();
    List<Person> getChildren();
    void addChild(Person child);
    LocalDate getBirthDate();
    List<Person> getSortedChildrenByBirthDate();
}