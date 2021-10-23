package pl.dobaczewskiMateusz.PurchaseRequests.requests;

import lombok.Data;
import pl.dobaczewskiMateusz.PurchaseRequests.orders.Order;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class PurchaseRequests {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    private List<Order> dayList;
}
