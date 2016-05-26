package sfg.tutorial.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ThangN on 5/26/2016.
 */

@Controller
public class ProductController {

    private Logger logger = LoggerFactory.getLogger(ProductController.class);

    @RequestMapping("/products")
    public String getProductIndexPage(){
        logger.info(logger.getName() + "dßå" + logger.getClass() + "Loading Product Index Page");
        return "product";
    }
}
