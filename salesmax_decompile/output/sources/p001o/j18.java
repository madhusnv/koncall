package p001o;

import com.google.android.gms.cast.MediaStatus;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;

/* loaded from: classes6.dex */
public final class j18 {

    /* renamed from: n */
    public static final C14426a f29538n = new C14426a(null);

    /* renamed from: a */
    public final int f29539a;

    /* renamed from: b */
    public final g18 f29540b;

    /* renamed from: c */
    public final x8j f29541c;

    /* renamed from: d */
    public long f29542d;

    /* renamed from: e */
    public long f29543e;

    /* renamed from: f */
    public final ArrayDeque f29544f;

    /* renamed from: g */
    public boolean f29545g;

    /* renamed from: h */
    public final C14428c f29546h;

    /* renamed from: i */
    public final C14427b f29547i;

    /* renamed from: j */
    public final C14429d f29548j;

    /* renamed from: k */
    public final C14429d f29549k;

    /* renamed from: l */
    public fj6 f29550l;

    /* renamed from: m */
    public IOException f29551m;

    /* renamed from: o.j18$a */
    public static final class C14426a {
        public C14426a() {
        }

        public /* synthetic */ C14426a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: o.j18$b */
    public final class C14427b implements dvf {

        /* renamed from: a */
        public boolean f29552a;

        /* renamed from: b */
        public final rl1 f29553b = new rl1();

        /* renamed from: c */
        public wx7 f29554c;

        /* renamed from: d */
        public boolean f29555d;

        public C14427b(boolean z) {
            this.f29552a = z;
        }

        @Override // p001o.dvf
        public void M0(rl1 rl1Var, long j) throws IOException {
            sq8.m48649h(rl1Var, "source");
            j18 j18Var = j18.this;
            if (!jgj.f30421e || !Thread.holdsLock(j18Var)) {
                this.f29553b.M0(rl1Var, j);
                while (this.f29553b.f0() >= MediaStatus.COMMAND_LIKE) {
                    m33058a(false);
                }
            } else {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + j18Var);
            }
        }

        /* renamed from: a */
        public final void m33058a(boolean z) throws IOException {
            long jMin;
            boolean z2;
            j18 j18Var = j18.this;
            synchronized (j18Var) {
                j18Var.m33051t().m17742v();
                while (j18Var.m33050s() >= j18Var.m33049r() && !this.f29552a && !this.f29555d && j18Var.m33041j() == null) {
                    try {
                        j18Var.m33031D();
                    } finally {
                        j18Var.m33051t().m33070C();
                    }
                }
                j18Var.m33051t().m33070C();
                j18Var.m33035d();
                jMin = Math.min(j18Var.m33049r() - j18Var.m33050s(), this.f29553b.f0());
                j18Var.m33028A(j18Var.m33050s() + jMin);
                z2 = z && jMin == this.f29553b.f0();
                y3i y3iVar = y3i.f54824a;
            }
            j18.this.m33051t().m17742v();
            try {
                j18.this.m33040i().b1(j18.this.m33043l(), z2, this.f29553b, jMin);
            } finally {
                j18Var = j18.this;
            }
        }

        /* renamed from: c */
        public final boolean m33059c() {
            return this.f29555d;
        }

