package com.test.objectAdapter;

public class Adapter  implements Target{

    Adaptee adaptee  = new Adaptee();
    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}
