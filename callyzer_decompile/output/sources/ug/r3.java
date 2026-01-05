package ug;

import android.content.Intent;
import android.os.SystemClock;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class r3 extends AbstractC7444o {

    /* renamed from: e */
    public final /* synthetic */ int f35809e;

    /* renamed from: f */
    public final /* synthetic */ Object f35810f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r3(Object obj, u1 u1Var, int i10) {
        super(u1Var);
        this.f35809e = i10;
        this.f35810f = obj;
    }

    @Override // ug.AbstractC7444o
    /* renamed from: a */
    public final void mo13868a() {
        switch (this.f35809e) {
            case 0:
                h1.e2 e2Var = (h1.e2) this.f35810f;
                s3 s3Var = (s3) e2Var.f15413d;
                s3Var.mo325M();
                n1 n1Var = (n1) s3Var.f482a;
                n1Var.f35674l.getClass();
                e2Var.m6803d(SystemClock.elapsedRealtime(), false, false);
                c0 c0Var = n1Var.f35677p;
                n1.m14082h(c0Var);
                n1Var.f35674l.getClass();
                c0Var.m13852P(SystemClock.elapsedRealtime());
                break;
            case 1:
                x3 x3Var = (x3) this.f35810f;
                x3Var.m14185Q();
                v0 v0Var = ((n1) x3Var.f482a).f35669f;
                n1.m14085m(v0Var);
                v0Var.f35870p.m14140a("Starting upload from DelayedRunnable");
                x3Var.f35959b.m13975q();
                break;
            default:
                h4 h4Var = (h4) this.f35810f;
                h4Var.mo327b().mo325M();
                String str = (String) h4Var.f35502s.pollFirst();
                if (str != null) {
                    h4Var.mo334l().getClass();
                    h4Var.f35484N = SystemClock.elapsedRealtime();
                    h4Var.mo326a().f35870p.m14141b(str, "Sending trigger URI notification to app");
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intent.setPackage(str);
                    h4.m13942S(h4Var.f35497m.f35664a, intent);
                }
                h4Var.m13950H();
                break;
        }
    }
}
