package gov.cms.madie.packageservice.resources;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.user;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(HumanReadableController.class)
@ActiveProfiles("test")
public class HumanReadableControllerMvcTest {
  @Autowired private MockMvc mockMvc;
  private static final String TEST_USER = "test-okta-user";

  @Test
  void getIndex() throws Exception {
    mockMvc.perform(get("/human-readable/").with(user(TEST_USER))).andExpect(status().isOk());
  }
}
