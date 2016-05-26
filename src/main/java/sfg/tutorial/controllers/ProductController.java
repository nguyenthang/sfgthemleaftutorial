package sfg.tutorial.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ThangN on 5/26/2016.
 */

@Controller
public class ProductController {

    @RequestMapping("/products")
    public String getProductIndexPage(){
        return "product";
    }
}
