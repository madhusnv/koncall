package p001o;

import android.os.Build;
import android.util.Log;
import com.bumptech.glide.C10726c;
import com.bumptech.glide.load.data.InterfaceC10732a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p001o.dhe;
import p001o.ms6;
import p001o.mu4;
import p001o.v75;

/* loaded from: classes5.dex */
public class u75 implements mu4.InterfaceC15433a, Runnable, Comparable, ms6.InterfaceC15418f {

    /* renamed from: H */
    public int f48442H;

    /* renamed from: L */
    public qt5 f48443L;

    /* renamed from: M */
    public rec f48444M;

    /* renamed from: Q */
    public InterfaceC17314b f48445Q;

    /* renamed from: X */
    public int f48446X;

    /* renamed from: Y */
    public EnumC17320h f48447Y;

    /* renamed from: Z */
    public EnumC17319g f48448Z;

    /* renamed from: d */
    public final InterfaceC17317e f48452d;

    /* renamed from: e */
    public final ged f48453e;

    /* renamed from: h */
    public C10726c f48456h;
    public long h0;
    public boolean i0;
    public Object j0;
    public Thread k0;
    public ic9 l0;
    public ic9 m0;
    public Object n0;
    public ez4 o0;
    public lu4 p0;

    /* renamed from: q */
    public ic9 f48457q;
    public volatile mu4 q0;
    public volatile boolean r0;

    /* renamed from: s */
    public gid f48458s;
    public volatile boolean s0;
    public boolean t0;

    /* renamed from: x */
    public dg6 f48459x;

    /* renamed from: y */
    public int f48460y;

    /* renamed from: a */
    public final t75 f48449a = new t75();

    /* renamed from: b */
    public final List f48450b = new ArrayList();

    /* renamed from: c */
    public final h5g f48451c = h5g.m29827a();

    /* renamed from: f */
    public final C17316d f48454f = new C17316d();

    /* renamed from: g */
    public final C17318f f48455g = new C17318f();

    /* renamed from: o.u75$a */
    public static /* synthetic */ class C17313a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f48461a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f48462b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f48463c;

