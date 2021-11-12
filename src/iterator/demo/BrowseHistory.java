package iterator.demo;

import iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    // If change the type of this field, it'll break other code of this class's consumers
    private List<String> urls = new ArrayList<>();
    private int index;

    public Iterator createIterator() {
        return new ArrayListIterator(this);
    }

    public void push(String history) {
        this.urls.add(history);
    }

    public String pop(String item) {
        int lastIndex = urls.size() - 1;
        String lastItem = urls.get(lastIndex);
        urls.remove(lastIndex);

        return lastItem;
    }

    public class ArrayListIterator implements Iterator<String> {

        private BrowseHistory history;

        public ArrayListIterator(BrowseHistory history) {
            this.history = history;
        }
        @Override
        public void next() {
            index++;
        }

        @Override
        public String current() {
            return this.history.urls.get(index);
        }

        @Override
        public boolean hasNext() {
            return index < this.history.urls.size();
        }
    }
}
