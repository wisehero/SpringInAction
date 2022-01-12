package springinaction.taco.data;

import springinaction.taco.Taco;

public interface TacoRepository {
    Taco save(Taco design);
}
