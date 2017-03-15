package com.mkyong;

import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * Created by ghavamian on 8/27/2016.
 */


@Service
@WebService(endpointInterface = "com.mkyong.IMyService")
public class MyService implements  IMyService {


    public String helloWs(String message){
        System.out.println("message = " + message);
        return "Hello "+message;
    }



}