        static {
            int[] iArr = new int[a76.values().length];
            f48463c = iArr;
            try {
                iArr[a76.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f48463c[a76.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC17320h.values().length];
            f48462b = iArr2;
            try {
                iArr2[EnumC17320h.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f48462b[EnumC17320h.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f48462b[EnumC17320h.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f48462b[EnumC17320h.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f48462b[EnumC17320h.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[EnumC17319g.values().length];
            f48461a = iArr3;
            try {
                iArr3[EnumC17319g.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f48461a[EnumC17319g.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f48461a[EnumC17319g.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* renamed from: o.u75$b */
    public interface InterfaceC17314b {
        /* renamed from: b */
        void mo18848b(zne zneVar, ez4 ez4Var, boolean z);

        /* renamed from: c */
        void mo18849c(xs7 xs7Var);

        /* renamed from: e */
        void mo18851e(u75 u75Var);
    }

    /* renamed from: o.u75$c */
    public final class C17315c implements v75.InterfaceC17522a {

        /* renamed from: a */
        public final ez4 f48464a;

        public C17315c(ez4 ez4Var) {
            this.f48464a = ez4Var;
        }

        @Override // p001o.v75.InterfaceC17522a
        /* renamed from: a */
        public zne mo51111a(zne zneVar) {
            return u75.this.m51087C(this.f48464a, zneVar);
        }
    }

    /* renamed from: o.u75$d */
    public static class C17316d {

        /* renamed from: a */
        public ic9 f48466a;

        /* renamed from: b */
        public loe f48467b;

        /* renamed from: c */
        public pia f48468c;

        /* renamed from: a */
        public void m51112a() {
            this.f48466a = null;
            this.f48467b = null;
            this.f48468c = null;
        }

        /* renamed from: b */
        public void m51113b(InterfaceC17317e interfaceC17317e, rec recVar) {
            et7.m25571a("DecodeJob.encode");
            try {
                interfaceC17317e.mo51116a().mo42649a(this.f48466a, new cu4(this.f48467b, this.f48468c, recVar));
            } finally {
                this.f48468c.m43732f();
                et7.m25575e();
            }
        }

        /* renamed from: c */
        public boolean m51114c() {
            return this.f48468c != null;
        }

        /* renamed from: d */
        public void m51115d(ic9 ic9Var, loe loeVar, pia piaVar) {
            this.f48466a = ic9Var;
            this.f48467b = loeVar;
            this.f48468c = piaVar;
        }
    }

    /* renamed from: o.u75$e */
    public interface InterfaceC17317e {
        /* renamed from: a */
        ot5 mo51116a();
    }

    /* renamed from: o.u75$f */
    public static class C17318f {

        /* renamed from: a */
        public boolean f48469a;

        /* renamed from: b */
        public boolean f48470b;

        /* renamed from: c */
        public boolean f48471c;

        /* renamed from: a */
        public final boolean m51117a(boolean z) {
            return (this.f48471c || z || this.f48470b) && this.f48469a;
        }

        /* renamed from: b */
        public synchronized boolean m51118b() {
            this.f48470b = true;
            return m51117a(false);
        }

        /* renamed from: c */
        public synchronized boolean m51119c() {
            this.f48471c = true;
            return m51117a(false);
        }

        /* renamed from: d */
        public synchronized boolean m51120d(boolean z) {
            this.f48469a = true;
            return m51117a(z);
        }

        /* renamed from: e */
        public synchronized void m51121e() {
            this.f48470b = false;
            this.f48469a = false;
            this.f48471c = false;
        }
    }

    /* renamed from: o.u75$g */
    public enum EnumC17319g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* renamed from: o.u75$h */
    public enum EnumC17320h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    public u75(InterfaceC17317e interfaceC17317e, ged gedVar) {
        this.f48452d = interfaceC17317e;
        this.f48453e = gedVar;
    }

    /* renamed from: A */
    public final void m51085A() {
        if (this.f48455g.m51118b()) {
            m51089E();
        }
    }

    /* renamed from: B */
    public final void m51086B() {
        if (this.f48455g.m51119c()) {
            m51089E();
        }
    }

    /* renamed from: C */
    public zne m51087C(ez4 ez4Var, zne zneVar) {
        zne zneVarMo26072b;
        xuh xuhVar;
        a76 a76VarMo21293a;
        ic9 bu4Var;
        Class<?> cls = zneVar.get().getClass();
        loe loeVarM49514n = null;
        if (ez4Var != ez4.RESOURCE_DISK_CACHE) {
            xuh xuhVarM49519s = this.f48449a.m49519s(cls);
            xuhVar = xuhVarM49519s;
            zneVarMo26072b = xuhVarM49519s.mo26072b(this.f48456h, zneVar, this.f48460y, this.f48442H);
        } else {
            zneVarMo26072b = zneVar;
            xuhVar = null;
        }
        if (!zneVar.equals(zneVarMo26072b)) {
            zneVar.mo19618b();
        }
        if (this.f48449a.m49523w(zneVarMo26072b)) {
            loeVarM49514n = this.f48449a.m49514n(zneVarMo26072b);
            a76VarMo21293a = loeVarM49514n.mo21293a(this.f48444M);
        } else {
            a76VarMo21293a = a76.NONE;
        }
        loe loeVar = loeVarM49514n;
        if (!this.f48443L.mo45831d(!this.f48449a.m49525y(this.l0), ez4Var, a76VarMo21293a)) {
            return zneVarMo26072b;
        }
        if (loeVar == null) {
            throw new dhe.C12919d(zneVarMo26072b.get().getClass());
        }
        int i = C17313a.f48463c[a76VarMo21293a.ordinal()];
        if (i == 1) {
            bu4Var = new bu4(this.l0, this.f48457q);
        } else {
            if (i != 2) {
                throw new IllegalArgumentException("Unknown strategy: " + a76VarMo21293a);
            }
            bu4Var = new coe(this.f48449a.m49502b(), this.l0, this.f48457q, this.f48460y, this.f48442H, xuhVar, cls, this.f48444M);
        }
        pia piaVarM43729c = pia.m43729c(zneVarMo26072b);
        this.f48454f.m51115d(bu4Var, loeVar, piaVarM43729c);
        return piaVarM43729c;
    }

    /* renamed from: D */
    public void m51088D(boolean z) {
        if (this.f48455g.m51120d(z)) {
            m51089E();
        }
    }

    /* renamed from: E */
    public final void m51089E() {
        this.f48455g.m51121e();
        this.f48454f.m51112a();
        this.f48449a.m49501a();
        this.r0 = false;
        this.f48456h = null;
        this.f48457q = null;
        this.f48444M = null;
        this.f48458s = null;
        this.f48459x = null;
        this.f48445Q = null;
        this.f48447Y = null;
        this.q0 = null;
        this.k0 = null;
        this.l0 = null;
        this.n0 = null;
        this.o0 = null;
        this.p0 = null;
        this.h0 = 0L;
        this.s0 = false;
        this.j0 = null;
        this.f48450b.clear();
        this.f48453e.mo28525a(this);
    }

    /* renamed from: F */
    public final void m51090F(EnumC17319g enumC17319g) {
        this.f48448Z = enumC17319g;
        this.f48445Q.mo18851e(this);
    }

    /* renamed from: G */
    public final void m51091G() {
        this.k0 = Thread.currentThread();
        this.h0 = lja.m37350b();
        boolean zMo17834b = false;
        while (!this.s0 && this.q0 != null && !(zMo17834b = this.q0.mo17834b())) {
            this.f48447Y = m51102r(this.f48447Y);
            this.q0 = m51101o();
            if (this.f48447Y == EnumC17320h.SOURCE) {
                m51090F(EnumC17319g.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.f48447Y == EnumC17320h.FINISHED || this.s0) && !zMo17834b) {
            m51110z();
        }
    }

    /* renamed from: H */
    public final zne m51092H(Object obj, ez4 ez4Var, uga ugaVar) {
        rec recVarM51103s = m51103s(ez4Var);
        InterfaceC10732a interfaceC10732aM23129l = this.f48456h.m12676i().m23129l(obj);
        try {
            return ugaVar.m51565a(interfaceC10732aM23129l, recVarM51103s, this.f48460y, this.f48442H, new C17315c(ez4Var));
        } finally {
            interfaceC10732aM23129l.mo12700b();
        }
    }

    /* renamed from: I */
    public final void m51093I() {
        int i = C17313a.f48461a[this.f48448Z.ordinal()];
        if (i == 1) {
            this.f48447Y = m51102r(EnumC17320h.INITIALIZE);
            this.q0 = m51101o();
            m51091G();
        } else if (i == 2) {
            m51091G();
        } else {
            if (i == 3) {
                m51100n();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: " + this.f48448Z);
        }
    }

    /* renamed from: J */
    public final void m51094J() {
        Throwable th;
        this.f48451c.mo29829c();
        if (!this.r0) {
            this.r0 = true;
            return;
        }
        if (this.f48450b.isEmpty()) {
            th = null;
        } else {
            List list = this.f48450b;
            th = (Throwable) list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    /* renamed from: K */
    public boolean m51095K() {
        EnumC17320h enumC17320hM51102r = m51102r(EnumC17320h.INITIALIZE);
        return enumC17320hM51102r == EnumC17320h.RESOURCE_CACHE || enumC17320hM51102r == EnumC17320h.DATA_CACHE;
    }

    @Override // p001o.mu4.InterfaceC15433a
    /* renamed from: a */
    public void mo39690a(ic9 ic9Var, Exception exc, lu4 lu4Var, ez4 ez4Var) {
        lu4Var.mo18154b();
        xs7 xs7Var = new xs7("Fetching data failed", exc);
        xs7Var.m56770j(ic9Var, ez4Var, lu4Var.mo18153a());
        this.f48450b.add(xs7Var);
        if (Thread.currentThread() != this.k0) {
            m51090F(EnumC17319g.SWITCH_TO_SOURCE_SERVICE);
        } else {
            m51091G();
        }
    }

    @Override // p001o.mu4.InterfaceC15433a
    /* renamed from: c */
    public void mo39691c(ic9 ic9Var, Object obj, lu4 lu4Var, ez4 ez4Var, ic9 ic9Var2) {
        this.l0 = ic9Var;
        this.n0 = obj;
        this.p0 = lu4Var;
        this.o0 = ez4Var;
        this.m0 = ic9Var2;
        this.t0 = ic9Var != this.f48449a.m49503c().get(0);
        if (Thread.currentThread() != this.k0) {
            m51090F(EnumC17319g.DECODE_DATA);
            return;
        }
        et7.m25571a("DecodeJob.decodeFromRetrievedData");
        try {
            m51100n();
        } finally {
            et7.m25575e();
        }
    }

    @Override // p001o.ms6.InterfaceC15418f
    /* renamed from: d */
    public h5g mo18850d() {
        return this.f48451c;
    }

    @Override // p001o.mu4.InterfaceC15433a
    /* renamed from: e */
    public void mo39692e() {
        m51090F(EnumC17319g.SWITCH_TO_SOURCE_SERVICE);
    }

    /* renamed from: g */
    public void m51096g() {
        this.s0 = true;
        mu4 mu4Var = this.q0;
        if (mu4Var != null) {
            mu4Var.cancel();
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public int compareTo(u75 u75Var) {
        int iM51104t = m51104t() - u75Var.m51104t();
        return iM51104t == 0 ? this.f48446X - u75Var.f48446X : iM51104t;
    }

    /* renamed from: j */
    public final zne m51098j(lu4 lu4Var, Object obj, ez4 ez4Var) {
        if (obj == null) {
            lu4Var.mo18154b();
            return null;
        }
        try {
            long jM37350b = lja.m37350b();
            zne zneVarM51099m = m51099m(obj, ez4Var);
            if (Log.isLoggable("DecodeJob", 2)) {
                m51106v("Decoded result " + zneVarM51099m, jM37350b);
            }
            return zneVarM51099m;
        } finally {
            lu4Var.mo18154b();
        }
    }

    /* renamed from: m */
    public final zne m51099m(Object obj, ez4 ez4Var) {
        return m51092H(obj, ez4Var, this.f48449a.m49508h(obj.getClass()));
    }

    /* renamed from: n */
    public final void m51100n() {
        zne zneVarM51098j;
        if (Log.isLoggable("DecodeJob", 2)) {
            m51107w("Retrieved data", this.h0, "data: " + this.n0 + ", cache key: " + this.l0 + ", fetcher: " + this.p0);
        }
        try {
            zneVarM51098j = m51098j(this.p0, this.n0, this.o0);
        } catch (xs7 e) {
            e.m56769i(this.m0, this.o0);
            this.f48450b.add(e);
            zneVarM51098j = null;
        }
        if (zneVarM51098j != null) {
            m51109y(zneVarM51098j, this.o0, this.t0);
        } else {
            m51091G();
        }
    }

    /* renamed from: o */
    public final mu4 m51101o() {
        int i = C17313a.f48462b[this.f48447Y.ordinal()];
        if (i == 1) {
            return new boe(this.f48449a, this);
        }
        if (i == 2) {
            return new au4(this.f48449a, this);
        }
        if (i == 3) {
            return new ozf(this.f48449a, this);
        }
        if (i == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f48447Y);
    }

    /* renamed from: r */
    public final EnumC17320h m51102r(EnumC17320h enumC17320h) {
        int i = C17313a.f48462b[enumC17320h.ordinal()];
        if (i == 1) {
            return this.f48443L.mo45828a() ? EnumC17320h.DATA_CACHE : m51102r(EnumC17320h.DATA_CACHE);
        }
        if (i == 2) {
            return this.i0 ? EnumC17320h.FINISHED : EnumC17320h.SOURCE;
        }
        if (i == 3 || i == 4) {
            return EnumC17320h.FINISHED;
        }
        if (i == 5) {
            return this.f48443L.mo45829b() ? EnumC17320h.RESOURCE_CACHE : m51102r(EnumC17320h.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + enumC17320h);
    }

    @Override // java.lang.Runnable
    public void run() {
        et7.m25573c("DecodeJob#run(reason=%s, model=%s)", this.f48448Z, this.j0);
        lu4 lu4Var = this.p0;
        try {
            try {
                try {
                    if (this.s0) {
                        m51110z();
                        if (lu4Var != null) {
                            lu4Var.mo18154b();
                        }
                        et7.m25575e();
                        return;
                    }
                    m51093I();
                    if (lu4Var != null) {
                        lu4Var.mo18154b();
                    }
                    et7.m25575e();
                } catch (b32 e) {
                    throw e;
                }
            } catch (Throwable th) {
                if (Log.isLoggable("DecodeJob", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("DecodeJob threw unexpectedly, isCancelled: ");
                    sb.append(this.s0);
                    sb.append(", stage: ");
                    sb.append(this.f48447Y);
                }
                if (this.f48447Y != EnumC17320h.ENCODE) {
                    this.f48450b.add(th);
                    m51110z();
                }
                if (!this.s0) {
                    throw th;
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (lu4Var != null) {
                lu4Var.mo18154b();
            }
            et7.m25575e();
            throw th2;
        }
    }

    /* renamed from: s */
    public final rec m51103s(ez4 ez4Var) {
        rec recVar = this.f48444M;
        if (Build.VERSION.SDK_INT < 26) {
            return recVar;
        }
        boolean z = ez4Var == ez4.RESOURCE_DISK_CACHE || this.f48449a.m49524x();
        mec mecVar = sx5.f46067j;
        Boolean bool = (Boolean) recVar.m46585c(mecVar);
        if (bool != null && (!bool.booleanValue() || z)) {
            return recVar;
        }
        rec recVar2 = new rec();
        recVar2.m46586d(this.f48444M);
        recVar2.m46587e(mecVar, Boolean.valueOf(z));
        return recVar2;
    }

    /* renamed from: t */
    public final int m51104t() {
        return this.f48458s.ordinal();
    }

    /* renamed from: u */
    public u75 m51105u(C10726c c10726c, Object obj, dg6 dg6Var, ic9 ic9Var, int i, int i2, Class cls, Class cls2, gid gidVar, qt5 qt5Var, Map map, boolean z, boolean z2, boolean z3, rec recVar, InterfaceC17314b interfaceC17314b, int i3) {
        this.f48449a.m49522v(c10726c, obj, ic9Var, i, i2, qt5Var, cls, cls2, gidVar, recVar, map, z, z2, this.f48452d);
        this.f48456h = c10726c;
        this.f48457q = ic9Var;
        this.f48458s = gidVar;
        this.f48459x = dg6Var;
        this.f48460y = i;
        this.f48442H = i2;
        this.f48443L = qt5Var;
        this.i0 = z3;
        this.f48444M = recVar;
        this.f48445Q = interfaceC17314b;
        this.f48446X = i3;
        this.f48448Z = EnumC17319g.INITIALIZE;
        this.j0 = obj;
        return this;
    }

    /* renamed from: v */
    public final void m51106v(String str, long j) {
        m51107w(str, j, null);
    }

    /* renamed from: w */
    public final void m51107w(String str, long j, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(lja.m37349a(j));
        sb.append(", load key: ");
        sb.append(this.f48459x);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
    }

    /* renamed from: x */
    public final void m51108x(zne zneVar, ez4 ez4Var, boolean z) {
        m51094J();
        this.f48445Q.mo18848b(zneVar, ez4Var, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: y */
    public final void m51109y(zne zneVar, ez4 ez4Var, boolean z) {
        pia piaVar;
        et7.m25571a("DecodeJob.notifyEncodeAndRelease");
        try {
            if (zneVar instanceof ji8) {
                ((ji8) zneVar).mo33860a();
            }
            if (this.f48454f.m51114c()) {
                zneVar = pia.m43729c(zneVar);
                piaVar = zneVar;
            } else {
                piaVar = 0;
            }
            m51108x(zneVar, ez4Var, z);
            this.f48447Y = EnumC17320h.ENCODE;
            try {
                if (this.f48454f.m51114c()) {
                    this.f48454f.m51113b(this.f48452d, this.f48444M);
                }
                m51085A();
            } finally {
                if (piaVar != 0) {
                    piaVar.m43732f();
                }
            }
        } finally {
            et7.m25575e();
        }
    }

    /* renamed from: z */
    public final void m51110z() {
        m51094J();
        this.f48445Q.mo18849c(new xs7("Failed to load resource", new ArrayList(this.f48450b)));
        m51086B();
    }
}
