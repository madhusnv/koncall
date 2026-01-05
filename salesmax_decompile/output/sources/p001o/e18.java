package p001o;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import org.apache.http.message.TokenParser;
import org.apache.http.protocol.HTTP;
import p001o.el6;
import p001o.zqe;

/* loaded from: classes6.dex */
public final class e18 implements el6 {

    /* renamed from: h */
    public static final C13074d f20732h = new C13074d(null);

    /* renamed from: a */
    public final hac f20733a;

    /* renamed from: b */
    public final el6.InterfaceC13212a f20734b;

    /* renamed from: c */
    public final im1 f20735c;

    /* renamed from: d */
    public final gm1 f20736d;

    /* renamed from: e */
    public int f20737e;

    /* renamed from: f */
    public final zx7 f20738f;

    /* renamed from: g */
    public wx7 f20739g;

    /* renamed from: o.e18$a */
    public abstract class AbstractC13071a implements lzf {

        /* renamed from: a */
        public final vf7 f20740a;

        /* renamed from: b */
        public boolean f20741b;

        public AbstractC13071a() {
            this.f20740a = new vf7(e18.this.f20735c.timeout());
        }

        @Override // p001o.lzf
        public long N0(rl1 rl1Var, long j) throws IOException {
            sq8.m48649h(rl1Var, "sink");
            try {
                return e18.this.f20735c.N0(rl1Var, j);
            } catch (IOException e) {
                e18.this.mo24076f().mo25204c();
                m24089c();
                throw e;
            }
        }

        /* renamed from: a */
        public final boolean m24088a() {
            return this.f20741b;
        }

        /* renamed from: c */
        public final void m24089c() {
            if (e18.this.f20737e == 6) {
                return;
            }
            if (e18.this.f20737e == 5) {
                e18.this.m24080s(this.f20740a);
                e18.this.f20737e = 6;
            } else {
                throw new IllegalStateException("state: " + e18.this.f20737e);
            }
        }

        /* renamed from: d */
        public final void m24090d(boolean z) {
            this.f20741b = z;
        }

        @Override // p001o.lzf
        public nmh timeout() {
            return this.f20740a;
        }
    }

    /* renamed from: o.e18$b */
    public final class C13072b implements dvf {

        /* renamed from: a */
        public final vf7 f20743a;

        /* renamed from: b */
        public boolean f20744b;

        public C13072b() {
            this.f20743a = new vf7(e18.this.f20736d.timeout());
        }

        @Override // p001o.dvf
        public void M0(rl1 rl1Var, long j) {
            sq8.m48649h(rl1Var, "source");
            if (!(!this.f20744b)) {
                throw new IllegalStateException("closed".toString());
            }
            if (j == 0) {
                return;
            }
            e18.this.f20736d.t2(j);
            e18.this.f20736d.n0("\r\n");
            e18.this.f20736d.M0(rl1Var, j);
            e18.this.f20736d.n0("\r\n");
        }

