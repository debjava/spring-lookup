package com.ddlab.rnd.service;

import com.ddlab.rnd.model.Address;
import com.ddlab.rnd.model.EmailNotification;
import com.ddlab.rnd.model.Employee;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

@Service
public class SampleServiceImpl {

//    @Autowired <== If you use @Autowired, you will always get the same instance
//    private EmailNotification notification;

    @Lookup
    public EmailNotification getNotification() {
        return null;
    }
}
