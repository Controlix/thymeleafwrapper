package be.mbict.thymeleafwrapper

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class GroovyController {

    @GetMapping("/hello/groovy")
    def helloGroovy(Model model) {
        def greeting = new Greeting("Groovy, baby", "I almost lost my mojo!")
        def groovyGreeting = new GroovyGreeting(greeting: greeting)
        model.addAttribute("greeting", groovyGreeting)
        model.addAttribute("groovy", true)
        return "hello"
    }

}
