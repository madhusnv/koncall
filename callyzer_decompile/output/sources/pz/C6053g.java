package pz;

import a2.AbstractC0030c;
import b00.InterfaceC0527l;
import b00.InterfaceC0528m;
import b00.h0;
import b2.C0554l;
import i0.m0;
import iz.C3389v;
import iz.C3391x;
import iz.d0;
import iz.f0;
import iz.i0;
import iz.j0;
import iz.k0;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import k1.j2;
import kotlin.jvm.internal.AbstractC4154l;
import kz.AbstractC4299e;
import og.fb;
import oz.AbstractC5782e;
import oz.InterfaceC5780c;
import oz.InterfaceC5781d;
import p020v.x0;
import pg.g7;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pz.g */
/* loaded from: classes3.dex */
public final class C6053g implements InterfaceC5781d {

    /* renamed from: g */
    public static final C3389v f29538g;

    /* renamed from: a */
    public final d0 f29539a;

    /* renamed from: b */
    public final InterfaceC5780c f29540b;

    /* renamed from: c */
    public final InterfaceC0528m f29541c;

    /* renamed from: d */
    public final InterfaceC0527l f29542d;

    /* renamed from: e */
    public int f29543e;

    /* renamed from: f */
    public final j2 f29544f;

    static {
        C3389v c3389v = C3389v.f17980b;
        f29538g = g7.m11657b("OkHttp-Response-Body", "Truncated");
    }

    public C6053g(d0 d0Var, InterfaceC5780c interfaceC5780c, InterfaceC0528m source, InterfaceC0527l sink) {
        AbstractC4154l.m8923f(source, "source");
        AbstractC4154l.m8923f(sink, "sink");
        this.f29539a = d0Var;
        this.f29540b = interfaceC5780c;
        this.f29541c = source;
        this.f29542d = sink;
        this.f29544f = new j2(source);
    }

    @Override // oz.InterfaceC5781d
    /* renamed from: a */
    public final long mo11313a(k0 k0Var) {
        if (!AbstractC5782e.m11322a(k0Var)) {
            return 0L;
        }
        String strM7787b = k0Var.f17922f.m7787b("Transfer-Encoding");
        if (strM7787b == null) {
            strM7787b = null;
        }
        if ("chunked".equalsIgnoreCase(strM7787b)) {
            return -1L;
        }
        return AbstractC4299e.m9016e(k0Var);
    }

    @Override // oz.InterfaceC5781d
    /* renamed from: b */
    public final void mo11314b() {
        this.f29542d.flush();
    }

    @Override // oz.InterfaceC5781d
    /* renamed from: c */
    public final boolean mo11315c() {
        return this.f29543e == 6;
    }

    @Override // oz.InterfaceC5781d
    public final void cancel() {
        this.f29540b.cancel();
    }

