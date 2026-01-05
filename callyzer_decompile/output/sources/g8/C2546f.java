package g8;

import android.os.Bundle;
import d7.EnumC1645q;
import i8.C3182a;
import java.util.Arrays;
import java.util.Map;
import og.cg;
import og.fg;
import pg.n7;
import qw.C6361k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g8.f */
/* loaded from: classes.dex */
public final class C2546f {

    /* renamed from: a */
    public final C3182a f13876a;

    /* renamed from: b */
    public final C2545e f13877b;

    public C2546f(C3182a c3182a) {
        this.f13876a = c3182a;
        this.f13877b = new C2545e(c3182a);
    }

    /* renamed from: a */
    public final void m6567a() {
        this.f13876a.m7540a();
    }

    /* renamed from: b */
    public final void m6568b(Bundle bundle) {
        C3182a c3182a = this.f13876a;
        InterfaceC2547g interfaceC2547g = c3182a.f17106a;
        if (!c3182a.f17110e) {
            c3182a.m7540a();
        }
        if (interfaceC2547g.getLifecycle().mo5344b().isAtLeast(EnumC1645q.STARTED)) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + interfaceC2547g.getLifecycle().mo5344b()).toString());
        }
        if (c3182a.f17112g) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundleM10588c = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleM10588c = cg.m10588c("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
        }
        c3182a.f17111f = bundleM10588c;
        c3182a.f17112g = true;
    }

    /* renamed from: c */
    public final void m6569c(Bundle bundle) {
        C3182a c3182a = this.f13876a;
        Bundle bundleM11799a = n7.m11799a((C6361k[]) Arrays.copyOf(new C6361k[0], 0));
        Bundle bundle2 = c3182a.f17111f;
        if (bundle2 != null) {
            bundleM11799a.putAll(bundle2);
        }
        synchronized (c3182a.f17108c) {
            for (Map.Entry entry : c3182a.f17109d.entrySet()) {
                fg.m10658d(bundleM11799a, (String) entry.getKey(), ((InterfaceC2544d) entry.getValue()).mo1205a());
            }
        }
        if (bundleM11799a.isEmpty()) {
            return;
        }
        fg.m10658d(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key", bundleM11799a);
    }
}
