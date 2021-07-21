package com.example.messagingapp.controller;
import com.example.messagingapp.component.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/message")
public class MessageRestController {


    @GetMapping("/hello")
    public String helloMessage(){
        return "Hello From BridgeLabs";
    }

    @GetMapping("/helloName")
    public String sayHelloMark(@RequestParam String name){
        return "Hello " + name;
    }

    @GetMapping("/helloPath/{name}")
    public String sayHelloPath(@PathVariable String name){
        return "Hello " + name +" from BridgeLabs";
    }

    @PostMapping(path = "users")
    public String sayHelloBean(@RequestBody User user){
        return "Hello " + user.getFirstName() +" "+user.getLastName()+" from BridgeLabs";
    }

    @PutMapping("put/users/{firstName}")
    public String sayHelloPut(@PathVariable String firstName, @RequestParam String lastName){
        return "Hello " +firstName+" "+lastName+" from BridgeLabs";
    }

}

