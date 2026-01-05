package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import aw.C0465e;
import d7.AbstractC1646r;
import d7.C1651w;
import d7.EnumC1644p;
import d7.InterfaceC1637j;
import g7.AbstractC2538c;
import g7.C2539d;
import g8.C2545e;
import g8.C2546f;
import g8.InterfaceC2547g;
import i8.C3182a;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d2 implements InterfaceC1637j, InterfaceC2547g, d7.c1 {

    /* renamed from: a */
    public final j0 f2491a;

    /* renamed from: b */
    public final d7.b1 f2492b;

    /* renamed from: c */
    public final RunnableC0359x f2493c;

    /* renamed from: d */
    public d7.y0 f2494d;

    /* renamed from: e */
    public C1651w f2495e = null;

    /* renamed from: f */
    public C2546f f2496f = null;

    public d2(j0 j0Var, d7.b1 b1Var, RunnableC0359x runnableC0359x) {
        this.f2491a = j0Var;
        this.f2492b = b1Var;
        this.f2493c = runnableC0359x;
    }

    /* renamed from: a */
    public final void m1128a(EnumC1644p enumC1644p) {
        this.f2495e.m5355g(enumC1644p);
    }

    /* renamed from: b */
    public final void m1129b() {
        if (this.f2495e == null) {
            this.f2495e = new C1651w(this);
            C2546f c2546f = new C2546f(new C3182a(this, new C0465e(9, this)));
            this.f2496f = c2546f;
            c2546f.m6567a();
            this.f2493c.run();
        }
    }

    @Override // d7.InterfaceC1637j
    public final AbstractC2538c getDefaultViewModelCreationExtras() {
        Application application;
        j0 j0Var = this.f2491a;
        Context applicationContext = j0Var.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        C2539d c2539d = new C2539d(0);
        LinkedHashMap linkedHashMap = c2539d.f13868a;
        if (application != null) {
            linkedHashMap.put(d7.x0.f8158d, application);
        }
        linkedHashMap.put(d7.q0.f8124a, j0Var);
        linkedHashMap.put(d7.q0.f8125b, this);
        if (j0Var.getArguments() != null) {
            linkedHashMap.put(d7.q0.f8126c, j0Var.getArguments());
        }
        return c2539d;
    }

    @Override // d7.InterfaceC1637j
    public final d7.y0 getDefaultViewModelProviderFactory() {
        Application application;
        j0 j0Var = this.f2491a;
        d7.y0 defaultViewModelProviderFactory = j0Var.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(j0Var.mDefaultFactory)) {
            this.f2494d = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f2494d == null) {
            Context applicationContext = j0Var.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.f2494d = new d7.t0(application, j0Var, j0Var.getArguments());
        }
        return this.f2494d;
    }

    @Override // d7.InterfaceC1649u
    public final AbstractC1646r getLifecycle() {
        m1129b();
        return this.f2495e;
    }

    @Override // g8.InterfaceC2547g
    public final C2545e getSavedStateRegistry() {
        m1129b();
        return this.f2496f.f13877b;
    }

    @Override // d7.c1
    public final d7.b1 getViewModelStore() {
        m1129b();
        return this.f2492b;
    }
}
