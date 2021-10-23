package pl.dobaczewskiMateusz.PurchaseRequests.orders;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;


    public void createOrder(Order orderToAdd) {
        orderRepository.save(orderToAdd);
    }

    public List<Order> getOrder() {
        List<Order> orderList = orderRepository.findAll();
        return orderList;
    }

    public Optional<Order> readOrder(Long id){
        return orderRepository.findById(id);
    }

    public Order getOrderById(Long id) {
        Order orderById = orderRepository.getById(id);
        return orderById;
    }

    public void updateOrder(Order orderToUpdate) {
        orderRepository.save(orderToUpdate);
    }

    public void deleteOrder(Long id) {
        Order orderById = orderRepository.getById(id);
        if (orderById != null) {
            orderRepository.deleteById(id);
        }
    }
}
