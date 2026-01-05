package p004e;

import a1.RunnableC0012k;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import c6.C0885o;
import d7.t0;
import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e.l */
/* loaded from: classes.dex */
public final class C1877l extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f8891a;

    /* renamed from: b */
    public final /* synthetic */ AbstractActivityC1878m f8892b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1877l(AbstractActivityC1878m abstractActivityC1878m, int i10) {
        super(0);
        this.f8891a = i10;
        this.f8892b = abstractActivityC1878m;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f8891a) {
            case 0:
                AbstractActivityC1878m abstractActivityC1878m = this.f8892b;
                return new t0(abstractActivityC1878m.getApplication(), abstractActivityC1878m, abstractActivityC1878m.getIntent() != null ? abstractActivityC1878m.getIntent().getExtras() : null);
            case 1:
                this.f8892b.reportFullyDrawn();
                return a0.f30746a;
            case 2:
                AbstractActivityC1878m abstractActivityC1878m2 = this.f8892b;
                return new C1886u(abstractActivityC1878m2.reportFullyDrawnExecutor, new C1877l(abstractActivityC1878m2, 1));
            default:
                AbstractActivityC1878m abstractActivityC1878m3 = this.f8892b;
                c0 c0Var = new c0(new RunnableC1868c(abstractActivityC1878m3, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (AbstractC4154l.m8918a(Looper.myLooper(), Looper.getMainLooper())) {
                        abstractActivityC1878m3.getLifecycle().mo5343a(new C0885o(1, c0Var, abstractActivityC1878m3));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new RunnableC0012k(18, abstractActivityC1878m3, c0Var));
                    }
                }
                return c0Var;
        }
    }
}
