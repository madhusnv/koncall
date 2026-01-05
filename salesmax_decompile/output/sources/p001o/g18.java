package p001o;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.http.message.TokenParser;
import org.objectweb.asm.Opcodes;
import p001o.a47;
import p001o.i18;

/* loaded from: classes6.dex */
public final class g18 implements Closeable {
    public static final C13602c q0 = new C13602c(null);
    public static final tif r0;

    /* renamed from: H */
    public long f24393H;

    /* renamed from: L */
    public long f24394L;

    /* renamed from: M */
    public long f24395M;

    /* renamed from: Q */
    public long f24396Q;

    /* renamed from: X */
    public long f24397X;

    /* renamed from: Y */
    public long f24398Y;

    /* renamed from: Z */
    public final a47 f24399Z;

    /* renamed from: a */
    public final boolean f24400a;

    /* renamed from: b */
    public final AbstractC13603d f24401b;

    /* renamed from: c */
    public final Map f24402c;

    /* renamed from: d */
    public final String f24403d;

    /* renamed from: e */
    public int f24404e;

    /* renamed from: f */
    public int f24405f;

    /* renamed from: g */
    public boolean f24406g;

    /* renamed from: h */
    public final uog f24407h;
    public final tif h0;
    public tif i0;
    public final x8j j0;
    public long k0;
    public long l0;
    public final Socket m0;
    public final k18 n0;
    public final C13604e o0;
    public final Set p0;

    /* renamed from: q */
    public final tog f24408q;

    /* renamed from: s */
    public final tog f24409s;

    /* renamed from: x */
    public final tog f24410x;

    /* renamed from: y */
    public final i3e f24411y;

    /* renamed from: o.g18$a */
    public static final class C13600a extends kf9 implements uk7 {

        /* renamed from: b */
        public final /* synthetic */ long f24413b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13600a(long j) {
            super(0);
            this.f24413b = j;
        }

        @Override // p001o.uk7
        public final Long invoke() throws IOException {
            boolean z;
            g18 g18Var = g18.this;
            synchronized (g18Var) {
                if (g18Var.f24394L < g18Var.f24393H) {
                    z = true;
                } else {
                    g18Var.f24393H++;
                    z = false;
                }
            }
            if (z) {
                g18.this.m27936S(null);
                return -1L;
            }
            g18.this.j1(false, 1, 0);
            return Long.valueOf(this.f24413b);
        }
    }

    /* renamed from: o.g18$b */
    public static final class C13601b {

        /* renamed from: a */
        public boolean f24414a;

        /* renamed from: b */
        public final uog f24415b;

        /* renamed from: c */
        public Socket f24416c;

        /* renamed from: d */
        public String f24417d;

        /* renamed from: e */
        public im1 f24418e;

        /* renamed from: f */
        public gm1 f24419f;

        /* renamed from: g */
        public AbstractC13603d f24420g;

        /* renamed from: h */
        public i3e f24421h;

        /* renamed from: i */
        public int f24422i;

        /* renamed from: j */
        public a47 f24423j;

        public C13601b(boolean z, uog uogVar) {
            sq8.m48649h(uogVar, "taskRunner");
            this.f24414a = z;
            this.f24415b = uogVar;
            this.f24420g = AbstractC13603d.f24425b;
            this.f24421h = i3e.f27999b;
            this.f24423j = a47.C12079a.f14119a;
        }

        /* renamed from: a */
        public final g18 m27940a() {
            return new g18(this);
        }

        /* renamed from: b */
        public final C13601b m27941b(a47 a47Var) {
            sq8.m48649h(a47Var, "flowControlListener");
            this.f24423j = a47Var;
            return this;
        }

        /* renamed from: c */
        public final boolean m27942c() {
            return this.f24414a;
        }

        /* renamed from: d */
        public final String m27943d() {
            String str = this.f24417d;
            if (str != null) {
                return str;
            }
            sq8.m48667z("connectionName");
            return null;
        }

        /* renamed from: e */
        public final a47 m27944e() {
            return this.f24423j;
        }

        /* renamed from: f */
        public final AbstractC13603d m27945f() {
            return this.f24420g;
        }

        /* renamed from: g */
        public final int m27946g() {
            return this.f24422i;
        }

        /* renamed from: h */
        public final i3e m27947h() {
            return this.f24421h;
        }

        /* renamed from: i */
        public final gm1 m27948i() {
            gm1 gm1Var = this.f24419f;
            if (gm1Var != null) {
                return gm1Var;
            }
            sq8.m48667z("sink");
            return null;
        }

