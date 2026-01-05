package p001o;

import com.google.android.gms.cast.MediaStatus;
import java.util.Locale;
import p001o.ax7;
import p001o.m18;
import p001o.qja;

/* loaded from: classes3.dex */
public final class s27 extends a7 {

    /* renamed from: b */
    public final xk7 f44447b;

    /* renamed from: c */
    public String f44448c;

    /* renamed from: o.s27$a */
    public static final class C16712a implements y6f {

        /* renamed from: a */
        public final cl3 f44449a;

        /* renamed from: b */
        public final gx7 f44450b;

        /* renamed from: o.s27$a$a */
        public static final class a extends o64 {

            /* renamed from: a */
            public Object f44451a;

            /* renamed from: b */
            public /* synthetic */ Object f44452b;

            /* renamed from: d */
            public int f44454d;

            public a(n64 n64Var) {
                super(n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                this.f44452b = obj;
                this.f44454d |= Integer.MIN_VALUE;
                return C16712a.this.read(null, 0L, this);
            }
        }

        public C16712a(cl3 cl3Var, gx7 gx7Var) {
            sq8.m48649h(cl3Var, "deferred");
            sq8.m48649h(gx7Var, "hashingChannel");
            this.f44449a = cl3Var;
            this.f44450b = gx7Var;
        }

        @Override // p001o.y6f
        public boolean cancel(Throwable th) {
            return this.f44450b.cancel(th);
        }

        @Override // p001o.y6f
        public int getAvailableForRead() {
            return this.f44450b.getAvailableForRead();
        }

        @Override // p001o.y6f
        public Throwable getClosedCause() {
            return this.f44450b.getClosedCause();
        }

        @Override // p001o.y6f
        public boolean isClosedForRead() {
            return this.f44450b.isClosedForRead();
        }

        @Override // p001o.y6f
        public boolean isClosedForWrite() {
            return this.f44450b.isClosedForWrite();
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p001o.y6f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object read(t6f t6fVar, long j, n64 n64Var) {
            a aVar;
            C16712a c16712a;
            if (n64Var instanceof a) {
                aVar = (a) n64Var;
                int i = aVar.f44454d;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.f44454d = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(n64Var);
                }
            }
            Object obj = aVar.f44452b;
            Object objM51918f = uq8.m51918f();
            int i2 = aVar.f44454d;
            if (i2 == 0) {
                wre.m54934b(obj);
                gx7 gx7Var = this.f44450b;
                aVar.f44451a = this;
                aVar.f44454d = 1;
                obj = gx7Var.read(t6fVar, j, aVar);
                if (obj == objM51918f) {
                    return objM51918f;
                }
                c16712a = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c16712a = (C16712a) aVar.f44451a;
                wre.m54934b(obj);
            }
            if (((Number) obj).longValue() == -1) {
                c16712a.f44449a.complete(cb1.m20635c(c16712a.f44450b.m29623a()));
            }
            return obj;
        }
    }

    /* renamed from: o.s27$b */
    public static final class C16713b implements h8f {

        /* renamed from: a */
        public final cl3 f44455a;

        /* renamed from: b */
        public final ix7 f44456b;

        public C16713b(cl3 cl3Var, ix7 ix7Var) {
            sq8.m48649h(cl3Var, "deferred");
            sq8.m48649h(ix7Var, "hashingSource");
            this.f44455a = cl3Var;
            this.f44456b = ix7Var;
        }

        @Override // p001o.h8f, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f44456b.close();
        }

        @Override // p001o.h8f
        public long read(t6f t6fVar, long j) {
            sq8.m48649h(t6fVar, "sink");
            long j2 = this.f44456b.read(t6fVar, j);
            if (j2 == -1) {
                this.f44455a.complete(cb1.m20635c(this.f44456b.m32881c()));
            }
            return j2;
        }
    }

    /* renamed from: o.s27$c */
    public static final class C16714c extends o64 {

        /* renamed from: a */
        public Object f44457a;

