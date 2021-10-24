package pl.dobaczewskiMateusz.PurchaseRequests.requests;

import lombok.Data;
import pl.dobaczewskiMateusz.PurchaseRequests.items.Item;
import pl.dobaczewskiMateusz.PurchaseRequests.orders.Order;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class PurchaseRequests {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 2, max = 50)
    private String indication;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Item> itemList = new ArrayList<>();;
}
