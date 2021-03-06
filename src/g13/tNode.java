package g13;

/**
 * Created by albert on 16/04/15.
 */
public class tNode extends Node {
    private final int key;

    public tNode(int key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || o.getClass() != getClass()) return false;
        return ((tNode) o).getKey() == this.key;
    }

    @Override
    public int hashCode() {
        return ((Integer) key).hashCode();
    }

    @Override
    public String toString() {
        return Integer.toString(key);
    }

    @Override
    public int compareTo(Node n) {
        return key - ((tNode) n).getKey();
    }


    public int getKey() {
        return key;
    }
}
