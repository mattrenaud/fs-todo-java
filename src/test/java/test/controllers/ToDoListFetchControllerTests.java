package test.controllers;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import app.models.ToDoListRepository;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = ToDoListRepository.class)
@AutoConfigureMockMvc
public class ToDoListFetchControllerTests {
	static String testId = "123";

	@Autowired
	private MockMvc mvc;

	@MockBean
	private ToDoListRepository repo;

	@Test
	public void fetchList() throws Exception {
		assertTrue(true);
	}
}