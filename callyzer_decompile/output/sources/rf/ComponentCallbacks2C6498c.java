package rf;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rf.c */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C6498c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: e */
    public static final ComponentCallbacks2C6498c f31211e = new ComponentCallbacks2C6498c();

    /* renamed from: a */
    public final AtomicBoolean f31212a = new AtomicBoolean();

    /* renamed from: b */
    public final AtomicBoolean f31213b = new AtomicBoolean();

    /* renamed from: c */
    public final ArrayList f31214c = new ArrayList();

    /* renamed from: d */
    public boolean f31215d = false;

    /* renamed from: b */
    public static void m12509b(Application application) {
        ComponentCallbacks2C6498c componentCallbacks2C6498c = f31211e;
        synchronized (componentCallbacks2C6498c) {
            try {
                if (!componentCallbacks2C6498c.f31215d) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C6498c);
                    application.registerComponentCallbacks(componentCallbacks2C6498c);
                    componentCallbacks2C6498c.f31215d = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: a */
    public final void m12510a(InterfaceC6497b interfaceC6497b) {
        synchronized (f31211e) {
            this.f31214c.add(interfaceC6497b);
        }
    }

    /* renamed from: c */
    public final void m12511c(boolean z6) {
        synchronized (f31211e) {
            try {
                ArrayList arrayList = this.f31214c;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((InterfaceC6497b) obj).mo385a(z6);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean zCompareAndSet = this.f31212a.compareAndSet(true, false);
        this.f31213b.set(true);
        if (zCompareAndSet) {
            m12511c(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean zCompareAndSet = this.f31212a.compareAndSet(true, false);
        this.f31213b.set(true);
        if (zCompareAndSet) {
            m12511c(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        if (i10 == 20 && this.f31212a.compareAndSet(false, true)) {
            this.f31213b.set(true);
            m12511c(true);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
