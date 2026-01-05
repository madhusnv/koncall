package p001o;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import p001o.a47;
import p001o.dee;
import p001o.el6;
import p001o.g18;

/* loaded from: classes6.dex */
public final class zce extends g18.AbstractC13603d implements xr3, el6.InterfaceC13212a {

    /* renamed from: w */
    public static final C18612a f56943w = new C18612a(null);

    /* renamed from: c */
    public final uog f56944c;

    /* renamed from: d */
    public final ade f56945d;

    /* renamed from: e */
    public final bve f56946e;

    /* renamed from: f */
    public Socket f56947f;

    /* renamed from: g */
    public Socket f56948g;

    /* renamed from: h */
    public ww7 f56949h;

    /* renamed from: i */
    public a2e f56950i;

    /* renamed from: j */
    public im1 f56951j;

    /* renamed from: k */
    public gm1 f56952k;

    /* renamed from: l */
    public final int f56953l;

    /* renamed from: m */
    public final bt3 f56954m;

    /* renamed from: n */
    public g18 f56955n;

    /* renamed from: o */
    public boolean f56956o;

    /* renamed from: p */
    public boolean f56957p;

    /* renamed from: q */
    public int f56958q;

    /* renamed from: r */
    public int f56959r;

    /* renamed from: s */
    public int f56960s;

    /* renamed from: t */
    public int f56961t;

    /* renamed from: u */
    public final List f56962u;

    /* renamed from: v */
    public long f56963v;

    /* renamed from: o.zce$a */
    public static final class C18612a {
        public C18612a() {
        }

        public /* synthetic */ C18612a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: o.zce$b */
    public static final class C18613b extends dee.AbstractC12890d {

        /* renamed from: d */
        public final /* synthetic */ dl6 f56964d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18613b(im1 im1Var, gm1 gm1Var, dl6 dl6Var) {
            super(true, im1Var, gm1Var);
            this.f56964d = dl6Var;
        }

        @Override // p001o.dee.AbstractC12890d
        /* renamed from: a */
        public void mo22940a() {
            this.f56964d.m23387b();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f56964d.m23386a(-1L, true, true, null);
        }
    }

    public zce(uog uogVar, ade adeVar, bve bveVar, Socket socket, Socket socket2, ww7 ww7Var, a2e a2eVar, im1 im1Var, gm1 gm1Var, int i, bt3 bt3Var) {
        sq8.m48649h(uogVar, "taskRunner");
        sq8.m48649h(adeVar, "connectionPool");
        sq8.m48649h(bveVar, "route");
        sq8.m48649h(bt3Var, "connectionListener");
        this.f56944c = uogVar;
        this.f56945d = adeVar;
        this.f56946e = bveVar;
        this.f56947f = socket;
        this.f56948g = socket2;
        this.f56949h = ww7Var;
        this.f56950i = a2eVar;
        this.f56951j = im1Var;
        this.f56952k = gm1Var;
        this.f56953l = i;
        this.f56954m = bt3Var;
        this.f56961t = 1;
        this.f56962u = new ArrayList();
        this.f56963v = Long.MAX_VALUE;
    }

    /* renamed from: A */
    public final void m59191A() throws SocketException {
        Socket socket = this.f56948g;
        sq8.m48646e(socket);
        im1 im1Var = this.f56951j;
        sq8.m48646e(im1Var);
        gm1 gm1Var = this.f56952k;
        sq8.m48646e(gm1Var);
        socket.setSoTimeout(0);
        Object obj = this.f56954m;
        a47 a47Var = obj instanceof a47 ? (a47) obj : null;
        if (a47Var == null) {
            a47Var = a47.C12079a.f14119a;
        }
        g18 g18VarM27940a = new g18.C13601b(true, this.f56944c).m27958s(socket, getRoute().m19864a().m22357l().m53877h(), im1Var, gm1Var).m27952m(this).m27953n(this.f56953l).m27941b(a47Var).m27940a();
        this.f56955n = g18VarM27940a;
        this.f56961t = g18.q0.m27959a().m49942d();
        g18.V0(g18VarM27940a, false, 1, null);
    }

