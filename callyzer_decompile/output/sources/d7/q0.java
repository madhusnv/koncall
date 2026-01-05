package d7;

import android.os.Bundle;
import android.view.View;
import ay.C0496f;
import bl.C0689a;
import com.websoptimization.callyzerbiz.R;
import g7.AbstractC2538c;
import g8.C2545e;
import g8.InterfaceC2544d;
import g8.InterfaceC2547g;
import i7.C3178a;
import i7.C3180c;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC4154l;
import ng.C5070u;
import og.cg;
import og.oe;
import oj.C5392d;
import pg.n7;
import qw.C6360j;
import qw.C6361k;
import uw.C7565i;
import uw.InterfaceC7564h;
import yk.C8687a;
import yx.AbstractC8819m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class q0 {

    /* renamed from: a */
    public static final C0689a f8124a;

    /* renamed from: b */
    public static final C5070u f8125b;

    /* renamed from: c */
    public static final C5392d f8126c;

    /* renamed from: d */
    public static final C3180c f8127d = new C3180c();

    static {
        int i10 = 5;
        f8124a = new C0689a(i10);
        f8125b = new C5070u(i10);
        f8126c = new C5392d(i10);
    }

    /* renamed from: a */
    public static final void m5334a(w0 w0Var, C2545e registry, AbstractC1646r lifecycle) throws NoSuchMethodException, SecurityException {
        AbstractC4154l.m8923f(registry, "registry");
        AbstractC4154l.m8923f(lifecycle, "lifecycle");
        o0 o0Var = (o0) w0Var.m5361c("androidx.lifecycle.savedstate.vm.tag");
        if (o0Var == null || o0Var.f8123c) {
            return;
        }
        o0Var.m5332h(lifecycle, registry);
        EnumC1645q enumC1645qMo5344b = lifecycle.mo5344b();
        if (enumC1645qMo5344b == EnumC1645q.INITIALIZED || enumC1645qMo5344b.isAtLeast(EnumC1645q.STARTED)) {
            registry.m6566d();
        } else {
            lifecycle.mo5343a(new C1635h(lifecycle, registry));
        }
    }

    /* renamed from: b */
    public static final n0 m5335b(AbstractC2538c abstractC2538c) {
        n0 n0Var;
        AbstractC4154l.m8923f(abstractC2538c, "<this>");
        InterfaceC2547g interfaceC2547g = (InterfaceC2547g) abstractC2538c.mo6562a(f8124a);
        if (interfaceC2547g == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        c1 c1Var = (c1) abstractC2538c.mo6562a(f8125b);
        if (c1Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) abstractC2538c.mo6562a(f8126c);
        String str = (String) abstractC2538c.mo6562a(a1.f8066b);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        InterfaceC2544d interfaceC2544dM6564b = interfaceC2547g.getSavedStateRegistry().m6564b();
        Bundle bundle2 = null;
        r0 r0Var = interfaceC2544dM6564b instanceof r0 ? (r0) interfaceC2544dM6564b : null;
        if (r0Var == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap = m5339f(c1Var).f8132b;
        n0 n0Var2 = (n0) linkedHashMap.get(str);
        if (n0Var2 != null) {
            return n0Var2;
        }
        r0Var.m5347b();
        Bundle bundle3 = r0Var.f8130c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = n7.m11799a((C6361k[]) Arrays.copyOf(new C6361k[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                r0Var.f8130c = null;
            }
            bundle2 = bundle4;
        }
        if (bundle2 != null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            n0Var = new n0();
        } else {
            ClassLoader classLoader = n0.class.getClassLoader();
            AbstractC4154l.m8920c(classLoader);
            bundle.setClassLoader(classLoader);
            n0Var = new n0(cg.m10591f(bundle));
        }
        linkedHashMap.put(str, n0Var);
        return n0Var;
    }

    /* renamed from: c */
    public static final void m5336c(InterfaceC2547g interfaceC2547g) {
        EnumC1645q enumC1645qMo5344b = interfaceC2547g.getLifecycle().mo5344b();
        if (enumC1645qMo5344b != EnumC1645q.INITIALIZED && enumC1645qMo5344b != EnumC1645q.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (interfaceC2547g.getSavedStateRegistry().m6564b() == null) {
            r0 r0Var = new r0(interfaceC2547g.getSavedStateRegistry(), (c1) interfaceC2547g);
            interfaceC2547g.getSavedStateRegistry().m6565c("androidx.lifecycle.internal.SavedStateHandlesProvider", r0Var);
            interfaceC2547g.getLifecycle().mo5343a(new C1632e(1, r0Var));
        }
    }

    /* renamed from: d */
    public static final InterfaceC1649u m5337d(View view) {
        AbstractC4154l.m8923f(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            InterfaceC1649u interfaceC1649u = tag instanceof InterfaceC1649u ? (InterfaceC1649u) tag : null;
            if (interfaceC1649u != null) {
                return interfaceC1649u;
            }
            Object objM10801c = oe.m10801c(view);
            view = objM10801c instanceof View ? (View) objM10801c : null;
        }
        return null;
    }

    /* renamed from: e */
    public static final c1 m5338e(View view) {
        AbstractC4154l.m8923f(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            c1 c1Var = tag instanceof c1 ? (c1) tag : null;
            if (c1Var != null) {
                return c1Var;
            }
            Object objM10801c = oe.m10801c(view);
            view = objM10801c instanceof View ? (View) objM10801c : null;
        }
        return null;
    }

    /* renamed from: f */
    public static final s0 m5339f(c1 c1Var) {
        a1 a1VarM16035k = C8687a.m16035k(c1Var, new p0(), 4);
        return (s0) a1VarM16035k.f8067a.m2630j(kotlin.jvm.internal.a0.m8901a(s0.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    /* renamed from: g */
    public static final C3178a m5340g(w0 w0Var) {
        C3178a c3178a;
        AbstractC4154l.m8923f(w0Var, "<this>");
        synchronized (f8127d) {
            c3178a = (C3178a) w0Var.m5361c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (c3178a == null) {
                InterfaceC7564h interfaceC7564h = C7565i.f36440a;
                try {
                    C0496f c0496f = tx.m0.f34659a;
                    interfaceC7564h = AbstractC8819m.f42514a.f36446f;
                } catch (IllegalStateException | C6360j unused) {
                }
                C3178a c3178a2 = new C3178a(interfaceC7564h.t0(tx.c0.m13481d()));
                w0Var.m5359a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", c3178a2);
                c3178a = c3178a2;
            }
        }
        return c3178a;
    }

    /* renamed from: h */
    public static final void m5341h(View view, InterfaceC1649u interfaceC1649u) {
        AbstractC4154l.m8923f(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, interfaceC1649u);
    }

    /* renamed from: i */
    public static final void m5342i(View view, c1 c1Var) {
        AbstractC4154l.m8923f(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, c1Var);
    }
}
