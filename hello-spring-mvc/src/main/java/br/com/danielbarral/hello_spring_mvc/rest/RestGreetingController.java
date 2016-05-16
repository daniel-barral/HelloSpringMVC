package br.com.danielbarral.hello_spring_mvc.rest;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.danielbarral.hello_spring_mvc.Greeting;

@RestController
public class RestGreetingController {
	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
    @RequestMapping("/rest/greeting")
    public Greeting greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

}
