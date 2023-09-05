package be.mbict.thymeleafwrapper

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class DemoController {

    @GetMapping("/hello")
    fun hello() = "hello"
}