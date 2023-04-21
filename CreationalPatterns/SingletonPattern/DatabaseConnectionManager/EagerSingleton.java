package org.CreationalPatterns.SingletonPattern.DatabaseConnectionManager;

public class EagerSingleton {
//This means that the class definition itself is compiled at compile time
// but the creation of objects of that class occurs at runtime.
// The JVM performs dynamic memory allocation to create and manage objects at
// runtime, which allows for greater flexibility and adaptability in programming.
    private static final EagerSingleton instance= new EagerSingleton();
    private EagerSingleton()
    {}
    public static EagerSingleton getInstance()
    {
        return instance;
//        Multi-Threading can be implemented.
    }

}
