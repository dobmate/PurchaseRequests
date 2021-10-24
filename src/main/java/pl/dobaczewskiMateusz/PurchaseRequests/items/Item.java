package pl.dobaczewskiMateusz.PurchaseRequests.items;


import lombok.Data;
import lombok.NoArgsConstructor;
import pl.dobaczewskiMateusz.PurchaseRequests.requests.PurchaseRequests;

import javax.persistence.*;

@Entity
@Table(name = "items")
@Data
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;

    private String title;

    private String description;

    private Integer quantity;

    @ManyToOne
    private PurchaseRequests purchaseRequests;



}
