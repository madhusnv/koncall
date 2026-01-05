package c0;

import a1.RunnableC0024w;
import be.C0655j;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final /* synthetic */ class o0 implements c0 {

    /* renamed from: a */
    public final /* synthetic */ int f5184a;

    /* renamed from: b */
    public final /* synthetic */ Object f5185b;

    public /* synthetic */ o0(int i10, Object obj) {
        this.f5184a = i10;
        this.f5185b = obj;
    }

    @Override // c0.c0
    /* renamed from: c */
    public final void mo2178c(d0 d0Var) {
        c0 c0Var;
        switch (this.f5184a) {
            case 0:
                q0 q0Var = (q0) ((WeakReference) ((p0) this.f5185b).f5190e).get();
                if (q0Var != null) {
                    q0Var.f5197y.execute(new RunnableC0024w(3, q0Var));
                    return;
                }
                return;
            default:
                C0655j c0655j = (C0655j) this.f5185b;
                synchronized (c0655j.f4193c) {
                    try {
                        int i10 = c0655j.f4191a - 1;
                        c0655j.f4191a = i10;
                        if (c0655j.f4192b && i10 == 0) {
                            c0655j.close();
                        }
                        c0Var = (c0) c0655j.f4196f;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (c0Var != null) {
                    c0Var.mo2178c(d0Var);
                    return;
                }
                return;
        }
    }
}
