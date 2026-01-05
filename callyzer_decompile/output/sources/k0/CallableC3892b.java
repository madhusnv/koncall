package k0;

import android.os.Binder;
import android.os.Process;
import com.google.android.gms.internal.measurement.l4;
import java.util.concurrent.Callable;
import k7.RunnableC4019a;
import ng.C5066q;
import og.yg;
import pg.ka;
import sf.C6824j;
import ug.C7449t;
import ug.h4;
import ug.i1;
import ug.s1;
import ug.y0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k0.b */
/* loaded from: classes.dex */
public final class CallableC3892b implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f19990a;

    /* renamed from: b */
    public final /* synthetic */ Object f19991b;

    public /* synthetic */ CallableC3892b(int i10, Object obj) {
        this.f19990a = i10;
        this.f19991b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f19990a) {
            case 0:
                ((Runnable) this.f19991b).run();
                return null;
            case 1:
                RunnableC4019a runnableC4019a = (RunnableC4019a) this.f19991b;
                runnableC4019a.f20794e.set(true);
                try {
                    Process.setThreadPriority(10);
                    runnableC4019a.m8821a();
                    Binder.flushPendingCommands();
                    return null;
                } finally {
                }
            case 2:
                C5066q c5066q = (C5066q) this.f19991b;
                c5066q.getClass();
                return C6824j.f32444c.m13016a(c5066q.f24859a);
            case 3:
                yg ygVar = (yg) this.f19991b;
                ygVar.getClass();
                return C6824j.f32444c.m13016a(ygVar.f26975g);
            case 4:
                ka kaVar = (ka) this.f19991b;
                kaVar.getClass();
                return C6824j.f32444c.m13016a(kaVar.f28946g);
            case 5:
                return new l4(((i1) this.f19991b).f35517l);
            default:
                s1 s1Var = (s1) this.f19991b;
                s1Var.f35819e.m13947B();
                y0 y0Var = s1Var.f35819e.f35493h;
                h4.m13944U(y0Var);
                y0Var.mo325M();
                throw new IllegalStateException("Unexpected call on client side");
        }
    }

    public CallableC3892b(s1 s1Var, C7449t c7449t, String str) {
        this.f19990a = 6;
        this.f19991b = s1Var;
    }
}
