package p001o;

import android.os.Looper;
import p001o.dnd;
import p001o.dz4;
import p001o.ind;
import p001o.jnd;
import p001o.lmh;
import p001o.s2b;
import p001o.x8b;

/* loaded from: classes2.dex */
public final class jnd extends be1 implements ind.InterfaceC14337c {

    /* renamed from: H */
    public boolean f30810H;

    /* renamed from: L */
    public long f30811L;

    /* renamed from: M */
    public boolean f30812M;

    /* renamed from: Q */
    public boolean f30813Q;

    /* renamed from: X */
    public juh f30814X;

    /* renamed from: Y */
    public s2b f30815Y;

    /* renamed from: h */
    public final dz4.InterfaceC13064a f30816h;

    /* renamed from: q */
    public final dnd.InterfaceC13005a f30817q;

    /* renamed from: s */
    public final nz5 f30818s;

    /* renamed from: x */
    public final sga f30819x;

    /* renamed from: y */
    public final int f30820y;

    /* renamed from: o.jnd$a */
    public class C14619a extends uf7 {
        public C14619a(lmh lmhVar) {
            super(lmhVar);
        }

        @Override // p001o.uf7, p001o.lmh
        /* renamed from: g */
        public lmh.C15105b mo6950g(int i, lmh.C15105b c15105b, boolean z) {
            super.mo6950g(i, c15105b, z);
            c15105b.f34062f = true;
            return c15105b;
        }

        @Override // p001o.uf7, p001o.lmh
        /* renamed from: o */
        public lmh.C15106c mo6953o(int i, lmh.C15106c c15106c, long j) {
            super.mo6953o(i, c15106c, j);
            c15106c.f34090k = true;
            return c15106c;
        }
    }

    /* renamed from: o.jnd$b */
    public static final class C14620b implements f9b {

        /* renamed from: c */
        public final dz4.InterfaceC13064a f30822c;

        /* renamed from: d */
        public dnd.InterfaceC13005a f30823d;

        /* renamed from: e */
        public pz5 f30824e;

        /* renamed from: f */
        public sga f30825f;

        /* renamed from: g */
        public int f30826g;

        public C14620b(dz4.InterfaceC13064a interfaceC13064a) {
            this(interfaceC13064a, new be5());
        }

        /* renamed from: h */
        public static /* synthetic */ dnd m34135h(yq6 yq6Var, jbd jbdVar) {
            return new ln1(yq6Var);
        }

        @Override // p001o.x8b.InterfaceC18075a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public jnd mo6940e(s2b s2bVar) {
            op0.m42515e(s2bVar.f44480b);
            return new jnd(s2bVar, this.f30822c, this.f30823d, this.f30824e.mo44362a(s2bVar), this.f30825f, this.f30826g, null);
        }

        @Override // p001o.x8b.InterfaceC18075a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public C14620b mo6939d(pz5 pz5Var) {
            this.f30824e = (pz5) op0.m42516f(pz5Var, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // p001o.x8b.InterfaceC18075a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public C14620b mo6938c(sga sgaVar) {
            this.f30825f = (sga) op0.m42516f(sgaVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public C14620b(dz4.InterfaceC13064a interfaceC13064a, final yq6 yq6Var) {
            this(interfaceC13064a, new dnd.InterfaceC13005a() { // from class: o.knd
                @Override // p001o.dnd.InterfaceC13005a
                /* renamed from: a */
                public final dnd mo23629a(jbd jbdVar) {
                    return jnd.C14620b.m34135h(yq6Var, jbdVar);
                }
            });
        }

        public C14620b(dz4.InterfaceC13064a interfaceC13064a, dnd.InterfaceC13005a interfaceC13005a) {
            this(interfaceC13064a, interfaceC13005a, new ud5(), new ue5(), 1048576);
        }

        public C14620b(dz4.InterfaceC13064a interfaceC13064a, dnd.InterfaceC13005a interfaceC13005a, pz5 pz5Var, sga sgaVar, int i) {
            this.f30822c = interfaceC13064a;
            this.f30823d = interfaceC13005a;
            this.f30824e = pz5Var;
            this.f30825f = sgaVar;
            this.f30826g = i;
        }
    }

    public /* synthetic */ jnd(s2b s2bVar, dz4.InterfaceC13064a interfaceC13064a, dnd.InterfaceC13005a interfaceC13005a, nz5 nz5Var, sga sgaVar, int i, C14619a c14619a) {
        this(s2bVar, interfaceC13064a, interfaceC13005a, nz5Var, sgaVar, i);
    }

    @Override // p001o.be1
    /* renamed from: B */
    public void mo6919B(juh juhVar) {
        this.f30814X = juhVar;
        this.f30818s.mo41292c((Looper) op0.m42515e(Looper.myLooper()), m18744z());
        this.f30818s.mo41294f();
        m34133F();
    }

    @Override // p001o.be1
    /* renamed from: D */
    public void mo6920D() {
        this.f30818s.release();
    }

    /* renamed from: E */
    public final s2b.C16723h m34132E() {
        return (s2b.C16723h) op0.m42515e(mo6932b().f44480b);
    }

    /* renamed from: F */
    public final void m34133F() {
        lmh nufVar = new nuf(this.f30811L, this.f30812M, false, this.f30813Q, null, mo6932b());
        if (this.f30810H) {
            nufVar = new C14619a(nufVar);
        }
        m18729C(nufVar);
    }

    @Override // p001o.x8b
    /* renamed from: a */
    public x4b mo6931a(x8b.C18076b c18076b, ob0 ob0Var, long j) {
        dz4 dz4VarMo23962a = this.f30816h.mo23962a();
        juh juhVar = this.f30814X;
        if (juhVar != null) {
            dz4VarMo23962a.mo23961j(juhVar);
        }
        s2b.C16723h c16723hM34132E = m34132E();
        return new ind(c16723hM34132E.f44572a, dz4VarMo23962a, this.f30817q.mo23629a(m18744z()), this.f30818s, m18739u(c18076b), this.f30819x, m18741w(c18076b), this, ob0Var, c16723hM34132E.f44576e, this.f30820y, sqi.O0(c16723hM34132E.f44580i));
    }

    @Override // p001o.x8b
    /* renamed from: b */
    public synchronized s2b mo6932b() {
        return this.f30815Y;
    }

    @Override // p001o.x8b
    /* renamed from: e */
    public void mo6933e(x4b x4bVar) {
        ((ind) x4bVar).g0();
    }

    @Override // p001o.ind.InterfaceC14337c
    /* renamed from: i */
    public void mo32499i(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.f30811L;
        }
        if (!this.f30810H && this.f30811L == j && this.f30812M == z && this.f30813Q == z2) {
            return;
        }
        this.f30811L = j;
        this.f30812M = z;
        this.f30813Q = z2;
        this.f30810H = false;
        m34133F();
    }

    @Override // p001o.x8b
    /* renamed from: j */
    public void mo6934j() {
    }

    @Override // p001o.x8b
    /* renamed from: n */
    public synchronized void mo6935n(s2b s2bVar) {
        this.f30815Y = s2bVar;
    }

    public jnd(s2b s2bVar, dz4.InterfaceC13064a interfaceC13064a, dnd.InterfaceC13005a interfaceC13005a, nz5 nz5Var, sga sgaVar, int i) {
        this.f30815Y = s2bVar;
        this.f30816h = interfaceC13064a;
        this.f30817q = interfaceC13005a;
        this.f30818s = nz5Var;
        this.f30819x = sgaVar;
        this.f30820y = i;
        this.f30810H = true;
        this.f30811L = -9223372036854775807L;
    }
}
