package kotlin.jvm.internal;

import dx.AbstractC1851a;
import ex.InterfaceC2137a;
import ex.InterfaceC2138b;
import ex.InterfaceC2139c;
import ex.InterfaceC2140d;
import ex.InterfaceC2141e;
import ex.InterfaceC2142f;
import ex.InterfaceC2143g;
import ex.InterfaceC2144h;
import ex.InterfaceC2145i;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import lx.InterfaceC4564c;
import nx.AbstractC5178p;
import og.pe;
import qw.C6361k;
import rw.AbstractC6664n;
import rw.AbstractC6674x;
import s2.InterfaceC6733b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kotlin.jvm.internal.e */
/* loaded from: classes3.dex */
public final class C4147e implements InterfaceC4564c, InterfaceC4146d {

    /* renamed from: b */
    public static final Map f21156b;

    /* renamed from: a */
    public final Class f21157a;

    static {
        List listM10834i = pe.m10834i(InterfaceC2137a.class, InterfaceC2139c.class, InterfaceC2141e.class, InterfaceC2142f.class, InterfaceC2143g.class, InterfaceC2144h.class, InterfaceC2145i.class, InterfaceC6733b.class, InterfaceC6733b.class, InterfaceC6733b.class, InterfaceC6733b.class, InterfaceC6733b.class, InterfaceC2138b.class, InterfaceC6733b.class, InterfaceC6733b.class, InterfaceC6733b.class, InterfaceC6733b.class, InterfaceC6733b.class, InterfaceC6733b.class, InterfaceC6733b.class, InterfaceC6733b.class, InterfaceC6733b.class, InterfaceC2140d.class);
        ArrayList arrayList = new ArrayList(AbstractC6664n.m12768r(listM10834i, 10));
        int i10 = 0;
        for (Object obj : listM10834i) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                pe.m10842q();
                throw null;
            }
            arrayList.add(new C6361k((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f21156b = AbstractC6674x.m12784l(arrayList);
    }

    public C4147e(Class jClass) {
        AbstractC4154l.m8923f(jClass, "jClass");
        this.f21157a = jClass;
    }

    @Override // kotlin.jvm.internal.InterfaceC4146d
    /* renamed from: a */
    public final Class mo8903a() {
        return this.f21157a;
    }

    /* renamed from: b */
    public final String m8913b() {
        String strM8908e;
        Class jClass = this.f21157a;
        AbstractC4154l.m8923f(jClass, "jClass");
        String strConcat = null;
        if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
            return null;
        }
        if (!jClass.isArray()) {
            String strM8908e2 = d0.m8908e(jClass.getName());
            return strM8908e2 == null ? jClass.getCanonicalName() : strM8908e2;
        }
        Class<?> componentType = jClass.getComponentType();
        if (componentType.isPrimitive() && (strM8908e = d0.m8908e(componentType.getName())) != null) {
            strConcat = strM8908e.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    /* renamed from: c */
    public final String m8914c() {
        String strM8911h;
        Class jClass = this.f21157a;
        AbstractC4154l.m8923f(jClass, "jClass");
        String strConcat = null;
        if (jClass.isAnonymousClass()) {
            return null;
        }
        if (!jClass.isLocalClass()) {
            if (!jClass.isArray()) {
                String strM8911h2 = d0.m8911h(jClass.getName());
                return strM8911h2 == null ? jClass.getSimpleName() : strM8911h2;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (strM8911h = d0.m8911h(componentType.getName())) != null) {
                strConcat = strM8911h.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = jClass.getSimpleName();
        Method enclosingMethod = jClass.getEnclosingMethod();
        if (enclosingMethod != null) {
            return AbstractC5178p.a0(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return AbstractC5178p.m10115Z('$', simpleName, simpleName);
        }
        return AbstractC5178p.a0(simpleName, enclosingConstructor.getName() + '$');
    }

    /* renamed from: d */
    public final boolean m8915d(Object obj) {
        Class jClass = this.f21157a;
        AbstractC4154l.m8923f(jClass, "jClass");
        Map map = f21156b;
        AbstractC4154l.m8921d(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(jClass);
        if (num != null) {
            return d0.m8909f(num.intValue(), obj);
        }
        if (jClass.isPrimitive()) {
            jClass = AbstractC1851a.m5484c(a0.m8901a(jClass));
        }
        return jClass.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C4147e) && AbstractC1851a.m5484c(this).equals(AbstractC1851a.m5484c((InterfaceC4564c) obj));
    }

    public final int hashCode() {
        return AbstractC1851a.m5484c(this).hashCode();
    }

    public final String toString() {
        return this.f21157a.toString() + " (Kotlin reflection is not available)";
    }
}
