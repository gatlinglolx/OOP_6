import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person grandfather = new Person("Nikita", LocalDate.of(1977, 5, 10));
        Person father = new Person("Dobrinya", LocalDate.of(1997, 7, 11));
        Person fathersBrother = new Person("Ivan", LocalDate.of (1999, 9, 26));
        Person fathersDaughter = new Person("Anna", LocalDate.of (2015, 4, 30));

        grandfather.addChild(father);
        grandfather.addChild(fathersBrother);
        father.addChild(fathersDaughter);

        GenealogicalTree tree = new GenealogicalTree(grandfather);
        tree.printTree();

        System.out.println("Дети дедушки: ");
        List<Person> grandfathersChildren = tree.getChildrenOf("Nikita");
        for (Person child : grandfathersChildren) {
            System.out.println(child.getName());
        }

        System.out.println("Дети Никиты отсортированные по дате рождения: ");
        List<Person> grandfathersChildrenSortedByBirthDate = grandfather.getSortedChildrenByBirthDate();
        for (Person child : grandfathersChildrenSortedByBirthDate) {
            System.out.println(child.getName() + " - " + child.getBirthDate());
        }
    }
}