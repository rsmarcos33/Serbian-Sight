package com.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class MyAccessDeniedHandler implements AccessDeniedHandler {

    private static final Logger logger = LoggerFactory.getLogger(MyAccessDeniedHandler.class);

    public MyAccessDeniedHandler() {
    }

    @Override
    public void handle(
            HttpServletRequest request,
            HttpServletResponse response,
            AccessDeniedException accessDeniedException) throws IOException, ServletException {
    Authentication auth = SecurityContextHolder.getContext().getAuthentication();

    if(auth != null){
        logger.info(String.format("User '%s' attempted to access the protected URL: %s", auth.getName(), request.getRequestURI()));
    }
    response.sendRedirect(request.getContextPath()+"/403");
    }

}
