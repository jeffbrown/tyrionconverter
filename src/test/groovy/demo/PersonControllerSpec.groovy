package demo

import grails.testing.gorm.DataTest
import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class PersonControllerSpec extends Specification implements ControllerUnitTest<PersonController>, DataTest {

    void setupSpec() {
        mockDomain Person
    }

    void "test something"() {
        when:
        params.name = 'tyrion'
        controller.index()
        
        then:
        response.json.name == 'tyrion'
    }

    Set<String> getIncludePlugins() {
        ['converters']
    }
}
