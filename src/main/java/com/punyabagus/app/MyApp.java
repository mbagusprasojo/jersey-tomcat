package com.punyabagus.app;

import com.punyabagus.app.services.AuthenticationFilter;
import org.glassfish.jersey.server.ResourceConfig;

/**
 * Created by prasojo on 7/22/17.
 */
public class MyApp extends ResourceConfig {
    public MyApp() {
        register(new MyAppBinder());
        register(AuthenticationFilter.class);
        packages(true, "com.punyabagus.app.services");
    }
}
