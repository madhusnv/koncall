package p001o;

import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import p001o.vre;
import p001o.xr0;

/* loaded from: classes3.dex */
public final class d28 implements Closeable {

    /* renamed from: Z */
    public static final /* synthetic */ AtomicLongFieldUpdater f19014Z = AtomicLongFieldUpdater.newUpdater(d28.class, "c");
    public static final /* synthetic */ AtomicLongFieldUpdater h0 = AtomicLongFieldUpdater.newUpdater(d28.class, "d");
    public static final /* synthetic */ AtomicLongFieldUpdater i0 = AtomicLongFieldUpdater.newUpdater(d28.class, "e");
    public static final /* synthetic */ AtomicLongFieldUpdater j0 = AtomicLongFieldUpdater.newUpdater(d28.class, "f");
    public static final /* synthetic */ AtomicLongFieldUpdater k0 = AtomicLongFieldUpdater.newUpdater(d28.class, "g");
    public static final /* synthetic */ AtomicLongFieldUpdater l0 = AtomicLongFieldUpdater.newUpdater(d28.class, "h");

    /* renamed from: H */
    public final yr0 f19015H;

    /* renamed from: L */
    public final yr0 f19016L;

    /* renamed from: M */
    public final yr0 f19017M;

    /* renamed from: Q */
    public final nlb f19018Q;

    /* renamed from: X */
    public final nlb f19019X;

    /* renamed from: Y */
    public final qy7 f19020Y;

    /* renamed from: a */
    public final vdh f19021a;

    /* renamed from: b */
    public final deb f19022b;

    /* renamed from: c */
    public volatile /* synthetic */ long f19023c;

    /* renamed from: d */
    public volatile /* synthetic */ long f19024d;

    /* renamed from: e */
    public volatile /* synthetic */ long f19025e;

    /* renamed from: f */
    public volatile /* synthetic */ long f19026f;

    /* renamed from: g */
    public volatile /* synthetic */ long f19027g;

    /* renamed from: h */
    public volatile /* synthetic */ long f19028h;

    /* renamed from: q */
    public final qy7 f19029q;

    /* renamed from: s */
    public final qy7 f19030s;

    /* renamed from: x */
    public final qy7 f19031x;

    /* renamed from: y */
    public final yr0 f19032y;

    /* renamed from: o.d28$a */
    public /* synthetic */ class C12785a extends dm7 implements xk7 {
        public C12785a(Object obj) {
            super(1, obj, d28.class, "recordConnectionState", "recordConnectionState(Laws/smithy/kotlin/runtime/telemetry/metrics/AsyncMeasurement;)V", 0);
        }

        /* renamed from: b */
        public final void m22273b(xr0 xr0Var) {
            sq8.m48649h(xr0Var, "p0");
            ((d28) this.receiver).m22260H(xr0Var);
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            tq.m50332a(obj);
            m22273b(null);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.d28$b */
    public /* synthetic */ class C12786b extends dm7 implements xk7 {
        public C12786b(Object obj) {
            super(1, obj, d28.class, "recordRequestsState", "recordRequestsState(Laws/smithy/kotlin/runtime/telemetry/metrics/AsyncMeasurement;)V", 0);
        }

        /* renamed from: b */
        public final void m22274b(xr0 xr0Var) {
            sq8.m48649h(xr0Var, "p0");
            ((d28) this.receiver).m22261J(xr0Var);
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            tq.m50332a(obj);
            m22274b(null);
            return y3i.f54824a;
        }
    }

    public d28(String str, vdh vdhVar) {
        sq8.m48649h(str, "scope");
        sq8.m48649h(vdhVar, AWSCognitoLegacyCredentialStore.PROVIDER_KEY);
        this.f19021a = vdhVar;
        deb debVarMo24858a = vdhVar.mo40625a().mo24858a(str);
        this.f19022b = debVarMo24858a;
        this.f19023c = 0L;
        this.f19024d = 0L;
        this.f19025e = 0L;
        this.f19026f = 0L;
        this.f19027g = 0L;
        this.f19028h = 0L;
        this.f19029q = debVarMo24858a.mo22901c("smithy.client.http.connections.acquire_duration", "s", "The amount of time requests take to acquire a connection from the pool");
        this.f19030s = debVarMo24858a.mo22901c("smithy.client.http.requests.queued_duration", "s", "The amount of time a request spent queued waiting to be executed by the HTTP client");
        this.f19031x = debVarMo24858a.mo22901c("smithy.client.http.connections.uptime", "s", "The amount of time a connection has been open");
        this.f19032y = debVarMo24858a.mo22900b("smithy.client.http.connections.limit", new xk7() { // from class: o.b28
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                d28 d28Var = this.f15480a;
                tq.m50332a(obj);
                return d28.m22257g(d28Var, null);
            }
        }, "{connection}", "Max connections configured for the HTTP client");
        this.f19015H = debVarMo24858a.mo22900b("smithy.client.http.connections.usage", new C12785a(this), "{connection}", "Current state of connections (idle, acquired)");
        this.f19016L = debVarMo24858a.mo22900b("smithy.client.http.requests.limit", new xk7() { // from class: o.c28
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                d28 d28Var = this.f17160a;
                tq.m50332a(obj);
                return d28.m22252K(d28Var, null);
            }
        }, "{request}", "Max concurrent requests configured for the HTTP client");
        this.f19017M = debVarMo24858a.mo22900b("smithy.client.http.requests.usage", new C12786b(this), "{request}", "The current state of HTTP client request concurrency (queued, in-flight)");
        this.f19018Q = debVarMo24858a.mo22899a("smithy.client.http.bytes_sent", "By", "The total number of bytes sent by the HTTP client");
        this.f19019X = debVarMo24858a.mo22899a("smithy.client.http.bytes_received", "By", "The total number of bytes received by the HTTP client");
        this.f19020Y = debVarMo24858a.mo22901c("smithy.client.http.time_to_first_byte", "s", "The amount of time after a request has been sent spent waiting on a response from the remote server");
    }

