package headFirst09.iterator.infoImpl;


import headFirst09.iterator.info.Iterator;
import headFirst09.iterator.menu.MenuItem;

import java.util.Calendar;

/**
 * Created by wangjize on 2025/6/13.
 */
public class AlternatingDinerMenuIterator implements Iterator {
    MenuItem[] list;
    int position;

    public AlternatingDinerMenuIterator(MenuItem[] list) {
        this.list = list;
        Calendar rightNow = Calendar.getInstance();
        position = rightNow.DAY_OF_WEEK % 2;
    }
    public Object next() {
        MenuItem menuItem = list[position];
        position = position + 2;
        return menuItem;
    }
    public boolean hasNext() {
        if (position >= list.length || list[position] == null) {
            return false;
        } else {
            return true;
        }
    }
    public String toString() {
        return "Alternating Diner Menu Iterator";
    }
}