/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package com.example.BeTheChange.myapplication.backend;

import com.example.JavaJokeTeller;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.myapplication.BeTheChange.example.com",
                ownerName = "backend.myapplication.BeTheChange.example.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    /**
     * A simple endpoint method that takes a name and says Hi back
     */
    @ApiMethod(name = "getJoke")
    public MyBean getJoke(){
        JavaJokeTeller javaJokeTeller=new JavaJokeTeller();
        MyBean response = new MyBean();
        response.setData(javaJokeTeller.tellMeJoke());

        return response;
    }

}