/*
 * This Spock specification was generated by the Gradle 'init' task.
 */
import spock.lang.Specification

class AppTest extends Specification {
    def "application has a greeting"() {
        setup:
        def app = new A()

        when:
        def result = app.greeting

        then:
        result != null
    }
}
