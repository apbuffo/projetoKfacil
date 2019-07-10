package com.kfacil.cadastro.controller;
import org.springframework.http.MediaType;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.kfacil.cadastro.ApplicationTests;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClienteControllerTest extends ApplicationTests {

	private MockMvc mockMvc;
	
	@Autowired
	private ClienteController clienteController;
	
	@Before
	public void setUp() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(clienteController).build();
	}
	
	@Test
	public void consultaClienteControllerTest() throws Exception {
		this.mockMvc.perform(MockMvcRequestBuilders.get("/api/cliente")).andExpect(MockMvcResultMatchers.status().isOk());
	}
	
	@Test
    public void exclusaoClienteControllerTest() throws Exception {
        ResultMatcher ok = MockMvcResultMatchers.status().isOk();
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.delete("/api/cliente/1");
        this.mockMvc.perform(builder)
                  .andExpect(ok);
	}
	
    @Test
    public void inclusaoClienteControllerTest () throws Exception {
        ResultMatcher ok = MockMvcResultMatchers.status()
                                                .isOk();

        MockHttpServletRequestBuilder builder =
                            MockMvcRequestBuilders.post("/api/cliente")
                                                  .contentType(MediaType.APPLICATION_JSON)
                                                  .content("{ \"id\":1,\"nome\": \"João\",\"cpf\":\"867.685.588-97\",\"endereco\":\"Rua 3\"}");
    
        this.mockMvc.perform(builder)
                    .andExpect(ok);

    }
    
    @Test
    public void alteracapClienteControllerTest () throws Exception {

        MockHttpServletRequestBuilder builder =
                            MockMvcRequestBuilders.put("/api/cliente")
                            .contentType(MediaType.APPLICATION_JSON)
                            .content("{ \"id\":1,\"nome\": \"João\",\"cpf\":\"867.685.588-97\",\"endereco\":\"Rua 3\"}");;


        this.mockMvc.perform(builder)
                    .andExpect(MockMvcResultMatchers.status()
                                                    .isOk());
    }

}
