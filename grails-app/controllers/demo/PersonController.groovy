package demo

import grails.converters.JSON

class PersonController {

    def index(String name) {
        Person p = new Person(name: name)
        
        render p as JSON 
    }
}
