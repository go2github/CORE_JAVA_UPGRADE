package org.upgrade.factoryDesignPattern;


import org.upgrade.model.Employee;

public class MobileCommunication implements Communication{
    @Override
    public void process(Employee e) {
        System.out.println("communication via mobile number");
    }
}
