package p004e;

import android.window.OnBackInvokedCallback;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e.y */
/* loaded from: classes.dex */
public final /* synthetic */ class C1890y implements OnBackInvokedCallback {

    /* renamed from: a */
    public final /* synthetic */ int f8908a;

    /* renamed from: b */
    public final /* synthetic */ Object f8909b;

    public /* synthetic */ C1890y(int i10, Object obj) {
        this.f8908a = i10;
        this.f8909b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f8908a) {
            case 0:
                ((C1889x) this.f8909b).invoke();
                break;
            default:
                ((Runnable) this.f8909b).run();
                break;
        }
    }
}
