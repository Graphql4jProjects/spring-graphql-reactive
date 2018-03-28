package graphql4j.springframework.graphql;

import graphql4j.springframework.graphql.stereotype.GraphqlRepository;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Map;

public class GraphqlContext implements ApplicationContextAware, InitializingBean {

    private ApplicationContext applicationContext;

    @Override
    public void afterPropertiesSet() throws Exception {
        final Map<String, Object> queries = applicationContext.getBeansWithAnnotation(GraphqlRepository.class);
        for (Object o : queries.values()) {

        }
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
