package sfg.tutorial.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ThangN on 5/26/2016.
 */
@Controller
public class IndexController {

    private Logger logger = LoggerFactory.getLogger(IndexController.class);
    @RequestMapping("/")
    public String getIndexPage(){
        logger.info(logger.getName() + "C" + logger.getClass() + "Loading index page");
        return "index";
    }
}
