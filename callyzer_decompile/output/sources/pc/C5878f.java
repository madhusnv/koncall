package pc;

import au.C0448l;
import aw.C0471k;
import com.google.android.gms.internal.measurement.d4;
import er.C2123w;
import iz.AbstractC3386s;
import iz.C3382o;
import iz.C3388u;
import iz.C3391x;
import iz.f0;
import iz.i0;
import iz.k0;
import iz.n0;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayDeque;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.a0;
import ld.C4446f;
import ld.InterfaceC4447g;
import nc.AbstractC4993d;
import nd.C5015f;
import nd.InterfaceC5016g;
import nf.C5047i;
import nz.C5205p;
import nz.C5206q;
import nz.C5207r;
import oc.C5335b;
import og.ad;
import og.bb;
import og.pb;
import og.u1;
import ox.AbstractC5773d;
import ox.C5770a;
import ox.C5774e;
import ox.EnumC5772c;
import p020v.x0;
import pg.w9;
import qd.C6185e;
import qd.C6186f;
import qd.EnumC6183c;
import qd.EnumC6184d;
import qd.InterfaceC6187g;
import uw.InterfaceC7564h;
import zc.C8924a;
import zc.InterfaceC8929f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pc.f */
/* loaded from: classes.dex */
public final class C5878f extends AbstractC3386s {

    /* renamed from: b */
    public final C5047i f28665b;

    /* renamed from: c */
    public final InterfaceC8929f f28666c;

    /* renamed from: d */
    public final C3382o f28667d;

    /* renamed from: e */
    public final C5335b f28668e;

    /* renamed from: f */
    public final C6185e f28669f;

    /* renamed from: g */
    public final InterfaceC5016g f28670g;

    /* renamed from: h */
    public C5774e f28671h;

    /* renamed from: i */
    public boolean f28672i;

    /* renamed from: j */
    public long f28673j;

    /* renamed from: k */
    public boolean f28674k;

    /* renamed from: l */
    public C5774e f28675l;

    /* renamed from: m */
    public C5774e f28676m;

    public C5878f(C5047i c5047i, InterfaceC8929f hr2, C3382o c3382o, C5335b c5335b, C5205p c5205p) {
        InterfaceC4447g interfaceC4447gM3227a;
        InterfaceC5016g interfaceC5016gM10949h;
        AbstractC4154l.m8923f(hr2, "hr");
        this.f28665b = c5047i;
        this.f28666c = hr2;
        this.f28667d = c3382o;
        this.f28668e = c5335b;
        x0 x0Var = c5205p.f25360b;
        C5893u c5893u = (C5893u) x0Var.m14479O(C5893u.class);
        if (c5893u != null) {
            interfaceC4447gM3227a = d4.m3227a(c5893u.f28722b);
        } else {
            InterfaceC4447g.f22179a.getClass();
            interfaceC4447gM3227a = C4446f.f22178b;
        }
        interfaceC4447gM3227a.mo9307c().getClass();
        EnumC6183c spanKind = EnumC6183c.INTERNAL;
        AbstractC4154l.m8923f(spanKind, "spanKind");
        InterfaceC6187g.Q0.getClass();
        this.f28669f = C6186f.f30145b;
        C5893u c5893u2 = (C5893u) x0Var.m14479O(C5893u.class);
        if (c5893u2 != null) {
            InterfaceC7564h interfaceC7564h = c5893u2.f28722b;
            String strM8913b = a0.m8901a(C5887o.class).m8913b();
            if (strM8913b == null) {
                throw new IllegalArgumentException("logger<T> cannot be used on an anonymous object");
            }
            interfaceC5016gM10949h = u1.m10949h(interfaceC7564h, strM8913b);
        } else {
            if (a0.m8901a(C5887o.class).m8913b() == null) {
                throw new IllegalArgumentException("getLogger<T> cannot be used on an anonymous object");
            }
            interfaceC5016gM10949h = C5015f.f24766a;
        }
        this.f28670g = interfaceC5016gM10949h;
        int i10 = C5770a.f28335d;
        this.f28673j = bb.m10551g(0, EnumC5772c.SECONDS);
    }

