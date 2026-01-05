package p001o;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class lb9 {

    /* renamed from: a */
    public static final lb9 f33547a = new lb9();

    /* renamed from: a */
    public final dxi m36859a(Class cls) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        sq8.m48649h(cls, "modelClass");
        try {
            Object objNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            sq8.m48648g(objNewInstance, "{\n            modelClass…).newInstance()\n        }");
            return (dxi) objNewInstance;
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Cannot create an instance of " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        }
    }
}
