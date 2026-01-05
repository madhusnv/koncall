package qi;

import a1.c0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import og.fd;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qi.b */
/* loaded from: classes.dex */
public final class C6219b {

    /* renamed from: a */
    public final String f30213a;

    /* renamed from: b */
    public final Set f30214b;

    /* renamed from: c */
    public final Set f30215c;

    /* renamed from: d */
    public final int f30216d;

    /* renamed from: e */
    public final int f30217e;

    /* renamed from: f */
    public final InterfaceC6222e f30218f;

    /* renamed from: g */
    public final Set f30219g;

    public C6219b(String str, Set set, Set set2, int i10, int i11, InterfaceC6222e interfaceC6222e, Set set3) {
        this.f30213a = str;
        this.f30214b = Collections.unmodifiableSet(set);
        this.f30215c = Collections.unmodifiableSet(set2);
        this.f30216d = i10;
        this.f30217e = i11;
        this.f30218f = interfaceC6222e;
        this.f30219g = Collections.unmodifiableSet(set3);
    }

    /* renamed from: a */
    public static C6218a m12231a(Class cls) {
        return new C6218a(cls, new Class[0]);
    }

    /* renamed from: b */
    public static C6218a m12232b(C6234q c6234q) {
        return new C6218a(c6234q, new C6234q[0]);
    }

    /* renamed from: c */
    public static C6219b m12233c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(C6234q.m12250a(cls));
        for (Class cls2 : clsArr) {
            fd.m10650a(cls2, "Null interface");
            hashSet.add(C6234q.m12250a(cls2));
        }
        return new C6219b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new c0(19, obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f30214b.toArray()) + ">{" + this.f30216d + ", type=" + this.f30217e + ", deps=" + Arrays.toString(this.f30215c.toArray()) + "}";
    }
}
