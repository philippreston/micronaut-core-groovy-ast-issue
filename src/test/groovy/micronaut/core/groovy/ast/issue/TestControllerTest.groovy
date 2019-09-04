package micronaut.core.groovy.ast.issue;

import io.micronaut.test.annotation.MicronautTest
import io.micronaut.test.annotation.MockBean
import javax.inject.Inject
import spock.lang.Specification

@MicronautTest
class TestControllerTest extends Specification {

    @Inject
    TestService testService

    def "test"() {
    
    }

    @MockBean(TestServiceImpl)
    TestService testService() {
        Mock(TestService)
    }
}
