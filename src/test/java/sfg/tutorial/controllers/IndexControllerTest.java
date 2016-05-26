package sfg.tutorial.controllers;

import org.junit.Before;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.*;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Created by thangnguyen-imac on 5/26/16.
 */
public class IndexControllerTest {

    private MockMvc mockMvc;

    private IndexController indexController;

    @Before
    public void setup(){
        indexController = new IndexController();
        mockMvc = MockMvcBuilders.standaloneSetup(indexController).build();
    }

    public void testIndex() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("index"));
    }
}
