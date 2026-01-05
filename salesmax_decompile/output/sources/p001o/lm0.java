package p001o;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.startup.InitializationProvider;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class lm0 {

    /* renamed from: d */
    public static volatile lm0 f34029d;

    /* renamed from: e */
    public static final Object f34030e = new Object();

    /* renamed from: c */
    public final Context f34033c;

    /* renamed from: b */
    public final Set f34032b = new HashSet();

    /* renamed from: a */
    public final Map f34031a = new HashMap();

    public lm0(Context context) {
        this.f34033c = context.getApplicationContext();
    }

    /* renamed from: e */
    public static lm0 m37453e(Context context) {
        if (f34029d == null) {
            synchronized (f34030e) {
                if (f34029d == null) {
                    f34029d = new lm0(context);
                }
            }
        }
        return f34029d;
    }

    /* renamed from: a */
    public void m37454a() {
        try {
            try {
                vsh.m53384a("Startup");
                m37455b(this.f34033c.getPackageManager().getProviderInfo(new ComponentName(this.f34033c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e) {
                throw new m4g(e);
            }
        } finally {
            vsh.m53385b();
        }
    }

    /* renamed from: b */
    public void m37455b(Bundle bundle) throws ClassNotFoundException {
        String string = this.f34033c.getString(dae.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (pi8.class.isAssignableFrom(cls)) {
                            this.f34032b.add(cls);
                        }
                    }
                }
                Iterator it = this.f34032b.iterator();
                while (it.hasNext()) {
                    m37457d((Class) it.next(), hashSet);
                }
            } catch (ClassNotFoundException e) {
                throw new m4g(e);
            }
        }
    }

    /* renamed from: c */
    public Object m37456c(Class cls) {
        Object objM37457d;
        synchronized (f34030e) {
            objM37457d = this.f34031a.get(cls);
            if (objM37457d == null) {
                objM37457d = m37457d(cls, new HashSet());
            }
        }
        return objM37457d;
    }

    /* renamed from: d */
    public final Object m37457d(Class cls, Set set) {
        Object objCreate;
        if (vsh.m53387d()) {
            try {
                vsh.m53384a(cls.getSimpleName());
            } finally {
                vsh.m53385b();
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f34031a.containsKey(cls)) {
            objCreate = this.f34031a.get(cls);
        } else {
            set.add(cls);
            try {
                pi8 pi8Var = (pi8) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class> listDependencies = pi8Var.dependencies();
                if (!listDependencies.isEmpty()) {
                    for (Class cls2 : listDependencies) {
                        if (!this.f34031a.containsKey(cls2)) {
                            m37457d(cls2, set);
                        }
                    }
                }
                objCreate = pi8Var.create(this.f34033c);
                set.remove(cls);
                this.f34031a.put(cls, objCreate);
            } catch (Throwable th) {
                throw new m4g(th);
            }
        }
        return objCreate;
    }

    /* renamed from: f */
    public Object m37458f(Class cls) {
        return m37456c(cls);
    }

    /* renamed from: g */
    public boolean m37459g(Class cls) {
        return this.f34032b.contains(cls);
    }
}
