package com.example;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import java.io.InputStream;

@Path("")
public class ExampleResource {

    @POST
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    public String postMultipartMethod(
        @FormDataParam("field") InputStream fileInputStream,
        @FormDataParam("field") FormDataContentDisposition fileMetaData
    ) {
        return "post multipart method";
    }
}
