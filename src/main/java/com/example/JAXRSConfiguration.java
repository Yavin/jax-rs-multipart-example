package com.example;

import org.glassfish.jersey.media.multipart.MultiPartFeature;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/api")
public class JAXRSConfiguration extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<>();
        classes.add(MultiPartFeature.class);
        return classes;
    }
}
