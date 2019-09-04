package micronaut.core.groovy.ast.issue;

import reactor.core.publisher.Mono;
import java.util.List;


public interface TestService {

    <T extends ListArguments> Mono<List<String>> findAll(T args);    

}
