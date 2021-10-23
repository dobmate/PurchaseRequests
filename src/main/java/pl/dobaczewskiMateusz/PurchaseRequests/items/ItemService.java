package pl.dobaczewskiMateusz.PurchaseRequests.items;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;


    public void createItem(Item itemToAdd) {
        itemRepository.save(itemToAdd);

    }

    public List<Item> getItem() {
        List<Item> itemList = itemRepository.findAll();
        return itemList;
    }


    public Optional<Item> getItemById(Long id) {
        Optional<Item> byId = itemRepository.findById(id);
        return byId;
    }

    public void updateItem(Item itemToUpdate) {
        itemRepository.save(itemToUpdate);
    }

    public void deleteItem(Long id) {
        Optional<Item> byId = itemRepository.findById(id);
        if (byId.isPresent()) {
            itemRepository.deleteById(id);
        }
    }
}
