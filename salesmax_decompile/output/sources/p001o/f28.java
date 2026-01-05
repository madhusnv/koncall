package p001o;

import java.io.IOException;
import java.io.PrintWriter;
import org.apache.http.HttpStatus;
import org.apache.http.protocol.HTTP;
import p001o.r7;
import p001o.u38;
import p001o.ul1;

/* loaded from: classes6.dex */
public class f28 {

    /* renamed from: y */
    public static int f22563y = -2;

    /* renamed from: z */
    public static ThreadLocal f22564z = new ThreadLocal();

    /* renamed from: a */
    public long f22565a = System.currentTimeMillis();

    /* renamed from: b */
    public int f22566b;

    /* renamed from: c */
    public boolean f22567c;

    /* renamed from: d */
    public boolean f22568d;

    /* renamed from: e */
    public final lt3 f22569e;

    /* renamed from: f */
    public final y76 f22570f;

    /* renamed from: g */
    public final bgf f22571g;

    /* renamed from: h */
    public final v48 f22572h;

    /* renamed from: i */
    public final ixc f22573i;

    /* renamed from: j */
    public final e38 f22574j;

    /* renamed from: k */
    public final vle f22575k;

    /* renamed from: l */
    public xgf f22576l;

    /* renamed from: m */
    public final zn7 f22577m;

    /* renamed from: n */
    public final e38 f22578n;

    /* renamed from: o */
    public final are f22579o;

    /* renamed from: p */
    public C13315a f22580p;

    /* renamed from: q */
    public C13316b f22581q;

    /* renamed from: r */
    public PrintWriter f22582r;

    /* renamed from: s */
    public int f22583s;

    /* renamed from: t */
    public transient int f22584t;

    /* renamed from: u */
    public transient int f22585u;

    /* renamed from: v */
    public transient boolean f22586v;

    /* renamed from: w */
    public transient boolean f22587w;

    /* renamed from: x */
    public transient boolean f22588x;

    /* renamed from: o.f28$a */
    public class C13315a extends r7.C16546a {
        public C13315a() {
            super((r7) f28.this.f22577m, f28.this.f22569e.mo24447l());
        }

