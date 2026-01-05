package g2;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import ex.InterfaceC2137a;
import h1.C2772c;
import tx.InterfaceC7266z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i7 implements OnBackAnimationCallback {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC7266z f11803a;

    /* renamed from: b */
    public final /* synthetic */ C2772c f11804b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2137a f11805c;

    public i7(InterfaceC2137a interfaceC2137a, C2772c c2772c, InterfaceC7266z interfaceC7266z) {
        this.f11803a = interfaceC7266z;
        this.f11804b = c2772c;
        this.f11805c = interfaceC2137a;
    }

    public final void onBackCancelled() {
        tx.c0.m13502y(this.f11803a, null, null, new g7(this.f11804b, null, 0), 3);
    }

    public final void onBackInvoked() {
        this.f11805c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        tx.c0.m13502y(this.f11803a, null, null, new h7(this.f11804b, backEvent, null, 0), 3);
    }

    public final void onBackStarted(BackEvent backEvent) {
        tx.c0.m13502y(this.f11803a, null, null, new h7(this.f11804b, backEvent, null, 1), 3);
    }
}
