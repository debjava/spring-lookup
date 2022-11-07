package com.ddlab.rnd.startup;

import com.ddlab.rnd.model.EmailNotification;
import com.ddlab.rnd.model.Employee;
import com.ddlab.rnd.service.SampleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Startup {

    @Autowired
    private SampleServiceImpl service;

    @Autowired
    private Employee emp;

    @EventListener(ApplicationReadyEvent.class)
    public void startup() {
        System.out.println("===================================");
        System.out.println("Started ...");
//        System.out.println("Notification: "+service.getNotification());
//        System.out.println("Notification: "+service.getNotification());
//        System.out.println("Notification: "+service.getNotification());
        System.out.println("Employee: "+emp);
        System.out.println("Address: "+emp.getAdrs());
        System.out.println("Address: "+emp.getAdrs());
//        System.out.println("===================================");
    }
}
