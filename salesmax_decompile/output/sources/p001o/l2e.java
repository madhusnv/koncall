package p001o;

import java.util.ServiceConfigurationError;

/* loaded from: classes6.dex */
public abstract class l2e {
    /* renamed from: a */
    public static Object m36460a(Class cls, Class cls2) {
        try {
            return cls.asSubclass(cls2).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            throw new ServiceConfigurationError("Provider " + cls.getName() + " could not be instantiated.", e);
        }
    }
}
