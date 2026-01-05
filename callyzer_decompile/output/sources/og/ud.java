package og;

import bd.C0645a;
import com.sun.mail.util.AbstractC1452a;
import ec.C2003a;
import ec.C2005c;
import ec.C2011i;
import ec.InterfaceC2004b;
import ec.InterfaceC2016n;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class ud {
    /* renamed from: a */
    public static final void m10975a(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(AbstractC5601a.m11235f("index: ", i10, i11, ", size: "));
        }
    }

    /* renamed from: b */
    public static final void m10976b(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(AbstractC5601a.m11235f("index: ", i10, i11, ", size: "));
        }
    }

    /* renamed from: c */
    public static final void m10977c(int i10, int i11, int i12) {
        if (i10 < 0 || i11 > i12) {
            StringBuilder sbM4566m = AbstractC1452a.m4566m(i10, i11, "fromIndex: ", ", toIndex: ", ", size: ");
            sbM4566m.append(i12);
            throw new IndexOutOfBoundsException(sbM4566m.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(AbstractC5601a.m11235f("fromIndex: ", i10, i11, " > toIndex: "));
        }
    }

    /* renamed from: d */
    public static final Object m10978d(InterfaceC2004b interfaceC2004b, C2003a key) {
        AbstractC4154l.m8923f(interfaceC2004b, "<this>");
        AbstractC4154l.m8923f(key, "key");
        Object objMo1864e = interfaceC2004b.mo1864e(key);
        if (objMo1864e != null) {
            return objMo1864e;
        }
        throw new IllegalStateException("No instance for " + key);
    }

    /* renamed from: e */
    public static final void m10979e(InterfaceC2016n interfaceC2016n, InterfaceC2004b other) {
        AbstractC4154l.m8923f(interfaceC2016n, "<this>");
        AbstractC4154l.m8923f(other, "other");
        for (C2003a c2003a : other.mo1863c()) {
            AbstractC4154l.m8921d(c2003a, "null cannot be cast to non-null type aws.smithy.kotlin.runtime.collections.AttributeKey<kotlin.Any>");
            interfaceC2016n.mo1862b(c2003a, m10978d(other, c2003a));
        }
    }

    /* renamed from: f */
    public static final C2005c m10980f() {
        return new C2005c(C2011i.f9543a);
    }

    /* renamed from: g */
    public static final void m10981g(InterfaceC2016n interfaceC2016n, C2003a key, Object value) {
        AbstractC4154l.m8923f(interfaceC2016n, "<this>");
        AbstractC4154l.m8923f(key, "key");
        AbstractC4154l.m8923f(value, "value");
        if (interfaceC2016n.mo1861a(key)) {
            return;
        }
        interfaceC2016n.mo1862b(key, value);
    }

    /* renamed from: h */
    public static final void m10982h(C0645a c0645a, C2003a key, Object obj) {
        AbstractC4154l.m8923f(c0645a, "<this>");
        AbstractC4154l.m8923f(key, "key");
        if (obj != null) {
            m10981g(c0645a, key, obj);
        }
    }

    /* renamed from: i */
    public static final void m10983i(InterfaceC2016n interfaceC2016n, C2003a key, Object obj) {
        AbstractC4154l.m8923f(interfaceC2016n, "<this>");
        AbstractC4154l.m8923f(key, "key");
        if (obj != null) {
            interfaceC2016n.mo1862b(key, obj);
        }
    }

    /* renamed from: j */
    public static final C2005c m10984j(InterfaceC2004b interfaceC2004b) {
        AbstractC4154l.m8923f(interfaceC2004b, "<this>");
        return new C2005c(interfaceC2004b);
    }
}
