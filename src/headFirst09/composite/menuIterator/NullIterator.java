package headFirst09.composite.menuIterator;


import java.util.Iterator;

/**
 * Created by wangjize on 2025/6/13.
 */
public class NullIterator implements Iterator {

    public Object next() {
        return null;
    }

    public boolean hasNext() {
        return false;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
