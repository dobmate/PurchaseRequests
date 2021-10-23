package pl.dobaczewskiMateusz.PurchaseRequests.orders;

import lombok.Data;
import lombok.NoArgsConstructor;
import pl.dobaczewskiMateusz.PurchaseRequests.items.Item;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "orders")
@Data
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long ID;

    private LocalDate date;

    private Integer orderNo;

    private Double price;

    @ManyToMany
    private List<Item> itemList;

    public Order(LocalDate date, Integer orderNo, Double price, List<Item> itemList) {
        this.date = date;
        this.orderNo = orderNo;
        this.price = price;
        this.itemList = itemList;
    }
}
