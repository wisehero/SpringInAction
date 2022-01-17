package springinaction.taco.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import springinaction.taco.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {

}
