package pl.dobaczewskiMateusz.PurchaseRequests.items;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.dobaczewskiMateusz.PurchaseRequests.requests.PurchaseRequests;
import pl.dobaczewskiMateusz.PurchaseRequests.requests.PurchaseRequestsService;
import pl.dobaczewskiMateusz.PurchaseRequests.user.User;
import pl.dobaczewskiMateusz.PurchaseRequests.user.UserServiceImpl;

import javax.validation.Valid;
import java.security.Principal;
import java.util.Optional;

@Log
@Controller
@RequiredArgsConstructor
public class ItemController {

    private final UserServiceImpl userServiceImpl;
    private final ItemService itemService;
    private final PurchaseRequestsService purchaseRequestsService;

  /*  @GetMapping("user/addItem/{id}")
    public String addItemForm(@PathVariable Long id, Model model, Principal principal) {
       // User user = userServiceImpl.findByUsername(principal.getName());
        Optional<PurchaseRequests> purchaseRequestsOptional = purchaseRequestsService.getPRById(id);
       // model.addAttribute("user", user);
        model.addAttribute("purchaseRequestsOptional", purchaseRequestsOptional);
        model.addAttribute("item", new Item());
        return "addItemForm";
    }*/

    @GetMapping("user/add/item/{id}")
    public String addItemForm(@PathVariable Long id, Model model) {
        log.getName();
        Item item = new Item();
        /*PurchaseRequests purchaseRequests = purchaseRequestsService.findPRbyID(id);
        Optional<PurchaseRequests> purchaseRequestsOptional = purchaseRequestsService.getPRById(id);
        item.setPurchaseRequests(purchaseRequests);*/
        model.addAttribute("item", item);
       // model.addAttribute("purchaseRequestsOptional", purchaseRequestsOptional);
        return "addItemForm";
    }

    @PostMapping("user/add/item/{id}")
    public String addItem(@PathVariable Long id, @Valid Item item, BindingResult result,Principal principal, Model model){
        if(result.hasErrors()){
            return "user/add/item";
        }
        itemService.createItem(item);

        return "dashboard";
    }
}
