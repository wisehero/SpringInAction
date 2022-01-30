package springinaction.taco.data;

import org.springframework.data.repository.CrudRepository;
import springinaction.taco.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