    /* renamed from: B */
    public final boolean m59192B(w48 w48Var) {
        ww7 ww7Var;
        if (jgj.f30421e && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        w48 w48VarM22357l = getRoute().m19864a().m22357l();
        if (w48Var.m53882n() != w48VarM22357l.m53882n()) {
            return false;
        }
        if (sq8.m48644c(w48Var.m53877h(), w48VarM22357l.m53877h())) {
            return true;
        }
        if (this.f56957p || (ww7Var = this.f56949h) == null) {
            return false;
        }
        sq8.m48646e(ww7Var);
        return m59193g(w48Var, ww7Var);
    }

    @Override // p001o.xr3
    /* renamed from: a */
    public a2e mo56683a() {
        a2e a2eVar = this.f56950i;
        sq8.m48646e(a2eVar);
        return a2eVar;
    }

    @Override // p001o.el6.InterfaceC13212a
    /* renamed from: b */
    public void mo25203b(yce yceVar, IOException iOException) {
        boolean z;
        sq8.m48649h(yceVar, "call");
        synchronized (this) {
            if (iOException instanceof b7g) {
                if (((b7g) iOException).f15658a == fj6.REFUSED_STREAM) {
                    int i = this.f56960s + 1;
                    this.f56960s = i;
                    if (i > 1) {
                        z = this.f56956o ? false : true;
                        this.f56956o = true;
                        this.f56958q++;
                    }
                } else if (((b7g) iOException).f15658a != fj6.CANCEL || !yceVar.isCanceled()) {
                    z = this.f56956o ? false : true;
                    this.f56956o = true;
                    this.f56958q++;
                }
            } else if (!m59204r() || (iOException instanceof dt3)) {
                z = this.f56956o ? false : true;
                this.f56956o = true;
                if (this.f56959r == 0) {
                    if (iOException != null) {
                        m59194h(yceVar.m57585k(), getRoute(), iOException);
                    }
                    this.f56958q++;
                }
            }
            y3i y3iVar = y3i.f54824a;
        }
        if (z) {
            this.f56954m.m19708h(this);
        }
    }

    @Override // p001o.el6.InterfaceC13212a
    /* renamed from: c */
    public void mo25204c() {
        synchronized (this) {
            this.f56956o = true;
            y3i y3iVar = y3i.f54824a;
        }
        this.f56954m.m19708h(this);
    }

    @Override // p001o.el6.InterfaceC13212a
    public void cancel() throws IOException {
        Socket socket = this.f56947f;
        if (socket != null) {
            jgj.m33813g(socket);
        }
    }

    @Override // p001o.xr3
    /* renamed from: d */
    public Socket mo56684d() {
        Socket socket = this.f56948g;
        sq8.m48646e(socket);
        return socket;
    }

    @Override // p001o.g18.AbstractC13603d
    /* renamed from: e */
    public synchronized void mo27960e(g18 g18Var, tif tifVar) {
        sq8.m48649h(g18Var, "connection");
        sq8.m48649h(tifVar, "settings");
        int i = this.f56961t;
        int iM49942d = tifVar.m49942d();
        this.f56961t = iM49942d;
        if (iM49942d < i) {
            this.f56945d.m16930l(getRoute().m19864a());
        } else if (iM49942d > i) {
            this.f56945d.m16929k();
        }
    }

    @Override // p001o.g18.AbstractC13603d
    /* renamed from: f */
    public void mo27961f(j18 j18Var) {
        sq8.m48649h(j18Var, "stream");
        j18Var.m33036e(fj6.REFUSED_STREAM, null);
    }

    /* renamed from: g */
    public final boolean m59193g(w48 w48Var, ww7 ww7Var) {
        List listM55295d = ww7Var.m55295d();
        if (!listM55295d.isEmpty()) {
            eac eacVar = eac.f21258a;
            String strM53877h = w48Var.m53877h();
            Object obj = listM55295d.get(0);
            sq8.m48647f(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            if (eacVar.m24661e(strM53877h, (X509Certificate) obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // p001o.el6.InterfaceC13212a
    public bve getRoute() {
        return this.f56946e;
    }

    /* renamed from: h */
    public final void m59194h(hac hacVar, bve bveVar, IOException iOException) {
        sq8.m48649h(hacVar, "client");
        sq8.m48649h(bveVar, "failedRoute");
        sq8.m48649h(iOException, "failure");
        if (bveVar.m19865b().type() != Proxy.Type.DIRECT) {
            d60 d60VarM19864a = bveVar.m19864a();
            d60VarM19864a.m22354i().connectFailed(d60VarM19864a.m22357l().m53887s(), bveVar.m19865b().address(), iOException);
        }
        hacVar.m30082u().m23892b(bveVar);
    }

    /* renamed from: i */
    public final List m59195i() {
        return this.f56962u;
    }

    /* renamed from: j */
    public final bt3 m59196j() {
        return this.f56954m;
    }

    /* renamed from: k */
    public final long m59197k() {
        return this.f56963v;
    }

    /* renamed from: l */
    public final boolean m59198l() {
        return this.f56956o;
    }

    /* renamed from: m */
    public final int m59199m() {
        return this.f56958q;
    }

    /* renamed from: n */
    public ww7 m59200n() {
        return this.f56949h;
    }

    /* renamed from: o */
    public final synchronized void m59201o() {
        this.f56959r++;
    }

    /* renamed from: p */
    public final boolean m59202p(d60 d60Var, List list) {
        sq8.m48649h(d60Var, "address");
        if (jgj.f30421e && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (this.f56962u.size() >= this.f56961t || this.f56956o || !getRoute().m19864a().m22349d(d60Var)) {
            return false;
        }
        if (sq8.m48644c(d60Var.m22357l().m53877h(), m59208v().m19864a().m22357l().m53877h())) {
            return true;
        }
        if (this.f56955n == null || list == null || !m59209w(list) || d60Var.m22350e() != eac.f21258a || !m59192B(d60Var.m22357l())) {
            return false;
        }
        try {
            pf2 pf2VarM22346a = d60Var.m22346a();
            sq8.m48646e(pf2VarM22346a);
            String strM53877h = d60Var.m22357l().m53877h();
            ww7 ww7VarM59200n = m59200n();
            sq8.m48646e(ww7VarM59200n);
            pf2VarM22346a.m43551a(strM53877h, ww7VarM59200n.m55295d());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    /* renamed from: q */
    public final boolean m59203q(boolean z) {
        long j;
        if (jgj.f30421e && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        long jNanoTime = System.nanoTime();
        Socket socket = this.f56947f;
        sq8.m48646e(socket);
        Socket socket2 = this.f56948g;
        sq8.m48646e(socket2);
        im1 im1Var = this.f56951j;
        sq8.m48646e(im1Var);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        g18 g18Var = this.f56955n;
        if (g18Var != null) {
            return g18Var.y0(jNanoTime);
        }
        synchronized (this) {
            j = jNanoTime - this.f56963v;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        return jgj.m33818l(socket2, im1Var);
    }

    /* renamed from: r */
    public final boolean m59204r() {
        return this.f56955n != null;
    }

    /* renamed from: s */
    public final el6 m59205s(hac hacVar, cde cdeVar) {
        sq8.m48649h(hacVar, "client");
        sq8.m48649h(cdeVar, "chain");
        Socket socket = this.f56948g;
        sq8.m48646e(socket);
        im1 im1Var = this.f56951j;
        sq8.m48646e(im1Var);
        gm1 gm1Var = this.f56952k;
        sq8.m48646e(gm1Var);
        g18 g18Var = this.f56955n;
        if (g18Var != null) {
            return new h18(hacVar, this, cdeVar, g18Var);
        }
        socket.setSoTimeout(cdeVar.m20981k());
        nmh nmhVarTimeout = im1Var.timeout();
        long jM20978h = cdeVar.m20978h();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        nmhVarTimeout.mo40796g(jM20978h, timeUnit);
        gm1Var.timeout().mo40796g(cdeVar.m20980j(), timeUnit);
        return new e18(hacVar, this, im1Var, gm1Var);
    }

    /* renamed from: t */
    public final dee.AbstractC12890d m59206t(dl6 dl6Var) throws SocketException {
        sq8.m48649h(dl6Var, "exchange");
        Socket socket = this.f56948g;
        sq8.m48646e(socket);
        im1 im1Var = this.f56951j;
        sq8.m48646e(im1Var);
        gm1 gm1Var = this.f56952k;
        sq8.m48646e(gm1Var);
        socket.setSoTimeout(0);
        mo25204c();
        return new C18613b(im1Var, gm1Var, dl6Var);
    }

    public String toString() {
        Object objM55292a;
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(getRoute().m19864a().m22357l().m53877h());
        sb.append(':');
        sb.append(getRoute().m19864a().m22357l().m53882n());
        sb.append(", proxy=");
        sb.append(getRoute().m19865b());
        sb.append(" hostAddress=");
        sb.append(getRoute().m19867d());
        sb.append(" cipherSuite=");
        ww7 ww7Var = this.f56949h;
        if (ww7Var == null || (objM55292a = ww7Var.m55292a()) == null) {
            objM55292a = DevicePublicKeyStringDef.NONE;
        }
        sb.append(objM55292a);
        sb.append(" protocol=");
        sb.append(this.f56950i);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: u */
    public final synchronized void m59207u() {
        this.f56957p = true;
    }

    /* renamed from: v */
    public bve m59208v() {
        return getRoute();
    }

    /* renamed from: w */
    public final boolean m59209w(List list) {
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bve bveVar = (bve) it.next();
            if (bveVar.m19865b().type() == Proxy.Type.DIRECT && getRoute().m19865b().type() == Proxy.Type.DIRECT && sq8.m48644c(getRoute().m19867d(), bveVar.m19867d())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: x */
    public final void m59210x(long j) {
        this.f56963v = j;
    }

    /* renamed from: y */
    public final void m59211y(boolean z) {
        this.f56956o = z;
    }

    /* renamed from: z */
    public final void m59212z() throws SocketException {
        this.f56963v = System.nanoTime();
        a2e a2eVar = this.f56950i;
        if (a2eVar == a2e.HTTP_2 || a2eVar == a2e.H2_PRIOR_KNOWLEDGE) {
            m59191A();
        }
    }
}
