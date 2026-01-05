package p001o;

/* loaded from: classes6.dex */
public interface fve {

    /* renamed from: o.fve$b */
    public interface InterfaceC13582b {
        /* renamed from: a */
        zce mo25596a();

        void cancel();

        /* renamed from: d */
        C13581a mo25599d();

        /* renamed from: e */
        InterfaceC13582b mo25600e();

        /* renamed from: f */
        C13581a mo25601f();

        boolean isReady();
    }

    /* renamed from: e */
    static /* synthetic */ boolean m27567e(fve fveVar, zce zceVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hasNext");
        }
        if ((i & 1) != 0) {
            zceVar = null;
        }
        return fveVar.mo24818c(zceVar);
    }

    /* renamed from: a */
    boolean mo24816a(w48 w48Var);

    /* renamed from: b */
    oo0 mo24817b();

    /* renamed from: c */
    boolean mo24818c(zce zceVar);

    /* renamed from: d */
    InterfaceC13582b mo24819d();

    d60 getAddress();

    boolean isCanceled();

    /* renamed from: o.fve$a */
    public static final class C13581a {

        /* renamed from: a */
        public final InterfaceC13582b f24162a;

        /* renamed from: b */
        public final InterfaceC13582b f24163b;

        /* renamed from: c */
        public final Throwable f24164c;

        public C13581a(InterfaceC13582b interfaceC13582b, InterfaceC13582b interfaceC13582b2, Throwable th) {
            sq8.m48649h(interfaceC13582b, "plan");
            this.f24162a = interfaceC13582b;
            this.f24163b = interfaceC13582b2;
            this.f24164c = th;
        }

        /* renamed from: a */
        public final InterfaceC13582b m27568a() {
            return this.f24163b;
        }

        /* renamed from: b */
        public final Throwable m27569b() {
            return this.f24164c;
        }

        /* renamed from: c */
        public final InterfaceC13582b m27570c() {
            return this.f24163b;
        }

        /* renamed from: d */
        public final InterfaceC13582b m27571d() {
            return this.f24162a;
        }

        /* renamed from: e */
        public final Throwable m27572e() {
            return this.f24164c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13581a)) {
                return false;
            }
            C13581a c13581a = (C13581a) obj;
            return sq8.m48644c(this.f24162a, c13581a.f24162a) && sq8.m48644c(this.f24163b, c13581a.f24163b) && sq8.m48644c(this.f24164c, c13581a.f24164c);
        }

        /* renamed from: f */
        public final boolean m27573f() {
            return this.f24163b == null && this.f24164c == null;
        }

        public int hashCode() {
            int iHashCode = this.f24162a.hashCode() * 31;
            InterfaceC13582b interfaceC13582b = this.f24163b;
            int iHashCode2 = (iHashCode + (interfaceC13582b == null ? 0 : interfaceC13582b.hashCode())) * 31;
            Throwable th = this.f24164c;
            return iHashCode2 + (th != null ? th.hashCode() : 0);
        }

        public String toString() {
            return "ConnectResult(plan=" + this.f24162a + ", nextPlan=" + this.f24163b + ", throwable=" + this.f24164c + ')';
        }

        public /* synthetic */ C13581a(InterfaceC13582b interfaceC13582b, InterfaceC13582b interfaceC13582b2, Throwable th, int i, id5 id5Var) {
            this(interfaceC13582b, (i & 2) != 0 ? null : interfaceC13582b2, (i & 4) != 0 ? null : th);
        }
    }
}
