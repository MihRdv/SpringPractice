package com.mihrdv.RestPractice;

import org.springframework.web.bind.annotation.*;

@RestController
public class PracticeController {

    @GetMapping("/message")
    public String printMessage(){
        return "This is a practice app";
    }

    @PostMapping("/post")
    public String post(@RequestBody String message){
        return "Request accepted. Message is : "+ message;
    }

    @PostMapping("/post-order")
    public String post(@RequestBody Order order){
        return "Request accepted. Order is : "+ order.toString();
    }

    @PostMapping("/post-orderRecord")
    public String post(@RequestBody OrderRecord order){
        return "Request accepted. Order is : "+ order.toString();
    }

    @GetMapping("/greet/{user-name}")
    public String greet(
            @PathVariable("user-name") String userName
    ){
        return "Good evening "+ userName;
    }
}
