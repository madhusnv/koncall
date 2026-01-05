package androidx.media3.exoplayer;

import androidx.media3.common.C2181a;
import androidx.media3.exoplayer.InterfaceC2221p;
import p001o.a85;
import p001o.if7;
import p001o.jb3;
import p001o.jbd;
import p001o.l1b;
import p001o.lmh;
import p001o.nke;
import p001o.op0;
import p001o.qm6;
import p001o.sqi;
import p001o.t0f;
import p001o.x8b;

/* renamed from: androidx.media3.exoplayer.c */
/* loaded from: classes2.dex */
public abstract class AbstractC2193c implements InterfaceC2218o, InterfaceC2221p {

    /* renamed from: L */
    public boolean f8141L;

    /* renamed from: M */
    public boolean f8142M;

    /* renamed from: X */
    public InterfaceC2221p.a f8144X;

    /* renamed from: b */
    public final int f8146b;

    /* renamed from: d */
    public nke f8148d;

    /* renamed from: e */
    public int f8149e;

    /* renamed from: f */
    public jbd f8150f;

    /* renamed from: g */
    public jb3 f8151g;

    /* renamed from: h */
    public int f8152h;

    /* renamed from: q */
    public t0f f8153q;

    /* renamed from: s */
    public C2181a[] f8154s;

    /* renamed from: x */
    public long f8155x;

    /* renamed from: y */
    public long f8156y;

    /* renamed from: a */
    public final Object f8145a = new Object();

    /* renamed from: c */
    public final if7 f8147c = new if7();

    /* renamed from: H */
    public long f8140H = Long.MIN_VALUE;

    /* renamed from: Q */
    public lmh f8143Q = lmh.f34048a;

    public AbstractC2193c(int i) {
        this.f8146b = i;
    }

    @Override // androidx.media3.exoplayer.InterfaceC2218o
    /* renamed from: B */
    public final void mo6869B(nke nkeVar, C2181a[] c2181aArr, t0f t0fVar, long j, boolean z, boolean z2, long j2, long j3, x8b.C18076b c18076b) {
        op0.m42517g(this.f8152h == 0);
        this.f8148d = nkeVar;
        this.f8152h = 1;
        a0(z, z2);
        mo6891l(c2181aArr, t0fVar, j2, j3, c18076b);
        l0(j2, z);
    }

    @Override // androidx.media3.exoplayer.InterfaceC2218o
    /* renamed from: E */
    public final InterfaceC2221p mo6870E() {
        return this;
    }

    @Override // androidx.media3.exoplayer.InterfaceC2221p
    /* renamed from: F */
    public final void mo6871F(InterfaceC2221p.a aVar) {
        synchronized (this.f8145a) {
            this.f8144X = aVar;
        }
    }

    @Override // androidx.media3.exoplayer.InterfaceC2221p
    /* renamed from: J */
    public int mo6872J() {
        return 0;
    }

    @Override // androidx.media3.exoplayer.InterfaceC2218o
    /* renamed from: K */
    public final long mo6873K() {
        return this.f8140H;
    }

    @Override // androidx.media3.exoplayer.InterfaceC2218o
    /* renamed from: L */
    public final void mo6874L(int i, jbd jbdVar, jb3 jb3Var) {
        this.f8149e = i;
        this.f8150f = jbdVar;
        this.f8151g = jb3Var;
        b0();
    }

    @Override // androidx.media3.exoplayer.InterfaceC2218o
    /* renamed from: M */
    public final void mo6875M(long j) {
        l0(j, false);
    }

    @Override // androidx.media3.exoplayer.InterfaceC2218o
    /* renamed from: N */
    public l1b mo6876N() {
        return null;
    }

    /* renamed from: P */
    public final qm6 m6877P(Throwable th, C2181a c2181a, int i) {
        return m6878Q(th, c2181a, false, i);
    }

    /* renamed from: Q */
    public final qm6 m6878Q(Throwable th, C2181a c2181a, boolean z, int i) {
        int iM7440O;
        if (c2181a == null || this.f8142M) {
            iM7440O = 4;
        } else {
            this.f8142M = true;
            try {
                iM7440O = InterfaceC2221p.m7440O(mo7449a(c2181a));
            } catch (qm6 unused) {
            } finally {
                this.f8142M = false;
            }
        }
        return qm6.m45648b(th, getName(), m6882U(), c2181a, iM7440O, z, i);
    }

    /* renamed from: R */
    public final jb3 m6879R() {
        return (jb3) op0.m42515e(this.f8151g);
    }

    /* renamed from: S */
    public final nke m6880S() {
        return (nke) op0.m42515e(this.f8148d);
    }

    /* renamed from: T */
    public final if7 m6881T() {
        this.f8147c.m32049a();
        return this.f8147c;
    }

    /* renamed from: U */
    public final int m6882U() {
        return this.f8149e;
    }

    /* renamed from: V */
    public final long m6883V() {
        return this.f8156y;
    }

    /* renamed from: W */
    public final jbd m6884W() {
        return (jbd) op0.m42515e(this.f8150f);
    }

    /* renamed from: X */
    public final C2181a[] m6885X() {
        return (C2181a[]) op0.m42515e(this.f8154s);
    }

    /* renamed from: Y */
    public final boolean m6886Y() {
        return mo6890i() ? this.f8141L : ((t0f) op0.m42515e(this.f8153q)).isReady();
    }

