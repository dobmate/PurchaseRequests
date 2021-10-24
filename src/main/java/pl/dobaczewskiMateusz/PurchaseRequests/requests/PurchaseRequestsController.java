package pl.dobaczewskiMateusz.PurchaseRequests.requests;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.dobaczewskiMateusz.PurchaseRequests.items.Item;
import pl.dobaczewskiMateusz.PurchaseRequests.items.ItemService;
import pl.dobaczewskiMateusz.PurchaseRequests.user.User;
import pl.dobaczewskiMateusz.PurchaseRequests.user.UserServiceImpl;

import javax.validation.Valid;
import java.security.Principal;
import java.util.List;
import java.util.Optional;

@Log
@Controller
@RequiredArgsConstructor
public class PurchaseRequestsController {
    private final UserServiceImpl userServiceImpl;
    private final PurchaseRequestsService purchaseRequestsService;
    private final ItemService itemService;

    @GetMapping("user/add/pr")
    public String addPRForm(Model model) {
        log.getName();
        model.addAttribute("pr", new PurchaseRequests());
        return "addPRForm";
    }


    @PostMapping("/user/add/pr")
    public String addPR(@Valid PurchaseRequests purchaseRequests, BindingResult result, Principal principal, Model model) {
        if (result.hasErrors()) {
            return "/user/add/pr";
        }
        purchaseRequestsService.createPR(purchaseRequests);
        User user = userServiceImpl.findByUsername(principal.getName());
        List<PurchaseRequests> purchaseRequests2 = user.getPurchaseRequests();
        purchaseRequests2.add(purchaseRequests);
        userServiceImpl.updateUser(user);
        model.addAttribute("user", user);
        return "dashboard";
    }

    @GetMapping("/user/prList")
    public String showPR(Model model, Principal principal) {
        User user = userServiceImpl.findByUsername(principal.getName());
        List<PurchaseRequests> purchaseRequests = user.getPurchaseRequests();
        model.addAttribute("user", user);
        model.addAttribute("purchaseRequests", purchaseRequests);
        return "prList";
    }

    @GetMapping("/user/editPR/{id}")
    public String editPRForm(@PathVariable Long id, Model model, Principal principal) {
        User user = userServiceImpl.findByUsername(principal.getName());
        Optional<PurchaseRequests> purchaseRequestsOptional = purchaseRequestsService.getPRById(id);
        model.addAttribute("user", user);
        model.addAttribute("purchaseRequestsOptional", purchaseRequestsOptional);
        return "editPRForm";
    }

    @PostMapping("user/editPR/{id}")
    public String editSymptom(@Valid PurchaseRequests purchaseRequests, BindingResult result, Model model, Principal principal) {
        purchaseRequestsService.updatePR(purchaseRequests);
        User user = userServiceImpl.findByUsername(principal.getName());
        List<PurchaseRequests> purchaseRequests2 = user.getPurchaseRequests();
        model.addAttribute("user", user);
        model.addAttribute("purchaseRequests", purchaseRequests2);
        return "prList";
    }

    @GetMapping("user/deletePR/{id}")
    public String deletePR(@PathVariable Long id, Model model) {
        purchaseRequestsService.deletePR(id);
        List<PurchaseRequests> purchaseRequests = purchaseRequestsService.getPRs();
        model.addAttribute("purchaseRequests", purchaseRequests);
        return "dashboard";

    }

    }
