package com.punyabagus.app.services;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.NewCookie;
import java.io.IOException;

/**
 * Created by prasojo on 7/22/17.
 */
public class AuthenticationFilter implements ContainerRequestFilter, ContainerResponseFilter {
    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {

    }

    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException {
        responseContext.getHeaders().add("TEST-HEADER", "Value Test Header");
        responseContext.getHeaders().add("Set-Cookie", new NewCookie("Hello", "World"));
    }
}