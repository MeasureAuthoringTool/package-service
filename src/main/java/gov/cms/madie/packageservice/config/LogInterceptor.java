package gov.cms.madie.packageservice.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Slf4j(topic = "action_audit")
@Component
public class LogInterceptor implements HandlerInterceptor {

  @Override
  public void afterCompletion(
      HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
    final String username =
        request.getUserPrincipal() == null ? "" : request.getUserPrincipal().getName();
    log.info(
        "User [{}] called [{}] on path [{}] and got response code [{}]",
        username,
        request.getMethod(),
        request.getRequestURI(),
        response.getStatus());
  }
}
