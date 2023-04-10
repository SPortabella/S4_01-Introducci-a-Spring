package cat.itacademy.barcelonactiva.PORTABELLASUSANA.s04.t01.n02.S04T01N02PORTABELLASUSANA.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String hello(@RequestParam(value = "name", defaultValue = "Unknown") String name) {
        return saluda(name);
    }

    @GetMapping("/HelloWorld2/{name}")
    public String hello2(@PathVariable String name) {
        return saluda2(name);
    }
    public String saluda(String nom){
        return "Hola, " + nom + ".Estàs executant un projecte Gradle";
    }

    public String saluda2(String nom) {
        return "Hola, " + nom + ".Estàs executant un projecte Gradle";
    }
}
