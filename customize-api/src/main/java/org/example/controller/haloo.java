package org.example.controller;

import org.springframework.context.annotation.Conditional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class haloo {
    @GetMapping("/halo")
   public Object hello(){
       return "hello";
   }
}