    @Override // iz.AbstractC3386s
    /* renamed from: A */
    public final void mo7757A(C5205p c5205p, C3388u c3388u) {
        this.f28670g.mo330g(null, new C2123w(6, c3388u));
    }

    @Override // iz.AbstractC3386s
    /* renamed from: B */
    public final void mo7758B(C5205p c5205p) {
        this.f28670g.mo330g(null, new C5874b(14));
    }

    @Override // iz.AbstractC3386s
    /* renamed from: a */
    public final void mo7759a(C5205p c5205p, k0 cachedResponse) {
        AbstractC4154l.m8923f(cachedResponse, "cachedResponse");
        this.f28670g.mo330g(null, new C5874b(0));
    }

    @Override // iz.AbstractC3386s
    /* renamed from: b */
    public final void mo7760b(C5205p c5205p, k0 k0Var) {
        this.f28670g.mo330g(null, new C5874b(1));
    }

    @Override // iz.AbstractC3386s
    /* renamed from: c */
    public final void mo7761c(C5205p c5205p) {
        int size;
        C5335b c5335b = this.f28668e;
        C3382o c3382o = this.f28667d;
        synchronized (c3382o) {
            size = ((ArrayDeque) c3382o.f17966d).size();
        }
        do {
        } while (!C5335b.f26235t.compareAndSet(c5335b, c5335b.f26241e, size));
        long jM7755i = c3382o.m7755i();
        while (true) {
            long j6 = jM7755i;
            if (C5335b.f26236v.compareAndSet(c5335b, c5335b.f26242f, jM7755i)) {
                this.f28670g.mo330g(null, new C5874b(2));
                this.f28669f.getClass();
                return;
            }
            jM7755i = j6;
        }
    }

    @Override // iz.AbstractC3386s
    /* renamed from: d */
    public final void mo7762d(C5205p c5205p, IOException iOException) {
        int size;
        C5335b c5335b = this.f28668e;
        C3382o c3382o = this.f28667d;
        synchronized (c3382o) {
            size = ((ArrayDeque) c3382o.f17966d).size();
        }
        do {
        } while (!C5335b.f26235t.compareAndSet(c5335b, c5335b.f26241e, size));
        long jM7755i = c3382o.m7755i();
        while (true) {
            long j6 = jM7755i;
            if (C5335b.f26236v.compareAndSet(c5335b, c5335b.f26242f, jM7755i)) {
                this.f28670g.mo330g(iOException, new C5874b(3));
                C6185e c6185e = this.f28669f;
                ad.m10529a(c6185e, iOException);
                c6185e.m12208h(EnumC6184d.ERROR);
                return;
            }
            jM7755i = j6;
        }
    }

    @Override // iz.AbstractC3386s
    /* renamed from: e */
    public final void mo7763e(C5205p c5205p) {
        int size;
        this.f28671h = new C5774e(AbstractC5773d.m11305c());
        C5335b c5335b = this.f28668e;
        C3382o c3382o = this.f28667d;
        synchronized (c3382o) {
            size = ((ArrayDeque) c3382o.f17966d).size();
        }
        do {
        } while (!C5335b.f26235t.compareAndSet(c5335b, c5335b.f26241e, size));
        long jM7755i = c3382o.m7755i();
        while (true) {
            long j6 = jM7755i;
            if (C5335b.f26236v.compareAndSet(c5335b, c5335b.f26242f, jM7755i)) {
                this.f28670g.mo330g(null, new C5874b(4));
                return;
            }
            jM7755i = j6;
        }
    }

    @Override // iz.AbstractC3386s
    /* renamed from: f */
    public final void mo7764f(C5205p c5205p) {
        this.f28670g.mo330g(null, new C5874b(5));
    }

    @Override // iz.AbstractC3386s
    /* renamed from: g */
    public final void mo7765g(C5205p c5205p, InetSocketAddress inetSocketAddress, Proxy proxy, f0 f0Var) {
        AbstractC4154l.m8923f(inetSocketAddress, "inetSocketAddress");
        this.f28670g.mo330g(null, new C0448l(4, inetSocketAddress, proxy, f0Var));
    }