        /* renamed from: j */
        public final Socket m27949j() {
            Socket socket = this.f24416c;
            if (socket != null) {
                return socket;
            }
            sq8.m48667z("socket");
            return null;
        }

        /* renamed from: k */
        public final im1 m27950k() {
            im1 im1Var = this.f24418e;
            if (im1Var != null) {
                return im1Var;
            }
            sq8.m48667z("source");
            return null;
        }

        /* renamed from: l */
        public final uog m27951l() {
            return this.f24415b;
        }

        /* renamed from: m */
        public final C13601b m27952m(AbstractC13603d abstractC13603d) {
            sq8.m48649h(abstractC13603d, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            this.f24420g = abstractC13603d;
            return this;
        }

        /* renamed from: n */
        public final C13601b m27953n(int i) {
            this.f24422i = i;
            return this;
        }

        /* renamed from: o */
        public final void m27954o(String str) {
            sq8.m48649h(str, "<set-?>");
            this.f24417d = str;
        }

        /* renamed from: p */
        public final void m27955p(gm1 gm1Var) {
            sq8.m48649h(gm1Var, "<set-?>");
            this.f24419f = gm1Var;
        }

        /* renamed from: q */
        public final void m27956q(Socket socket) {
            sq8.m48649h(socket, "<set-?>");
            this.f24416c = socket;
        }

        /* renamed from: r */
        public final void m27957r(im1 im1Var) {
            sq8.m48649h(im1Var, "<set-?>");
            this.f24418e = im1Var;
        }

        /* renamed from: s */
        public final C13601b m27958s(Socket socket, String str, im1 im1Var, gm1 gm1Var) {
            String str2;
            sq8.m48649h(socket, "socket");
            sq8.m48649h(str, "peerName");
            sq8.m48649h(im1Var, "source");
            sq8.m48649h(gm1Var, "sink");
            m27956q(socket);
            if (this.f24414a) {
                str2 = jgj.f30422f + TokenParser.SP + str;
            } else {
                str2 = "MockWebServer " + str;
            }
            m27954o(str2);
            m27957r(im1Var);
            m27955p(gm1Var);
            return this;
        }
    }

    /* renamed from: o.g18$c */
    public static final class C13602c {
        public C13602c() {
        }

        public /* synthetic */ C13602c(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final tif m27959a() {
            return g18.r0;
        }
    }

    /* renamed from: o.g18$d */
    public static abstract class AbstractC13603d {

        /* renamed from: a */
        public static final b f24424a = new b(null);

        /* renamed from: b */
        public static final AbstractC13603d f24425b = new a();

        /* renamed from: o.g18$d$a */
        public static final class a extends AbstractC13603d {
            @Override // p001o.g18.AbstractC13603d
            /* renamed from: f */
            public void mo27961f(j18 j18Var) {
                sq8.m48649h(j18Var, "stream");
                j18Var.m33036e(fj6.REFUSED_STREAM, null);
            }
        }

        /* renamed from: o.g18$d$b */
        public static final class b {
            public b() {
            }

            public /* synthetic */ b(id5 id5Var) {
                this();
            }
        }

        /* renamed from: e */
        public void mo27960e(g18 g18Var, tif tifVar) {
            sq8.m48649h(g18Var, "connection");
            sq8.m48649h(tifVar, "settings");
        }

        /* renamed from: f */
        public abstract void mo27961f(j18 j18Var);
    }

    /* renamed from: o.g18$e */
    public final class C13604e implements i18.InterfaceC14151c, uk7 {

        /* renamed from: a */
        public final i18 f24426a;

        /* renamed from: b */
        public final /* synthetic */ g18 f24427b;

        /* renamed from: o.g18$e$a */
        public static final class a extends kf9 implements uk7 {

            /* renamed from: a */
            public final /* synthetic */ g18 f24428a;

            /* renamed from: b */
            public final /* synthetic */ gge f24429b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g18 g18Var, gge ggeVar) {
                super(0);
                this.f24428a = g18Var;
                this.f24429b = ggeVar;
            }

            @Override // p001o.uk7
            public /* bridge */ /* synthetic */ Object invoke() {
                m69007invoke();
                return y3i.f54824a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m69007invoke() {
                this.f24428a.f0().mo27960e(this.f24428a, (tif) this.f24429b.f25106a);
            }
        }

        /* renamed from: o.g18$e$b */
        public static final class b extends kf9 implements uk7 {

            /* renamed from: a */
            public final /* synthetic */ g18 f24430a;