    /* renamed from: Z */
    public abstract void mo6887Z();

    public void a0(boolean z, boolean z2) {
    }

    public void b0() {
    }

    public abstract void c0(long j, boolean z);

    public void d0() {
    }

    @Override // androidx.media3.exoplayer.InterfaceC2218o
    public final void disable() {
        op0.m42517g(this.f8152h == 1);
        this.f8147c.m32049a();
        this.f8152h = 0;
        this.f8153q = null;
        this.f8154s = null;
        this.f8141L = false;
        mo6887Z();
    }

    public final void e0() {
        InterfaceC2221p.a aVar;
        synchronized (this.f8145a) {
            aVar = this.f8144X;
        }
        if (aVar != null) {
            aVar.mo7450a(this);
        }
    }

    @Override // androidx.media3.exoplayer.InterfaceC2218o, androidx.media3.exoplayer.InterfaceC2221p
    /* renamed from: f */
    public final int mo6888f() {
        return this.f8146b;
    }

    public void f0() {
    }

    public void g0() {
    }

    @Override // androidx.media3.exoplayer.InterfaceC2218o
    public final int getState() {
        return this.f8152h;
    }

    @Override // androidx.media3.exoplayer.InterfaceC2218o
    public final t0f getStream() {
        return this.f8153q;
    }

    @Override // androidx.media3.exoplayer.InterfaceC2221p
    /* renamed from: h */
    public final void mo6889h() {
        synchronized (this.f8145a) {
            this.f8144X = null;
        }
    }

    public void h0() {
    }

    @Override // androidx.media3.exoplayer.InterfaceC2218o
    /* renamed from: i */
    public final boolean mo6890i() {
        return this.f8140H == Long.MIN_VALUE;
    }

    public void i0(C2181a[] c2181aArr, long j, long j2, x8b.C18076b c18076b) {
    }

    public void j0(lmh lmhVar) {
    }

    public final int k0(if7 if7Var, a85 a85Var, int i) {
        int iMo26373f = ((t0f) op0.m42515e(this.f8153q)).mo26373f(if7Var, a85Var, i);
        if (iMo26373f == -4) {
            if (a85Var.m50150n()) {
                this.f8140H = Long.MIN_VALUE;
                return this.f8141L ? -4 : -3;
            }
            long j = a85Var.f14284f + this.f8155x;
            a85Var.f14284f = j;
            this.f8140H = Math.max(this.f8140H, j);
        } else if (iMo26373f == -5) {
            C2181a c2181a = (C2181a) op0.m42515e(if7Var.f28594b);
            if (c2181a.f7948s != Long.MAX_VALUE) {
                if7Var.f28594b = c2181a.m6707a().s0(c2181a.f7948s + this.f8155x).m6748K();
            }
        }
        return iMo26373f;
    }

    @Override // androidx.media3.exoplayer.InterfaceC2218o
    /* renamed from: l */
    public final void mo6891l(C2181a[] c2181aArr, t0f t0fVar, long j, long j2, x8b.C18076b c18076b) {
        op0.m42517g(!this.f8141L);
        this.f8153q = t0fVar;
        if (this.f8140H == Long.MIN_VALUE) {
            this.f8140H = j;
        }
        this.f8154s = c2181aArr;
        this.f8155x = j2;
        i0(c2181aArr, j, j2, c18076b);
    }

    public final void l0(long j, boolean z) {
        this.f8141L = false;
        this.f8156y = j;
        this.f8140H = j;
        c0(j, z);
    }

    @Override // androidx.media3.exoplayer.InterfaceC2218o
    /* renamed from: m */
    public final void mo6892m() {
        this.f8141L = true;
    }

    public int m0(long j) {
        return ((t0f) op0.m42515e(this.f8153q)).mo26374p(j - this.f8155x);
    }

    @Override // androidx.media3.exoplayer.InterfaceC2218o
    /* renamed from: q */
    public final void mo6893q(lmh lmhVar) {
        if (sqi.m48724c(this.f8143Q, lmhVar)) {
            return;
        }
        this.f8143Q = lmhVar;
        j0(lmhVar);
    }

    @Override // androidx.media3.exoplayer.InterfaceC2218o
    public final void release() {
        op0.m42517g(this.f8152h == 0);
        d0();
    }

    @Override // androidx.media3.exoplayer.InterfaceC2218o
    public final void reset() {
        op0.m42517g(this.f8152h == 0);
        this.f8147c.m32049a();
        f0();
    }

    @Override // androidx.media3.exoplayer.InterfaceC2218o
    public final void start() {
        op0.m42517g(this.f8152h == 1);
        this.f8152h = 2;
        g0();
    }

    @Override // androidx.media3.exoplayer.InterfaceC2218o
    public final void stop() {
        op0.m42517g(this.f8152h == 2);
        this.f8152h = 1;
        h0();
    }

    @Override // androidx.media3.exoplayer.C2217n.b
    /* renamed from: u */
    public void mo6894u(int i, Object obj) {
    }

    @Override // androidx.media3.exoplayer.InterfaceC2218o
    /* renamed from: v */
    public final void mo6895v() {
        ((t0f) op0.m42515e(this.f8153q)).mo26371a();
    }

    @Override // androidx.media3.exoplayer.InterfaceC2218o
    /* renamed from: y */
    public final boolean mo6896y() {
        return this.f8141L;
    }
}
