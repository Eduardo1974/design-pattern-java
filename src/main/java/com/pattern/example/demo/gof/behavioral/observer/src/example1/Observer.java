package com.pattern.example.demo.gof.behavioral.observer.src.example1;

public interface Observer {

    //method to update the observer, used by subject
    void update();

    //attach with subject to observe
    void setSubject(Subject sub);
}
