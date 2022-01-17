package springinaction.taco.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import springinaction.taco.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {

}
