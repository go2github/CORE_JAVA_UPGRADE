package org.upgrade.factoryDesignPattern;


import org.upgrade.model.Employee;

public class EmailCommunication implements Communication {

    @Override
    public void process(Employee e) {

        System.out.println("communication via email");
    }
}
