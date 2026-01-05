package p001o;

import android.os.Bundle;
import androidx.lifecycle.AbstractC2139h;
import androidx.lifecycle.InterfaceC2142k;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p001o.f1f;

/* loaded from: classes2.dex */
public final class lfe implements InterfaceC2142k {

    /* renamed from: b */
    public static final C15067a f33717b = new C15067a(null);

    /* renamed from: a */
    public final h1f f33718a;

    /* renamed from: o.lfe$a */
    public static final class C15067a {
        public C15067a() {
        }

        public /* synthetic */ C15067a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: o.lfe$b */
    public static final class C15068b implements f1f.InterfaceC13312c {

        /* renamed from: a */
        public final Set f33719a;

        public C15068b(f1f f1fVar) {
            sq8.m48649h(f1fVar, "registry");
            this.f33719a = new LinkedHashSet();
            f1fVar.m25946h("androidx.savedstate.Restarter", this);
        }

        @Override // p001o.f1f.InterfaceC13312c
        /* renamed from: a */
        public Bundle mo3785a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f33719a));
            return bundle;
        }

        /* renamed from: b */
        public final void m37122b(String str) {
            sq8.m48649h(str, "className");
            this.f33719a.add(str);
        }
    }

    public lfe(h1f h1fVar) {
        sq8.m48649h(h1fVar, "owner");
        this.f33718a = h1fVar;
    }

    /* renamed from: a */
    public final void m37121a(String str) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str, false, lfe.class.getClassLoader()).asSubclass(f1f.InterfaceC13310a.class);
            sq8.m48648g(clsAsSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    Object objNewInstance = declaredConstructor.newInstance(new Object[0]);
                    sq8.m48648g(objNewInstance, "{\n                constr…wInstance()\n            }");
                    ((f1f.InterfaceC13310a) objNewInstance).mo6520a(this.f33718a);
                } catch (Exception e) {
                    throw new RuntimeException("Failed to instantiate " + str, e);
                }
            } catch (NoSuchMethodException e2) {
                throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("Class " + str + " wasn't found", e3);
        }
    }

    @Override // androidx.lifecycle.InterfaceC2142k
    /* renamed from: o */
    public void mo3717o(xca xcaVar, AbstractC2139h.a aVar) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        sq8.m48649h(xcaVar, "source");
        sq8.m48649h(aVar, "event");
        if (aVar != AbstractC2139h.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        xcaVar.getLifecycle().mo6524d(this);
        Bundle bundleM25941b = this.f33718a.getSavedStateRegistry().m25941b("androidx.savedstate.Restarter");
        if (bundleM25941b == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleM25941b.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            m37121a(it.next());
        }
    }
}
