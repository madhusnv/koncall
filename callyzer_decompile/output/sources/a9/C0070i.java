package a9;

import android.content.Context;
import android.net.ConnectivityManager;
import c9.C0914i;
import kotlin.jvm.internal.AbstractC4154l;
import t8.C7077w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: a9.i */
/* loaded from: classes.dex */
public final class C0070i extends AbstractC0067f {

    /* renamed from: f */
    public final ConnectivityManager f260f;

    /* renamed from: g */
    public final C0069h f261g;

    public C0070i(Context context, C0914i c0914i) {
        super(context, c0914i);
        Object systemService = ((Context) this.f252b).getSystemService("connectivity");
        AbstractC4154l.m8921d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f260f = (ConnectivityManager) systemService;
        this.f261g = new C0069h(0, this);
    }

    @Override // a9.AbstractC0067f
    /* renamed from: c */
    public final Object mo182c() {
        return AbstractC0071j.m189a(this.f260f);
    }

    @Override // a9.AbstractC0067f
    /* renamed from: e */
    public final void mo183e() {
        try {
            C7077w c7077wM13371a = C7077w.m13371a();
            int i10 = AbstractC0071j.f262a;
            c7077wM13371a.getClass();
            ConnectivityManager connectivityManager = this.f260f;
            C0069h networkCallback = this.f261g;
            AbstractC4154l.m8923f(connectivityManager, "<this>");
            AbstractC4154l.m8923f(networkCallback, "networkCallback");
            connectivityManager.registerDefaultNetworkCallback(networkCallback);
        } catch (IllegalArgumentException unused) {
            C7077w c7077wM13371a2 = C7077w.m13371a();
            int i11 = AbstractC0071j.f262a;
            c7077wM13371a2.getClass();
        } catch (SecurityException unused2) {
            C7077w c7077wM13371a3 = C7077w.m13371a();
            int i12 = AbstractC0071j.f262a;
            c7077wM13371a3.getClass();
        }
    }

    @Override // a9.AbstractC0067f
    /* renamed from: f */
    public final void mo184f() {
        try {
            C7077w c7077wM13371a = C7077w.m13371a();
            int i10 = AbstractC0071j.f262a;
            c7077wM13371a.getClass();
            ConnectivityManager connectivityManager = this.f260f;
            C0069h networkCallback = this.f261g;
            AbstractC4154l.m8923f(connectivityManager, "<this>");
            AbstractC4154l.m8923f(networkCallback, "networkCallback");
            connectivityManager.unregisterNetworkCallback(networkCallback);
        } catch (IllegalArgumentException unused) {
            C7077w c7077wM13371a2 = C7077w.m13371a();
            int i11 = AbstractC0071j.f262a;
            c7077wM13371a2.getClass();
        } catch (SecurityException unused2) {
            C7077w c7077wM13371a3 = C7077w.m13371a();
            int i12 = AbstractC0071j.f262a;
            c7077wM13371a3.getClass();
        }
    }
}
