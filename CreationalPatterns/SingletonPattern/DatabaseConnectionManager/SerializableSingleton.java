package org.CreationalPatterns.SingletonPattern.DatabaseConnectionManager;

import java.io.Serializable;

public class SerializableSingleton implements Serializable {
    private static volatile SerializableSingleton instance = null;

    public static SerializableSingleton getInstance() {
        if (instance == null) {
            synchronized (SerializableSingleton.class) {
                if (instance == null)
                    instance = new SerializableSingleton();
            }

        }
        return instance;
    }
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    protected Object readResolve() {
        return instance;
    }
}
