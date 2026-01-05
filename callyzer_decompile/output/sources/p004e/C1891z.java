package p004e;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e.z */
/* loaded from: classes.dex */
public final class C1891z implements OnBackAnimationCallback {

    /* renamed from: a */
    public final /* synthetic */ C1888w f8910a;

    /* renamed from: b */
    public final /* synthetic */ C1888w f8911b;

    /* renamed from: c */
    public final /* synthetic */ C1889x f8912c;

    /* renamed from: d */
    public final /* synthetic */ C1889x f8913d;

    public C1891z(C1888w c1888w, C1888w c1888w2, C1889x c1889x, C1889x c1889x2) {
        this.f8910a = c1888w;
        this.f8911b = c1888w2;
        this.f8912c = c1889x;
        this.f8913d = c1889x2;
    }

    public final void onBackCancelled() {
        this.f8913d.invoke();
    }

    public final void onBackInvoked() {
        this.f8912c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        AbstractC4154l.m8923f(backEvent, "backEvent");
        this.f8911b.invoke(new C1866a(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        AbstractC4154l.m8923f(backEvent, "backEvent");
        this.f8910a.invoke(new C1866a(backEvent));
    }
}
