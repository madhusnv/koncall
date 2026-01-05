package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.AbstractC2139h;
import androidx.lifecycle.AbstractC2154w;
import androidx.lifecycle.C2144m;
import androidx.lifecycle.C2155x;
import androidx.lifecycle.InterfaceC2137f;
import androidx.lifecycle.b0;
import p001o.f1f;
import p001o.g1f;
import p001o.h1f;
import p001o.kxi;
import p001o.lxi;
import p001o.wob;
import p001o.ya4;

/* renamed from: androidx.fragment.app.k */
/* loaded from: classes2.dex */
public class C2125k implements InterfaceC2137f, h1f, lxi {

    /* renamed from: a */
    public final Fragment f7607a;

    /* renamed from: b */
    public final kxi f7608b;

    /* renamed from: c */
    public final Runnable f7609c;

    /* renamed from: d */
    public b0.InterfaceC2131c f7610d;

    /* renamed from: e */
    public C2144m f7611e = null;

    /* renamed from: f */
    public g1f f7612f = null;

    public C2125k(Fragment fragment, kxi kxiVar, Runnable runnable) {
        this.f7607a = fragment;
        this.f7608b = kxiVar;
        this.f7609c = runnable;
    }

    /* renamed from: a */
    public void m6431a(AbstractC2139h.a aVar) {
        this.f7611e.m6538i(aVar);
    }

    /* renamed from: b */
    public void m6432b() {
        if (this.f7611e == null) {
            this.f7611e = new C2144m(this);
            g1f g1fVarM27975a = g1f.m27975a(this);
            this.f7612f = g1fVarM27975a;
            g1fVarM27975a.m27977c();
            this.f7609c.run();
        }
    }

    /* renamed from: c */
    public boolean m6433c() {
        return this.f7611e != null;
    }

    /* renamed from: d */
    public void m6434d(Bundle bundle) {
        this.f7612f.m27978d(bundle);
    }

    /* renamed from: e */
    public void m6435e(Bundle bundle) {
        this.f7612f.m27979e(bundle);
    }

    /* renamed from: f */
    public void m6436f(AbstractC2139h.b bVar) {
        this.f7611e.m6543n(bVar);
    }

    @Override // androidx.lifecycle.InterfaceC2137f
    public ya4 getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.f7607a.requireContext().getApplicationContext();
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
        wob wobVar = new wob();
        if (application != null) {
            wobVar.m54753c(b0.C2129a.f7658h, application);
        }
        wobVar.m54753c(AbstractC2154w.f7762a, this.f7607a);
        wobVar.m54753c(AbstractC2154w.f7763b, this);
        if (this.f7607a.getArguments() != null) {
            wobVar.m54753c(AbstractC2154w.f7764c, this.f7607a.getArguments());
        }
        return wobVar;
    }

    @Override // androidx.lifecycle.InterfaceC2137f
    public b0.InterfaceC2131c getDefaultViewModelProviderFactory() {
        Application application;
        b0.InterfaceC2131c defaultViewModelProviderFactory = this.f7607a.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.f7607a.mDefaultFactory)) {
            this.f7610d = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f7610d == null) {
            Context applicationContext = this.f7607a.requireContext().getApplicationContext();
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
            Fragment fragment = this.f7607a;
            this.f7610d = new C2155x(application, fragment, fragment.getArguments());
        }
        return this.f7610d;
    }

    @Override // p001o.xca
    public AbstractC2139h getLifecycle() {
        m6432b();
        return this.f7611e;
    }

    @Override // p001o.h1f
    public f1f getSavedStateRegistry() {
        m6432b();
        return this.f7612f.m27976b();
    }

    @Override // p001o.lxi
    public kxi getViewModelStore() {
        m6432b();
        return this.f7608b;
    }
}
