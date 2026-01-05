package androidx.fragment.app;

import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: b */
    public static final e1.u0 f2472b = new e1.u0(0);

    /* renamed from: a */
    public final /* synthetic */ j1 f2473a;

    public b1(j1 j1Var) {
        this.f2473a = j1Var;
    }

    /* renamed from: b */
    public static Class m1117b(String str, ClassLoader classLoader) throws ClassNotFoundException {
        e1.u0 u0Var = f2472b;
        e1.u0 u0Var2 = (e1.u0) u0Var.get(classLoader);
        if (u0Var2 == null) {
            u0Var2 = new e1.u0(0);
            u0Var.put(classLoader, u0Var2);
        }
        Class cls = (Class) u0Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        u0Var2.put(str, cls2);
        return cls2;
    }

    /* renamed from: c */
    public static Class m1118c(String str, ClassLoader classLoader) {
        try {
            return m1117b(str, classLoader);
        } catch (ClassCastException e2) {
            throw new Fragment$InstantiationException(AbstractC5601a.m11238i("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e2);
        } catch (ClassNotFoundException e10) {
            throw new Fragment$InstantiationException(AbstractC5601a.m11238i("Unable to instantiate fragment ", str, ": make sure class name exists"), e10);
        }
    }

    /* renamed from: a */
    public final j0 m1119a(String str) {
        return j0.instantiate(this.f2473a.f2601w.f2708b, str, null);
    }
}
