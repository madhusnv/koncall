package ug;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f35449a;

    /* renamed from: b */
    public final /* synthetic */ long f35450b;

    /* renamed from: c */
    public final /* synthetic */ q2 f35451c;

    public g2(q2 q2Var, long j6, int i10) {
        this.f35449a = i10;
        switch (i10) {
            case 1:
                this.f35450b = j6;
                Objects.requireNonNull(q2Var);
                this.f35451c = q2Var;
                break;
            default:
                this.f35450b = j6;
                Objects.requireNonNull(q2Var);
                this.f35451c = q2Var;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f35449a) {
            case 0:
                n1 n1Var = (n1) this.f35451c.f482a;
                d1 d1Var = n1Var.f35668e;
                n1.m14083i(d1Var);
                c1 c1Var = d1Var.f35337l;
                long j6 = this.f35450b;
                c1Var.m13857b(j6);
                v0 v0Var = n1Var.f35669f;
                n1.m14085m(v0Var);
                v0Var.f35869n.m14141b(Long.valueOf(j6), "Session timeout duration set");
                break;
            default:
                q2 q2Var = this.f35451c;
                q2Var.mo325M();
                q2Var.m13936N();
                n1 n1Var2 = (n1) q2Var.f482a;
                v0 v0Var2 = n1Var2.f35669f;
                n1.m14085m(v0Var2);
                v0Var2.f35869n.m14140a("Resetting analytics data (FE)");
                s3 s3Var = n1Var2.f35671h;
                n1.m14084k(s3Var);
                s3Var.mo325M();
                h1.e2 e2Var = s3Var.f35825f;
                ((r3) e2Var.f15412c).m14097c();
                ((n1) ((s3) e2Var.f15413d).f482a).f35674l.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                e2Var.f15410a = jElapsedRealtime;
                e2Var.f15411b = jElapsedRealtime;
                n1Var2.m14095r().m14079R();
                boolean z6 = !n1Var2.m14087d();
                d1 d1Var2 = n1Var2.f35668e;
                n1.m14083i(d1Var2);
                d1Var2.f35332f.m13857b(this.f35450b);
                n1 n1Var3 = (n1) d1Var2.f482a;
                d1 d1Var3 = n1Var3.f35668e;
                n1.m14083i(d1Var3);
                if (!TextUtils.isEmpty(d1Var3.f35348y.m428s())) {
                    d1Var2.f35348y.m429t(null);
                }
                d1Var2.f35342r.m13857b(0L);
                d1Var2.f35343s.m13857b(0L);
                if (!n1Var3.f35667d.m13892Z()) {
                    d1Var2.m13866V(z6);
                }
                d1Var2.f35349z.m429t(null);
                d1Var2.f35327B.m13857b(0L);
                d1Var2.f35328C.m15247Z(null);
                k3 k3VarM14093p = n1Var2.m14093p();
                k3VarM14093p.mo325M();
                k3VarM14093p.m13936N();
                n4 n4VarC0 = k3VarM14093p.c0(false);
                k3VarM14093p.m14025Y();
                ((n1) k3VarM14093p.f482a).m14092o().m14106Q();
                k3VarM14093p.a0(new f3(k3VarM14093p, n4VarC0, 0));
                n1.m14084k(s3Var);
                s3Var.f35824e.m13917B();
                q2Var.f35786v = z6;
                n1Var2.m14093p().m14017Q(new AtomicReference());
                break;
        }
    }
}
