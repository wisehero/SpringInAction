package springinaction.taco.data;

import springinaction.taco.Order;

public interface OrderRepository {
    Order save(Order order);
}
