package com.example.myfinder.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    public class ActeurController {

        @Autowired
        ServiceReponse serviceReponse;

        @RequestMapping(value = "/response", method = RequestMethod.GET)
        public String getResponse() {
            return serviceReponse.callResponse();
        }

        @RequestMapping(value = "/test", method = RequestMethod.GET)
        public String getResponseTest() {
            return "test";
        }


    }
