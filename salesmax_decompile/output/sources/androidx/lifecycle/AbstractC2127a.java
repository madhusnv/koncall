package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.b0;
import p001o.dxi;
import p001o.f1f;
import p001o.h1f;
import p001o.sq8;
import p001o.ya4;

/* renamed from: androidx.lifecycle.a */
/* loaded from: classes2.dex */
public abstract class AbstractC2127a extends b0.C2133e implements b0.InterfaceC2131c {

    /* renamed from: b */
    public f1f f7638b;

    /* renamed from: c */
    public AbstractC2139h f7639c;

    /* renamed from: d */
    public Bundle f7640d;

    public AbstractC2127a(h1f h1fVar, Bundle bundle) {
        sq8.m48649h(h1fVar, "owner");
        this.f7638b = h1fVar.getSavedStateRegistry();
        this.f7639c = h1fVar.getLifecycle();
        this.f7640d = bundle;
    }

    @Override // androidx.lifecycle.b0.InterfaceC2131c
    /* renamed from: b */
    public dxi mo6492b(Class cls, ya4 ya4Var) {
        sq8.m48649h(cls, "modelClass");
        sq8.m48649h(ya4Var, "extras");
        String str = (String) ya4Var.mo54752a(b0.C2132d.f7664d);
        if (str != null) {
            return this.f7638b != null ? m6494e(str, cls) : mo6495f(str, cls, AbstractC2154w.m6596a(ya4Var));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.b0.InterfaceC2131c
    /* renamed from: c */
    public dxi mo6367c(Class cls) {
        sq8.m48649h(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        if (this.f7639c != null) {
            return m6494e(canonicalName, cls);
        }
        throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.b0.C2133e
    /* renamed from: d */
    public void mo6493d(dxi dxiVar) {
        sq8.m48649h(dxiVar, "viewModel");
        f1f f1fVar = this.f7638b;
        if (f1fVar != null) {
            sq8.m48646e(f1fVar);
            AbstractC2139h abstractC2139h = this.f7639c;
            sq8.m48646e(abstractC2139h);
            C2138g.m6517a(dxiVar, f1fVar, abstractC2139h);
        }
    }

    /* renamed from: e */
    public final dxi m6494e(String str, Class cls) throws Exception {
        f1f f1fVar = this.f7638b;
        sq8.m48646e(f1fVar);
        AbstractC2139h abstractC2139h = this.f7639c;
        sq8.m48646e(abstractC2139h);
        C2153v c2153vM6518b = C2138g.m6518b(f1fVar, abstractC2139h, str, this.f7640d);
        dxi dxiVarMo6495f = mo6495f(str, cls, c2153vM6518b.m6594c());
        dxiVarMo6495f.m23930b("androidx.lifecycle.savedstate.vm.tag", c2153vM6518b);
        return dxiVarMo6495f;
    }

    /* renamed from: f */
    public abstract dxi mo6495f(String str, Class cls, C2151t c2151t);
}
