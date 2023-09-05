package be.mbict.thymeleafwrapper

class GroovyGreeting {
    @Delegate be.mbict.thymeleafwrapper.Greeting greeting

    def greet() {
        "Gotta say hello from " + greeting.title
    }

    @Lazy String myGreeting = greeting.title + " but now in a Groovy way"
}
