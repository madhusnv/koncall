package ia;

import a9.C0073l;
import ba.C0631a;
import bd.C0645a;
import cj.C0979e;
import ec.C2011i;
import fk.b1;
import i0.m0;
import java.io.Closeable;
import jc.i0;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4147e;
import kotlin.jvm.internal.a0;
import l1.C4327p;
import ld.C4446f;
import ld.InterfaceC4447g;
import lv.C4535g;
import na.C4979a;
import nc.C5006q;
import nc.InterfaceC4991b;
import og.bb;
import og.kf;
import og.s1;
import ox.C5770a;
import ox.EnumC5772c;
import pc.C5887o;
import pc.C5888p;
import pc.C5889q;
import qd.EnumC6183c;
import sc.C6788h;
import sc.C6793m;
import sc.C6801u;
import td.C7124a;
import ud.C7399c;
import ud.InterfaceC7411o;
import uw.InterfaceC7559c;
import wc.AbstractC7984r;
import yc.C8614c;
import yc.EnumC8616e;
import zb.AbstractC8923q;
import zb.C8911e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ia.c */
/* loaded from: classes.dex */
public final class C3211c implements Closeable {

    /* renamed from: a */
    public final C8911e f17320a;

    /* renamed from: b */
    public final InterfaceC4991b f17321b;

    /* renamed from: c */
    public final i0 f17322c;

    /* renamed from: d */
    public final boolean f17323d;

    /* renamed from: e */
    public final C4327p f17324e;

    /* renamed from: f */
    public final C3215g f17325f;

    /* renamed from: g */
    public final C3220l f17326g;

    public C3211c(C3220l c3220l) {
        long j6 = c3220l.f17354a;
        C7124a clock = (C7124a) c3220l.f17357d;
        InterfaceC7411o interfaceC7411o = (InterfaceC7411o) c3220l.f17358e;
        this.f17320a = (C8911e) c3220l.f17355b;
        InterfaceC4991b c5887o = (InterfaceC4991b) c3220l.f17356c;
        this.f17323d = c5887o == null;
        if (c5887o == null) {
            int i10 = C5887o.f28703g;
            C5888p c5888p = new C5888p();
            int i11 = C5770a.f28335d;
            EnumC5772c enumC5772c = EnumC5772c.SECONDS;
            c5888p.f28709c = bb.m10551g(1, enumC5772c);
            c5888p.f28707a = bb.m10551g(1, enumC5772c);
            c5888p.f28712f = C5006q.f24759a;
            c5887o = new C5887o(new C5889q(c5888p));
        }
        this.f17321b = c5887o;
        i0 i0Var = new i0(c5887o);
        this.f17322c = i0Var;
        this.f17324e = new C4327p(s1.m10886a(new C4979a("imds", "unknown"), null));
        C3215g c3215g = new C3215g(interfaceC7411o);
        this.f17325f = c3215g;
        AbstractC4154l.m8923f(clock, "clock");
        C3220l c3220l2 = new C3220l();
        c3220l2.f17355b = i0Var;
        c3220l2.f17356c = c3215g;
        c3220l2.f17354a = j6;
        c3220l2.f17357d = clock;
        int i12 = C5770a.f28335d;
        c3220l2.f17358e = new C7399c(bb.m10551g(120, EnumC5772c.SECONDS), clock);
        this.f17326g = c3220l2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f17323d) {
            AbstractC7984r.m15160d(this.f17321b);
        }
    }

    /* renamed from: h */
    public final Object m7556h(String str, InterfaceC7559c interfaceC7559c) {
        C4147e c4147eM8901a = a0.m8901a(qw.a0.class);
        C4147e c4147eM8901a2 = a0.m8901a(String.class);
        C0073l c0073l = new C0073l();
        InterfaceC4447g.f22179a.getClass();
        c0073l.f264a = C4446f.f22178b;
        c0073l.f265b = EnumC6183c.CLIENT;
        c0073l.f266c = C2011i.f9543a;
        c0073l.f267d = C6801u.f32317n;
        C4535g c4535g = new C4535g();
        C0645a c0645a = new C0645a();
        C0631a c0631a = new C0631a(29);
        c0645a.mo1862b(AbstractC8923q.f42886e, this.f17320a);
        c4535g.f22543g = this.f17325f;
        if (str == null) {
            throw new IllegalArgumentException("operationName is a required HTTP execution attribute");
        }
        c0645a.mo1862b(AbstractC8923q.f42882a, str);
        C0979e c0979e = new C0979e(c4535g, c0645a, C6793m.f32301a, c0631a, m0.m7390w(c0645a, AbstractC8923q.f42883b, "IMDS", c4147eM8901a, c4147eM8901a2), c0073l);
        c4535g.f22545i = new C3216h(interfaceC7559c.getContext());
        C4327p middleware = this.f17324e;
        AbstractC4154l.m8923f(middleware, "middleware");
        middleware.m9051i(c0979e);
        C3220l middleware2 = this.f17326g;
        AbstractC4154l.m8923f(middleware2, "middleware");
        middleware2.getClass();
        C6788h c6788h = (C6788h) ((C4535g) c0979e.f5802a).f22540d;
        EnumC8616e order = EnumC8616e.After;
        c6788h.getClass();
        AbstractC4154l.m8923f(order, "order");
        c6788h.m12980c(new C6788h(2, middleware2), order);
        C6788h c6788h2 = (C6788h) c4535g.f22539c;
        EnumC8616e order2 = EnumC8616e.Before;
        b1 b1Var = new b1(str, null, 1);
        c6788h2.getClass();
        AbstractC4154l.m8923f(order2, "order");
        c6788h2.m12980c(new C8614c(b1Var), order2);
        return kf.m10740e(c0979e, this.f17322c, qw.a0.f30746a, interfaceC7559c);
    }
}
