package graphql4j.springframework.graphql;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ConditionalOnMissingBean(GraphiqlController.class)
@ConditionalOnProperty(name = "spring.graphiql.url")
@RestController
@RequestMapping("${spring.graphiql.url}")
public class SimpleGraphiqlController implements GraphiqlController {

  @GetMapping(produces = MediaType.TEXT_HTML_VALUE)
  public Resource graphiql() {
    return new ClassPathResource("graphiql/index.html");
  }

}
