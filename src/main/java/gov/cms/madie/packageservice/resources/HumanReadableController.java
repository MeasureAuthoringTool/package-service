package gov.cms.madie.packageservice.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/human-readable")
public class HumanReadableController {
  @GetMapping("/")
  public String index() {
    return "Dummy endpoint to test setup";
  }
}
