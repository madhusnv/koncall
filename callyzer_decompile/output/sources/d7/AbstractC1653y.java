package d7;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d7.y */
/* loaded from: classes.dex */
public abstract class AbstractC1653y {

    /* renamed from: a */
    public static final HashMap f8160a = new HashMap();

    /* renamed from: b */
    public static final HashMap f8161b = new HashMap();

    /* renamed from: a */
    public static void m5363a(Constructor constructor, InterfaceC1648t interfaceC1648t) {
        try {
            AbstractC4154l.m8920c(constructor.newInstance(interfaceC1648t));
            throw new ClassCastException();
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0141 A[SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m5364b(java.lang.Class r13) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.AbstractC1653y.m5364b(java.lang.Class):int");
    }
}
