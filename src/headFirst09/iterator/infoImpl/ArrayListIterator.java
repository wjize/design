package headFirst09.iterator.infoImpl;


import headFirst09.iterator.info.Iterator;

import java.util.ArrayList;

/**
 * Created by wangjize on 2025/6/13.
 */
public class ArrayListIterator implements Iterator {
    ArrayList items;
    int position = 0;

    public ArrayListIterator(ArrayList items) {
        this.items = items;
    }

    public Object next() {
        Object object = items.get(position);
        position = position + 1;
        return object;
    }

    public boolean hasNext() {
        if (position >= items.size()) {
            return false;
        } else {
            return true;
        }
    }
}