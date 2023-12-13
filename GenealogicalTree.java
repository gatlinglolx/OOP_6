import java.util.ArrayList;
import java.util.List;

public class GenealogicalTree {
    private Person root;

    public GenealogicalTree(Person root) {
        this.root = root;
    }

    public void printTree() {
        printTree(root, 0);
    }

    private void printTree(Person person, int level) {
        System.out.println(getIndent(level) + person.getName());
        List<Person> children = person.getChildren();
        for (Person child : children) {
            printTree(child, level + 1);
        }
    }

    private String getIndent(int level) {
        StringBuilder indent = new StringBuilder();
        for (int i = 0; i < level; i++) {
            indent.append("  ");
        }
        return indent.toString();
    }

    public List<Person> getChildrenOf(String name) {
        List<Person> result = new ArrayList<>();
        findChildren(root, name, result);
        return result;
    }

    private void findChildren(Person person, String name, List<Person> result) {
        if (person.getName().equals(name)) {
            result.addAll(person.getChildren());
        }
        for (Person child : person.getChildren()) {
            findChildren(child, name, result);
        }
    }
}