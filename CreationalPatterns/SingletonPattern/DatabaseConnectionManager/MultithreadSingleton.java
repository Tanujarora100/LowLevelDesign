package org.CreationalPatterns.SingletonPattern.DatabaseConnectionManager;

public class MultithreadSingleton implements Cloneable {
    private static volatile MultithreadSingleton instance = null;
//    In the context of the Singleton pattern, the volatile keyword is often used to ensure that the
//    Singleton instance is correctly initialized in a multithreaded environment.
//    Without the volatile keyword, there is a chance that two threads may access the Singleton instance at the same time, and
//    one of them may see a stale reference or null value if the Singleton instance has not yet been initialized.

    private MultithreadSingleton() {

    }
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public static MultithreadSingleton getInstance() {
        if (instance == null) {
            synchronized (MultithreadSingleton.class) {
                if (instance == null)
//                    Second NULL CHECK Because all Objects can pass through the first null-check.
                    instance = new MultithreadSingleton();
            }

        }
        return instance;
    }
}
