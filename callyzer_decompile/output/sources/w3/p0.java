package w3;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import b4.C0598d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class p0 implements ComponentCallbacks2 {

    /* renamed from: a */
    public final /* synthetic */ C0598d f37914a;

    public p0(C0598d c0598d) {
        this.f37914a = c0598d;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        C0598d c0598d = this.f37914a;
        synchronized (c0598d) {
            c0598d.f3975a.m5658c();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        C0598d c0598d = this.f37914a;
        synchronized (c0598d) {
            c0598d.f3975a.m5658c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        C0598d c0598d = this.f37914a;
        synchronized (c0598d) {
            c0598d.f3975a.m5658c();
        }
    }
}