        @Override // p001o.dvf, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            j18 j18Var = j18.this;
            if (jgj.f30421e && Thread.holdsLock(j18Var)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + j18Var);
            }
            j18 j18Var2 = j18.this;
            synchronized (j18Var2) {
                if (this.f29555d) {
                    return;
                }
                boolean z = j18Var2.m33041j() == null;
                y3i y3iVar = y3i.f54824a;
                if (!j18.this.m33047p().f29552a) {
                    boolean z2 = this.f29553b.f0() > 0;
                    if (this.f29554c != null) {
                        while (this.f29553b.f0() > 0) {
                            m33058a(false);
                        }
                        g18 g18VarM33040i = j18.this.m33040i();
                        int iM33043l = j18.this.m33043l();
                        wx7 wx7Var = this.f29554c;
                        sq8.m48646e(wx7Var);
                        g18VarM33040i.d1(iM33043l, z, jgj.m33823q(wx7Var));
                    } else if (z2) {
                        while (this.f29553b.f0() > 0) {
                            m33058a(true);
                        }
                    } else if (z) {
                        j18.this.m33040i().b1(j18.this.m33043l(), true, null, 0L);
                    }
                }
                j18 j18Var3 = j18.this;
                synchronized (j18Var3) {
                    this.f29555d = true;
                    sq8.m48647f(j18Var3, "null cannot be cast to non-null type java.lang.Object");
                    j18Var3.notifyAll();
                    y3i y3iVar2 = y3i.f54824a;
                }
                j18.this.m33040i().flush();
                j18.this.m33034c();
            }
        }

        /* renamed from: d */
        public final boolean m33060d() {
            return this.f29552a;
        }

        @Override // p001o.dvf, java.io.Flushable
        public void flush() throws IOException {
            j18 j18Var = j18.this;
            if (jgj.f30421e && Thread.holdsLock(j18Var)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + j18Var);
            }
            j18 j18Var2 = j18.this;
            synchronized (j18Var2) {
                j18Var2.m33035d();
                y3i y3iVar = y3i.f54824a;
            }
            while (this.f29553b.f0() > 0) {
                m33058a(false);
                j18.this.m33040i().flush();
            }
        }

        @Override // p001o.dvf
        public nmh timeout() {
            return j18.this.m33051t();
        }
    }

    /* renamed from: o.j18$c */
    public final class C14428c implements lzf {

        /* renamed from: a */
        public final long f29557a;

        /* renamed from: b */
        public boolean f29558b;

        /* renamed from: c */
        public final rl1 f29559c = new rl1();

        /* renamed from: d */
        public final rl1 f29560d = new rl1();

        /* renamed from: e */
        public wx7 f29561e;

        /* renamed from: f */
        public boolean f29562f;

        public C14428c(long j, boolean z) {
            this.f29557a = j;
            this.f29558b = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x00b9 A[Catch: all -> 0x0104, DONT_GENERATE, TRY_ENTER, TryCatch #0 {, blocks: (B:9:0x0019, B:11:0x001f, B:37:0x00b9, B:38:0x00c0, B:53:0x00fc, B:54:0x0103, B:12:0x0026, B:14:0x002c, B:16:0x0030, B:18:0x0036, B:20:0x0044, B:22:0x0048, B:24:0x0054, B:26:0x007b, B:28:0x008e, B:29:0x00a9, B:32:0x00af, B:49:0x00f1, B:50:0x00f8), top: B:60:0x0019, inners: #1 }] */
        @Override // p001o.lzf
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public long N0(rl1 rl1Var, long j) throws IOException {
            IOException iOExceptionM33042k;
            long jN0;
            boolean z;
            sq8.m48649h(rl1Var, "sink");
            long j2 = 0;
            if (!(j >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            }
            while (true) {
                j18 j18Var = j18.this;
                synchronized (j18Var) {
                    boolean zM33039h = j18Var.m33039h();
                    if (zM33039h) {
                        j18Var.m33045n().m17742v();
                    }
                    try {
                        if (j18Var.m33041j() == null || this.f29558b) {
                            iOExceptionM33042k = null;
                        } else {
                            iOExceptionM33042k = j18Var.m33042k();
                            if (iOExceptionM33042k == null) {
                                fj6 fj6VarM33041j = j18Var.m33041j();
                                sq8.m48646e(fj6VarM33041j);
                                iOExceptionM33042k = new b7g(fj6VarM33041j);
                            }
                        }
                        if (this.f29562f) {
                            throw new IOException("stream closed");
                        }
                        if (this.f29560d.f0() > j2) {
                            rl1 rl1Var2 = this.f29560d;
                            jN0 = rl1Var2.N0(rl1Var, Math.min(j, rl1Var2.f0()));
                            x8j.m55853c(j18Var.m33044m(), jN0, 0L, 2, null);
                            long jM55854a = j18Var.m33044m().m55854a();
                            if (iOExceptionM33042k == null && jM55854a >= j18Var.m33040i().k0().m49941c() / 2) {
                                j18Var.m33040i().q1(j18Var.m33043l(), jM55854a);
                                x8j.m55853c(j18Var.m33044m(), 0L, jM55854a, 1, null);
                            }
                        } else if (this.f29558b || iOExceptionM33042k != null) {
                            jN0 = -1;
                        } else {
                            j18Var.m33031D();
                            jN0 = -1;
                            z = true;
                            y3i y3iVar = y3i.f54824a;
                        }
                        z = false;
                        y3i y3iVar2 = y3i.f54824a;
                    } finally {
                        if (zM33039h) {
                            j18Var.m33045n().m33070C();
                        }
                    }
                }
                j18.this.m33040i().m27939Y().mo16404b(j18.this.m33043l(), j18.this.m33044m(), this.f29560d.f0());
                if (!z) {
                    if (jN0 != -1) {
                        return jN0;
                    }
                    if (iOExceptionM33042k == null) {
                        return -1L;
                    }
                    throw iOExceptionM33042k;
                }
                j2 = 0;
            }
        }

        /* renamed from: a */
        public final boolean m33061a() {
            return this.f29562f;
        }

        /* renamed from: c */
        public final boolean m33062c() {
            return this.f29558b;
        }

        @Override // p001o.lzf, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long jF0;
            j18 j18Var = j18.this;
            synchronized (j18Var) {
                this.f29562f = true;
                jF0 = this.f29560d.f0();
                this.f29560d.clear();
                sq8.m48647f(j18Var, "null cannot be cast to non-null type java.lang.Object");
                j18Var.notifyAll();
                y3i y3iVar = y3i.f54824a;
            }
            if (jF0 > 0) {
                m33069r(jF0);
            }
            j18.this.m33034c();
        }

        /* renamed from: d */
        public final rl1 m33063d() {
            return this.f29560d;
        }

        /* renamed from: f */
        public final rl1 m33064f() {
            return this.f29559c;
        }

        /* renamed from: g */
        public final wx7 m33065g() {
            return this.f29561e;
        }

        /* renamed from: h */
        public final void m33066h(im1 im1Var, long j) throws EOFException {
            boolean z;
            boolean z2;
            boolean z3;
            sq8.m48649h(im1Var, "source");
            j18 j18Var = j18.this;
            if (jgj.f30421e && Thread.holdsLock(j18Var)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + j18Var);
            }
            long j2 = j;
            while (j2 > 0) {
                synchronized (j18.this) {
                    z = this.f29558b;
                    z2 = true;
                    z3 = this.f29560d.f0() + j2 > this.f29557a;
                    y3i y3iVar = y3i.f54824a;
                }
                if (z3) {
                    im1Var.skip(j2);
                    j18.this.m33038g(fj6.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z) {
                    im1Var.skip(j2);
                    return;
                }
                long jN0 = im1Var.N0(this.f29559c, j2);
                if (jN0 == -1) {
                    throw new EOFException();
                }
                j2 -= jN0;
                j18 j18Var2 = j18.this;
                synchronized (j18Var2) {
                    if (this.f29562f) {
                        this.f29559c.clear();
                    } else {
                        if (this.f29560d.f0() != 0) {
                            z2 = false;
                        }
                        this.f29560d.p0(this.f29559c);
                        if (z2) {
                            sq8.m48647f(j18Var2, "null cannot be cast to non-null type java.lang.Object");
                            j18Var2.notifyAll();
                        }
                    }
                }
            }
            m33069r(j);
            j18.this.m33040i().m27939Y().mo16404b(j18.this.m33043l(), j18.this.m33044m(), this.f29560d.f0());
        }

        /* renamed from: k */
        public final void m33067k(boolean z) {
            this.f29558b = z;
        }

        /* renamed from: o */
        public final void m33068o(wx7 wx7Var) {
            this.f29561e = wx7Var;
        }

        /* renamed from: r */
        public final void m33069r(long j) {
            j18 j18Var = j18.this;
            if (!jgj.f30421e || !Thread.holdsLock(j18Var)) {
                j18.this.m33040i().W0(j);
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + j18Var);
        }

        @Override // p001o.lzf
        public nmh timeout() {
            return j18.this.m33045n();
        }
    }

    /* renamed from: o.j18$d */
    public final class C14429d extends as0 {
        public C14429d() {
        }

        @Override // p001o.as0
        /* renamed from: B */
        public void mo17740B() {
            j18.this.m33038g(fj6.CANCEL);
            j18.this.m33040i().L0();
        }

        /* renamed from: C */
        public final void m33070C() throws IOException {
            if (m17743w()) {
                throw mo17744x(null);
            }
        }

        @Override // p001o.as0
        /* renamed from: x */
        public IOException mo17744x(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }
    }

    public j18(int i, g18 g18Var, boolean z, boolean z2, wx7 wx7Var) {
        sq8.m48649h(g18Var, "connection");
        this.f29539a = i;
        this.f29540b = g18Var;
        this.f29541c = new x8j(i);
        this.f29543e = g18Var.l0().m49941c();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f29544f = arrayDeque;
        this.f29546h = new C14428c(g18Var.k0().m49941c(), z2);
        this.f29547i = new C14427b(z);
        this.f29548j = new C14429d();
        this.f29549k = new C14429d();
        if (wx7Var == null) {
            if (!m33052u()) {
                throw new IllegalStateException("remotely-initiated streams should have headers".toString());
            }
        } else {
            if (!(!m33052u())) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
            }
            arrayDeque.add(wx7Var);
        }
    }

    /* renamed from: A */
    public final void m33028A(long j) {
        this.f29542d = j;
    }

    /* renamed from: B */
    public final synchronized wx7 m33029B(boolean z) {
        Object objRemoveFirst;
        while (true) {
            boolean z2 = true;
            if (!this.f29544f.isEmpty() || this.f29550l != null) {
                break;
            }
            if (!z && !m33039h()) {
                z2 = false;
            }
            if (z2) {
                this.f29548j.m17742v();
            }
            try {
                m33031D();
                if (z2) {
                    this.f29548j.m33070C();
                }
            } catch (Throwable th) {
                if (z2) {
                    this.f29548j.m33070C();
                }
                throw th;
            }
        }
        if (!(!this.f29544f.isEmpty())) {
            IOException iOException = this.f29551m;
            if (iOException != null) {
                throw iOException;
            }
            fj6 fj6Var = this.f29550l;
            sq8.m48646e(fj6Var);
            throw new b7g(fj6Var);
        }
        objRemoveFirst = this.f29544f.removeFirst();
        sq8.m48648g(objRemoveFirst, "removeFirst(...)");
        return (wx7) objRemoveFirst;
    }

    /* renamed from: C */
    public final synchronized wx7 m33030C() throws IOException {
        wx7 wx7VarM33065g;
        if (!this.f29546h.m33062c() || !this.f29546h.m33064f().mo32311n() || !this.f29546h.m33063d().mo32311n()) {
            if (this.f29550l == null) {
                throw new IllegalStateException("too early; can't read the trailers yet");
            }
            IOException iOException = this.f29551m;
            if (iOException != null) {
                throw iOException;
            }
            fj6 fj6Var = this.f29550l;
            sq8.m48646e(fj6Var);
            throw new b7g(fj6Var);
        }
        wx7VarM33065g = this.f29546h.m33065g();
        if (wx7VarM33065g == null) {
            wx7VarM33065g = jgj.f30417a;
        }
        return wx7VarM33065g;
    }

    /* renamed from: D */
    public final void m33031D() throws InterruptedException, InterruptedIOException {
        try {
            sq8.m48647f(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* renamed from: E */
    public final nmh m33032E() {
        return this.f29549k;
    }

    /* renamed from: b */
    public final void m33033b(long j) {
        this.f29543e += j;
        if (j > 0) {
            sq8.m48647f(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    /* renamed from: c */
    public final void m33034c() {
        boolean z;
        boolean zM33053v;
        if (jgj.f30421e && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            z = !this.f29546h.m33062c() && this.f29546h.m33061a() && (this.f29547i.m33060d() || this.f29547i.m33059c());
            zM33053v = m33053v();
            y3i y3iVar = y3i.f54824a;
        }
        if (z) {
            m33036e(fj6.CANCEL, null);
        } else {
            if (zM33053v) {
                return;
            }
            this.f29540b.K0(this.f29539a);
        }
    }

    /* renamed from: d */
    public final void m33035d() throws IOException {
        if (this.f29547i.m33059c()) {
            throw new IOException("stream closed");
        }
        if (this.f29547i.m33060d()) {
            throw new IOException("stream finished");
        }
        if (this.f29550l != null) {
            IOException iOException = this.f29551m;
            if (iOException != null) {
                throw iOException;
            }
            fj6 fj6Var = this.f29550l;
            sq8.m48646e(fj6Var);
            throw new b7g(fj6Var);
        }
    }

    /* renamed from: e */
    public final void m33036e(fj6 fj6Var, IOException iOException) {
        sq8.m48649h(fj6Var, "rstStatusCode");
        if (m33037f(fj6Var, iOException)) {
            this.f29540b.n1(this.f29539a, fj6Var);
        }
    }

    /* renamed from: f */
    public final boolean m33037f(fj6 fj6Var, IOException iOException) {
        if (jgj.f30421e && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (this.f29550l != null) {
                return false;
            }
            this.f29550l = fj6Var;
            this.f29551m = iOException;
            sq8.m48647f(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            if (this.f29546h.m33062c() && this.f29547i.m33060d()) {
                return false;
            }
            y3i y3iVar = y3i.f54824a;
            this.f29540b.K0(this.f29539a);
            return true;
        }
    }

    /* renamed from: g */
    public final void m33038g(fj6 fj6Var) {
        sq8.m48649h(fj6Var, "errorCode");
        if (m33037f(fj6Var, null)) {
            this.f29540b.p1(this.f29539a, fj6Var);
        }
    }

    /* renamed from: h */
    public final boolean m33039h() {
        return !this.f29540b.m27937T() || this.f29547i.m33059c() || this.f29547i.m33060d();
    }

    /* renamed from: i */
    public final g18 m33040i() {
        return this.f29540b;
    }

    /* renamed from: j */
    public final synchronized fj6 m33041j() {
        return this.f29550l;
    }

    /* renamed from: k */
    public final IOException m33042k() {
        return this.f29551m;
    }

    /* renamed from: l */
    public final int m33043l() {
        return this.f29539a;
    }

    /* renamed from: m */
    public final x8j m33044m() {
        return this.f29541c;
    }

    /* renamed from: n */
    public final C14429d m33045n() {
        return this.f29548j;
    }

    /* renamed from: o */
    public final dvf m33046o() {
        synchronized (this) {
            if (!(this.f29545g || m33052u())) {
                throw new IllegalStateException("reply before requesting the sink".toString());
            }
            y3i y3iVar = y3i.f54824a;
        }
        return this.f29547i;
    }

    /* renamed from: p */
    public final C14427b m33047p() {
        return this.f29547i;
    }

    /* renamed from: q */
    public final C14428c m33048q() {
        return this.f29546h;
    }

    /* renamed from: r */
    public final long m33049r() {
        return this.f29543e;
    }

    /* renamed from: s */
    public final long m33050s() {
        return this.f29542d;
    }

    /* renamed from: t */
    public final C14429d m33051t() {
        return this.f29549k;
    }

    /* renamed from: u */
    public final boolean m33052u() {
        return this.f29540b.m27937T() == ((this.f29539a & 1) == 1);
    }

    /* renamed from: v */
    public final synchronized boolean m33053v() {
        if (this.f29550l != null) {
            return false;
        }
        if ((this.f29546h.m33062c() || this.f29546h.m33061a()) && (this.f29547i.m33060d() || this.f29547i.m33059c())) {
            if (this.f29545g) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: w */
    public final nmh m33054w() {
        return this.f29548j;
    }

    /* renamed from: x */
    public final void m33055x(im1 im1Var, int i) {
        sq8.m48649h(im1Var, "source");
        if (!jgj.f30421e || !Thread.holdsLock(this)) {
            this.f29546h.m33066h(im1Var, i);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    /* renamed from: y */
    public final void m33056y(wx7 wx7Var, boolean z) {
        boolean zM33053v;
        sq8.m48649h(wx7Var, "headers");
        if (jgj.f30421e && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (this.f29545g && wx7Var.m55327d(":status") == null && wx7Var.m55327d(":method") == null) {
                this.f29546h.m33068o(wx7Var);
            } else {
                this.f29545g = true;
                this.f29544f.add(wx7Var);
            }
            if (z) {
                this.f29546h.m33067k(true);
            }
            zM33053v = m33053v();
            sq8.m48647f(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            y3i y3iVar = y3i.f54824a;
        }
        if (zM33053v) {
            return;
        }
        this.f29540b.K0(this.f29539a);
    }

    /* renamed from: z */
    public final synchronized void m33057z(fj6 fj6Var) {
        sq8.m48649h(fj6Var, "errorCode");
        if (this.f29550l == null) {
            this.f29550l = fj6Var;
            sq8.m48647f(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }
}
