package com.itproject.comweb.cotrollers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class ProductController {
    @GetMapping("/")
    public String product(){
        return "product";
    }
}
