package micronaut.core.groovy.ast.issue;

import reactor.core.publisher.Mono;
import java.util.List;
import javax.inject.Singleton;

@Singleton
public class TestServiceImpl implements TestService {

    @Override
    public <T extends ListArguments> Mono<List<String>> findAll(T args) {
        return Mono.empty();
    }
}
