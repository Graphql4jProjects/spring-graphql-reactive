package graphql4j.springframework.graphql;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.Collections;
import java.util.Map;

@ConditionalOnMissingBean(GraphqlController.class)
@RestController
@RequestMapping("${spring.graphql.url:/graphql}")
public class ReactiveGraphqlController implements GraphqlController<Mono<Map>> {

  @PostMapping
  public Mono<Map> graphql() {
    return Mono.just(Collections.emptyMap());
  }

}