        /* renamed from: b */
        public Object f44458b;

        /* renamed from: c */
        public /* synthetic */ Object f44459c;

        /* renamed from: e */
        public int f44461e;

        public C16714c(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f44459c = obj;
            this.f44461e |= Integer.MIN_VALUE;
            return s27.this.mo16531b(null, this);
        }
    }

    /* renamed from: o.s27$d */
    public static final class C16715d extends o64 {

        /* renamed from: a */
        public Object f44462a;

        /* renamed from: b */
        public Object f44463b;

        /* renamed from: c */
        public Object f44464c;

        /* renamed from: d */
        public Object f44465d;

        /* renamed from: e */
        public long f44466e;

        /* renamed from: f */
        public /* synthetic */ Object f44467f;

        /* renamed from: h */
        public int f44469h;

        public C16715d(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f44467f = obj;
            this.f44469h |= Integer.MIN_VALUE;
            return s27.this.m47466p(null, null, 0L, this);
        }
    }

    public s27(xk7 xk7Var) {
        this.f44447b = xk7Var;
    }

    /* renamed from: k */
    public static final String m47458k() {
        return "no checksum algorithm specified, skipping flexible checksums processing";
    }

    /* renamed from: l */
    public static final String m47459l(String str) {
        return "Resolved checksum header name: " + str;
    }

    /* renamed from: m */
    public static final String m47460m() {
        return "User supplied a checksum, skipping asynchronous calculation";
    }

    /* renamed from: n */
    public static final String m47461n() {
        return "Calculating checksum asynchronously";
    }

    /* renamed from: q */
    public static /* synthetic */ Object m47462q(s27 s27Var, y6f y6fVar, ax7 ax7Var, long j, n64 n64Var, int i, Object obj) {
        if ((i & 2) != 0) {
            j = MediaStatus.COMMAND_PLAYBACK_RATE;
        }
        return s27Var.m47466p(y6fVar, ax7Var, j, n64Var);
    }

