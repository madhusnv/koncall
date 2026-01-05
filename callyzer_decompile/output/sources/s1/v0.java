package s1;

import ak.C0166e;
import android.os.Trace;
import c9.C0919n;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4168z;
import l4.C4367l;
import n1.AbstractC4941a;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import ox.AbstractC5773d;
import ox.C5770a;
import ox.C5774e;
import s4.C6745a;
import t3.d1;
import t3.f1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class v0 implements g0 {

    /* renamed from: a */
    public final int f32151a;

    /* renamed from: b */
    public final long f32152b;

    /* renamed from: c */
    public final C0919n f32153c;

    /* renamed from: d */
    public d1 f32154d;

    /* renamed from: e */
    public boolean f32155e;

    /* renamed from: f */
    public boolean f32156f;

    /* renamed from: g */
    public boolean f32157g;

    /* renamed from: h */
    public u0 f32158h;

    /* renamed from: i */
    public boolean f32159i;

    /* renamed from: j */
    public long f32160j;

    /* renamed from: k */
    public long f32161k;

    /* renamed from: l */
    public long f32162l = AbstractC5773d.m11305c();

    /* renamed from: m */
    public final /* synthetic */ C4367l f32163m;

    public v0(C4367l c4367l, int i10, long j6, C0919n c0919n) {
        this.f32163m = c4367l;
        this.f32151a = i10;
        this.f32152b = j6;
        this.f32153c = c0919n;
    }

    @Override // s1.g0
    /* renamed from: a */
    public final void mo12848a() {
        this.f32159i = true;
    }

    /* JADX WARN: Type inference failed for: r9v21, types: [ex.c, kotlin.jvm.internal.m] */
    /* renamed from: b */
    public final boolean m12869b(C0166e c0166e) {
        long j6;
        C0919n c0919n;
        long j10;
        C0919n c0919n2;
        long j11;
        long j12;
        long j13 = c0166e.f515a;
        C4367l c4367l = this.f32163m;
        InterfaceC6728w interfaceC6728w = (InterfaceC6728w) ((C6727v) c4367l.f21921b).f32149b.invoke();
        if (this.f32156f) {
            return false;
        }
        int iMo12101a = interfaceC6728w.mo12101a();
        int i10 = this.f32151a;
        if (i10 < 0 || i10 >= iMo12101a) {
            return false;
        }
        Object objMo12103c = interfaceC6728w.mo12103c(i10);
        this.f32160j = Math.max(0L, j13 - System.nanoTime());
        this.f32162l = AbstractC5773d.m11305c();
        this.f32161k = 0L;
        d1 d1Var = this.f32154d;
        C0919n c0919n3 = this.f32153c;
        if (d1Var != null) {
            j11 = j13;
            j6 = 0;
            c0919n2 = c0919n3;
        } else {
            j6 = 0;
            long j14 = this.f32160j;
            long j15 = c0919n3.m2657c(objMo12103c).f32044a;
            if ((!this.f32159i || j14 <= 0) && j15 >= j14) {
                return true;
            }
            Trace.beginSection("compose:lazy:prefetch:compose");
            try {
                if (this.f32154d != null) {
                    AbstractC4941a.m9884a("Request was already composed!");
                }
                Object objMo12102b = interfaceC6728w.mo12102b(i10);
                this.f32154d = ((f1) c4367l.f21922c).m13292a().m13289f(objMo12102b, ((C6727v) c4367l.f21921b).m12867a(i10, objMo12102b, objMo12103c));
                Trace.endSection();
                m12872e();
                long j16 = this.f32161k;
                C6707b c6707b = (C6707b) c0919n3.f5598a;
                long j17 = c6707b.f32044a;
                if (j17 == 0) {
                    j10 = j16;
                    c0919n = c0919n3;
                } else {
                    long j18 = 4;
                    c0919n = c0919n3;
                    j10 = (j16 / j18) + ((j17 / j18) * 3);
                }
                c6707b.f32044a = j10;
                c0919n2 = c0919n;
                C6707b c6707bM2657c = c0919n2.m2657c(objMo12103c);
                long j19 = c6707bM2657c.f32044a;
                if (j19 == 0) {
                    j11 = j13;
                } else {
                    long j20 = 4;
                    j11 = j13;
                    j16 = (j16 / j20) + ((j19 / j20) * 3);
                }
                c6707bM2657c.f32044a = j16;
            } finally {
            }
        }
        if (!this.f32159i) {
            if (!this.f32157g) {
                if (this.f32160j <= j6) {
                    return true;
                }
                Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                try {
                    this.f32158h = m12871d();
                    this.f32157g = true;
                } finally {
                }
            }
            u0 u0Var = this.f32158h;
            if (u0Var != null) {
                List[] listArr = (List[]) u0Var.f32146d;
                int i11 = u0Var.f32143a;
                List list = (List) u0Var.f32145c;
                if (i11 < list.size()) {
                    if (((v0) u0Var.f32147e).f32156f) {
                        AbstractC4941a.m9886c("Should not execute nested prefetch on canceled request");
                    }
                    Trace.beginSection("compose:lazy:prefetch:nested");
                    while (u0Var.f32143a < list.size()) {
                        try {
                            if (listArr[u0Var.f32143a] == null) {
                                long j21 = j6;
                                if (Math.max(j21, j11 - System.nanoTime()) <= j21) {
                                    return true;
                                }
                                int i12 = u0Var.f32143a;
                                h0 h0Var = (h0) list.get(i12);
                                ?? r9 = h0Var.f32071a;
                                f0 f0Var = new f0(h0Var);
                                r9.invoke(f0Var);
                                listArr[i12] = f0Var.f32065a;
                            }
                            List list2 = listArr[u0Var.f32143a];
                            AbstractC4154l.m8920c(list2);
                            while (u0Var.f32144b < list2.size()) {
                                if (((v0) list2.get(u0Var.f32144b)).m12869b(c0166e)) {
                                    return true;
                                }
                                u0Var.f32144b++;
                            }
                            u0Var.f32144b = 0;
                            u0Var.f32143a++;
                            j6 = 0;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
            m12872e();
        }
        if (this.f32155e) {
            return false;
        }
        long j22 = this.f32152b;
        if (C6745a.m12921l(j22)) {
            return false;
        }
        long j23 = this.f32160j;
        long j24 = c0919n2.m2657c(objMo12103c).f32045b;
        if ((!this.f32159i || j23 <= 0) && j24 >= j23) {
            return true;
        }
        Trace.beginSection("compose:lazy:prefetch:measure");
        try {
            m12870c(j22);
            Trace.endSection();
            m12872e();
            long j25 = this.f32161k;
            C6707b c6707b2 = (C6707b) c0919n2.f5598a;
            long j26 = c6707b2.f32045b;
            if (j26 == 0) {
                j12 = j25;
            } else {
                long j27 = 4;
                j12 = (j25 / j27) + ((j26 / j27) * 3);
            }
            c6707b2.f32045b = j12;
            C6707b c6707bM2657c2 = c0919n2.m2657c(objMo12103c);
            long j28 = c6707bM2657c2.f32045b;
            if (j28 != 0) {
                long j29 = 4;
                j25 = (j25 / j29) + ((j28 / j29) * 3);
            }
            c6707bM2657c2.f32045b = j25;
            return false;
        } finally {
        }
    }

    /* renamed from: c */
    public final void m12870c(long j6) {
        if (this.f32156f) {
            AbstractC4941a.m9884a("Callers should check whether the request is still valid before calling performMeasure()");
        }
        if (this.f32155e) {
            AbstractC4941a.m9884a("Request was already measured!");
        }
        this.f32155e = true;
        d1 d1Var = this.f32154d;
        if (d1Var == null) {
            AbstractC4941a.m9885b("performComposition() must be called before performMeasure()");
            throw new KotlinNothingValueException();
        }
        int iMo13282a = d1Var.mo13282a();
        for (int i10 = 0; i10 < iMo13282a; i10++) {
            d1Var.mo13283b(i10, j6);
        }
    }

    @Override // s1.g0
    public final void cancel() {
        if (this.f32156f) {
            return;
        }
        this.f32156f = true;
        d1 d1Var = this.f32154d;
        if (d1Var != null) {
            d1Var.dispose();
        }
        this.f32154d = null;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Serializable, java.util.List[]] */
    /* renamed from: d */
    public final u0 m12871d() {
        d1 d1Var = this.f32154d;
        if (d1Var == null) {
            AbstractC4941a.m9885b("Should precompose before resolving nested prefetch states");
            throw new KotlinNothingValueException();
        }
        C4168z c4168z = new C4168z();
        d1Var.mo13284c(new o1.k0(c4168z, 4));
        List list = (List) c4168z.f21164a;
        if (list == null) {
            return null;
        }
        u0 u0Var = new u0();
        u0Var.f32147e = this;
        u0Var.f32145c = list;
        u0Var.f32146d = new List[list.size()];
        if (list.isEmpty()) {
            AbstractC4941a.m9884a("NestedPrefetchController shouldn't be created with no states");
        }
        return u0Var;
    }

    /* renamed from: e */
    public final void m12872e() {
        long jM11305c = AbstractC5773d.m11305c();
        long jM11294e = C5770a.m11294e(C5774e.m11307b(jM11305c, this.f32162l));
        this.f32161k = jM11294e;
        this.f32160j -= jM11294e;
        this.f32162l = jM11305c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HandleAndRequestImpl { index = ");
        sb2.append(this.f32151a);
        sb2.append(", constraints = ");
        sb2.append((Object) C6745a.m12922m(this.f32152b));
        sb2.append(", isComposed = ");
        sb2.append(this.f32154d != null);
        sb2.append(", isMeasured = ");
        sb2.append(this.f32155e);
        sb2.append(", isCanceled = ");
        return AbstractC5601a.m11242m(sb2, this.f32156f, " }");
    }
}
