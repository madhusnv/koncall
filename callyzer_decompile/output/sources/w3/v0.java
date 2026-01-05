package w3;

import android.view.Choreographer;
import ex.InterfaceC2139c;
import og.od;
import tx.C7251k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class v0 implements Choreographer.FrameCallback {

    /* renamed from: a */
    public final /* synthetic */ C7251k f38041a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2139c f38042b;

    public v0(C7251k c7251k, k2.g1 g1Var, InterfaceC2139c interfaceC2139c) {
        this.f38041a = c7251k;
        this.f38042b = interfaceC2139c;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j6) {
        Object objM10796a;
        try {
            objM10796a = this.f38042b.invoke(Long.valueOf(j6));
        } catch (Throwable th2) {
            objM10796a = od.m10796a(th2);
        }
        this.f38041a.resumeWith(objM10796a);
    }
}
