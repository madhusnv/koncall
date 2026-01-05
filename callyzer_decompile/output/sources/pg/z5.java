package pg;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class z5 implements i0.z1 {
    /* renamed from: a */
    public static d7.w0 m11962a(Class cls) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException("Cannot create an instance of " + cls);
            }
            try {
                Object objNewInstance = declaredConstructor.newInstance(null);
                AbstractC4154l.m8920c(objNewInstance);
                return (d7.w0) objNewInstance;
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (InstantiationException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            }
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException("Cannot create an instance of " + cls, e11);
        }
    }

    /* renamed from: b */
    public abstract int m11963b(List list, i0.x1 x1Var);
}
