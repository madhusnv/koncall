package i00;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i00.n */
/* loaded from: classes3.dex */
public abstract class AbstractC3109n {

    /* renamed from: a */
    public static Constructor f16687a;

    /* renamed from: a */
    public static Object m7452a(Method method, Class cls, Object obj, Object[] objArr) throws NoSuchMethodException, SecurityException {
        Constructor declaredConstructor = f16687a;
        if (declaredConstructor == null) {
            declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            f16687a = declaredConstructor;
        }
        return ((MethodHandles.Lookup) declaredConstructor.newInstance(cls, -1)).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }
}
