package th;

import android.os.RemoteException;
import android.util.Log;
import c9.C0927v;
import eb.g2;
import uh.AbstractRunnableC7464i;
import uh.C7469n;
import yg.C8650g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: th.f */
/* loaded from: classes.dex */
public final class C7156f extends AbstractRunnableC7464i {

    /* renamed from: b */
    public final /* synthetic */ int f34394b = 0;

    /* renamed from: c */
    public final /* synthetic */ C8650g f34395c;

    /* renamed from: d */
    public final /* synthetic */ Object f34396d;

    /* renamed from: e */
    public final /* synthetic */ Object f34397e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7156f(C7158h c7158h, C8650g c8650g, String str, C8650g c8650g2) {
        super(c8650g);
        this.f34397e = c7158h;
        this.f34396d = str;
        this.f34395c = c8650g2;
    }

    @Override // uh.AbstractRunnableC7464i
    /* renamed from: a */
    public final void mo13417a() {
        switch (this.f34394b) {
            case 0:
                C8650g c8650g = this.f34395c;
                C7158h c7158h = (C7158h) this.f34397e;
                String str = (String) this.f34396d;
                try {
                    c7158h.f34404a.f36073m.mo14271K(c7158h.f34405b, C7158h.m13418a(c7158h, str), new BinderC7157g(c7158h, c8650g, str));
                    return;
                } catch (RemoteException e2) {
                    g2 g2Var = C7158h.f34402e;
                    Object[] objArr = {str};
                    g2Var.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        g2.m5718f(g2Var.f9320a, "requestUpdateInfo(%s)", objArr);
                    }
                    c8650g.m15970c(new RuntimeException(e2));
                    return;
                }
            default:
                synchronized (((C7469n) this.f34397e).f36066f) {
                    try {
                        C7469n c7469n = (C7469n) this.f34397e;
                        C8650g c8650g2 = this.f34395c;
                        c7469n.f36065e.add(c8650g2);
                        c8650g2.f41930a.m15976c(new C0927v(16, c7469n, c8650g2, false));
                        if (((C7469n) this.f34397e).f36071k.getAndIncrement() > 0) {
                            ((C7469n) this.f34397e).f36062b.m5720e("Already connected to the service.", new Object[0]);
                        }
                        C7469n.m14272b((C7469n) this.f34397e, (C7156f) this.f34396d);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7156f(C7469n c7469n, C8650g c8650g, C8650g c8650g2, C7156f c7156f) {
        super(c8650g);
        this.f34397e = c7469n;
        this.f34395c = c8650g2;
        this.f34396d = c7156f;
    }
}
