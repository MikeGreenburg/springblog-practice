package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class HomeController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello from Spring";
    }

    @Controller
    static
    class MathController {

      @GetMapping("/{operation}/{numOne}/{numTwo}")
        @ResponseBody
        public int sum(@PathVariable String operation, @PathVariable int numOne, @PathVariable int numTwo){
          int sum = 0;
          if(operation.equals("add")){
              return numOne + numTwo;
          }
          return sum;
      }
    }
}