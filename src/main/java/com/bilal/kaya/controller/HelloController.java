package com.bilal.kaya.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class HelloController {
    // GET: We use it when we want to display data. @GetMapping
    // POST: We use it when we want to save data.  @PostMapping
    // PUT :We use it when we want to update data. @PutMapping
    // PATCH: We use it when we want to update part of data. @PatchMapping
    //   Example: like updating password
    // DELETE: We use it when we want to delete data.  @DeleteMapping


    /*@GetMapping(path="/hello")
    //@RequestMapping(path = "/hello",method = RequestMethod.GET)
    // 13 ve 14. satırdaki kodlar aynı şeyi ifade eder.ikiside kullanılabilir.Genelde getmapping kullanılır çünkü daha anlaşılır.
    // burda görüldüğü üzere @RequestMapping hem class hem de method seviyesinde kullanılabilir.
    public String sayHello(){
        return "Hello World";
    }
    @PostMapping("/save")
    public String save(){
        return "Data saved";
    }
    @DeleteMapping("/delete")
    public String delete(){
        return "Data deleted";
    }*/



    // @PathVariable'ın iki kullanımı var.ikiside görüldüğü üzere aşağıdadır.
    @GetMapping("/message/{message}")
    public String getMessage(@PathVariable String message){
        return "Your message is : "+message;
    }
    /*@GetMapping("/message/{m}")
    public String getMessage2(@PathVariable("m") String message ){
        return "Your message is : "+message;
    }*/





}