    @Override // oz.InterfaceC5781d
    /* renamed from: d */
    public final h0 mo11316d(x0 request, long j6) throws ProtocolException {
        AbstractC4154l.m8923f(request, "request");
        i0 i0Var = (i0) request.f36757e;
        if (i0Var != null && i0Var.mo7730c()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if ("chunked".equalsIgnoreCase(((C3389v) request.f36756d).m7787b("Transfer-Encoding"))) {
            if (this.f29543e == 1) {
                this.f29543e = 2;
                return new C6048b(this);
            }
            throw new IllegalStateException(("state: " + this.f29543e).toString());
        }
        if (j6 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f29543e == 1) {
            this.f29543e = 2;
            return new C6051e(this);
        }
        throw new IllegalStateException(("state: " + this.f29543e).toString());
    }

    @Override // oz.InterfaceC5781d
    /* renamed from: e */
    public final b00.i0 mo11317e(k0 k0Var) {
        x0 x0Var = k0Var.f17917a;
        if (!AbstractC5782e.m11322a(k0Var)) {
            return m12059j((C3391x) x0Var.f36754b, 0L);
        }
        String strM7787b = k0Var.f17922f.m7787b("Transfer-Encoding");
        if (strM7787b == null) {
            strM7787b = null;
        }
        if ("chunked".equalsIgnoreCase(strM7787b)) {
            C3391x c3391x = (C3391x) x0Var.f36754b;
            if (this.f29543e == 4) {
                this.f29543e = 5;
                return new C6049c(this, c3391x);
            }
            throw new IllegalStateException(("state: " + this.f29543e).toString());
        }
        long jM9016e = AbstractC4299e.m9016e(k0Var);
        if (jM9016e != -1) {
            return m12059j((C3391x) x0Var.f36754b, jM9016e);
        }
        C3391x url = (C3391x) x0Var.f36754b;
        if (this.f29543e != 4) {
            throw new IllegalStateException(("state: " + this.f29543e).toString());
        }
        this.f29543e = 5;
        this.f29540b.mo10171f();
        AbstractC4154l.m8923f(url, "url");
        return new C6052f(this, url);
    }

    @Override // oz.InterfaceC5781d
    /* renamed from: f */
    public final j0 mo11318f(boolean z6) throws IOException {
        j2 j2Var = this.f29544f;
        int i10 = this.f29543e;
        if (i10 != 0 && i10 != 1 && i10 != 2 && i10 != 3) {
            throw new IllegalStateException(("state: " + this.f29543e).toString());
        }
        try {
            String strMo1541C = ((InterfaceC0528m) j2Var.f20151c).mo1541C(j2Var.f20150b);
            j2Var.f20150b -= strMo1541C.length();
            C0554l c0554lM10649c = fb.m10649c(strMo1541C);
            int i11 = c0554lM10649c.f3778b;
            j0 j0Var = new j0();
            f0 protocol = (f0) c0554lM10649c.f3779c;
            AbstractC4154l.m8923f(protocol, "protocol");
            j0Var.f17900b = protocol;
            j0Var.f17901c = i11;
            j0Var.f17902d = (String) c0554lM10649c.f3780d;
            j0Var.f17904f = j2Var.m8461h().m7789j();
            if (z6 && i11 == 100) {
                return null;
            }
            if (i11 == 100) {
                this.f29543e = 3;
                return j0Var;
            }
            if (102 > i11 || i11 >= 200) {
                this.f29543e = 4;
                return j0Var;
            }
            this.f29543e = 3;
            return j0Var;
        } catch (EOFException e2) {
            throw new IOException(m0.m7378k("unexpected end of stream on ", this.f29540b.mo10173h().f17969a.f17780h.m7802g()), e2);
        }
    }

    @Override // oz.InterfaceC5781d
    /* renamed from: g */
    public final void mo11319g() {
        this.f29542d.flush();
    }

    @Override // oz.InterfaceC5781d
    /* renamed from: h */
    public final InterfaceC5780c mo11320h() {
        return this.f29540b;
    }

    @Override // oz.InterfaceC5781d
    /* renamed from: i */
    public final void mo11321i(x0 request) {
        AbstractC4154l.m8923f(request, "request");
        Proxy.Type type = this.f29540b.mo10173h().f17970b.type();
        AbstractC4154l.m8922e(type, "type(...)");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((String) request.f36755c);
        sb2.append(' ');
        C3391x c3391x = (C3391x) request.f36754b;
        if (AbstractC4154l.m8918a(c3391x.f17991a, "https") || type != Proxy.Type.HTTP) {
            String strM7797b = c3391x.m7797b();
            String strM7799d = c3391x.m7799d();
            if (strM7799d != null) {
                strM7797b = AbstractC0030c.m115f('?', strM7797b, strM7799d);
            }
            sb2.append(strM7797b);
        } else {
            sb2.append(c3391x);
        }
        sb2.append(" HTTP/1.1");
        m12060k((C3389v) request.f36756d, sb2.toString());
    }

    /* renamed from: j */
    public final C6050d m12059j(C3391x c3391x, long j6) {
        if (this.f29543e == 4) {
            this.f29543e = 5;
            return new C6050d(this, c3391x, j6);
        }
        throw new IllegalStateException(("state: " + this.f29543e).toString());
    }

    /* renamed from: k */
    public final void m12060k(C3389v headers, String requestLine) {
        AbstractC4154l.m8923f(headers, "headers");
        AbstractC4154l.m8923f(requestLine, "requestLine");
        if (this.f29543e != 0) {
            throw new IllegalStateException(("state: " + this.f29543e).toString());
        }
        InterfaceC0527l interfaceC0527l = this.f29542d;
        interfaceC0527l.mo1534N(requestLine).mo1534N("\r\n");
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            interfaceC0527l.mo1534N(headers.m7788h(i10)).mo1534N(": ").mo1534N(headers.m7790q(i10)).mo1534N("\r\n");
        }
        interfaceC0527l.mo1534N("\r\n");
        this.f29543e = 1;
    }
}
