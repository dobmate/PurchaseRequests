package pl.dobaczewskiMateusz.PurchaseRequests.items;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @GetMapping("/add/item")
    public String addItemForm(Model model) {
        model.addAttribute("item", new Item());
        return "addItemForm";
    }

    @PostMapping("/add/item")
    public String addItem(@Valid Item item, BindingResult result){
        if(result.hasErrors()){
            return "add/item";
        }
        itemService.createItem(item);
        return "dashboard";
    }
}
