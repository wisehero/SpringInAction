package springinaction.taco.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import springinaction.taco.Taco;

public interface TacoRepository extends CrudRepository<Taco, Long> {

}
