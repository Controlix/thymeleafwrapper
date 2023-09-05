package be.mbict.thymeleafwrapper

class GroovyGreeting {
    @Delegate be.mbict.thymeleafwrapper.Greeting greeting

    def greet() {
        "Gotta say hello from " + greeting.title
    }
}
