package headFirst09.iterator.infoImpl;


import headFirst09.iterator.info.Iterator;
import headFirst09.iterator.menu.MenuItem;

/**
 * Created by wangjize on 2025/6/13.
 */
public class ArrayIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public ArrayIterator(MenuItem[] items) {
        this.items = items;
    }

    public Object next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }

    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }
}