        @Override // p001o.r7.C16546a, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f43091e) {
                return;
            }
            if (f28.this.m25988G() || this.f43088b.mo46285f()) {
                f28.this.m25994p();
            } else {
                f28.this.m25991m(true);
            }
            super.close();
        }

        @Override // p001o.r7.C16546a, java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            if (!this.f43088b.mo46285f()) {
                f28.this.m25991m(false);
            }
            super.flush();
        }
    }

    /* renamed from: o.f28$b */
    public class C13316b extends r7.C16547b {
        public C13316b() {
            super(f28.this.f22580p);
        }
    }

    /* renamed from: o.f28$c */
    public class C13317c extends u38.AbstractC17288a {

        /* renamed from: a */
        public String f22591a;

        public C13317c() {
        }

        @Override // p001o.u38.AbstractC17288a
        /* renamed from: a */
        public void mo26005a(sl1 sl1Var) throws Throwable {
            f28 f28Var = f28.this;
            y76 y76Var = f28Var.f22570f;
            if (f28Var.f22588x) {
                f28.this.f22588x = false;
                f28.this.m25986E();
            }
        }

        @Override // p001o.u38.AbstractC17288a
        /* renamed from: b */
        public void mo26006b() throws Throwable {
            f28 f28Var = f28.this;
            y76 y76Var = f28Var.f22570f;
            f28.m25981l(f28Var);
            f28 f28Var2 = f28.this;
            f28Var2.f22577m.setVersion(f28Var2.f22585u);
            int i = f28.this.f22585u;
            if (i == 10) {
                f28 f28Var3 = f28.this;
                f28Var3.f22577m.mo46290m(f28Var3.f22586v);
            } else if (i == 11) {
                f28 f28Var4 = f28.this;
                f28Var4.f22577m.mo46290m(f28Var4.f22586v);
                if (f28.this.f22571g.m18896J()) {
                    f28 f28Var5 = f28.this;
                    f28Var5.f22578n.m24188q(j38.f29708m, f28Var5.f22575k.m52943u(), f28.this.f22575k.m52942t());
                }
                if (!f28.this.f22587w) {
                    f28.this.f22577m.mo46284e(400, null);
                    f28.this.f22578n.m24187p(j38.f29706k, i38.f27984e);
                    f28 f28Var6 = f28.this;
                    f28Var6.f22577m.mo28019h(f28Var6.f22578n, true);
                    f28.this.f22577m.mo28017c();
                    return;
                }
                if (f28.this.f22584t != f28.f22563y) {
                    if (f28.this.f22584t == 6) {
                        if (((u38) f28.this.f22573i).m50886i() == null || ((u38) f28.this.f22573i).m50886i().length() < 2) {
                            f28.this.f22577m.mo46284e(100, null);
                            f28.this.f22577m.mo28019h(null, true);
                            f28.this.f22577m.mo28017c();
                            f28.this.f22577m.mo28016a(false);
                        }
                    } else if (f28.this.f22584t != 7) {
                        f28.this.f22577m.mo46284e(HttpStatus.SC_EXPECTATION_FAILED, null);
                        f28.this.f22578n.m24187p(j38.f29706k, i38.f27984e);
                        f28 f28Var7 = f28.this;
                        f28Var7.f22577m.mo28019h(f28Var7.f22578n, true);
                        f28.this.f22577m.mo28017c();
                        return;
                    }
                }
            }
            String str = this.f22591a;
            if (str != null) {
                f28.this.f22575k.m52946x(str);
            }
            if (((u38) f28.this.f22573i).m50885h() > 0 || ((u38) f28.this.f22573i).m50888k()) {
                f28.this.f22588x = true;
            } else {
                f28.this.m25986E();
            }
        }

        @Override // p001o.u38.AbstractC17288a
        /* renamed from: c */
        public void mo26007c(long j) throws Throwable {
            if (f28.this.f22588x) {
                f28.this.f22588x = false;
                f28.this.m25986E();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
        @Override // p001o.u38.AbstractC17288a
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo26008d(sl1 sl1Var, sl1 sl1Var2) {
            int iM51694f = j38.f29699d.m51694f(sl1Var);
            if (iM51694f == 1) {
                int iM51694f2 = i38.f27983d.m51694f(sl1Var2);
                if (iM51694f2 == -1) {
                    n5e n5eVar = new n5e(sl1Var2.toString(), ",");
                    while (n5eVar.hasMoreTokens()) {
                        ul1.C17390a c17390aM51691c = i38.f27983d.m51691c(n5eVar.nextToken().trim());
                        if (c17390aM51691c != null) {
                            int iM51698j = c17390aM51691c.m51698j();
                            if (iM51698j == 1) {
                                f28.this.f22578n.m24174a(j38.f29706k, i38.f27984e);
                                f28.this.f22577m.mo46288j(false);
                            } else if (iM51698j == 5 && f28.this.f22585u == 10) {
                                f28.this.f22578n.m24174a(j38.f29706k, i38.f27988i);
                            }
                        }
                    }
                } else if (iM51694f2 == 1) {
                    f28.this.f22578n.m24187p(j38.f29706k, i38.f27984e);
                    f28.this.f22577m.mo46288j(false);
                } else if (iM51694f2 == 5 && f28.this.f22585u == 10) {
                    f28.this.f22578n.m24187p(j38.f29706k, i38.f27988i);
                }
            } else if (iM51694f == 16) {
                sl1Var2 = yeb.f55360b.m51696h(sl1Var2);
                this.f22591a = yeb.m57702a(sl1Var2);
            } else if (iM51694f == 21) {
                sl1Var2 = i38.f27983d.m51696h(sl1Var2);
            } else if (iM51694f == 24) {
                i38 i38Var = i38.f27983d;
                sl1Var2 = i38Var.m51696h(sl1Var2);
                f28.this.f22584t = i38Var.m51694f(sl1Var2);
            } else if (iM51694f == 27) {
                f28.this.f22587w = true;
            } else if (iM51694f == 40) {
            }
            f28.this.f22574j.m24174a(sl1Var, sl1Var2);
        }

        @Override // p001o.u38.AbstractC17288a
        /* renamed from: e */
        public void mo26009e(sl1 sl1Var, sl1 sl1Var2, sl1 sl1Var3) throws a38 {
            f28.this.f22587w = false;
            f28.this.f22584t = f28.f22563y;
            f28.this.f22588x = false;
            this.f22591a = null;
            if (f28.this.f22575k.m52942t() == 0) {
                f28.this.f22575k.m52921G(System.currentTimeMillis());
            }
            f28.this.f22575k.m52948z(sl1Var.toString());
            try {
                f28.this.f22572h.m52311k(sl1Var2.j0(), sl1Var2.mo48451r(), sl1Var2.length());
                f28 f28Var = f28.this;
                f28Var.f22575k.m52922H(f28Var.f22572h);
                if (sl1Var3 == null) {
                    f28.this.f22575k.m52916B("");
                    f28.this.f22585u = 9;
                } else {
                    ul1 ul1Var = z48.f56508a;
                    ul1.C17390a c17390aM51692d = ul1Var.m51692d(sl1Var3);
                    f28.this.f22585u = ul1Var.m51694f(c17390aM51692d);
                    if (f28.this.f22585u <= 0) {
                        f28.this.f22585u = 10;
                    }
                    f28.this.f22575k.m52916B(c17390aM51692d.toString());
                }
                f28.this.f22586v = sl1Var == r38.f42889d;
            } catch (Exception e) {
                tia.m49922d(e);
                throw new a38(400, null, e);
            }
        }

        @Override // p001o.u38.AbstractC17288a
        /* renamed from: f */
        public void mo26010f(sl1 sl1Var, int i, sl1 sl1Var2) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Bad request!: ");
            stringBuffer.append(sl1Var);
            stringBuffer.append(" ");
            stringBuffer.append(i);
            stringBuffer.append(" ");
            stringBuffer.append(sl1Var2);
            tia.m49920b(stringBuffer.toString());
        }

        public /* synthetic */ C13317c(f28 f28Var, e28 e28Var) {
            this();
        }
    }

    public f28(lt3 lt3Var, y76 y76Var, bgf bgfVar) {
        int i = f22563y;
        this.f22584t = i;
        this.f22585u = i;
        this.f22586v = false;
        this.f22587w = false;
        this.f22588x = false;
        String str = b1i.f15461a;
        this.f22572h = str == HTTP.UTF_8 ? new v48() : new c76(str);
        this.f22569e = lt3Var;
        this.f22570f = y76Var;
        this.f22573i = new u38(lt3Var, y76Var, new C13317c(this, null), lt3Var.m37871e(), lt3Var.m37872m());
        this.f22574j = new e38();
        this.f22578n = new e38();
        this.f22575k = new vle(this);
        this.f22579o = new are(this);
        g38 g38Var = new g38(lt3Var, y76Var, lt3Var.m37871e(), lt3Var.m37873q());
        this.f22577m = g38Var;
        g38Var.mo46291n(bgfVar.m18897L());
        this.f22571g = bgfVar;
    }

    /* renamed from: J */
    public static void m25969J(f28 f28Var) {
        f22564z.set(f28Var);
    }

    /* renamed from: l */
    public static /* synthetic */ int m25981l(f28 f28Var) {
        int i = f28Var.f22566b;
        f28Var.f22566b = i + 1;
        return i;
    }

    /* renamed from: A */
    public are m25982A() {
        return this.f22579o;
    }

    /* renamed from: B */
    public e38 m25983B() {
        return this.f22578n;
    }

    /* renamed from: C */
    public long m25984C() {
        return this.f22565a;
    }

    /* renamed from: D */
    public void m25985D() throws IOException {
        int i;
        boolean z = true;
        int i2 = 0;
        while (z) {
            try {
                try {
                    synchronized (this) {
                        if (this.f22567c) {
                            throw new IllegalStateException();
                        }
                        this.f22567c = true;
                    }
                    m25969J(this);
                    this.f22575k.m52929g();
                    long jMo32885d = !this.f22573i.isComplete() ? this.f22573i.mo32885d() : 0L;
                    while (this.f22577m.mo46285f() && !this.f22577m.isComplete()) {
                        long jFlush = this.f22577m.flush();
                        jMo32885d += jFlush;
                        if (jFlush <= 0) {
                            break;
                        } else if (this.f22570f.mo51049g()) {
                            this.f22570f.flush();
                        }
                    }
                    if (this.f22570f.mo51049g()) {
                        this.f22570f.flush();
                        if (!this.f22570f.mo51049g()) {
                            i2 = 0;
                        }
                    }
                    if (jMo32885d > 0) {
                        i = 0;
                    } else {
                        i = i2 + 1;
                        if (i2 >= 2) {
                            m25969J(null);
                            boolean z2 = this.f22573i.mo32884c() || this.f22570f.mo51052l();
                            synchronized (this) {
                                this.f22567c = false;
                                if (this.f22568d) {
                                    m25993o();
                                    return;
                                }
                                if (this.f22573i.isComplete() && this.f22577m.isComplete() && !this.f22570f.mo51049g()) {
                                    if (!this.f22577m.isPersistent()) {
                                        this.f22573i.mo32882a(true);
                                        z2 = false;
                                    }
                                    if (z2) {
                                        m25990I(false);
                                        if (!this.f22573i.mo32884c()) {
                                            this.f22570f.mo51052l();
                                        }
                                    } else {
                                        m25990I(true);
                                    }
                                }
                                this.f22575k.m52929g();
                                if (this.f22577m.mo46285f()) {
                                    this.f22577m.isComplete();
                                    return;
                                }
                                return;
                            }
                        }
                    }
                    m25969J(null);
                    z = this.f22573i.mo32884c() || this.f22570f.mo51052l();
                    synchronized (this) {
                        this.f22567c = false;
                        if (this.f22568d) {
                            m25993o();
                            return;
                        }
                    }
                    if (this.f22573i.isComplete() && this.f22577m.isComplete() && !this.f22570f.mo51049g()) {
                        if (!this.f22577m.isPersistent()) {
                            this.f22573i.mo32882a(true);
                            z = false;
                        }
                        if (z) {
                            m25990I(false);
                            z = this.f22573i.mo32884c() || this.f22570f.mo51052l();
                        } else {
                            m25990I(true);
                        }
                        i2 = 0;
                    } else {
                        i2 = i;
                    }
                    this.f22575k.m52929g();
                    if (this.f22577m.mo46285f()) {
                        this.f22577m.isComplete();
                    }
                } catch (a38 e) {
                    if (tia.m49926h()) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("uri=");
                        stringBuffer.append(this.f22572h);
                        tia.m49920b(stringBuffer.toString());
                        StringBuffer stringBuffer2 = new StringBuffer();
                        stringBuffer2.append("fields=");
                        stringBuffer2.append(this.f22574j);
                        tia.m49920b(stringBuffer2.toString());
                        tia.m49922d(e);
                    }
                    this.f22577m.mo46289l(e.m16375b(), e.m16374a(), null, true);
                    this.f22573i.mo32882a(true);
                    this.f22570f.close();
                    throw e;
                }
            } catch (Throwable th) {
                m25969J(null);
                boolean z3 = this.f22573i.mo32884c() || this.f22570f.mo51052l();
                synchronized (this) {
                    this.f22567c = false;
                    if (this.f22568d) {
                        m25993o();
                        return;
                    }
                    if (this.f22573i.isComplete() && this.f22577m.isComplete() && !this.f22570f.mo51049g()) {
                        if (!this.f22577m.isPersistent()) {
                            this.f22573i.mo32882a(true);
                            z3 = false;
                        }
                        if (z3) {
                            m25990I(false);
                            if (!this.f22573i.mo32884c()) {
                                this.f22570f.mo51052l();
                            }
                        } else {
                            m25990I(true);
                        }
                    }
                    this.f22575k.m52929g();
                    if (this.f22577m.mo46285f()) {
                        this.f22577m.isComplete();
                    }
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012f A[PHI: r3
      0x012f: PHI (r3v4 java.lang.String) = (r3v0 java.lang.String), (r3v3 java.lang.String), (r3v6 java.lang.String) binds: [B:52:0x012d, B:75:0x0197, B:66:0x0174] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01dc  */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m25986E() throws Throwable {
        String strM18099b;
        String str;
        String name;
        if (this.f22571g.isRunning()) {
            int i = 404;
            i = 404;
            String str2 = null;
            try {
                try {
                    try {
                        strM18099b = b1i.m18099b(this.f22572h.mo20366d());
                        try {
                        } catch (Throwable th) {
                            th = th;
                            str = null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        str = str2;
                        if (str != null) {
                        }
                        this.f22575k.m52929g();
                        if (this.f22570f.isOpen()) {
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    strM18099b = null;
                    str = null;
                }
            } catch (a38 e) {
                e = e;
            } catch (dj6 e2) {
                e = e2;
            }
            if (strM18099b == null) {
                throw new a38(400);
            }
            this.f22575k.m52915A(strM18099b);
            C13315a c13315a = this.f22580p;
            if (c13315a != null) {
                c13315a.m46296c();
            }
            if (tia.m49926h()) {
                name = Thread.currentThread().getName();
                try {
                    Thread threadCurrentThread = Thread.currentThread();
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(name);
                    stringBuffer.append(" - ");
                    stringBuffer.append(this.f22572h);
                    threadCurrentThread.setName(stringBuffer.toString());
                } catch (a38 e3) {
                    e = e3;
                    str2 = name;
                    tia.m49922d(e);
                    this.f22575k.m52947y(true);
                    this.f22579o.m17716o(e.m16375b(), e.m16374a());
                    if (str2 != null) {
                        Thread.currentThread().setName(str2);
                    }
                    this.f22575k.m52929g();
                    if (this.f22570f.isOpen()) {
                        if (this.f22577m.isPersistent()) {
                            this.f22569e.mo24445h(this.f22570f);
                        }
                        y76 y76Var = this.f22570f;
                        y76Var.close();
                        i = y76Var;
                    }
                    are areVar = this.f22579o;
                    areVar.m17707f();
                    i = areVar;
                } catch (dj6 e4) {
                    e = e4;
                    str2 = name;
                    tia.m49923e(e);
                    if (str2 != null) {
                        Thread.currentThread().setName(str2);
                    }
                    this.f22575k.m52929g();
                    if (this.f22570f.isOpen()) {
                        if (this.f22577m.isPersistent()) {
                        }
                        y76 y76Var2 = this.f22570f;
                        y76Var2.close();
                        i = y76Var2;
                    }
                    are areVar2 = this.f22579o;
                    areVar2.m17707f();
                    i = areVar2;
                } catch (Throwable th4) {
                    str = name;
                    th = th4;
                    try {
                        if (th instanceof ThreadDeath) {
                            throw th;
                        }
                        if (strM18099b == null) {
                            StringBuffer stringBuffer2 = new StringBuffer();
                            stringBuffer2.append(this.f22572h);
                            stringBuffer2.append(": ");
                            stringBuffer2.append(th);
                            tia.m49928j(stringBuffer2.toString());
                            tia.m49922d(th);
                            this.f22575k.m52947y(true);
                            this.f22577m.mo46289l(400, null, null, true);
                        } else {
                            StringBuffer stringBuffer3 = new StringBuffer();
                            stringBuffer3.append("");
                            stringBuffer3.append(this.f22572h);
                            tia.m49930l(stringBuffer3.toString(), th);
                            this.f22575k.m52947y(true);
                            this.f22577m.mo46289l(500, null, null, true);
                        }
                        if (str != null) {
                            Thread.currentThread().setName(str);
                        }
                        this.f22575k.m52929g();
                        if (this.f22570f.isOpen()) {
                            if (this.f22577m.isPersistent()) {
                            }
                            y76 y76Var22 = this.f22570f;
                            y76Var22.close();
                            i = y76Var22;
                        }
                        are areVar22 = this.f22579o;
                        areVar22.m17707f();
                        i = areVar22;
                    } catch (Throwable th5) {
                        th = th5;
                        if (str != null) {
                            Thread.currentThread().setName(str);
                        }
                        this.f22575k.m52929g();
                        if (this.f22570f.isOpen()) {
                            this.f22579o.m17707f();
                        } else {
                            if (this.f22577m.isPersistent()) {
                                this.f22569e.mo24445h(this.f22570f);
                            }
                            if (!this.f22579o.m17711j() && !this.f22575k.m52944v()) {
                                this.f22579o.m17715n(i);
                            }
                            this.f22579o.m17707f();
                        }
                        throw th;
                    }
                }
            } else {
                name = null;
            }
            this.f22569e.mo24444g(this.f22570f, this.f22575k);
            this.f22571g.m18899N(this);
            if (name != null) {
                Thread.currentThread().setName(name);
            }
            this.f22575k.m52929g();
            if (this.f22570f.isOpen()) {
                if (this.f22577m.isPersistent()) {
                    this.f22569e.mo24445h(this.f22570f);
                }
                if (!this.f22579o.m17711j() && !this.f22575k.m52944v()) {
                    this.f22579o.m17715n(404);
                }
                this.f22579o.m17707f();
                return;
            }
            are areVar222 = this.f22579o;
            areVar222.m17707f();
            i = areVar222;
        }
    }

    /* renamed from: F */
    public boolean m25987F() {
        return this.f22577m.mo46283b() && (this.f22573i.mo32883b() || this.f22588x);
    }

    /* renamed from: G */
    public boolean m25988G() {
        return this.f22583s > 0;
    }

    /* renamed from: H */
    public boolean m25989H() {
        return this.f22577m.mo46285f();
    }

    /* renamed from: I */
    public void m25990I(boolean z) throws IOException {
        this.f22573i.mo32882a(z);
        this.f22574j.m24176c();
        this.f22575k.m52945w();
        this.f22577m.mo28016a(z);
        this.f22578n.m24176c();
        this.f22579o.m17712k();
        this.f22572h.m52310a();
    }

    /* renamed from: m */
    public void m25991m(boolean z) throws IOException {
        if (!this.f22577m.mo46285f()) {
            this.f22577m.mo46284e(this.f22579o.m17710i(), this.f22579o.m17709h());
            try {
                this.f22577m.mo28019h(this.f22578n, z);
            } catch (IOException e) {
                throw e;
            } catch (RuntimeException e2) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("header full: ");
                stringBuffer.append(e2);
                tia.m49928j(stringBuffer.toString());
                if (tia.m49926h()) {
                    zn7 zn7Var = this.f22577m;
                    if (zn7Var instanceof g38) {
                        tia.m49921c(((g38) zn7Var).f43084q.S1(), e2);
                    }
                }
                this.f22579o.m17713l();
                this.f22577m.mo28016a(true);
                this.f22577m.mo46284e(500, null);
                this.f22577m.mo28019h(this.f22578n, true);
                this.f22577m.mo28017c();
                throw e2;
            }
        }
        if (z) {
            this.f22577m.mo28017c();
        }
    }

    /* renamed from: n */
    public void m25992n() {
        if (!this.f22577m.mo46285f()) {
            this.f22577m.mo46284e(this.f22579o.m17710i(), this.f22579o.m17709h());
            try {
                this.f22577m.mo28019h(this.f22578n, true);
            } catch (IOException e) {
                throw e;
            } catch (RuntimeException e2) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("header full: ");
                stringBuffer.append(e2);
                tia.m49928j(stringBuffer.toString());
                tia.m49922d(e2);
                this.f22579o.m17713l();
                this.f22577m.mo28016a(true);
                this.f22577m.mo46284e(500, null);
                this.f22577m.mo28019h(this.f22578n, true);
                this.f22577m.mo28017c();
                throw e2;
            }
        }
        this.f22577m.mo28017c();
    }

    /* renamed from: o */
    public void m25993o() {
        synchronized (this) {
            this.f22568d = true;
            if (!this.f22567c) {
                ixc ixcVar = this.f22573i;
                if (ixcVar != null) {
                    ixcVar.mo32882a(true);
                }
                zn7 zn7Var = this.f22577m;
                if (zn7Var != null) {
                    zn7Var.mo28016a(true);
                }
                e38 e38Var = this.f22574j;
                if (e38Var != null) {
                    e38Var.m24177d();
                }
                e38 e38Var2 = this.f22578n;
                if (e38Var2 != null) {
                    e38Var2.m24177d();
                }
            }
        }
    }

    /* renamed from: p */
    public void m25994p() {
        try {
            m25991m(false);
            this.f22577m.flush();
        } catch (IOException e) {
            if (!(e instanceof dj6)) {
                throw new dj6(e);
            }
        }
    }

    /* renamed from: q */
    public lt3 m25995q() {
        return this.f22569e;
    }

    /* renamed from: r */
    public y76 m25996r() {
        return this.f22570f;
    }

    /* renamed from: s */
    public zn7 m25997s() {
        return this.f22577m;
    }

    /* renamed from: t */
    public xgf m25998t() {
        if (this.f22576l == null) {
            this.f22576l = new u38.C17289b((u38) this.f22573i, this.f22569e.mo24447l());
        }
        return this.f22576l;
    }

    /* renamed from: u */
    public ygf m25999u() {
        if (this.f22580p == null) {
            this.f22580p = new C13315a();
        }
        return this.f22580p;
    }

    /* renamed from: v */
    public PrintWriter m26000v(String str) {
        m25999u();
        if (this.f22581q == null) {
            this.f22581q = new C13316b();
            this.f22582r = new e28(this, this.f22581q);
        }
        this.f22581q.m46299c(str);
        return this.f22582r;
    }

    /* renamed from: w */
    public vle m26001w() {
        return this.f22575k;
    }

    /* renamed from: x */
    public e38 m26002x() {
        return this.f22574j;
    }

    /* renamed from: y */
    public int m26003y() {
        return this.f22566b;
    }

    /* renamed from: z */
    public boolean m26004z() {
        return this.f22569e.mo24446i();
    }
}
