package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.AbstractC2139h;
import java.util.Iterator;
import p001o.dxi;
import p001o.f1f;
import p001o.h1f;
import p001o.kxi;
import p001o.lxi;
import p001o.sq8;
import p001o.xca;

/* renamed from: androidx.lifecycle.g */
/* loaded from: classes2.dex */
public final class C2138g {

    /* renamed from: a */
    public static final C2138g f7669a = new C2138g();

    /* renamed from: androidx.lifecycle.g$a */
    public static final class a implements f1f.InterfaceC13310a {
        @Override // p001o.f1f.InterfaceC13310a
        /* renamed from: a */
        public void mo6520a(h1f h1fVar) throws NoSuchMethodException, SecurityException {
            sq8.m48649h(h1fVar, "owner");
            if (!(h1fVar instanceof lxi)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
            }
            kxi viewModelStore = ((lxi) h1fVar).getViewModelStore();
            f1f savedStateRegistry = h1fVar.getSavedStateRegistry();
            Iterator it = viewModelStore.m36301c().iterator();
            while (it.hasNext()) {
                dxi dxiVarM36300b = viewModelStore.m36300b((String) it.next());
                sq8.m48646e(dxiVarM36300b);
                C2138g.m6517a(dxiVarM36300b, savedStateRegistry, h1fVar.getLifecycle());
            }
            if (!viewModelStore.m36301c().isEmpty()) {
                savedStateRegistry.m25947i(a.class);
            }
        }
    }

    /* renamed from: androidx.lifecycle.g$b */
    public static final class b implements InterfaceC2142k {

        /* renamed from: a */
        public final /* synthetic */ AbstractC2139h f7670a;

        /* renamed from: b */
        public final /* synthetic */ f1f f7671b;

        public b(AbstractC2139h abstractC2139h, f1f f1fVar) {
            this.f7670a = abstractC2139h;
            this.f7671b = f1fVar;
        }

        @Override // androidx.lifecycle.InterfaceC2142k
        /* renamed from: o */
        public void mo3717o(xca xcaVar, AbstractC2139h.a aVar) throws NoSuchMethodException, SecurityException {
            sq8.m48649h(xcaVar, "source");
            sq8.m48649h(aVar, "event");
            if (aVar == AbstractC2139h.a.ON_START) {
                this.f7670a.mo6524d(this);
                this.f7671b.m25947i(a.class);
            }
        }
    }

    /* renamed from: a */
    public static final void m6517a(dxi dxiVar, f1f f1fVar, AbstractC2139h abstractC2139h) {
        sq8.m48649h(dxiVar, "viewModel");
        sq8.m48649h(f1fVar, "registry");
        sq8.m48649h(abstractC2139h, "lifecycle");
        C2153v c2153v = (C2153v) dxiVar.m23932d("androidx.lifecycle.savedstate.vm.tag");
        if (c2153v == null || c2153v.m6595d()) {
            return;
        }
        c2153v.m6593a(f1fVar, abstractC2139h);
        f7669a.m6519c(f1fVar, abstractC2139h);
    }

    /* renamed from: b */
    public static final C2153v m6518b(f1f f1fVar, AbstractC2139h abstractC2139h, String str, Bundle bundle) {
        sq8.m48649h(f1fVar, "registry");
        sq8.m48649h(abstractC2139h, "lifecycle");
        sq8.m48646e(str);
        C2153v c2153v = new C2153v(str, C2151t.f7749f.m6590a(f1fVar.m25941b(str), bundle));
        c2153v.m6593a(f1fVar, abstractC2139h);
        f7669a.m6519c(f1fVar, abstractC2139h);
        return c2153v;
    }

    /* renamed from: c */
    public final void m6519c(f1f f1fVar, AbstractC2139h abstractC2139h) throws NoSuchMethodException, SecurityException {
        AbstractC2139h.b bVarMo6522b = abstractC2139h.mo6522b();
        if (bVarMo6522b == AbstractC2139h.b.INITIALIZED || bVarMo6522b.isAtLeast(AbstractC2139h.b.STARTED)) {
            f1fVar.m25947i(a.class);
        } else {
            abstractC2139h.mo6521a(new b(abstractC2139h, f1fVar));
        }
    }
}
