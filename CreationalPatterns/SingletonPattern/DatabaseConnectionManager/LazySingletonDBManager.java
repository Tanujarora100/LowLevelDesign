package org.CreationalPatterns.SingletonPattern.DatabaseConnectionManager;

import java.io.Serializable;

public class LazySingletonDBManager implements Serializable {
    private static LazySingletonDBManager instance;

    private LazySingletonDBManager() {

    }

    public static LazySingletonDBManager getInstance() {
        if (instance == null)
            instance = new LazySingletonDBManager();
        return instance;
//        If Two Threads are trying to use it and both will get different objects.
//        Multithreading will not work for this class.
    }

    public void printLog() {
        System.out.println("Hello World");
    }
}
