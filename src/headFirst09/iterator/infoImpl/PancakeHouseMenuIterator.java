package headFirst09.iterator.infoImpl;


import headFirst09.iterator.info.Iterator;
import headFirst09.iterator.menu.MenuItem;

import java.util.ArrayList;

/**
 * Created by wangjize on 2025/6/12.
 */
public class PancakeHouseMenuIterator implements Iterator {
    ArrayList<MenuItem> items;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> items) {
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
