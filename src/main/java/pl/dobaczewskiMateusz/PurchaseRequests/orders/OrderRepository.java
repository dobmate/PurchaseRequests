package pl.dobaczewskiMateusz.PurchaseRequests.orders;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
