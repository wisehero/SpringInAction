package springinaction.taco.web.api;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.hateoas.server.EntityLinks;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springinaction.taco.Taco;
import springinaction.taco.data.TacoRepository;

import javax.annotation.Resources;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/design", produces = "application/json")
@CrossOrigin(origins = "*") // 서로 다른 도메인 간의 요청을 허용
@RequiredArgsConstructor
public class DesignTacoController {

    private final TacoRepository tacoRepository;
    private final EntityLinks entityLinks;


    // 하나의 타코 요청
    @GetMapping("/{id}")
    public ResponseEntity<Taco> tacoById(@PathVariable("id") Long id) {
        Optional<Taco> optTaco = tacoRepository.findById(id);
        if (optTaco.isPresent()) {
            return new ResponseEntity<>(optTaco.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    // 타코 디자인 데이터를 요청하고 저장하는 메서드
    @PostMapping(consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Taco postTaco(@RequestBody Taco taco) {
        return tacoRepository.save(taco);
    }

}
