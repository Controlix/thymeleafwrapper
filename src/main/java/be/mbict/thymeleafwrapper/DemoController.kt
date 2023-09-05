package be.mbict.thymeleafwrapper

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class DemoController {

    @GetMapping("/hello")
    fun hello(model: Model): String {
        model.addAttribute("greeting", Greeting(title = "Salvus, visitor", salute = "Let's take some time to exchange greetings."))
        return "hello"
    }

    @GetMapping("/hello/value")
    fun helloValue(model: Model): String {
        model.addAttribute("greeting", GreetingWrapper(Greeting(title = "Salvus, visitor", salute = "Let's take some time to exchange greetings.")))
        return "hello"
    }
}

data class Greeting(
    val title: String,
    val salute: String
)

@JvmInline
value class GreetingWrapper(
    val greeting: Greeting
)