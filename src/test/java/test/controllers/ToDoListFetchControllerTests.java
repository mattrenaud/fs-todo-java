package test.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import app.controllers.ToDoListFetchController;
import app.models.ToDoList;
import app.models.ToDoListRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ToDoListFetchController.class)
@AutoConfigureMockMvc
public class ToDoListFetchControllerTests {
	static String testId = "123";

	@Autowired
	private MockMvc mvc;

	@MockBean
	private ToDoListRepository repo;

	@Before
	public void setUp() {
		Mockito.when(repo.findById(testId)).thenReturn(Optional.of(new ToDoList(testId, "example todo")));
	}

	@Test
	public void fetchList() throws Exception {
		mvc.perform(get("/todolist/{id}", testId)).andExpect(status().isOk());
	}
}