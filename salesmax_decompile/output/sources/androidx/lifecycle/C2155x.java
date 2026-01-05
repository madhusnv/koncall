package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.b0;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.lang.reflect.Constructor;
import p001o.dxi;
import p001o.f1f;
import p001o.h1f;
import p001o.i1f;
import p001o.sq8;
import p001o.ya4;
import p001o.zf0;

/* renamed from: androidx.lifecycle.x */
/* loaded from: classes2.dex */
public final class C2155x extends b0.C2133e implements b0.InterfaceC2131c {

    /* renamed from: b */
    public Application f7765b;

    /* renamed from: c */
    public final b0.InterfaceC2131c f7766c;

    /* renamed from: d */
    public Bundle f7767d;

    /* renamed from: e */
    public AbstractC2139h f7768e;

    /* renamed from: f */
    public f1f f7769f;

    public C2155x(Application application, h1f h1fVar, Bundle bundle) {
        sq8.m48649h(h1fVar, "owner");
        this.f7769f = h1fVar.getSavedStateRegistry();
        this.f7768e = h1fVar.getLifecycle();
        this.f7767d = bundle;
        this.f7765b = application;
        this.f7766c = application != null ? b0.C2129a.f7656f.m6511a(application) : new b0.C2129a();
    }

    @Override // androidx.lifecycle.b0.InterfaceC2131c
    /* renamed from: b */
    public dxi mo6492b(Class cls, ya4 ya4Var) {
        sq8.m48649h(cls, "modelClass");
        sq8.m48649h(ya4Var, "extras");
        String str = (String) ya4Var.mo54752a(b0.C2132d.f7664d);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (ya4Var.mo54752a(AbstractC2154w.f7762a) == null || ya4Var.mo54752a(AbstractC2154w.f7763b) == null) {
            if (this.f7768e != null) {
                return m6601e(str, cls);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) ya4Var.mo54752a(b0.C2129a.f7658h);
        boolean zIsAssignableFrom = zf0.class.isAssignableFrom(cls);
        Constructor constructorM31388c = (!zIsAssignableFrom || application == null) ? i1f.m31388c(cls, i1f.f27933b) : i1f.m31388c(cls, i1f.f27932a);
        return constructorM31388c == null ? this.f7766c.mo6492b(cls, ya4Var) : (!zIsAssignableFrom || application == null) ? i1f.m31389d(cls, constructorM31388c, AbstractC2154w.m6596a(ya4Var)) : i1f.m31389d(cls, constructorM31388c, application, AbstractC2154w.m6596a(ya4Var));
    }

    @Override // androidx.lifecycle.b0.InterfaceC2131c
    /* renamed from: c */
    public dxi mo6367c(Class cls) {
        sq8.m48649h(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return m6601e(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.b0.C2133e
    /* renamed from: d */
    public void mo6493d(dxi dxiVar) {
        sq8.m48649h(dxiVar, "viewModel");
        if (this.f7768e != null) {
            f1f f1fVar = this.f7769f;
            sq8.m48646e(f1fVar);
            AbstractC2139h abstractC2139h = this.f7768e;
            sq8.m48646e(abstractC2139h);
            C2138g.m6517a(dxiVar, f1fVar, abstractC2139h);
        }
    }

    /* renamed from: e */
    public final dxi m6601e(String str, Class cls) throws Exception {
        dxi dxiVarM31389d;
        Application application;
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        sq8.m48649h(cls, "modelClass");
        AbstractC2139h abstractC2139h = this.f7768e;
        if (abstractC2139h == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = zf0.class.isAssignableFrom(cls);
        Constructor constructorM31388c = (!zIsAssignableFrom || this.f7765b == null) ? i1f.m31388c(cls, i1f.f27933b) : i1f.m31388c(cls, i1f.f27932a);
        if (constructorM31388c == null) {
            return this.f7765b != null ? this.f7766c.mo6367c(cls) : b0.C2132d.f7662b.m6516a().mo6367c(cls);
        }
        f1f f1fVar = this.f7769f;
        sq8.m48646e(f1fVar);
        C2153v c2153vM6518b = C2138g.m6518b(f1fVar, abstractC2139h, str, this.f7767d);
        if (!zIsAssignableFrom || (application = this.f7765b) == null) {
            dxiVarM31389d = i1f.m31389d(cls, constructorM31388c, c2153vM6518b.m6594c());
        } else {
            sq8.m48646e(application);
            dxiVarM31389d = i1f.m31389d(cls, constructorM31388c, application, c2153vM6518b.m6594c());
        }
        dxiVarM31389d.m23930b("androidx.lifecycle.savedstate.vm.tag", c2153vM6518b);
        return dxiVarM31389d;
    }
}
