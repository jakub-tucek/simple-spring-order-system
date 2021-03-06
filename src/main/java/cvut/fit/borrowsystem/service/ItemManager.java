package cvut.fit.borrowsystem.service;

import cvut.fit.borrowsystem.domain.ItemRepository;
import cvut.fit.borrowsystem.domain.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Manager layer for item
 * Created by Jakub Tuček on 10.4.2016.
 */

@Service
public class ItemManager {
    @Autowired
    ItemRepository itemRepository;

    public List<Item> findAll() {
        return itemRepository.findAll();
    }

    public Item findOne(String id) {
        return itemRepository.findOne(id);
    }

    public Item insert(Item s) {
        return itemRepository.insert(s);
    }

    public void deleteAll() {
        itemRepository.deleteAll();
    }


    public boolean isItemNameUsed(String itemName) {
        return itemRepository.findByItemName(itemName) != null;
    }

    public void delete(Item i) {
        itemRepository.delete(i);
    }
}