    @Override // iz.AbstractC3386s
    /* renamed from: h */
    public final void mo7766h(C5205p c5205p, InetSocketAddress inetSocketAddress, Proxy proxy, IOException iOException) {
        AbstractC4154l.m8923f(inetSocketAddress, "inetSocketAddress");
        this.f28670g.mo330g(iOException, new C5875c(inetSocketAddress, proxy, 0));
        InetAddress address = inetSocketAddress.getAddress();
        AbstractC4154l.m8922e(address, "getAddress(...)");
        w9.m11918i(address);
        ((C8924a) this.f28666c).getClass();
    }

    @Override // iz.AbstractC3386s
    /* renamed from: i */
    public final void mo7767i(C5205p c5205p, InetSocketAddress inetSocketAddress, Proxy proxy) {
        AbstractC4154l.m8923f(inetSocketAddress, "inetSocketAddress");
        this.f28670g.mo330g(null, new C5875c(inetSocketAddress, proxy, 1));
    }

    @Override // iz.AbstractC3386s
    /* renamed from: j */
    public final void mo7768j(C5205p c5205p, C5206q connection) {
        AbstractC4154l.m8923f(connection, "connection");
        C5335b c5335b = this.f28668e;
        C5047i c5047i = this.f28665b;
        do {
        } while (!C5335b.f26234s.compareAndSet(c5335b, c5335b.f26239c, ((C5207r) c5047i.f24823b).f25402g.size()));
        long jM9978I = c5047i.m9978I();
        while (true) {
            long j6 = jM9978I;
            if (C5335b.f26233r.compareAndSet(c5335b, c5335b.f26238b, jM9978I)) {
                break;
            } else {
                jM9978I = j6;
            }
        }
        C5774e c5774e = this.f28671h;
        if (c5774e == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (!this.f28672i) {
            this.f28672i = true;
            long jM11306a = C5774e.m11306a(c5774e.f28340a);
            this.f28673j = jM11306a;
            pb.m10822d(c5335b.f26244h, jM11306a, null, 6);
        }
        if (!this.f28674k) {
            this.f28674k = true;
            C5774e c5774e2 = this.f28675l;
            pb.m10822d(c5335b.f26243g, c5774e2 != null ? C5774e.m11306a(c5774e2.f28340a) : C5770a.m11299j(C5774e.m11306a(c5774e.f28340a), C5770a.m11304o(this.f28673j)), null, 6);
        }
        this.f28670g.mo330g(null, new C5876d(System.identityHashCode(connection), connection, this, 0));
    }

    @Override // iz.AbstractC3386s
    /* renamed from: k */
    public final void mo7769k(C5205p c5205p, C5206q connection) {
        AbstractC4154l.m8923f(connection, "connection");
        C5335b c5335b = this.f28668e;
        C5047i c5047i = this.f28665b;
        do {
        } while (!C5335b.f26234s.compareAndSet(c5335b, c5335b.f26239c, ((C5207r) c5047i.f24823b).f25402g.size()));
        long jM9978I = c5047i.m9978I();
        while (true) {
            long j6 = jM9978I;
            if (C5335b.f26233r.compareAndSet(c5335b, c5335b.f26238b, jM9978I)) {
                this.f28670g.mo330g(null, new C5876d(System.identityHashCode(connection), connection, this, 1));
                return;
            }
            jM9978I = j6;
        }
    }

    @Override // iz.AbstractC3386s
    /* renamed from: l */
    public final void mo7770l(C5205p c5205p, String str, List list) {
        this.f28670g.mo330g(null, new C0471k(6, str, list));
    }

    @Override // iz.AbstractC3386s
    /* renamed from: m */
    public final void mo7771m(C5205p c5205p, String str) {
        this.f28675l = new C5774e(AbstractC5773d.m11305c());
        if (!this.f28672i) {
            C5774e c5774e = this.f28671h;
            if (c5774e == null) {
                throw new IllegalStateException("Required value was null.");
            }
            long jM11306a = C5774e.m11306a(c5774e.f28340a);
            this.f28673j = jM11306a;
            pb.m10822d(this.f28668e.f26244h, jM11306a, null, 6);
            this.f28672i = true;
        }
        this.f28670g.mo330g(null, new C2123w(3, str));
    }

    @Override // iz.AbstractC3386s
    /* renamed from: n */
    public final void mo7772n(C5205p c5205p, C3391x url, List list) {
        AbstractC4154l.m8923f(url, "url");
        this.f28670g.mo330g(null, new C0471k(7, url, list));
    }

    @Override // iz.AbstractC3386s
    /* renamed from: o */
    public final void mo7773o(C5205p c5205p, C3391x url) {
        AbstractC4154l.m8923f(url, "url");
        this.f28670g.mo330g(null, new C2123w(4, url));
    }

    @Override // iz.AbstractC3386s
    /* renamed from: p */
    public final void mo7774p(C5205p c5205p, long j6) {
        this.f28676m = new C5774e(AbstractC5773d.m11305c());
        this.f28670g.mo330g(null, new C5877e(0, j6));
    }

    @Override // iz.AbstractC3386s
    /* renamed from: q */
    public final void mo7775q(C5205p c5205p) {
        this.f28670g.mo330g(null, new C5874b(6));
    }

    @Override // iz.AbstractC3386s
    /* renamed from: r */
    public final void mo7776r(C5205p c5205p, IOException ioe) {
        AbstractC4154l.m8923f(ioe, "ioe");
        this.f28670g.mo330g(ioe, new C5874b(7));
    }

    @Override // iz.AbstractC3386s
    /* renamed from: s */
    public final void mo7777s(C5205p c5205p, x0 request) {
        AbstractC4154l.m8923f(request, "request");
        if (((i0) request.f36757e) == null) {
            this.f28676m = new C5774e(AbstractC5773d.m11305c());
        }
        this.f28670g.mo330g(null, new C5874b(8));
    }

    @Override // iz.AbstractC3386s
    /* renamed from: t */
    public final void mo7778t(C5205p c5205p) {
        this.f28670g.mo330g(null, new C5874b(9));
    }

    @Override // iz.AbstractC3386s
    /* renamed from: u */
    public final void mo7779u(C5205p c5205p, long j6) {
        this.f28670g.mo330g(null, new C5877e(1, j6));
    }

    @Override // iz.AbstractC3386s
    /* renamed from: v */
    public final void mo7780v(C5205p c5205p) {
        this.f28670g.mo330g(null, new C5874b(10));
    }

    @Override // iz.AbstractC3386s
    /* renamed from: w */
    public final void mo7781w(C5205p c5205p, IOException ioe) {
        AbstractC4154l.m8923f(ioe, "ioe");
        this.f28670g.mo330g(ioe, new C5874b(11));
    }

    @Override // iz.AbstractC3386s
    /* renamed from: x */
    public final void mo7782x(C5205p c5205p, k0 k0Var) {
        n0 n0Var = k0Var.f17923g;
        this.f28670g.mo330g(null, new C2123w(5, n0Var != null ? Long.valueOf(n0Var.mo7460h()) : null));
    }

    @Override // iz.AbstractC3386s
    /* renamed from: y */
    public final void mo7783y(C5205p c5205p) {
        C5774e c5774e = this.f28676m;
        if (c5774e != null) {
            long jM11306a = C5774e.m11306a(c5774e.f28340a);
            pb.m10822d(this.f28668e.f26251q, jM11306a, null, 6);
            C5893u c5893u = (C5893u) c5205p.f25360b.m14479O(C5893u.class);
            if (c5893u != null) {
                c5893u.f28721a.mo1862b(AbstractC4993d.f24735a, new C5770a(jM11306a));
            }
        }
        this.f28670g.mo330g(null, new C5874b(12));
    }

    @Override // iz.AbstractC3386s
    /* renamed from: z */
    public final void mo7784z(C5205p c5205p, k0 k0Var) {
        this.f28670g.mo330g(null, new C5874b(13));
    }
}