            /* renamed from: b */
            public final /* synthetic */ j18 f24431b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(g18 g18Var, j18 j18Var) {
                super(0);
                this.f24430a = g18Var;
                this.f24431b = j18Var;
            }

            @Override // p001o.uk7
            public /* bridge */ /* synthetic */ Object invoke() {
                m69008invoke();
                return y3i.f54824a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m69008invoke() {
                try {
                    this.f24430a.f0().mo27961f(this.f24431b);
                } catch (IOException e) {
                    e9d.f21191a.m24582g().m24573j("Http2Connection.Listener failure for " + this.f24430a.m27938X(), 4, e);
                    try {
                        this.f24431b.m33036e(fj6.PROTOCOL_ERROR, e);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        /* renamed from: o.g18$e$c */
        public static final class c extends kf9 implements uk7 {

            /* renamed from: a */
            public final /* synthetic */ g18 f24432a;

            /* renamed from: b */
            public final /* synthetic */ int f24433b;

            /* renamed from: c */
            public final /* synthetic */ int f24434c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(g18 g18Var, int i, int i2) {
                super(0);
                this.f24432a = g18Var;
                this.f24433b = i;
                this.f24434c = i2;
            }

            @Override // p001o.uk7
            public /* bridge */ /* synthetic */ Object invoke() throws IOException {
                m69009invoke();
                return y3i.f54824a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m69009invoke() throws IOException {
                this.f24432a.j1(true, this.f24433b, this.f24434c);
            }
        }

        /* renamed from: o.g18$e$d */
        public static final class d extends kf9 implements uk7 {

            /* renamed from: b */
            public final /* synthetic */ boolean f24436b;

            /* renamed from: c */
            public final /* synthetic */ tif f24437c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(boolean z, tif tifVar) {
                super(0);
                this.f24436b = z;
                this.f24437c = tifVar;
            }

            @Override // p001o.uk7
            public /* bridge */ /* synthetic */ Object invoke() {
                m69010invoke();
                return y3i.f54824a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m69010invoke() {
                C13604e.this.m27972l(this.f24436b, this.f24437c);
            }
        }

        public C13604e(g18 g18Var, i18 i18Var) {
            sq8.m48649h(i18Var, "reader");
            this.f24427b = g18Var;
            this.f24426a = i18Var;
        }

        @Override // p001o.i18.InterfaceC14151c
        /* renamed from: a */
        public void mo27962a(int i, fj6 fj6Var, zq1 zq1Var) {
            int i2;
            Object[] array;
            sq8.m48649h(fj6Var, "errorCode");
            sq8.m48649h(zq1Var, "debugData");
            zq1Var.m59694L();
            g18 g18Var = this.f24427b;
            synchronized (g18Var) {
                array = g18Var.r0().values().toArray(new j18[0]);
                g18Var.f24406g = true;
                y3i y3iVar = y3i.f54824a;
            }
            for (j18 j18Var : (j18[]) array) {
                if (j18Var.m33043l() > i && j18Var.m33052u()) {
                    j18Var.m33057z(fj6.REFUSED_STREAM);
                    this.f24427b.K0(j18Var.m33043l());
                }
            }
        }

        @Override // p001o.i18.InterfaceC14151c
        /* renamed from: b */
        public void mo27963b(boolean z, int i, int i2, List list) {
            sq8.m48649h(list, "headerBlock");
            if (this.f24427b.I0(i)) {
                this.f24427b.F0(i, list, z);
                return;
            }
            g18 g18Var = this.f24427b;
            synchronized (g18Var) {
                j18 j18VarO0 = g18Var.o0(i);
                if (j18VarO0 != null) {
                    y3i y3iVar = y3i.f54824a;
                    j18VarO0.m33056y(jgj.m33824r(list), z);
                    return;
                }
                if (g18Var.f24406g) {
                    return;
                }
                if (i <= g18Var.d0()) {
                    return;
                }
                if (i % 2 == g18Var.j0() % 2) {
                    return;
                }
                j18 j18Var = new j18(i, g18Var, false, z, jgj.m33824r(list));
                g18Var.O0(i);
                g18Var.r0().put(Integer.valueOf(i), j18Var);
                tog.m50260d(g18Var.f24407h.m51859k(), g18Var.m27938X() + '[' + i + "] onStream", 0L, false, new b(g18Var, j18Var), 6, null);
            }
        }

        @Override // p001o.i18.InterfaceC14151c
        /* renamed from: c */
        public void mo27964c(int i, fj6 fj6Var) {
            sq8.m48649h(fj6Var, "errorCode");
            if (this.f24427b.I0(i)) {
                this.f24427b.H0(i, fj6Var);
                return;
            }
            j18 j18VarK0 = this.f24427b.K0(i);
            if (j18VarK0 != null) {
                j18VarK0.m33057z(fj6Var);
            }
        }

        @Override // p001o.i18.InterfaceC14151c
        /* renamed from: d */
        public void mo27965d(int i, long j) {
            if (i == 0) {
                g18 g18Var = this.f24427b;
                synchronized (g18Var) {
                    g18Var.l0 = g18Var.u0() + j;
                    sq8.m48647f(g18Var, "null cannot be cast to non-null type java.lang.Object");
                    g18Var.notifyAll();
                    y3i y3iVar = y3i.f54824a;
                }
                return;
            }
            j18 j18VarO0 = this.f24427b.o0(i);
            if (j18VarO0 != null) {
                synchronized (j18VarO0) {
                    j18VarO0.m33033b(j);
                    y3i y3iVar2 = y3i.f54824a;
                }
            }
        }

        @Override // p001o.i18.InterfaceC14151c
        /* renamed from: e */
        public void mo27966e(boolean z, tif tifVar) {
            sq8.m48649h(tifVar, "settings");
            tog.m50260d(this.f24427b.f24408q, this.f24427b.m27938X() + " applyAndAckSettings", 0L, false, new d(z, tifVar), 6, null);
        }

        @Override // p001o.i18.InterfaceC14151c
        /* renamed from: f */
        public void mo27967f(int i, int i2, List list) {
            sq8.m48649h(list, "requestHeaders");
            this.f24427b.G0(i2, list);
        }

        @Override // p001o.i18.InterfaceC14151c
        /* renamed from: g */
        public void mo27968g() {
        }

        @Override // p001o.i18.InterfaceC14151c
        /* renamed from: h */
        public void mo27969h(boolean z, int i, im1 im1Var, int i2) {
            sq8.m48649h(im1Var, "source");
            if (this.f24427b.I0(i)) {
                this.f24427b.E0(i, im1Var, i2, z);
                return;
            }
            j18 j18VarO0 = this.f24427b.o0(i);
            if (j18VarO0 == null) {
                this.f24427b.p1(i, fj6.PROTOCOL_ERROR);
                long j = i2;
                this.f24427b.W0(j);
                im1Var.skip(j);
                return;
            }
            j18VarO0.m33055x(im1Var, i2);
            if (z) {
                j18VarO0.m33056y(jgj.f30417a, true);
            }
        }

        @Override // p001o.i18.InterfaceC14151c
        /* renamed from: i */
        public void mo27970i(boolean z, int i, int i2) {
            if (!z) {
                tog.m50260d(this.f24427b.f24408q, this.f24427b.m27938X() + " ping", 0L, false, new c(this.f24427b, i, i2), 6, null);
                return;
            }
            g18 g18Var = this.f24427b;
            synchronized (g18Var) {
                if (i == 1) {
                    g18Var.f24394L++;
                } else if (i != 2) {
                    if (i == 3) {
                        g18Var.f24397X++;
                        sq8.m48647f(g18Var, "null cannot be cast to non-null type java.lang.Object");
                        g18Var.notifyAll();
                    }
                    y3i y3iVar = y3i.f54824a;
                } else {
                    g18Var.f24396Q++;
                }
            }
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() throws Throwable {
            m27973m();
            return y3i.f54824a;
        }

        @Override // p001o.i18.InterfaceC14151c
        /* renamed from: k */
        public void mo27971k(int i, int i2, int i3, boolean z) {
        }

        /* renamed from: l */
        public final void m27972l(boolean z, tif tifVar) {
            long jM49941c;
            int i;
            j18[] j18VarArr;
            tif tifVar2 = tifVar;
            sq8.m48649h(tifVar2, "settings");
            gge ggeVar = new gge();
            k18 k18VarV0 = this.f24427b.v0();
            g18 g18Var = this.f24427b;
            synchronized (k18VarV0) {
                synchronized (g18Var) {
                    tif tifVarL0 = g18Var.l0();
                    if (!z) {
                        tif tifVar3 = new tif();
                        tifVar3.m49945g(tifVarL0);
                        tifVar3.m49945g(tifVar2);
                        tifVar2 = tifVar3;
                    }
                    ggeVar.f25106a = tifVar2;
                    jM49941c = tifVar2.m49941c() - tifVarL0.m49941c();
                    j18VarArr = (jM49941c == 0 || g18Var.r0().isEmpty()) ? null : (j18[]) g18Var.r0().values().toArray(new j18[0]);
                    g18Var.P0((tif) ggeVar.f25106a);
                    tog.m50260d(g18Var.f24410x, g18Var.m27938X() + " onSettings", 0L, false, new a(g18Var, ggeVar), 6, null);
                    y3i y3iVar = y3i.f54824a;
                }
                try {
                    g18Var.v0().m34904a((tif) ggeVar.f25106a);
                } catch (IOException e) {
                    g18Var.m27936S(e);
                }
                y3i y3iVar2 = y3i.f54824a;
            }
            if (j18VarArr != null) {
                for (j18 j18Var : j18VarArr) {
                    synchronized (j18Var) {
                        j18Var.m33033b(jM49941c);
                        y3i y3iVar3 = y3i.f54824a;
                    }
                }
            }
        }

        /* renamed from: m */
        public void m27973m() throws Throwable {
            fj6 fj6Var;
            fj6 fj6Var2 = fj6.INTERNAL_ERROR;
            IOException e = null;
            try {
                this.f24426a.m31366d(this);
                while (this.f24426a.m31365c(false, this)) {
                }
                fj6Var = fj6.NO_ERROR;
                try {
                    try {
                        this.f24427b.m27935Q(fj6Var, fj6.CANCEL, null);
                    } catch (IOException e2) {
                        e = e2;
                        fj6 fj6Var3 = fj6.PROTOCOL_ERROR;
                        this.f24427b.m27935Q(fj6Var3, fj6Var3, e);
                        ggj.m28626f(this.f24426a);
                    }
                } catch (Throwable th) {
                    th = th;
                    this.f24427b.m27935Q(fj6Var, fj6Var2, e);
                    ggj.m28626f(this.f24426a);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
                fj6Var = fj6Var2;
            } catch (Throwable th2) {
                th = th2;
                fj6Var = fj6Var2;
                this.f24427b.m27935Q(fj6Var, fj6Var2, e);
                ggj.m28626f(this.f24426a);
                throw th;
            }
            ggj.m28626f(this.f24426a);
        }
    }

    /* renamed from: o.g18$f */
    public static final class C13605f extends kf9 implements uk7 {

        /* renamed from: b */
        public final /* synthetic */ int f24439b;

        /* renamed from: c */
        public final /* synthetic */ rl1 f24440c;

        /* renamed from: d */
        public final /* synthetic */ int f24441d;

        /* renamed from: e */
        public final /* synthetic */ boolean f24442e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13605f(int i, rl1 rl1Var, int i2, boolean z) {
            super(0);
            this.f24439b = i;
            this.f24440c = rl1Var;
            this.f24441d = i2;
            this.f24442e = z;
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m69011invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m69011invoke() {
            g18 g18Var = g18.this;
            int i = this.f24439b;
            rl1 rl1Var = this.f24440c;
            int i2 = this.f24441d;
            boolean z = this.f24442e;
            try {
                boolean zMo31469a = g18Var.f24411y.mo31469a(i, rl1Var, i2, z);
                if (zMo31469a) {
                    g18Var.v0().m34914t(i, fj6.CANCEL);
                }
                if (zMo31469a || z) {
                    synchronized (g18Var) {
                        g18Var.p0.remove(Integer.valueOf(i));
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: o.g18$g */
    public static final class C13606g extends kf9 implements uk7 {

        /* renamed from: b */
        public final /* synthetic */ int f24444b;

        /* renamed from: c */
        public final /* synthetic */ List f24445c;

        /* renamed from: d */
        public final /* synthetic */ boolean f24446d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13606g(int i, List list, boolean z) {
            super(0);
            this.f24444b = i;
            this.f24445c = list;
            this.f24446d = z;
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m69012invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m69012invoke() {
            boolean zMo31472d = g18.this.f24411y.mo31472d(this.f24444b, this.f24445c, this.f24446d);
            g18 g18Var = g18.this;
            int i = this.f24444b;
            boolean z = this.f24446d;
            if (zMo31472d) {
                try {
                    g18Var.v0().m34914t(i, fj6.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (zMo31472d || z) {
                synchronized (g18Var) {
                    g18Var.p0.remove(Integer.valueOf(i));
                }
            }
        }
    }

    /* renamed from: o.g18$h */
    public static final class C13607h extends kf9 implements uk7 {

        /* renamed from: b */
        public final /* synthetic */ int f24448b;

        /* renamed from: c */
        public final /* synthetic */ List f24449c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13607h(int i, List list) {
            super(0);
            this.f24448b = i;
            this.f24449c = list;
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m69013invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m69013invoke() {
            boolean zMo31471c = g18.this.f24411y.mo31471c(this.f24448b, this.f24449c);
            g18 g18Var = g18.this;
            int i = this.f24448b;
            if (zMo31471c) {
                try {
                    g18Var.v0().m34914t(i, fj6.CANCEL);
                    synchronized (g18Var) {
                        g18Var.p0.remove(Integer.valueOf(i));
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    /* renamed from: o.g18$i */
    public static final class C13608i extends kf9 implements uk7 {

        /* renamed from: b */
        public final /* synthetic */ int f24451b;

        /* renamed from: c */
        public final /* synthetic */ fj6 f24452c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13608i(int i, fj6 fj6Var) {
            super(0);
            this.f24451b = i;
            this.f24452c = fj6Var;
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m69014invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m69014invoke() {
            g18.this.f24411y.mo31470b(this.f24451b, this.f24452c);
            g18 g18Var = g18.this;
            int i = this.f24451b;
            synchronized (g18Var) {
                g18Var.p0.remove(Integer.valueOf(i));
                y3i y3iVar = y3i.f54824a;
            }
        }
    }

    /* renamed from: o.g18$j */
    public static final class C13609j extends kf9 implements uk7 {
        public C13609j() {
            super(0);
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() throws IOException {
            m69015invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m69015invoke() throws IOException {
            g18.this.j1(false, 2, 0);
        }
    }

    /* renamed from: o.g18$k */
    public static final class C13610k extends kf9 implements uk7 {

        /* renamed from: b */
        public final /* synthetic */ int f24455b;

        /* renamed from: c */
        public final /* synthetic */ fj6 f24456c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13610k(int i, fj6 fj6Var) {
            super(0);
            this.f24455b = i;
            this.f24456c = fj6Var;
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() throws IOException {
            m69016invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m69016invoke() throws IOException {
            try {
                g18.this.n1(this.f24455b, this.f24456c);
            } catch (IOException e) {
                g18.this.m27936S(e);
            }
        }
    }

    /* renamed from: o.g18$l */
    public static final class C13611l extends kf9 implements uk7 {

        /* renamed from: b */
        public final /* synthetic */ int f24458b;

        /* renamed from: c */
        public final /* synthetic */ long f24459c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13611l(int i, long j) {
            super(0);
            this.f24458b = i;
            this.f24459c = j;
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() throws IOException {
            m69017invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m69017invoke() throws IOException {
            try {
                g18.this.v0().m34902C(this.f24458b, this.f24459c);
            } catch (IOException e) {
                g18.this.m27936S(e);
            }
        }
    }

    static {
        tif tifVar = new tif();
        tifVar.m49946h(7, 65535);
        tifVar.m49946h(5, Opcodes.ACC_ENUM);
        r0 = tifVar;
    }

    public g18(C13601b c13601b) {
        sq8.m48649h(c13601b, "builder");
        boolean zM27942c = c13601b.m27942c();
        this.f24400a = zM27942c;
        this.f24401b = c13601b.m27945f();
        this.f24402c = new LinkedHashMap();
        String strM27943d = c13601b.m27943d();
        this.f24403d = strM27943d;
        this.f24405f = c13601b.m27942c() ? 3 : 2;
        uog uogVarM27951l = c13601b.m27951l();
        this.f24407h = uogVarM27951l;
        tog togVarM51859k = uogVarM27951l.m51859k();
        this.f24408q = togVarM51859k;
        this.f24409s = uogVarM27951l.m51859k();
        this.f24410x = uogVarM27951l.m51859k();
        this.f24411y = c13601b.m27947h();
        this.f24399Z = c13601b.m27944e();
        tif tifVar = new tif();
        if (c13601b.m27942c()) {
            tifVar.m49946h(7, 16777216);
        }
        this.h0 = tifVar;
        this.i0 = r0;
        this.j0 = new x8j(0);
        this.l0 = this.i0.m49941c();
        this.m0 = c13601b.m27949j();
        this.n0 = new k18(c13601b.m27948i(), zM27942c);
        this.o0 = new C13604e(this, new i18(c13601b.m27950k(), zM27942c));
        this.p0 = new LinkedHashSet();
        if (c13601b.m27946g() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(c13601b.m27946g());
            togVarM51859k.m50271k(strM27943d + " ping", nanos, new C13600a(nanos));
        }
    }

    public static /* synthetic */ void V0(g18 g18Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        g18Var.S0(z);
    }

    public final j18 A0(List list, boolean z) {
        sq8.m48649h(list, "requestHeaders");
        return z0(0, list, z);
    }

    public final void E0(int i, im1 im1Var, int i2, boolean z) {
        sq8.m48649h(im1Var, "source");
        rl1 rl1Var = new rl1();
        long j = i2;
        im1Var.k1(j);
        im1Var.N0(rl1Var, j);
        tog.m50260d(this.f24409s, this.f24403d + '[' + i + "] onData", 0L, false, new C13605f(i, rl1Var, i2, z), 6, null);
    }

    public final void F0(int i, List list, boolean z) {
        sq8.m48649h(list, "requestHeaders");
        tog.m50260d(this.f24409s, this.f24403d + '[' + i + "] onHeaders", 0L, false, new C13606g(i, list, z), 6, null);
    }

    public final void G0(int i, List list) {
        sq8.m48649h(list, "requestHeaders");
        synchronized (this) {
            if (this.p0.contains(Integer.valueOf(i))) {
                p1(i, fj6.PROTOCOL_ERROR);
                return;
            }
            this.p0.add(Integer.valueOf(i));
            tog.m50260d(this.f24409s, this.f24403d + '[' + i + "] onRequest", 0L, false, new C13607h(i, list), 6, null);
        }
    }

    public final void H0(int i, fj6 fj6Var) {
        sq8.m48649h(fj6Var, "errorCode");
        tog.m50260d(this.f24409s, this.f24403d + '[' + i + "] onReset", 0L, false, new C13608i(i, fj6Var), 6, null);
    }

    public final boolean I0(int i) {
        return i != 0 && (i & 1) == 0;
    }

    public final synchronized j18 K0(int i) {
        j18 j18Var;
        j18Var = (j18) this.f24402c.remove(Integer.valueOf(i));
        sq8.m48647f(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return j18Var;
    }

    public final void L0() {
        synchronized (this) {
            long j = this.f24396Q;
            long j2 = this.f24395M;
            if (j < j2) {
                return;
            }
            this.f24395M = j2 + 1;
            this.f24398Y = System.nanoTime() + 1000000000;
            y3i y3iVar = y3i.f54824a;
            tog.m50260d(this.f24408q, this.f24403d + " ping", 0L, false, new C13609j(), 6, null);
        }
    }

    public final void O0(int i) {
        this.f24404e = i;
    }

    public final void P0(tif tifVar) {
        sq8.m48649h(tifVar, "<set-?>");
        this.i0 = tifVar;
    }

    /* renamed from: Q */
    public final void m27935Q(fj6 fj6Var, fj6 fj6Var2, IOException iOException) throws IOException {
        int i;
        Object[] array;
        sq8.m48649h(fj6Var, "connectionCode");
        sq8.m48649h(fj6Var2, "streamCode");
        if (jgj.f30421e && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        try {
            R0(fj6Var);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (!this.f24402c.isEmpty()) {
                array = this.f24402c.values().toArray(new j18[0]);
                this.f24402c.clear();
            } else {
                array = null;
            }
            y3i y3iVar = y3i.f54824a;
        }
        j18[] j18VarArr = (j18[]) array;
        if (j18VarArr != null) {
            for (j18 j18Var : j18VarArr) {
                try {
                    j18Var.m33036e(fj6Var2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.n0.close();
        } catch (IOException unused3) {
        }
        try {
            this.m0.close();
        } catch (IOException unused4) {
        }
        this.f24408q.m50276q();
        this.f24409s.m50276q();
        this.f24410x.m50276q();
    }

    public final void R0(fj6 fj6Var) {
        sq8.m48649h(fj6Var, "statusCode");
        synchronized (this.n0) {
            ege egeVar = new ege();
            synchronized (this) {
                if (this.f24406g) {
                    return;
                }
                this.f24406g = true;
                int i = this.f24404e;
                egeVar.f21602a = i;
                y3i y3iVar = y3i.f54824a;
                this.n0.m34909h(i, fj6Var, ggj.f25141a);
            }
        }
    }

    /* renamed from: S */
    public final void m27936S(IOException iOException) throws IOException {
        fj6 fj6Var = fj6.PROTOCOL_ERROR;
        m27935Q(fj6Var, fj6Var, iOException);
    }

    public final void S0(boolean z) {
        if (z) {
            this.n0.m34905c();
            this.n0.m34915u(this.h0);
            if (this.h0.m49941c() != 65535) {
                this.n0.m34902C(0, r9 - 65535);
            }
        }
        tog.m50260d(this.f24407h.m51859k(), this.f24403d, 0L, false, this.o0, 6, null);
    }

    /* renamed from: T */
    public final boolean m27937T() {
        return this.f24400a;
    }

    public final synchronized void W0(long j) {
        x8j.m55853c(this.j0, j, 0L, 2, null);
        long jM55854a = this.j0.m55854a();
        if (jM55854a >= this.h0.m49941c() / 2) {
            q1(0, jM55854a);
            x8j.m55853c(this.j0, 0L, jM55854a, 1, null);
        }
        this.f24399Z.mo16403a(this.j0);
    }

    /* renamed from: X */
    public final String m27938X() {
        return this.f24403d;
    }

    /* renamed from: Y */
    public final a47 m27939Y() {
        return this.f24399Z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.n0.m34911o());
        r6 = r2;
        r8.k0 += r6;
        r4 = p001o.y3i.f54824a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b1(int i, boolean z, rl1 rl1Var, long j) {
        int iMin;
        long j2;
        if (j == 0) {
            this.n0.m34906d(z, i, rl1Var, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        long j3 = this.k0;
                        long j4 = this.l0;
                        if (j3 < j4) {
                            break;
                        }
                        if (!this.f24402c.containsKey(Integer.valueOf(i))) {
                            throw new IOException("stream closed");
                        }
                        sq8.m48647f(this, "null cannot be cast to non-null type java.lang.Object");
                        wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
            }
            j -= j2;
            this.n0.m34906d(z && j == 0, i, rl1Var, iMin);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        m27935Q(fj6.NO_ERROR, fj6.CANCEL, null);
    }

    public final int d0() {
        return this.f24404e;
    }

    public final void d1(int i, boolean z, List list) {
        sq8.m48649h(list, "alternating");
        this.n0.m34910k(z, i, list);
    }

    public final AbstractC13603d f0() {
        return this.f24401b;
    }

    public final void flush() {
        this.n0.flush();
    }

    public final int j0() {
        return this.f24405f;
    }

    public final void j1(boolean z, int i, int i2) throws IOException {
        try {
            this.n0.m34912r(z, i, i2);
        } catch (IOException e) {
            m27936S(e);
        }
    }

    public final tif k0() {
        return this.h0;
    }

    public final tif l0() {
        return this.i0;
    }

    public final void n1(int i, fj6 fj6Var) {
        sq8.m48649h(fj6Var, "statusCode");
        this.n0.m34914t(i, fj6Var);
    }

    public final synchronized j18 o0(int i) {
        return (j18) this.f24402c.get(Integer.valueOf(i));
    }

    public final void p1(int i, fj6 fj6Var) {
        sq8.m48649h(fj6Var, "errorCode");
        tog.m50260d(this.f24408q, this.f24403d + '[' + i + "] writeSynReset", 0L, false, new C13610k(i, fj6Var), 6, null);
    }

    public final void q1(int i, long j) {
        tog.m50260d(this.f24408q, this.f24403d + '[' + i + "] windowUpdate", 0L, false, new C13611l(i, j), 6, null);
    }

    public final Map r0() {
        return this.f24402c;
    }

    public final long u0() {
        return this.l0;
    }

    public final k18 v0() {
        return this.n0;
    }

    public final synchronized boolean y0(long j) {
        if (this.f24406g) {
            return false;
        }
        if (this.f24396Q < this.f24395M) {
            if (j >= this.f24398Y) {
                return false;
            }
        }
        return true;
    }

    public final j18 z0(int i, List list, boolean z) {
        int i2;
        j18 j18Var;
        boolean z2;
        boolean z3 = !z;
        synchronized (this.n0) {
            synchronized (this) {
                if (this.f24405f > 1073741823) {
                    R0(fj6.REFUSED_STREAM);
                }
                if (this.f24406g) {
                    throw new dt3();
                }
                i2 = this.f24405f;
                this.f24405f = i2 + 2;
                j18Var = new j18(i2, this, z3, false, null);
                z2 = !z || this.k0 >= this.l0 || j18Var.m33050s() >= j18Var.m33049r();
                if (j18Var.m33053v()) {
                    this.f24402c.put(Integer.valueOf(i2), j18Var);
                }
                y3i y3iVar = y3i.f54824a;
            }
            if (i == 0) {
                this.n0.m34910k(z3, i2, list);
            } else {
                if (!(true ^ this.f24400a)) {
                    throw new IllegalArgumentException("client streams shouldn't have associated stream IDs".toString());
                }
                this.n0.m34913s(i, i2, list);
            }
        }
        if (z2) {
            this.n0.flush();
        }
        return j18Var;
    }
}
