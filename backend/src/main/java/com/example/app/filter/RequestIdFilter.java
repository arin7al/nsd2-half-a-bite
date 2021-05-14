package com.example.app.filter;//package com.example.app.filter;
//
//import java.io.IOException;
//import java.util.UUID;
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import org.slf4j.MDC;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.core.annotation.Order;
//import org.springframework.stereotype.Component;
//import org.springframework.web.filter.OncePerRequestFilter;
//
///** @author https://github.com/bipinthite */
//@Component
//@Order(1)
//public class RequestIdFilter extends OncePerRequestFilter {
//
//  @Value("${middleware.requestId.header.name}")
//  private String requestIdHeader;
//
//  @Override
//  protected void doFilterInternal(
//      HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
//      throws ServletException, IOException {
//    String requestId = request.getHeader(requestIdHeader);
//    if (requestId == null || requestId.isEmpty()) {
//      requestId = generateRandomUUID();
//    }
//    response.setHeader(requestIdHeader, requestId);
//    MDC.put("requestId", requestId);
//    filterChain.doFilter(request, response);
//  }
//
//  private String generateRandomUUID() {
//    UUID uuid = UUID.randomUUID();
//    return uuid.toString();
//  }
//}
