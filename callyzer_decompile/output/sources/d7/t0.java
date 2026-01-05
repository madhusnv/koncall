package d7;

import android.app.Application;
import android.os.Bundle;
import dx.AbstractC1851a;
import g7.C2539d;
import g8.C2545e;
import g8.InterfaceC2547g;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4147e;
import og.cg;
import pg.z5;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class t0 implements y0 {

    /* renamed from: a */
    public final Application f8133a;

    /* renamed from: b */
    public final x0 f8134b;

    /* renamed from: c */
    public final Bundle f8135c;

    /* renamed from: d */
    public final AbstractC1646r f8136d;

    /* renamed from: e */
    public final C2545e f8137e;

    public t0() {
        this.f8134b = new x0(null);
    }

    @Override // d7.y0
    /* renamed from: a */
    public final w0 mo5348a(Class cls, C2539d c2539d) {
        LinkedHashMap linkedHashMap = c2539d.f13868a;
        String str = (String) linkedHashMap.get(a1.f8066b);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(q0.f8124a) == null || linkedHashMap.get(q0.f8125b) == null) {
            if (this.f8136d != null) {
                return m5349d(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(x0.f8158d);
        boolean zIsAssignableFrom = AbstractC1628a.class.isAssignableFrom(cls);
        Constructor constructorM5350a = (!zIsAssignableFrom || application == null) ? u0.m5350a(cls, u0.f8139b) : u0.m5350a(cls, u0.f8138a);
        return constructorM5350a == null ? this.f8134b.mo5348a(cls, c2539d) : (!zIsAssignableFrom || application == null) ? u0.m5351b(cls, constructorM5350a, q0.m5335b(c2539d)) : u0.m5351b(cls, constructorM5350a, application, q0.m5335b(c2539d));
    }

    @Override // d7.y0
    /* renamed from: b */
    public final w0 mo1207b(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return m5349d(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // d7.y0
    /* renamed from: c */
    public final w0 mo5333c(C4147e c4147e, C2539d c2539d) {
        return mo5348a(AbstractC1851a.m5483b(c4147e), c2539d);
    }

    /* renamed from: d */
    public final w0 m5349d(Class cls, String str) throws NoSuchMethodException, SecurityException {
        n0 n0Var;
        AbstractC1646r abstractC1646r = this.f8136d;
        if (abstractC1646r == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = AbstractC1628a.class.isAssignableFrom(cls);
        Application application = this.f8133a;
        Constructor constructorM5350a = (!zIsAssignableFrom || application == null) ? u0.m5350a(cls, u0.f8139b) : u0.m5350a(cls, u0.f8138a);
        if (constructorM5350a == null) {
            if (application != null) {
                return this.f8134b.mo1207b(cls);
            }
            if (z0.f8163a == null) {
                z0.f8163a = new z0();
            }
            AbstractC4154l.m8920c(z0.f8163a);
            return z5.m11962a(cls);
        }
        C2545e c2545e = this.f8137e;
        AbstractC4154l.m8920c(c2545e);
        Bundle bundleM6563a = c2545e.m6563a(str);
        if (bundleM6563a == null) {
            bundleM6563a = this.f8135c;
        }
        if (bundleM6563a == null) {
            n0Var = new n0();
        } else {
            ClassLoader classLoader = n0.class.getClassLoader();
            AbstractC4154l.m8920c(classLoader);
            bundleM6563a.setClassLoader(classLoader);
            n0Var = new n0(cg.m10591f(bundleM6563a));
        }
        o0 o0Var = new o0(str, n0Var);
        o0Var.m5332h(abstractC1646r, c2545e);
        EnumC1645q enumC1645qMo5344b = abstractC1646r.mo5344b();
        if (enumC1645qMo5344b == EnumC1645q.INITIALIZED || enumC1645qMo5344b.isAtLeast(EnumC1645q.STARTED)) {
            c2545e.m6566d();
        } else {
            abstractC1646r.mo5343a(new C1635h(abstractC1646r, c2545e));
        }
        w0 w0VarM5351b = (!zIsAssignableFrom || application == null) ? u0.m5351b(cls, constructorM5350a, n0Var) : u0.m5351b(cls, constructorM5350a, application, n0Var);
        w0VarM5351b.m5359a("androidx.lifecycle.savedstate.vm.tag", o0Var);
        return w0VarM5351b;
    }

    public t0(Application application, InterfaceC2547g interfaceC2547g, Bundle bundle) {
        x0 x0Var;
        this.f8137e = interfaceC2547g.getSavedStateRegistry();
        this.f8136d = interfaceC2547g.getLifecycle();
        this.f8135c = bundle;
        this.f8133a = application;
        if (application != null) {
            if (x0.f8157c == null) {
                x0.f8157c = new x0(application);
            }
            x0Var = x0.f8157c;
            AbstractC4154l.m8920c(x0Var);
        } else {
            x0Var = new x0(null);
        }
        this.f8134b = x0Var;
    }
}
