package com.ddlab.rnd.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Data
@Component
public class Employee {
    private String name;

    @Lookup
    public Address getAdrs() {
        return null;
    }
}