    @Override // p001o.a7
    /* renamed from: a */
    public y38 mo16530a(c2e c2eVar, String str) {
        sq8.m48649h(c2eVar, "context");
        sq8.m48649h(str, "checksum");
        String lowerCase = ("x-amz-checksum-" + this.f44448c).toLowerCase(Locale.ROOT);
        sq8.m48648g(lowerCase, "toLowerCase(...)");
        z38 z38VarM26053c = f48.m26053c((y38) c2eVar.mo20099c());
        if (!z38VarM26053c.m58668e().m59801i(lowerCase)) {
            a48.m16408d(z38VarM26053c, lowerCase, str);
        }
        return z38VarM26053c.m58665b();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p001o.a7
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo16531b(c2e c2eVar, n64 n64Var) {
        C16714c c16714c;
        ax7 ax7VarM19912d;
        z38 z38Var;
        ax7 ax7Var;
        if (n64Var instanceof C16714c) {
            c16714c = (C16714c) n64Var;
            int i = c16714c.f44461e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16714c.f44461e = i - Integer.MIN_VALUE;
            } else {
                c16714c = new C16714c(n64Var);
            }
        }
        C16714c c16714c2 = c16714c;
        Object objM47462q = c16714c2.f44459c;
        Object objM51918f = uq8.m51918f();
        int i2 = c16714c2.f44461e;
        if (i2 != 0) {
            if (i2 == 1) {
                wre.m54934b(objM47462q);
                return cb1.m20635c((byte[]) objM47462q);
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ax7Var = (ax7) c16714c2.f44458b;
            z38Var = (z38) c16714c2.f44457a;
            wre.m54934b(objM47462q);
            sq8.m48646e(objM47462q);
            byte[] bArr = (byte[]) objM47462q;
            z38Var.m58672i(n18.m39986g(bArr));
            return cb1.m20635c(bx7.m19911c(bArr, ax7Var));
        }
        wre.m54934b(objM47462q);
        z38 z38VarM26053c = f48.m26053c((y38) c2eVar.mo20099c());
        String str = this.f44448c;
        if (str == null || (ax7VarM19912d = bx7.m19912d(str)) == null) {
            return null;
        }
        if (z38VarM26053c.m58667d().getContentLength() == null && !z38VarM26053c.m58667d().isOneShot()) {
            y6f y6fVarM39988i = n18.m39988i(z38VarM26053c.m58667d(), null, 1, null);
            sq8.m48646e(y6fVarM39988i);
            c16714c2.f44461e = 1;
            objM47462q = m47462q(this, y6fVarM39988i, ax7VarM19912d, 0L, c16714c2, 2, null);
            if (objM47462q == objM51918f) {
                return objM51918f;
            }
            return cb1.m20635c((byte[]) objM47462q);
        }
        m18 m18VarM58667d = z38VarM26053c.m58667d();
        c16714c2.f44457a = z38VarM26053c;
        c16714c2.f44458b = ax7VarM19912d;
        c16714c2.f44461e = 2;
        Object objM39980a = n18.m39980a(m18VarM58667d, c16714c2);
        if (objM39980a == objM51918f) {
            return objM51918f;
        }
        z38Var = z38VarM26053c;
        ax7Var = ax7VarM19912d;
        objM47462q = objM39980a;
        sq8.m48646e(objM47462q);
        byte[] bArr2 = (byte[]) objM47462q;
        z38Var.m58672i(n18.m39986g(bArr2));
        return cb1.m20635c(bx7.m19911c(bArr2, ax7Var));
    }

    /* renamed from: i */
    public final boolean m47463i(m18 m18Var) {
        if (((m18Var instanceof m18.AbstractC15197e) || (m18Var instanceof m18.AbstractC15194b)) && m18Var.getContentLength() != null) {
            if (!m18Var.isOneShot()) {
                Long contentLength = m18Var.getContentLength();
                sq8.m48646e(contentLength);
                if (contentLength.longValue() > 1048576) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final boolean m47464j(ax7 ax7Var) {
        return (ax7Var instanceof j94) || (ax7Var instanceof l94) || (ax7Var instanceof okf) || (ax7Var instanceof lkf);
    }

    @Override // p001o.a7, p001o.sn8
    public Object modifyBeforeSigning(c2e c2eVar, n64 n64Var) {
        String str;
        ax7 ax7VarM19912d;
        q74 context = n64Var.getContext();
        String strMo26336c = kge.m35689b(s27.class).mo26336c();
        if (strMo26336c == null) {
            throw new IllegalArgumentException("logger<T> cannot be used on an anonymous object".toString());
        }
        qja qjaVarM52400e = v74.m52400e(context, strMo26336c);
        Object objMo25340a = c2eVar.mo25340a();
        xk7 xk7Var = this.f44447b;
        if (xk7Var == null || (str = (String) xk7Var.invoke(objMo25340a)) == null) {
            str = (String) c2eVar.mo25341b().mo18191b(s38.f44646a.m47565a());
        }
        this.f44448c = str;
        if (str == null) {
            qja.C16414b.m45548a(qjaVarM52400e, null, new uk7() { // from class: o.o27
                @Override // p001o.uk7
                public final Object invoke() {
                    return s27.m47458k();
                }
            }, 1, null);
            return c2eVar.mo20099c();
        }
        z38 z38VarM26053c = f48.m26053c((y38) c2eVar.mo20099c());
        if (!(!(((y38) c2eVar.mo20099c()).getBody() instanceof m18.C15196d))) {
            throw new IllegalStateException("Can't calculate the checksum of an empty body".toString());
        }
        final String lowerCase = ("x-amz-checksum-" + this.f44448c).toLowerCase(Locale.ROOT);
        sq8.m48648g(lowerCase, "toLowerCase(...)");
        qja.C16414b.m45548a(qjaVarM52400e, null, new uk7() { // from class: o.p27
            @Override // p001o.uk7
            public final Object invoke() {
                return s27.m47459l(lowerCase);
            }
        }, 1, null);
        m47465o(z38VarM26053c.m58668e(), lowerCase);
        String str2 = this.f44448c;
        if (str2 == null || (ax7VarM19912d = bx7.m19912d(str2)) == null) {
            throw new xa3("Could not parse checksum algorithm " + this.f44448c);
        }
        if (!m47464j(ax7VarM19912d)) {
            throw new xa3("Checksum algorithm " + this.f44448c + " is not supported for flexible checksums");
        }
        if (!m47463i(z38VarM26053c.m58667d())) {
            return super.modifyBeforeSigning(c2eVar, n64Var);
        }
        a48.m16408d(z38VarM26053c, "x-amz-trailer", lowerCase);
        cl3 cl3VarM25196a = el3.m25196a(z69.m58846k(c2eVar.mo25341b().mo6529D()));
        if (z38VarM26053c.m58668e().m59804l(lowerCase) != null) {
            qja.C16414b.m45548a(qjaVarM52400e, null, new uk7() { // from class: o.q27
                @Override // p001o.uk7
                public final Object invoke() {
                    return s27.m47460m();
                }
            }, 1, null);
            Object objM59804l = z38VarM26053c.m58668e().m59804l(lowerCase);
            sq8.m48646e(objM59804l);
            z38VarM26053c.m58668e().m59809q(lowerCase);
            ml1.m39301a(cl3VarM25196a.complete((String) objM59804l));
        } else {
            qja.C16414b.m45548a(qjaVarM52400e, null, new uk7() { // from class: o.r27
                @Override // p001o.uk7
                public final Object invoke() {
                    return s27.m47461n();
                }
            }, 1, null);
            z38VarM26053c.m58672i(m47467r(n18.m39982c(z38VarM26053c.m58667d(), ax7VarM19912d, z38VarM26053c.m58667d().getContentLength()), cl3VarM25196a));
        }
        z38VarM26053c.m58670g().m59796c(lowerCase, cl3VarM25196a);
        return z38VarM26053c.m58665b();
    }

    /* renamed from: o */
    public final void m47465o(xx7 xx7Var, String str) {
        for (String str2 : xx7Var.m59808p()) {
            if (e9g.m24597K(str2, "x-amz-checksum-", false, 2, null) && !sq8.m48644c(str2, str)) {
                xx7Var.m59809q(str2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00b5 -> B:13:0x004b). Please report as a decompilation issue!!! */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m47466p(y6f y6fVar, ax7 ax7Var, long j, n64 n64Var) {
        C16715d c16715d;
        t6f t6fVar;
        C16715d c16715d2;
        Object obj;
        y6f y6fVar2;
        ax7 ax7Var2;
        long j2;
        y6f y6fVar3;
        t6f t6fVar2;
        long j3;
        ax7 ax7Var3;
        if (n64Var instanceof C16715d) {
            c16715d = (C16715d) n64Var;
            int i = c16715d.f44469h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16715d.f44469h = i - Integer.MIN_VALUE;
            } else {
                c16715d = new C16715d(n64Var);
            }
        }
        Object objM31738a = c16715d.f44467f;
        Object objM51918f = uq8.m51918f();
        int i2 = c16715d.f44469h;
        if (i2 == 0) {
            wre.m54934b(objM31738a);
            t6fVar = new t6f();
            c16715d2 = c16715d;
            obj = objM51918f;
            y6fVar2 = y6fVar;
            ax7Var2 = ax7Var;
            j2 = j;
            if (!y6fVar2.isClosedForRead()) {
            }
        } else if (i2 == 1) {
            j3 = c16715d.f44466e;
            t6f t6fVar3 = (t6f) c16715d.f44464c;
            ax7 ax7Var4 = (ax7) c16715d.f44463b;
            y6fVar3 = (y6f) c16715d.f44462a;
            wre.m54934b(objM31738a);
            t6fVar2 = t6fVar3;
            ax7Var3 = ax7Var4;
            c16715d.f44462a = y6fVar3;
            c16715d.f44463b = ax7Var3;
            c16715d.f44464c = t6fVar2;
            c16715d.f44465d = ax7Var3;
            c16715d.f44466e = j3;
            c16715d.f44469h = 2;
            objM31738a = i8f.m31738a(t6fVar2, c16715d);
            if (objM31738a != objM51918f) {
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j4 = c16715d.f44466e;
            ax7 ax7Var5 = (ax7) c16715d.f44465d;
            t6f t6fVar4 = (t6f) c16715d.f44464c;
            ax7 ax7Var6 = (ax7) c16715d.f44463b;
            y6f y6fVar4 = (y6f) c16715d.f44462a;
            wre.m54934b(objM31738a);
            long j5 = j4;
            c16715d2 = c16715d;
            t6fVar = t6fVar4;
            ax7Var2 = ax7Var6;
            y6fVar3 = y6fVar4;
            obj = objM51918f;
            ax7 ax7Var7 = ax7Var5;
            j2 = j5;
            ax7.C12265a.m17935a(ax7Var7, (byte[]) objM31738a, 0, 0, 6, null);
            y6fVar2 = y6fVar3;
            if (!y6fVar2.isClosedForRead()) {
                c16715d2.f44462a = y6fVar2;
                c16715d2.f44463b = ax7Var2;
                c16715d2.f44464c = t6fVar;
                c16715d2.f44465d = null;
                c16715d2.f44466e = j2;
                c16715d2.f44469h = 1;
                if (y6fVar2.read(t6fVar, j2, c16715d2) == obj) {
                    return obj;
                }
                y6fVar3 = y6fVar2;
                long j6 = j2;
                ax7Var3 = ax7Var2;
                c16715d = c16715d2;
                objM51918f = obj;
                t6fVar2 = t6fVar;
                j3 = j6;
                c16715d.f44462a = y6fVar3;
                c16715d.f44463b = ax7Var3;
                c16715d.f44464c = t6fVar2;
                c16715d.f44465d = ax7Var3;
                c16715d.f44466e = j3;
                c16715d.f44469h = 2;
                objM31738a = i8f.m31738a(t6fVar2, c16715d);
                if (objM31738a != objM51918f) {
                    return objM51918f;
                }
                ax7Var7 = ax7Var3;
                j5 = j3;
                c16715d2 = c16715d;
                ax7Var2 = ax7Var7;
                t6fVar = t6fVar2;
                obj = objM51918f;
                j2 = j5;
                ax7.C12265a.m17935a(ax7Var7, (byte[]) objM31738a, 0, 0, 6, null);
                y6fVar2 = y6fVar3;
                if (!y6fVar2.isClosedForRead()) {
                    return ax7Var2.mo17932a();
                }
            }
        }
    }

    /* renamed from: r */
    public final m18 m47467r(m18 m18Var, cl3 cl3Var) {
        if (m18Var instanceof m18.AbstractC15197e) {
            h8f from = ((m18.AbstractC15197e) m18Var).readFrom();
            sq8.m48647f(from, "null cannot be cast to non-null type aws.smithy.kotlin.runtime.io.HashingSource");
            return n18.m39985f(new C16713b(cl3Var, (ix7) from), m18Var.getContentLength());
        }
        if (!(m18Var instanceof m18.AbstractC15194b)) {
            throw new xa3("HttpBody type is not supported");
        }
        y6f from2 = ((m18.AbstractC15194b) m18Var).readFrom();
        sq8.m48647f(from2, "null cannot be cast to non-null type aws.smithy.kotlin.runtime.io.HashingByteReadChannel");
        return n18.m39984e(new C16712a(cl3Var, (gx7) from2), m18Var.getContentLength());
    }

    @Override // p001o.sn8
    public void readAfterSerialization(c2e c2eVar) {
        sq8.m48649h(c2eVar, "context");
    }
}
