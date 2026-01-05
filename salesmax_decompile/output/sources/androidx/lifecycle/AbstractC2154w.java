package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.AbstractC2139h;
import androidx.lifecycle.b0;
import p001o.c1f;
import p001o.d1f;
import p001o.dxi;
import p001o.f1f;
import p001o.h1f;
import p001o.lxi;
import p001o.sq8;
import p001o.ya4;

/* renamed from: androidx.lifecycle.w */
/* loaded from: classes2.dex */
public abstract class AbstractC2154w {

    /* renamed from: a */
    public static final ya4.InterfaceC18362b f7762a = new b();

    /* renamed from: b */
    public static final ya4.InterfaceC18362b f7763b = new c();

    /* renamed from: c */
    public static final ya4.InterfaceC18362b f7764c = new a();

    /* renamed from: androidx.lifecycle.w$a */
    public static final class a implements ya4.InterfaceC18362b {
    }

    /* renamed from: androidx.lifecycle.w$b */
    public static final class b implements ya4.InterfaceC18362b {
    }

    /* renamed from: androidx.lifecycle.w$c */
    public static final class c implements ya4.InterfaceC18362b {
    }

    /* renamed from: androidx.lifecycle.w$d */
    public static final class d implements b0.InterfaceC2131c {
        @Override // androidx.lifecycle.b0.InterfaceC2131c
        /* renamed from: b */
        public dxi mo6492b(Class cls, ya4 ya4Var) {
            sq8.m48649h(cls, "modelClass");
            sq8.m48649h(ya4Var, "extras");
            return new d1f();
        }
    }

    /* renamed from: a */
    public static final C2151t m6596a(ya4 ya4Var) {
        sq8.m48649h(ya4Var, "<this>");
        h1f h1fVar = (h1f) ya4Var.mo54752a(f7762a);
        if (h1fVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        lxi lxiVar = (lxi) ya4Var.mo54752a(f7763b);
        if (lxiVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) ya4Var.mo54752a(f7764c);
        String str = (String) ya4Var.mo54752a(b0.C2132d.f7664d);
        if (str != null) {
            return m6597b(h1fVar, lxiVar, str, bundle);
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }

    /* renamed from: b */
    public static final C2151t m6597b(h1f h1fVar, lxi lxiVar, String str, Bundle bundle) {
        c1f c1fVarM6599d = m6599d(h1fVar);
        d1f d1fVarM6600e = m6600e(lxiVar);
        C2151t c2151t = (C2151t) d1fVarM6600e.m22237f().get(str);
        if (c2151t != null) {
            return c2151t;
        }
        C2151t c2151tM6590a = C2151t.f7749f.m6590a(c1fVarM6599d.m20069b(str), bundle);
        d1fVarM6600e.m22237f().put(str, c2151tM6590a);
        return c2151tM6590a;
    }

    /* renamed from: c */
    public static final void m6598c(h1f h1fVar) {
        sq8.m48649h(h1fVar, "<this>");
        AbstractC2139h.b bVarMo6522b = h1fVar.getLifecycle().mo6522b();
        if (!(bVarMo6522b == AbstractC2139h.b.INITIALIZED || bVarMo6522b == AbstractC2139h.b.CREATED)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (h1fVar.getSavedStateRegistry().m25942c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            c1f c1fVar = new c1f(h1fVar.getSavedStateRegistry(), (lxi) h1fVar);
            h1fVar.getSavedStateRegistry().m25946h("androidx.lifecycle.internal.SavedStateHandlesProvider", c1fVar);
            h1fVar.getLifecycle().mo6521a(new C2152u(c1fVar));
        }
    }

    /* renamed from: d */
    public static final c1f m6599d(h1f h1fVar) {
        sq8.m48649h(h1fVar, "<this>");
        f1f.InterfaceC13312c interfaceC13312cM25942c = h1fVar.getSavedStateRegistry().m25942c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        c1f c1fVar = interfaceC13312cM25942c instanceof c1f ? (c1f) interfaceC13312cM25942c : null;
        if (c1fVar != null) {
            return c1fVar;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    /* renamed from: e */
    public static final d1f m6600e(lxi lxiVar) {
        sq8.m48649h(lxiVar, "<this>");
        return (d1f) new b0(lxiVar, new d()).m6506b("androidx.lifecycle.internal.SavedStateHandlesVM", d1f.class);
    }
}
