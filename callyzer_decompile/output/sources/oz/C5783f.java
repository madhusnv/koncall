package oz;

import iz.C3391x;
import iz.InterfaceC3392y;
import iz.k0;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4154l;
import n1.AbstractC4941a;
import nz.C5197h;
import nz.C5205p;
import p020v.x0;
import r1.C6419d;
import r1.C6424i;
import r1.C6426k;
import r1.C6436u;
import r1.C6437v;
import r1.C6438w;
import rw.C6668r;
import s1.C6713h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: oz.f */
/* loaded from: classes3.dex */
public final class C5783f {

    /* renamed from: a */
    public final ArrayList f28350a;

    /* renamed from: b */
    public int f28351b;

    /* renamed from: c */
    public int f28352c;

    /* renamed from: d */
    public int f28353d;

    /* renamed from: e */
    public int f28354e;

    /* renamed from: f */
    public int f28355f;

    /* renamed from: g */
    public final Object f28356g;

    /* renamed from: h */
    public final Object f28357h;

    /* renamed from: i */
    public Object f28358i;

    public C5783f(C6426k c6426k) {
        this.f28356g = c6426k;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C6436u(0, 0));
        this.f28350a = arrayList;
        this.f28354e = -1;
        this.f28357h = new ArrayList();
        this.f28358i = C6668r.f31943a;
    }

    /* renamed from: a */
    public static C5783f m11327a(C5783f c5783f, int i10, C5197h c5197h, x0 x0Var, int i11) {
        if ((i11 & 1) != 0) {
            i10 = c5783f.f28351b;
        }
        int i12 = i10;
        if ((i11 & 2) != 0) {
            c5197h = (C5197h) c5783f.f28357h;
        }
        C5197h c5197h2 = c5197h;
        if ((i11 & 4) != 0) {
            x0Var = (x0) c5783f.f28358i;
        }
        x0 request = x0Var;
        int i13 = c5783f.f28352c;
        int i14 = c5783f.f28353d;
        int i15 = c5783f.f28354e;
        AbstractC4154l.m8923f(request, "request");
        return new C5783f((C5205p) c5783f.f28356g, c5783f.f28350a, i12, c5197h2, request, i13, i14, i15);
    }

    /* renamed from: b */
    public int m11328b() {
        return ((int) Math.sqrt((m11331e() * 1.0d) / this.f28355f)) + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    /* renamed from: c */
    public C6438w m11329c(int i10) {
        ArrayList arrayList;
        int i11 = this.f28355f;
        int i12 = i10 * i11;
        int iM11331e = m11331e() - i12;
        if (i11 > iM11331e) {
            i11 = iM11331e;
        }
        if (i11 < 0) {
            i11 = 0;
        }
        if (i11 == this.f28358i.size()) {
            arrayList = this.f28358i;
        } else {
            ArrayList arrayList2 = new ArrayList(i11);
            for (int i13 = 0; i13 < i11; i13++) {
                arrayList2.add(new C6419d(1));
            }
            this.f28358i = arrayList2;
            arrayList = arrayList2;
        }
        return new C6438w(arrayList, i12);
    }

    /* renamed from: d */
    public int m11330d(int i10) {
        if (m11331e() <= 0) {
            return 0;
        }
        if (i10 >= m11331e()) {
            AbstractC4941a.m9884a("ItemIndex > total count");
        }
        return i10 / this.f28355f;
    }

    /* renamed from: e */
    public int m11331e() {
        return ((C6426k) this.f28356g).f30986c.f3778b;
    }

    /* renamed from: f */
    public k0 m11332f(x0 request) {
        C5197h c5197h = (C5197h) this.f28357h;
        AbstractC4154l.m8923f(request, "request");
        int i10 = this.f28351b;
        ArrayList arrayList = this.f28350a;
        if (i10 >= arrayList.size()) {
            throw new IllegalStateException("Check failed.");
        }
        this.f28355f++;
        if (c5197h != null) {
            if (!c5197h.f25340c.mo9080b().mo8766g((C3391x) request.f36754b)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i10 - 1) + " must retain the same host and port").toString());
            }
            if (this.f28355f != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i10 - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i11 = i10 + 1;
        C5783f c5783fM11327a = m11327a(this, i11, null, request, 58);
        InterfaceC3392y interfaceC3392y = (InterfaceC3392y) arrayList.get(i10);
        k0 k0VarMo7804a = interfaceC3392y.mo7804a(c5783fM11327a);
        if (k0VarMo7804a == null) {
            throw new NullPointerException("interceptor " + interfaceC3392y + " returned null");
        }
        if (c5197h == null || i11 >= arrayList.size() || c5783fM11327a.f28355f == 1) {
            return k0VarMo7804a;
        }
        throw new IllegalStateException(("network interceptor " + interfaceC3392y + " must call proceed() exactly once").toString());
    }

    /* renamed from: g */
    public int m11333g(int i10) {
        C6713h c6713hM1636e = ((C6426k) this.f28356g).f30986c.m1636e(i10);
        int i11 = i10 - c6713hM1636e.f32068a;
        return (int) ((C6419d) ((C6424i) c6713hM1636e.f32070c).f30979a.invoke(C6437v.f31064a, Integer.valueOf(i11))).f30951a;
    }

    public C5783f(C5205p c5205p, ArrayList arrayList, int i10, C5197h c5197h, x0 request, int i11, int i12, int i13) {
        AbstractC4154l.m8923f(request, "request");
        this.f28356g = c5205p;
        this.f28350a = arrayList;
        this.f28351b = i10;
        this.f28357h = c5197h;
        this.f28358i = request;
        this.f28352c = i11;
        this.f28353d = i12;
        this.f28354e = i13;
    }
}