    /* renamed from: K */
    public static final y3i m22252K(d28 d28Var, xr0 xr0Var) {
        sq8.m48649h(xr0Var, "it");
        xr0.C18227a.m56682a(xr0Var, Long.valueOf(d28Var.f19026f), null, null, 6, null);
        return y3i.f54824a;
    }

    /* renamed from: g */
    public static final y3i m22257g(d28 d28Var, xr0 xr0Var) {
        sq8.m48649h(xr0Var, "it");
        xr0.C18227a.m56682a(xr0Var, Long.valueOf(d28Var.f19023c), null, null, 6, null);
        return y3i.f54824a;
    }

    /* renamed from: C */
    public final qy7 m22258C() {
        return this.f19030s;
    }

    /* renamed from: D */
    public final qy7 m22259D() {
        return this.f19020Y;
    }

    /* renamed from: H */
    public final void m22260H(xr0 xr0Var) {
        Long lValueOf = Long.valueOf(m22270s());
        a28 a28Var = a28.f14057a;
        xr0.C18227a.m56682a(xr0Var, lValueOf, a28Var.m16362b(), null, 4, null);
        xr0.C18227a.m56682a(xr0Var, Long.valueOf(m22266h()), a28Var.m16361a(), null, 4, null);
    }

    /* renamed from: J */
    public final void m22261J(xr0 xr0Var) {
        Long lValueOf = Long.valueOf(m22271t());
        a28 a28Var = a28.f14057a;
        xr0.C18227a.m56682a(xr0Var, lValueOf, a28Var.m16363c(), null, 4, null);
        xr0.C18227a.m56682a(xr0Var, Long.valueOf(m22272u()), a28Var.m16364d(), null, 4, null);
    }

    /* renamed from: O */
    public final void m22262O(long j) {
        do {
        } while (!i0.compareAndSet(this, this.f19025e, j));
    }

    /* renamed from: Q */
    public final void m22263Q(long j) {
        do {
        } while (!h0.compareAndSet(this, this.f19024d, j));
    }

    /* renamed from: S */
    public final void m22264S(long j) {
        do {
        } while (!l0.compareAndSet(this, this.f19028h, j));
    }

    /* renamed from: T */
    public final void m22265T(long j) {
        do {
        } while (!k0.compareAndSet(this, this.f19027g, j));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Object objM53351b;
        Object objM53351b2;
        Object objM53351b3;
        Object objM53351b4;
        vre[] vreVarArr = new vre[4];
        yr0 yr0Var = this.f19032y;
        try {
            vre.C17665a c17665a = vre.f50797b;
            yr0Var.stop();
            objM53351b = vre.m53351b(y3i.f54824a);
        } catch (Throwable th) {
            vre.C17665a c17665a2 = vre.f50797b;
            objM53351b = vre.m53351b(wre.m54933a(th));
        }
        vreVarArr[0] = vre.m53350a(objM53351b);
        try {
            this.f19015H.stop();
            objM53351b2 = vre.m53351b(y3i.f54824a);
        } catch (Throwable th2) {
            vre.C17665a c17665a3 = vre.f50797b;
            objM53351b2 = vre.m53351b(wre.m54933a(th2));
        }
        vreVarArr[1] = vre.m53350a(objM53351b2);
        try {
            this.f19017M.stop();
            objM53351b3 = vre.m53351b(y3i.f54824a);
        } catch (Throwable th3) {
            vre.C17665a c17665a4 = vre.f50797b;
            objM53351b3 = vre.m53351b(wre.m54933a(th3));
        }
        vreVarArr[2] = vre.m53350a(objM53351b3);
        try {
            this.f19016L.stop();
            objM53351b4 = vre.m53351b(y3i.f54824a);
        } catch (Throwable th4) {
            vre.C17665a c17665a5 = vre.f50797b;
            objM53351b4 = vre.m53351b(wre.m54933a(th4));
        }
        vreVarArr[3] = vre.m53350a(objM53351b4);
        List listM21249n = ch3.m21249n(vreVarArr);
        ArrayList arrayList = new ArrayList();
        Iterator it = listM21249n.iterator();
        while (it.hasNext()) {
            Throwable thM53354e = vre.m53354e(((vre) it.next()).m53359j());
            if (thM53354e != null) {
                arrayList.add(thM53354e);
            }
        }
        Throwable th5 = (Throwable) kh3.h0(arrayList);
        if (th5 != null) {
            Iterator it2 = kh3.m35709Y(arrayList, 1).iterator();
            while (it2.hasNext()) {
                th5.addSuppressed((Throwable) it2.next());
            }
            throw th5;
        }
    }

    /* renamed from: h */
    public final long m22266h() {
        return this.f19025e;
    }

    /* renamed from: k */
    public final nlb m22267k() {
        return this.f19019X;
    }

    /* renamed from: o */
    public final nlb m22268o() {
        return this.f19018Q;
    }

    /* renamed from: r */
    public final qy7 m22269r() {
        return this.f19029q;
    }

    /* renamed from: s */
    public final long m22270s() {
        return this.f19024d;
    }

    /* renamed from: t */
    public final long m22271t() {
        return this.f19028h;
    }

    /* renamed from: u */
    public final long m22272u() {
        return this.f19027g;
    }
}
