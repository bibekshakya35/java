package io.github.bibekshakya35.resttdd.resource;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringJUnit4ClassRunner.class)
public class HelloResourceTest {
    private MockMvc mockMvc;
    @InjectMocks
    private HelloResource helloResource;

    @Before
    public void setUp() {
        //create instance of mockMvc
        mockMvc = MockMvcBuilders.standaloneSetup(helloResource)
                .build();
    }

    @Test
    public void whenCallHelloWorldShouldReturnCorrectResponse() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("hello world"));
    }
    @Test
    public void testHelloWorldJson() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/hello/json").accept(MediaType.APPLICATION_JSON))
            .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.title",
                        Matchers.is("Spring In Action")))
                .andExpect(MockMvcResultMatchers.jsonPath("$.page",
                        Matchers.is("12")));
    }
}
