package yw;

import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yw.a */
/* loaded from: classes3.dex */
public abstract class AbstractC8806a {

    /* renamed from: a */
    public static final Method f42476a;

    /* renamed from: b */
    public static final Method f42477b;

    static {
        Method method;
        Method method2;
        Method[] methods = Throwable.class.getMethods();
        AbstractC4154l.m8920c(methods);
        int length = methods.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            method = null;
            if (i11 >= length) {
                method2 = null;
                break;
            }
            method2 = methods[i11];
            if (AbstractC4154l.m8918a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                AbstractC4154l.m8922e(parameterTypes, "getParameterTypes(...)");
                if (AbstractC4154l.m8918a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    break;
                }
            }
            i11++;
        }
        f42476a = method2;
        int length2 = methods.length;
        while (true) {
            if (i10 >= length2) {
                break;
            }
            Method method3 = methods[i10];
            if (AbstractC4154l.m8918a(method3.getName(), "getSuppressed")) {
                method = method3;
                break;
            }
            i10++;
        }
        f42477b = method;
    }
}
