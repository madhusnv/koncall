package h1;

import android.os.Bundle;
import android.os.SystemClock;
import ug.b3;
import ug.l4;
import ug.q2;
import ug.r3;
import ug.s3;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e2 implements z1 {

    /* renamed from: a */
    public long f15410a;

    /* renamed from: b */
    public long f15411b;

    /* renamed from: c */
    public final Object f15412c;

    /* renamed from: d */
    public final Object f15413d;

    public e2(s3 s3Var) {
        this.f15413d = s3Var;
        ug.n1 n1Var = (ug.n1) s3Var.f482a;
        this.f15412c = new r3(this, n1Var, 0);
        n1Var.f35674l.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f15410a = jElapsedRealtime;
        this.f15411b = jElapsedRealtime;
    }

    @Override // h1.z1
    /* renamed from: B */
    public AbstractC2785p mo2730B(long j6, AbstractC2785p abstractC2785p, AbstractC2785p abstractC2785p2, AbstractC2785p abstractC2785p3) {
        return ((b2) this.f15412c).mo2730B(m6801a(j6), abstractC2785p, abstractC2785p2, m6802c(j6, abstractC2785p, abstractC2785p3, abstractC2785p2));
    }

    /* renamed from: a */
    public long m6801a(long j6) {
        long j10 = this.f15411b;
        if (j6 + j10 <= 0) {
            return 0L;
        }
        long j11 = j6 + j10;
        long j12 = this.f15410a;
        long j13 = j11 / j12;
        return (((o0) this.f15413d) == o0.Restart || j13 % ((long) 2) == 0) ? j11 - (j13 * j12) : ((j13 + 1) * j12) - j11;
    }

    @Override // h1.z1
    /* renamed from: b */
    public boolean mo6777b() {
        return true;
    }

    /* renamed from: c */
    public AbstractC2785p m6802c(long j6, AbstractC2785p abstractC2785p, AbstractC2785p abstractC2785p2, AbstractC2785p abstractC2785p3) {
        long j10 = this.f15411b;
        long j11 = j6 + j10;
        long j12 = this.f15410a;
        return j11 > j12 ? ((b2) this.f15412c).mo2744n(j12 - j10, abstractC2785p, abstractC2785p3, abstractC2785p2) : abstractC2785p2;
    }

    /* renamed from: d */
    public boolean m6803d(long j6, boolean z6, boolean z10) {
        s3 s3Var = (s3) this.f15413d;
        s3Var.mo325M();
        s3Var.m13936N();
        ug.n1 n1Var = (ug.n1) s3Var.f482a;
        boolean zM14087d = n1Var.m14087d();
        ug.v0 v0Var = n1Var.f35669f;
        if (zM14087d) {
            ug.d1 d1Var = n1Var.f35668e;
            ug.n1.m14083i(d1Var);
            ug.c1 c1Var = d1Var.f35342r;
            n1Var.f35674l.getClass();
            c1Var.m13857b(System.currentTimeMillis());
        }
        long j10 = j6 - this.f15410a;
        if (!z6 && j10 < 1000) {
            ug.n1.m14085m(v0Var);
            v0Var.f35870p.m14141b(Long.valueOf(j10), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z10) {
            j10 = j6 - this.f15411b;
            this.f15411b = j6;
        }
        ug.n1.m14085m(v0Var);
        v0Var.f35870p.m14141b(Long.valueOf(j10), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j10);
        boolean z11 = !n1Var.f35667d.a0();
        b3 b3Var = n1Var.f35675m;
        ug.n1.m14084k(b3Var);
        l4.E0(b3Var.m13842S(z11), bundle, true);
        if (!z10) {
            q2 q2Var = n1Var.f35676n;
            ug.n1.m14084k(q2Var);
            q2Var.m14122T("auto", "_e", bundle);
        }
        this.f15410a = j6;
        r3 r3Var = (r3) this.f15412c;
        r3Var.m14097c();
        r3Var.m14096b(((Long) ug.f0.f44825q0.m13872a(null)).longValue());
        return true;
    }

    @Override // h1.z1
    /* renamed from: m */
    public long mo6771m(AbstractC2785p abstractC2785p, AbstractC2785p abstractC2785p2, AbstractC2785p abstractC2785p3) {
        return Long.MAX_VALUE;
    }

    @Override // h1.z1
    /* renamed from: n */
    public AbstractC2785p mo2744n(long j6, AbstractC2785p abstractC2785p, AbstractC2785p abstractC2785p2, AbstractC2785p abstractC2785p3) {
        return ((b2) this.f15412c).mo2744n(m6801a(j6), abstractC2785p, abstractC2785p2, m6802c(j6, abstractC2785p, abstractC2785p3, abstractC2785p2));
    }

    public e2(b2 b2Var, o0 o0Var, long j6) {
        this.f15412c = b2Var;
        this.f15413d = o0Var;
        this.f15410a = (b2Var.mo2732W() + b2Var.mo2731N()) * 1000000;
        this.f15411b = j6 * 1000000;
    }
}
