package gov.cms.madie.packageservice.resources;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class HumanReadableControllerTest {
  @InjectMocks private HumanReadableController controller;

  @Test
  void testIndex() {
    String response = controller.index();
    assertEquals(response, "Dummy endpoint to test setups");
  }
}
