package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import p001o.ktf;

/* renamed from: androidx.fragment.app.d */
/* loaded from: classes2.dex */
public abstract class AbstractC2118d {

    /* renamed from: a */
    public static final ktf f7551a = new ktf();

    /* renamed from: b */
    public static boolean m6332b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(m6333c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static Class m6333c(ClassLoader classLoader, String str) throws ClassNotFoundException {
        ktf ktfVar = f7551a;
        ktf ktfVar2 = (ktf) ktfVar.get(classLoader);
        if (ktfVar2 == null) {
            ktfVar2 = new ktf();
            ktfVar.put(classLoader, ktfVar2);
        }
        Class cls = (Class) ktfVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        ktfVar2.put(str, cls2);
        return cls2;
    }

    /* renamed from: d */
    public static Class m6334d(ClassLoader classLoader, String str) {
        try {
            return m6333c(classLoader, str);
        } catch (ClassCastException e) {
            throw new Fragment.C2089l("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e);
        } catch (ClassNotFoundException e2) {
            throw new Fragment.C2089l("Unable to instantiate fragment " + str + ": make sure class name exists", e2);
        }
    }

    /* renamed from: a */
    public abstract Fragment mo6226a(ClassLoader classLoader, String str);
}
