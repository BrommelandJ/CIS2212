import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Library {

    private ObservableList<MediaItem> item = FXCollections.observableArrayList();

    public ObservableList<MediaItem> getItemList() {
        return item;
    }

    void addNewItem(String title, String format) {
        item.add(new MediaItem(title, format));

    }
    
}