        @Override // p001o.dvf, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f20744b) {
                return;
            }
            this.f20744b = true;
            e18.this.f20736d.n0("0\r\n\r\n");
            e18.this.m24080s(this.f20743a);
            e18.this.f20737e = 3;
        }

        @Override // p001o.dvf, java.io.Flushable
        public synchronized void flush() {
            if (this.f20744b) {
                return;
            }
            e18.this.f20736d.flush();
        }

        @Override // p001o.dvf
        public nmh timeout() {
            return this.f20743a;
        }
    }

    /* renamed from: o.e18$c */
    public final class C13073c extends AbstractC13071a {

        /* renamed from: d */
        public final w48 f20746d;

        /* renamed from: e */
        public long f20747e;

        /* renamed from: f */
        public boolean f20748f;

        /* renamed from: g */
        public final /* synthetic */ e18 f20749g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13073c(e18 e18Var, w48 w48Var) {
            super();
            sq8.m48649h(w48Var, ImagesContract.URL);
            this.f20749g = e18Var;
            this.f20746d = w48Var;
            this.f20747e = -1L;
            this.f20748f = true;
        }

        @Override // p001o.e18.AbstractC13071a, p001o.lzf
        public long N0(rl1 rl1Var, long j) throws IOException {
            sq8.m48649h(rl1Var, "sink");
            if (!(j >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            }
            if (!(!m24088a())) {
                throw new IllegalStateException("closed".toString());
            }
            if (!this.f20748f) {
                return -1L;
            }
            long j2 = this.f20747e;
            if (j2 == 0 || j2 == -1) {
                m24091f();
                if (!this.f20748f) {
                    return -1L;
                }
            }
            long jN0 = super.N0(rl1Var, Math.min(j, this.f20747e));
            if (jN0 != -1) {
                this.f20747e -= jN0;
                return jN0;
            }
            this.f20749g.mo24076f().mo25204c();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m24089c();
            throw protocolException;
        }

        @Override // p001o.lzf, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (m24088a()) {
                return;
            }
            if (this.f20748f && !jgj.m33814h(this, 100, TimeUnit.MILLISECONDS)) {
                this.f20749g.mo24076f().mo25204c();
                m24089c();
            }
            m24090d(true);
        }

        /* renamed from: f */
        public final void m24091f() throws ProtocolException {
            if (this.f20747e != -1) {
                this.f20749g.f20735c.Q0();
            }
            try {
                this.f20747e = this.f20749g.f20735c.m3();
                String string = f9g.Z0(this.f20749g.f20735c.Q0()).toString();
                if (this.f20747e >= 0) {
                    if (!(string.length() > 0) || e9g.m24597K(string, ";", false, 2, null)) {
                        if (this.f20747e == 0) {
                            this.f20748f = false;
                            e18 e18Var = this.f20749g;
                            e18Var.f20739g = e18Var.f20738f.m60065a();
                            hac hacVar = this.f20749g.f20733a;
                            sq8.m48646e(hacVar);
                            f74 f74VarM30075n = hacVar.m30075n();
                            w48 w48Var = this.f20746d;
                            wx7 wx7Var = this.f20749g.f20739g;
                            sq8.m48646e(wx7Var);
                            k38.m34943f(f74VarM30075n, w48Var, wx7Var);
                            m24089c();
                            return;
                        }
                        return;
                    }
                }
                throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f20747e + string + TokenParser.DQUOTE);
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }
    }

    /* renamed from: o.e18$d */
    public static final class C13074d {
        public C13074d() {
        }

        public /* synthetic */ C13074d(id5 id5Var) {
            this();
        }
    }

    /* renamed from: o.e18$e */
    public final class C13075e extends AbstractC13071a {

        /* renamed from: d */
        public long f20750d;

        public C13075e(long j) {
            super();
            this.f20750d = j;
            if (j == 0) {
                m24089c();
            }
        }

        @Override // p001o.e18.AbstractC13071a, p001o.lzf
        public long N0(rl1 rl1Var, long j) throws IOException {
            sq8.m48649h(rl1Var, "sink");
            if (!(j >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            }
            if (!(!m24088a())) {
                throw new IllegalStateException("closed".toString());
            }
            long j2 = this.f20750d;
            if (j2 == 0) {
                return -1L;
            }
            long jN0 = super.N0(rl1Var, Math.min(j2, j));
            if (jN0 == -1) {
                e18.this.mo24076f().mo25204c();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                m24089c();
                throw protocolException;
            }
            long j3 = this.f20750d - jN0;
            this.f20750d = j3;
            if (j3 == 0) {
                m24089c();
            }
            return jN0;
        }

        @Override // p001o.lzf, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (m24088a()) {
                return;
            }
            if (this.f20750d != 0 && !jgj.m33814h(this, 100, TimeUnit.MILLISECONDS)) {
                e18.this.mo24076f().mo25204c();
                m24089c();
            }
            m24090d(true);
        }
    }

    /* renamed from: o.e18$f */
    public final class C13076f implements dvf {

        /* renamed from: a */
        public final vf7 f20752a;

        /* renamed from: b */
        public boolean f20753b;

        public C13076f() {
            this.f20752a = new vf7(e18.this.f20736d.timeout());
        }

        @Override // p001o.dvf
        public void M0(rl1 rl1Var, long j) {
            sq8.m48649h(rl1Var, "source");
            if (!(!this.f20753b)) {
                throw new IllegalStateException("closed".toString());
            }
            ggj.m28625e(rl1Var.f0(), 0L, j);
            e18.this.f20736d.M0(rl1Var, j);
        }

        @Override // p001o.dvf, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f20753b) {
                return;
            }
            this.f20753b = true;
            e18.this.m24080s(this.f20752a);
            e18.this.f20737e = 3;
        }

        @Override // p001o.dvf, java.io.Flushable
        public void flush() {
            if (this.f20753b) {
                return;
            }
            e18.this.f20736d.flush();
        }

        @Override // p001o.dvf
        public nmh timeout() {
            return this.f20752a;
        }
    }

    /* renamed from: o.e18$g */
    public final class C13077g extends AbstractC13071a {

        /* renamed from: d */
        public boolean f20755d;

        public C13077g() {
            super();
        }

        @Override // p001o.e18.AbstractC13071a, p001o.lzf
        public long N0(rl1 rl1Var, long j) throws IOException {
            sq8.m48649h(rl1Var, "sink");
            if (!(j >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            }
            if (!(!m24088a())) {
                throw new IllegalStateException("closed".toString());
            }
            if (this.f20755d) {
                return -1L;
            }
            long jN0 = super.N0(rl1Var, j);
            if (jN0 != -1) {
                return jN0;
            }
            this.f20755d = true;
            m24089c();
            return -1L;
        }

        @Override // p001o.lzf, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (m24088a()) {
                return;
            }
            if (!this.f20755d) {
                m24089c();
            }
            m24090d(true);
        }
    }

    /* renamed from: o.e18$h */
    public static final class C13078h extends kf9 implements uk7 {

        /* renamed from: a */
        public static final C13078h f20757a = new C13078h();

        public C13078h() {
            super(0);
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final wx7 invoke() {
            throw new IllegalStateException("trailers not available".toString());
        }
    }

    public e18(hac hacVar, el6.InterfaceC13212a interfaceC13212a, im1 im1Var, gm1 gm1Var) {
        sq8.m48649h(interfaceC13212a, "carrier");
        sq8.m48649h(im1Var, "source");
        sq8.m48649h(gm1Var, "sink");
        this.f20733a = hacVar;
        this.f20734b = interfaceC13212a;
        this.f20735c = im1Var;
        this.f20736d = gm1Var;
        this.f20738f = new zx7(im1Var);
    }

    /* renamed from: A */
    public final void m24069A(zqe zqeVar) {
        sq8.m48649h(zqeVar, "response");
        long jM33816j = jgj.m33816j(zqeVar);
        if (jM33816j == -1) {
            return;
        }
        lzf lzfVarM24085x = m24085x(jM33816j);
        jgj.m33820n(lzfVarM24085x, Api.BaseClientBuilder.API_PRIORITY_OTHER, TimeUnit.MILLISECONDS);
        lzfVarM24085x.close();
    }

    /* renamed from: B */
    public final void m24070B(wx7 wx7Var, String str) {
        sq8.m48649h(wx7Var, "headers");
        sq8.m48649h(str, "requestLine");
        if (!(this.f20737e == 0)) {
            throw new IllegalStateException(("state: " + this.f20737e).toString());
        }
        this.f20736d.n0(str).n0("\r\n");
        int size = wx7Var.size();
        for (int i = 0; i < size; i++) {
            this.f20736d.n0(wx7Var.m55329j(i)).n0(": ").n0(wx7Var.m55333w(i)).n0("\r\n");
        }
        this.f20736d.n0("\r\n");
        this.f20737e = 1;
    }

    @Override // p001o.el6
    /* renamed from: a */
    public void mo24071a() {
        this.f20736d.flush();
    }

    @Override // p001o.el6
    /* renamed from: b */
    public dvf mo24072b(ule uleVar, long j) throws ProtocolException {
        sq8.m48649h(uleVar, "request");
        xle xleVarM51730a = uleVar.m51730a();
        boolean z = false;
        if (xleVarM51730a != null && xleVarM51730a.mo49546g()) {
            z = true;
        }
        if (z) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (m24081t(uleVar)) {
            return m24083v();
        }
        if (j != -1) {
            return m24086y();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // p001o.el6
    /* renamed from: c */
    public lzf mo24073c(zqe zqeVar) {
        sq8.m48649h(zqeVar, "response");
        if (!k38.m34939b(zqeVar)) {
            return m24085x(0L);
        }
        if (m24082u(zqeVar)) {
            return m24084w(zqeVar.m59732Q().m51741l());
        }
        long jM33816j = jgj.m33816j(zqeVar);
        return jM33816j != -1 ? m24085x(jM33816j) : m24087z();
    }

    @Override // p001o.el6
    public void cancel() {
        mo24076f().cancel();
    }

    @Override // p001o.el6
    /* renamed from: d */
    public zqe.C18696a mo24074d(boolean z) throws IOException {
        int i = this.f20737e;
        boolean z2 = false;
        if (!(i == 1 || i == 2 || i == 3)) {
            throw new IllegalStateException(("state: " + this.f20737e).toString());
        }
        try {
            r5g r5gVarM46248a = r5g.f43038d.m46248a(this.f20738f.m60066b());
            zqe.C18696a c18696aM59747C = new zqe.C18696a().m59762o(r5gVarM46248a.f43039a).m59752e(r5gVarM46248a.f43040b).m59759l(r5gVarM46248a.f43041c).m59757j(this.f20738f.m60065a()).m59747C(C13078h.f20757a);
            if (z && r5gVarM46248a.f43040b == 100) {
                return null;
            }
            int i2 = r5gVarM46248a.f43040b;
            if (i2 == 100) {
                this.f20737e = 3;
                return c18696aM59747C;
            }
            if (102 <= i2 && i2 < 200) {
                z2 = true;
            }
            if (z2) {
                this.f20737e = 3;
                return c18696aM59747C;
            }
            this.f20737e = 4;
            return c18696aM59747C;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on " + mo24076f().getRoute().m19864a().m22357l().m53884p(), e);
        }
    }

    @Override // p001o.el6
    /* renamed from: e */
    public void mo24075e() {
        this.f20736d.flush();
    }

    @Override // p001o.el6
    /* renamed from: f */
    public el6.InterfaceC13212a mo24076f() {
        return this.f20734b;
    }

    @Override // p001o.el6
    /* renamed from: g */
    public wx7 mo24077g() {
        if (!(this.f20737e == 6)) {
            throw new IllegalStateException("too early; can't read the trailers yet".toString());
        }
        wx7 wx7Var = this.f20739g;
        return wx7Var == null ? jgj.f30417a : wx7Var;
    }

    @Override // p001o.el6
    /* renamed from: h */
    public void mo24078h(ule uleVar) {
        sq8.m48649h(uleVar, "request");
        fme fmeVar = fme.f23676a;
        Proxy.Type type2 = mo24076f().getRoute().m19865b().type();
        sq8.m48648g(type2, "type(...)");
        m24070B(uleVar.m51735f(), fmeVar.m27086a(uleVar, type2));
    }

    @Override // p001o.el6
    /* renamed from: i */
    public long mo24079i(zqe zqeVar) {
        sq8.m48649h(zqeVar, "response");
        if (!k38.m34939b(zqeVar)) {
            return 0L;
        }
        if (m24082u(zqeVar)) {
            return -1L;
        }
        return jgj.m33816j(zqeVar);
    }

    /* renamed from: s */
    public final void m24080s(vf7 vf7Var) {
        nmh nmhVarM52701i = vf7Var.m52701i();
        vf7Var.m52702j(nmh.f37049e);
        nmhVarM52701i.mo40790a();
        nmhVarM52701i.mo40791b();
    }

    /* renamed from: t */
    public final boolean m24081t(ule uleVar) {
        return e9g.m24606x(HTTP.CHUNK_CODING, uleVar.m51734e("Transfer-Encoding"), true);
    }

    /* renamed from: u */
    public final boolean m24082u(zqe zqeVar) {
        return e9g.m24606x(HTTP.CHUNK_CODING, zqe.m59725t(zqeVar, "Transfer-Encoding", null, 2, null), true);
    }

    /* renamed from: v */
    public final dvf m24083v() {
        if (this.f20737e == 1) {
            this.f20737e = 2;
            return new C13072b();
        }
        throw new IllegalStateException(("state: " + this.f20737e).toString());
    }

    /* renamed from: w */
    public final lzf m24084w(w48 w48Var) {
        if (this.f20737e == 4) {
            this.f20737e = 5;
            return new C13073c(this, w48Var);
        }
        throw new IllegalStateException(("state: " + this.f20737e).toString());
    }

    /* renamed from: x */
    public final lzf m24085x(long j) {
        if (this.f20737e == 4) {
            this.f20737e = 5;
            return new C13075e(j);
        }
        throw new IllegalStateException(("state: " + this.f20737e).toString());
    }

    /* renamed from: y */
    public final dvf m24086y() {
        if (this.f20737e == 1) {
            this.f20737e = 2;
            return new C13076f();
        }
        throw new IllegalStateException(("state: " + this.f20737e).toString());
    }

    /* renamed from: z */
    public final lzf m24087z() {
        if (this.f20737e == 4) {
            this.f20737e = 5;
            mo24076f().mo25204c();
            return new C13077g();
        }
        throw new IllegalStateException(("state: " + this.f20737e).toString());
    }
}
