package effective.design.pattern.singleton;

import java.io.Serializable;

public class StaticSingleton implements Serializable {
    private static final StaticSingleton INSTANCE = new StaticSingleton();

    private StaticSingleton() {}

    public static StaticSingleton getInstance() {return INSTANCE;}
    private Object readResolve(){return INSTANCE;}
}
