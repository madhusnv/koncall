package tc;

import ad.C0104k;
import ad.C0109p;
import java.util.LinkedHashMap;
import java.util.Map;
import jc.AbstractC3745u;
import jc.C3733i;
import jc.C3734j;
import jc.C3736l;
import jc.C3737m;
import jc.C3743s;
import jc.InterfaceC3732h;
import jc.InterfaceC3738n;
import jc.e0;
import kotlin.jvm.internal.AbstractC4154l;
import og.yd;
import pg.AbstractC5927h;
import ud.InterfaceC7400d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tc.b */
/* loaded from: classes.dex */
public final class C7117b implements InterfaceC7400d {

    /* renamed from: a */
    public e0 f34310a;

    /* renamed from: b */
    public final C0104k f34311b;

    /* renamed from: c */
    public final C3733i f34312c;

    /* renamed from: d */
    public AbstractC3745u f34313d;

    /* renamed from: e */
    public final C3733i f34314e;

    public C7117b(e0 e0Var, C0104k c0104k, C3733i c3733i, AbstractC3745u abstractC3745u, C3733i c3733i2) {
        this.f34310a = e0Var;
        this.f34311b = c0104k;
        this.f34312c = c3733i;
        this.f34313d = abstractC3745u;
        this.f34314e = c3733i2;
    }

    /* renamed from: a */
    public final C7123h m13401a() {
        InterfaceC3738n interfaceC3738nM8274N;
        InterfaceC3732h c3734j;
        e0 e0Var = this.f34310a;
        C0109p c0109pM293a = this.f34311b.m293a();
        C3733i c3733i = this.f34312c;
        if (((Map) c3733i.f482a).isEmpty()) {
            InterfaceC3738n.f19595b.getClass();
            interfaceC3738nM8274N = C3737m.f19594c;
        } else {
            interfaceC3738nM8274N = c3733i.m8274N();
        }
        AbstractC3745u abstractC3745u = this.f34313d;
        C3733i c3733i2 = this.f34314e;
        if (((Map) c3733i2.f482a).isEmpty()) {
            InterfaceC3732h.f19567a.getClass();
            c3734j = C3736l.f19593c;
        } else {
            Map values = (Map) c3733i2.f482a;
            AbstractC4154l.m8923f(values, "values");
            c3734j = new C3734j(values);
        }
        return AbstractC5927h.m11669a(e0Var, c0109pM293a, interfaceC3738nM8274N, abstractC3745u, c3734j);
    }

    /* renamed from: b */
    public final void m13402b(e0 e0Var) {
        AbstractC4154l.m8923f(e0Var, "<set-?>");
        this.f34310a = e0Var;
    }

    @Override // ud.InterfaceC7400d
    /* renamed from: m */
    public final Object mo296m() {
        e0 e0Var = this.f34310a;
        C0104k c0104kM294b = this.f34311b.mo296m();
        LinkedHashMap linkedHashMapM11067a = yd.m11067a((Map) this.f34312c.f482a);
        C3733i c3733i = new C3733i(1);
        ((Map) c3733i.f482a).putAll(linkedHashMapM11067a);
        AbstractC3745u abstractC3745u = this.f34313d;
        LinkedHashMap linkedHashMapM11067a2 = yd.m11067a((Map) this.f34314e.f482a);
        C3733i c3733i2 = new C3733i(0);
        ((Map) c3733i2.f482a).putAll(linkedHashMapM11067a2);
        return new C7117b(e0Var, c0104kM294b, c3733i, abstractC3745u, c3733i2);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HttpRequestBuilder(method=" + this.f34310a + ", url=" + this.f34311b + ", headers=" + this.f34312c + ", body=" + this.f34313d + ", trailingHeaders=" + this.f34314e + ')');
        return sb2.toString();
    }

    public C7117b() {
        this(e0.GET, new C0104k(), new C3733i(1), C3743s.f19596a, new C3733i(0));
    }
}
