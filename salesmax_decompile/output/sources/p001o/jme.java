package p001o;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.fragment.app.AbstractC2124j;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.C10725b;
import com.bumptech.glide.C10727d;
import com.bumptech.glide.ComponentCallbacks2C10724a;
import com.bumptech.glide.manager.SupportRequestManagerFragment;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class jme implements Handler.Callback {

    /* renamed from: y */
    public static final InterfaceC14614b f30740y = new C14613a();

    /* renamed from: a */
    public volatile hme f30741a;

    /* renamed from: d */
    public final Handler f30744d;

    /* renamed from: e */
    public final InterfaceC14614b f30745e;

    /* renamed from: f */
    public final C10727d f30746f;

    /* renamed from: s */
    public final xj7 f30750s;

    /* renamed from: x */
    public final ada f30751x;

    /* renamed from: b */
    public final Map f30742b = new HashMap();

    /* renamed from: c */
    public final Map f30743c = new HashMap();

    /* renamed from: g */
    public final vo0 f30747g = new vo0();

    /* renamed from: h */
    public final vo0 f30748h = new vo0();

    /* renamed from: q */
    public final Bundle f30749q = new Bundle();

    /* renamed from: o.jme$a */
    public class C14613a implements InterfaceC14614b {
        @Override // p001o.jme.InterfaceC14614b
        /* renamed from: a */
        public hme mo34106a(ComponentCallbacks2C10724a componentCallbacks2C10724a, qca qcaVar, kme kmeVar, Context context) {
            return new hme(componentCallbacks2C10724a, qcaVar, kmeVar, context);
        }
    }

    /* renamed from: o.jme$b */
    public interface InterfaceC14614b {
        /* renamed from: a */
        hme mo34106a(ComponentCallbacks2C10724a componentCallbacks2C10724a, qca qcaVar, kme kmeVar, Context context);
    }

    public jme(InterfaceC14614b interfaceC14614b, C10727d c10727d) {
        interfaceC14614b = interfaceC14614b == null ? f30740y : interfaceC14614b;
        this.f30745e = interfaceC14614b;
        this.f30746f = c10727d;
        this.f30744d = new Handler(Looper.getMainLooper(), this);
        this.f30751x = new ada(interfaceC14614b);
        this.f30750s = m34090b(c10727d);
    }

    /* renamed from: a */
    public static void m34089a(Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    /* renamed from: b */
    public static xj7 m34090b(C10727d c10727d) {
        return (yw7.f56192h && yw7.f56191g) ? c10727d.m12677a(C10725b.e.class) ? new s17() : new t17() : new sv5();
    }

    /* renamed from: c */
    public static Activity m34091c(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m34091c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* renamed from: m */
    public static boolean m34092m(Context context) {
        Activity activityM34091c = m34091c(context);
        return activityM34091c == null || !activityM34091c.isFinishing();
    }

    /* renamed from: d */
    public final hme m34093d(Context context, FragmentManager fragmentManager, Fragment fragment, boolean z) {
        ime imeVarM34099j = m34099j(fragmentManager, fragment);
        hme hmeVarM32405e = imeVarM34099j.m32405e();
        if (hmeVarM32405e == null) {
            hmeVarM32405e = this.f30745e.mo34106a(ComponentCallbacks2C10724a.m12647c(context), imeVarM34099j.m32403c(), imeVarM34099j.m32406f(), context);
            if (z) {
                hmeVarM32405e.onStart();
            }
            imeVarM34099j.m32411k(hmeVarM32405e);
        }
        return hmeVarM32405e;
    }

    /* renamed from: e */
    public hme m34094e(Activity activity) {
        if (uqi.m51935p()) {
            return m34095f(activity.getApplicationContext());
        }
        if (activity instanceof FragmentActivity) {
            return m34096g((FragmentActivity) activity);
        }
        m34089a(activity);
        this.f30750s.mo47446a(activity);
        return m34093d(activity, activity.getFragmentManager(), null, m34092m(activity));
    }

    /* renamed from: f */
    public hme m34095f(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (uqi.m51936q() && !(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                return m34096g((FragmentActivity) context);
            }
            if (context instanceof Activity) {
                return m34094e((Activity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return m34095f(contextWrapper.getBaseContext());
                }
            }
        }
        return m34097h(context);
    }

    /* renamed from: g */
    public hme m34096g(FragmentActivity fragmentActivity) {
        if (uqi.m51935p()) {
            return m34095f(fragmentActivity.getApplicationContext());
        }
        m34089a(fragmentActivity);
        this.f30750s.mo47446a(fragmentActivity);
        androidx.fragment.app.FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        boolean zM34092m = m34092m(fragmentActivity);
        if (!m34103o()) {
            return m34102n(fragmentActivity, supportFragmentManager, null, zM34092m);
        }
        Context applicationContext = fragmentActivity.getApplicationContext();
        return this.f30751x.m16901b(applicationContext, ComponentCallbacks2C10724a.m12647c(applicationContext), fragmentActivity.getLifecycle(), fragmentActivity.getSupportFragmentManager(), zM34092m);
    }

    /* renamed from: h */
    public final hme m34097h(Context context) {
        if (this.f30741a == null) {
            synchronized (this) {
                if (this.f30741a == null) {
                    this.f30741a = this.f30745e.mo34106a(ComponentCallbacks2C10724a.m12647c(context.getApplicationContext()), new un0(), new o66(), context.getApplicationContext());
                }
            }
        }
        return this.f30741a;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        FragmentManager fragmentManager;
        FragmentManager fragmentManager2;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = message.arg1 == 1;
        int i = message.what;
        Object objRemove = null;
        if (i == 1) {
            FragmentManager fragmentManager3 = (FragmentManager) message.obj;
            if (m34104p(fragmentManager3, z3)) {
                objRemove = this.f30742b.remove(fragmentManager3);
                fragmentManager2 = fragmentManager3;
                z2 = true;
                fragmentManager = fragmentManager2;
            }
            fragmentManager = null;
            z2 = true;
            z = false;
        } else if (i != 2) {
            z = false;
            fragmentManager = null;
        } else {
            androidx.fragment.app.FragmentManager fragmentManager4 = (androidx.fragment.app.FragmentManager) message.obj;
            if (m34105q(fragmentManager4, z3)) {
                objRemove = this.f30743c.remove(fragmentManager4);
                fragmentManager2 = fragmentManager4;
                z2 = true;
                fragmentManager = fragmentManager2;
            }
            fragmentManager = null;
            z2 = true;
            z = false;
        }
        if (Log.isLoggable("RMRetriever", 5) && z && objRemove == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to remove expected request manager fragment, manager: ");
            sb.append(fragmentManager);
        }
        return z2;
    }

    /* renamed from: i */
    public ime m34098i(Activity activity) {
        return m34099j(activity.getFragmentManager(), null);
    }

    /* renamed from: j */
    public final ime m34099j(FragmentManager fragmentManager, Fragment fragment) {
        ime imeVar = (ime) this.f30742b.get(fragmentManager);
        if (imeVar != null) {
            return imeVar;
        }
        ime imeVar2 = (ime) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (imeVar2 == null) {
            imeVar2 = new ime();
            imeVar2.m32410j(fragment);
            this.f30742b.put(fragmentManager, imeVar2);
            fragmentManager.beginTransaction().add(imeVar2, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f30744d.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return imeVar2;
    }

    /* renamed from: k */
    public SupportRequestManagerFragment m34100k(androidx.fragment.app.FragmentManager fragmentManager) {
        return m34101l(fragmentManager, null);
    }

    /* renamed from: l */
    public final SupportRequestManagerFragment m34101l(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
        SupportRequestManagerFragment supportRequestManagerFragment = (SupportRequestManagerFragment) this.f30743c.get(fragmentManager);
        if (supportRequestManagerFragment != null) {
            return supportRequestManagerFragment;
        }
        SupportRequestManagerFragment supportRequestManagerFragment2 = (SupportRequestManagerFragment) fragmentManager.m0("com.bumptech.glide.manager");
        if (supportRequestManagerFragment2 == null) {
            supportRequestManagerFragment2 = new SupportRequestManagerFragment();
            supportRequestManagerFragment2.P0(fragment);
            this.f30743c.put(fragmentManager, supportRequestManagerFragment2);
            fragmentManager.m6205q().m6421e(supportRequestManagerFragment2, "com.bumptech.glide.manager").mo6261i();
            this.f30744d.obtainMessage(2, fragmentManager).sendToTarget();
        }
        return supportRequestManagerFragment2;
    }

    /* renamed from: n */
    public final hme m34102n(Context context, androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment, boolean z) {
        SupportRequestManagerFragment supportRequestManagerFragmentM34101l = m34101l(fragmentManager, fragment);
        hme hmeVarJ0 = supportRequestManagerFragmentM34101l.J0();
        if (hmeVarJ0 == null) {
            hmeVarJ0 = this.f30745e.mo34106a(ComponentCallbacks2C10724a.m12647c(context), supportRequestManagerFragmentM34101l.H0(), supportRequestManagerFragmentM34101l.K0(), context);
            if (z) {
                hmeVarJ0.onStart();
            }
            supportRequestManagerFragmentM34101l.Q0(hmeVarJ0);
        }
        return hmeVarJ0;
    }

    /* renamed from: o */
    public final boolean m34103o() {
        return this.f30746f.m12677a(C10725b.d.class);
    }

    /* renamed from: p */
    public final boolean m34104p(FragmentManager fragmentManager, boolean z) {
        ime imeVar = (ime) this.f30742b.get(fragmentManager);
        ime imeVar2 = (ime) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (imeVar2 == imeVar) {
            return true;
        }
        if (imeVar2 != null && imeVar2.m32405e() != null) {
            throw new IllegalStateException("We've added two fragments with requests! Old: " + imeVar2 + " New: " + imeVar);
        }
        if (z || fragmentManager.toString() != null) {
            if (Log.isLoggable("RMRetriever", 5)) {
                fragmentManager.toString();
            }
            imeVar.m32403c().m43996c();
            return true;
        }
        FragmentTransaction fragmentTransactionAdd = fragmentManager.beginTransaction().add(imeVar, "com.bumptech.glide.manager");
        if (imeVar2 != null) {
            fragmentTransactionAdd.remove(imeVar2);
        }
        fragmentTransactionAdd.commitAllowingStateLoss();
        this.f30744d.obtainMessage(1, 1, 0, fragmentManager).sendToTarget();
        return false;
    }

    /* renamed from: q */
    public final boolean m34105q(androidx.fragment.app.FragmentManager fragmentManager, boolean z) {
        SupportRequestManagerFragment supportRequestManagerFragment = (SupportRequestManagerFragment) this.f30743c.get(fragmentManager);
        SupportRequestManagerFragment supportRequestManagerFragment2 = (SupportRequestManagerFragment) fragmentManager.m0("com.bumptech.glide.manager");
        if (supportRequestManagerFragment2 == supportRequestManagerFragment) {
            return true;
        }
        if (supportRequestManagerFragment2 != null && supportRequestManagerFragment2.J0() != null) {
            throw new IllegalStateException("We've added two fragments with requests! Old: " + supportRequestManagerFragment2 + " New: " + supportRequestManagerFragment);
        }
        if (z || fragmentManager.O0()) {
            fragmentManager.O0();
            supportRequestManagerFragment.H0().m43996c();
            return true;
        }
        AbstractC2124j abstractC2124jM6421e = fragmentManager.m6205q().m6421e(supportRequestManagerFragment, "com.bumptech.glide.manager");
        if (supportRequestManagerFragment2 != null) {
            abstractC2124jM6421e.mo6266o(supportRequestManagerFragment2);
        }
        abstractC2124jM6421e.mo6263k();
        this.f30744d.obtainMessage(2, 1, 0, fragmentManager).sendToTarget();
        return false;
    }
}
