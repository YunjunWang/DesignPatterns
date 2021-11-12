package iterator.problem;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    // If change the type of this field, it'll break other code of this class's consumers
    private List<String> urls = new ArrayList<>();

    public void push(String history) {
        this.urls.add(history);
    }

    public String pop(String item) {
        int lastIndex = urls.size() - 1;
        String lastItem = urls.get(lastIndex);
        urls.remove(lastIndex);

        return lastItem;
    }
    public List<String> getUrls() {
        return urls;
    }
}
